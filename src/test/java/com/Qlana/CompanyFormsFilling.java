package com.Qlana;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.GenericLibrary.WebDriverUtil;
import com.ObjectRepository.CompanyForms;

public class CompanyFormsFilling extends BaseClass {
	@Test
	public void companyFormsFilling() throws Throwable
	{
		WebDriverUtil wdu=new WebDriverUtil();
		wdu.waitForElement(4000);
		/*driver.findElement(By.xpath("//i[@class='icomoon-company2']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='label-text text-line'])[4]")).click();*/
		CompanyForms cmf=new CompanyForms(driver);
		cmf.fillBasicInfo();
	}

}
