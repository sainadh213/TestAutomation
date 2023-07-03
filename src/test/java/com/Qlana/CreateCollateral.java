package com.Qlana;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;

public class CreateCollateral extends BaseClass {
	@Test
	public void createCollateral() throws Throwable
	{
		driver.findElement(By.xpath("//i[@class='icomoon-collateral']")).click();
		int count=1;
		for(int i=1;i<=7;i++)
		{
			
		driver.findElement(By.xpath("//span[text()='Add Collateral']")).click();
		driver.findElement(By.id("name")).sendKeys("Collateral_00"+count);
		driver.findElement(By.xpath("//label[text()='Select collateral type']")).click();
		driver.findElement(By.xpath("(//li[@class='ui-dropdown-item ui-corner-all'])["+  i +  "]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Select collateral sub type']")).click();
		driver.findElement(By.xpath("//li[@class='ui-dropdown-item ui-corner-all']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Collateral Value']")).sendKeys("2542000");
		driver.findElement(By.xpath("//input[@placeholder='DD/MM/YYYY']")).click();
		driver.findElement(By.xpath("//span[text()='24']")).click();
		driver.findElement(By.id("submitBtn")).click();
		count++;
		Thread.sleep(10000);
		
		
	}
	}
}
