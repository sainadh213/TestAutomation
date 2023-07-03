package com.Qlana;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.GenericLibrary.TestData;

public class CreateUser extends BaseClass {
	@Test
	public void createUser() throws Throwable
	{
		driver.findElement(By.xpath("//i[@class='icon-roles-2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Users List']")).click();
		String names[]= {"Ramya","Ravali","Keerthi","Sowmya","Navya","Lakshmi","Sravani","Mounika","Akhila","Krishaveni","Vaishnavi","Anusha","Jyothi","Praveena","Gowthami","Sailaja","Keertana","Bargavi","Maheswari","Pavani","Naveena","Kalyani","Priya","Meenakashi","Syamala","Hemalatha","Bhavani","Yamini","Meghana","Manasa","Aishwarya","Lavanya","Sowjanya","Karuna","Praneetha","Swapna","Ramya","Bharathi","Harshitha","Renuka","Pravallika","Nandini","Sanjana","Vasavi","Gayathri","Samyuktha","Rajini","Sindhu","Geetha","Vani","Meghana","Vineetha"};
		for(int i=51;i<=51;i++)
		{
		driver.findElement(By.xpath("//span[normalize-space()='Add']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Select Salutation']")).click();
		driver.findElement(By.xpath("//li[@aria-label='Ms']")).click();
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(names[i]);
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(names[i].toLowerCase()+"@mailinator.com");
		driver.findElement(By.xpath("//label[normalize-space()='Select Country Code']")).click();
		driver.findElement(By.xpath("//input[@class='ui-dropdown-filter ui-inputtext ui-widget ui-state-default ui-corner-all']")).sendKeys("india");
		driver.findElement(By.xpath("//div[text()='(+91) India']")).click();
		TestData td=new TestData();
		String phone = td.getPhone();
		driver.findElement(By.id("phone")).sendKeys(phone);
		driver.findElement(By.id("login_unique")).sendKeys(names[i]);
		driver.findElement(By.xpath("//label[text()='Select User Role']")).click();
		driver.findElement(By.xpath("(//li[@class='ui-dropdown-item ui-corner-all'])["+  i +  "]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Select Reporting To']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='ECDC Admin (Administrator)']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		System.out.println("The Number is: "+i);
		Thread.sleep(4000);
		
	}}

}
