package com.GenericLibrary;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.ObjectRepository.OurFoodHomePage;
import com.ObjectRepository.QlanaLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements Constants {
public static WebDriver driver;
public static FileUtil fu=new FileUtil();
 WebDriverUtil wdu=new WebDriverUtil();

	@BeforeClass 
	public void openBrowser() throws IOException
	{
	
	String browser = fu.readDataFromPropertyFile(properties_path,"browser");
	if(browser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	else if (browser.equalsIgnoreCase("firefox"))
	  {
         WebDriverManager.firefoxdriver().setup();
         driver=new FirefoxDriver();
     }
     else  {
         System.out.println("Enter proper browser name");
     }
	 driver.manage().window().maximize();
	  String url = fu.readDataFromPropertyFile(properties_path, "url");
	  driver.get(url);
 
	}
	@BeforeMethod 
	public void login() throws Throwable
	{
   /* ApolloLoginPage afl=new ApolloLoginPage(driver);
	afl.loginToApollo();
		OurfoodLoginPage ofl=new OurfoodLoginPage(driver);
		//ofl.loginToOurfood();*/
		QlanaLoginPage qlp=new QlanaLoginPage(driver);
		qlp.loginToQlana();
		
	}

	@AfterMethod(enabled = false)
	public void logout() throws Throwable
	{
		/*ApolloLogoutPage alp=new ApolloLogoutPage(driver);
		alp.logotApollo();*/
		OurFoodHomePage ofh=new OurFoodHomePage(driver);
		ofh.logoutToOurFood();
		
	}
	
	 @AfterClass(enabled = false)
	  public void closeBrowser() throws InterruptedException
	  {
		  Thread.sleep(3000);
		  driver.quit();
	  }

}
