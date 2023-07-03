package com.Qlana;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.GenericLibrary.TestData;

public class ContactCreation extends BaseClass{
	@Test
	public void contactCreation() throws Throwable
	{

String name[]= {"","Sai","Krishna","Mohan","Ravi"};
TestData td=new TestData();

driver.findElement(By.xpath("//i[@class='icon-book']")).click();
for(int i=1;i<=4;i++)
{
driver.findElement(By.xpath("//label[normalize-space()='Select Prefix']")).click();
driver.findElement(By.xpath("//li[@aria-label='Mr']")).click();
driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(name[i]);
driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Kumar");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys(name[i].toLowerCase()+"@mailinator.com");
driver.findElement(By.id("phone_main")).sendKeys("9"+td.getPhone());
driver.findElement(By.xpath("//label[normalize-space()='Select contact type']")).click();
driver.findElement(By.xpath("(//li[@role='option'])["+  i +  "]")).click();
Thread.sleep(3000);
driver.findElement(By.id("button_Save")).click();
Thread.sleep(15000);
	}
	}
}
