package com.Apollo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.GenericLibrary.WebDriverUtil;
import com.ObjectRepository.ApolloHomePage;
import com.ObjectRepository.ClusterPage;
@Listeners(com.GenericLibrary.MyListeners.class)

public class CreateCluster extends BaseClass {
	
	@Test
	public void createCluster() throws Throwable
	{
		ApolloHomePage hm=new ApolloHomePage(driver);
		WebDriverUtil wdu=new WebDriverUtil();
		wdu.moveToElement(hm.getMastersbtn());
		hm.getClusterbtn().click();
		ClusterPage cp=new ClusterPage(driver);
		cp.createCluster(1);
		Thread.sleep(5000);
					
	}
}
