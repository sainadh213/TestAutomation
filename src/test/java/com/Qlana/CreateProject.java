package com.Qlana;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;

public class CreateProject extends BaseClass {
	@Test
	public void createProject() throws Throwable
	{
		int count=1;
		int opt=1;
		driver.findElement(By.xpath("//i[@class='icon-folder-open']")).click();
		for(int i=1;i<=7;i++)
		{
		driver.findElement(By.id("title")).sendKeys("Project_UAT_00"+i) ;
		if(count<=4)
		{
		driver.findElement(By.xpath("//span[@class='custom-control-label' and text()='Loan']")).click();
		}
		else
		{
			driver.findElement(By.xpath("//span[@class='custom-control-label' and text()='Incentive']")).click();
		}
		driver.findElement(By.xpath("//label[text()='Select Product Sub Type']")).click() ;
		driver.findElement(By.xpath("(//li[@role='option'])["+  opt +  "]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Select product name']")).click() ;
		driver.findElement(By.xpath("//li[@class='ui-dropdown-item ui-corner-all']")).click() ;
		driver.findElement(By.xpath("//input[@placeholder='Search for company']")).sendKeys("zepto") ;
		driver.findElement(By.xpath("//div[text()='Zepto (8555835664 - sainadhb1996@gmail.com)']")).click() ;
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Save']")).click() ;
		count++;
		if(opt==4)
		{
			opt=0;
		}
		opt++;
		Thread.sleep(15000);
	}
	}
}
