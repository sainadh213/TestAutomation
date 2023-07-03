package com.Qlana;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.GenericLibrary.FileUtil;

public class EnterData extends BaseClass {
@Test
public void enterData() throws Throwable
{
	Thread.sleep(5000);
	driver.findElement(By.id("appUserName")).sendKeys("itadmin@bk.zc");
	driver.findElement(By.id("appPassword")).sendKeys("Bk#1234");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	Thread.sleep(5000);
	FileUtil fu=new FileUtil();
	int pageNo=0;
	int count=1;
	String recordsCount = driver.findElement(By.xpath("//div[@class='ui-paginator-right-content ng-star-inserted']")).getText();
	String[] s2 = recordsCount.split(" ");
	String records = s2[5].replaceAll("[^0-9]","");
	int number = Integer.parseInt(records);
	System.out.println(number);
	
	for(int i=1;i<=10;i++)
	{
	
		Thread.sleep(3000);
	
	String data = driver.findElement(By.xpath("//table[@class='table-view']//tr["+ i +"]//td[2]")).getText();
	System.out.println("ID is : "+data);
	Thread.sleep(3000);
	fu.enterDataInExcelSheet("C:\\Users\\SaiNadh\\git\\repository23\\MyHybridFramework\\DataSheet.xlsx","Sheet1",count,1,data);
	System.out.println(count);
	count++;
	
	if(count>number)
	{
		break;
	}
	if(i==10)
	{
		i=1;
		driver.findElement(By.xpath("//span[@class='ui-paginator-icon pi pi-caret-right']")).click();
		pageNo++;
		
		
	}
	
}
}
}