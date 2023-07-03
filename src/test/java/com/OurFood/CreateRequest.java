package com.OurFood;

import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.GenericLibrary.Constants;
import com.GenericLibrary.FileUtil;
import com.ObjectRepository.OurFoodHomePage;

public class CreateRequest extends BaseClass {
	@Test
	public void createRequest() throws Throwable
	{
	OurFoodHomePage ofh=new OurFoodHomePage(driver);
    ofh.getRequestbtn().click();
    ofh.getAddbtn().click();
    FileUtil fu=new FileUtil();
   String reqData = fu.readDataFromExcel(Constants.excel_path, "RequestCreation", 0, 0);
    ofh.getRequesttb().sendKeys(reqData);
    ofh.getRaiseareqbtn().click();

}
	
}