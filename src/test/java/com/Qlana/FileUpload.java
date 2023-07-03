package com.Qlana;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;

public class FileUpload extends BaseClass {
@Test
public void fileUpload() throws Throwable
{
	Thread.sleep(5000);
	driver.findElement(By.id("appUserName")).sendKeys("admin");
	driver.findElement(By.id("appPassword")).sendKeys("Ecdc#1234 ");
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@class='custom-file-input']")).sendKeys("D:\\Testing\\Png\\11 Kb.png");
	System.out.println("File Uploaded Successfully");
}
}
