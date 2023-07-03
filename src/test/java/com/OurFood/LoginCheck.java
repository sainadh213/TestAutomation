package com.OurFood;

import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.GenericLibrary.Constants;
import com.GenericLibrary.FileUtil;
import com.ObjectRepository.OurFoodHomePage;
import com.ObjectRepository.OurfoodLoginPage;

public class LoginCheck extends BaseClass{
	@Test
	public void loginCheck() throws Throwable
	{
		OurfoodLoginPage ofl = new OurfoodLoginPage(driver);
		FileUtil fu=new FileUtil();
		
		for(int i=45;i<=87;i++)
		{
		String username = fu.readDataFromExcel(Constants.loginsheet, "login", i, 0);
		String password = fu.readDataFromExcel(Constants.loginsheet, "login", 1, 1);
		Thread.sleep(5000);
		ofl.getUntb().sendKeys(username);
		ofl.getPwtb().sendKeys(password);
		ofl.getsigninbtn().click();
		Thread.sleep(1000);
		OurFoodHomePage ofh=new OurFoodHomePage(driver);
		ofh.logoutToOurFood();
		
	}
		driver.quit();
	}
}
