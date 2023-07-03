package com.Apollo;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.GenericLibrary.WebDriverUtil;
import com.ObjectRepository.ApolloHomePage;
import com.ObjectRepository.LocationPage;

public class CreateLocation extends BaseClass {
	@Test
	public void createLocation() throws Throwable
	{
		ApolloHomePage ho=new ApolloHomePage(driver);
        WebDriverUtil wdu=new WebDriverUtil();
		wdu.moveToElement(ho.getMastersbtn());
		ho.getLocationbtn().click();
		LocationPage lp=new LocationPage(driver);
		lp.createLocation(2);
		Thread.sleep(9000);
			
	}		
	}


