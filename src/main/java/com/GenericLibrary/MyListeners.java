package com.GenericLibrary;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" Started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" Success");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" Test Failed");
		WebDriverUtil wdu=new WebDriverUtil();
		
			try {
				//wdu.getFullScreenshot("./ScreenshotFolder/"+result.getName()+".png");
				wdu.getFullScreenshot(Constants.screenshot_Path+result.getName()+".png");
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	
	
	
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" Skipped");
		
	}

	public void onStart(ITestContext context) {
		System.out.println(context.getName()+" Start");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println(context.getName()+" Finish");
		
	}

}
