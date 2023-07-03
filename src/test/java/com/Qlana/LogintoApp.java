package com.Qlana;

import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.ObjectRepository.QlanaLoginPage;

public class LogintoApp extends BaseClass {
	@Test
	public void loginToApp() throws Throwable
	{
	QlanaLoginPage qlp=new QlanaLoginPage(driver);
	qlp.loginToQlana();
	Thread.sleep(5000);
	qlp.logoutFromQlana();
	
	
	}
}
