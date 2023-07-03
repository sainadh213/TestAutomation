package com.OurFood;

import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.ObjectRepository.OurFoodHomePage;

public class Counting extends BaseClass {
	@Test
	public void counting() throws Throwable
	{
		OurFoodHomePage ofh=new OurFoodHomePage(driver);
		ofh.getOptbtn().click();
		ofh.getRequestbtn().click();
			
		while(true)
		{
			try {
				ofh.getLoadmorebtn().click();
				
			} catch (Exception e) {
				 System.out.println(ofh.getReqid().size()); 
				break;
			}
		}
	}
}
