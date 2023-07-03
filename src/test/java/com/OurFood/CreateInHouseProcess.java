package com.OurFood;

import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.ObjectRepository.OurfoodInHouseProcessingPage;
import com.ObjectRepository.OurfoodLoginPage;

public class CreateInHouseProcess extends BaseClass {
	@Test
	public void createInHouseProcess() throws Throwable
	{
	OurfoodLoginPage ofl=new OurfoodLoginPage(driver);
	
	ofl.loginToOurfood("username","password");
	OurfoodInHouseProcessingPage oih=new OurfoodInHouseProcessingPage(driver);
	oih.createInhouseOI("100000", "1142", "200");
}
}