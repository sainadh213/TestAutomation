package com.OurFood;

import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.GenericLibrary.Constants;
import com.GenericLibrary.FileUtil;
import com.ObjectRepository.OurFoodHomePage;

public class CreateStartDay extends BaseClass{
	@Test
	public void createStartDay() throws Throwable
	{
OurFoodHomePage ofh=new OurFoodHomePage(driver);
ofh.getStartdaybtn().click();
FileUtil fu=new FileUtil();
String data = fu.readDataFromExcel(Constants.excel_path, "StartDay", 0, 0);
ofh.getYourPlantb().sendKeys(data);
Thread.sleep(9000);
ofh.getStartthedaybtn().click();

}
}