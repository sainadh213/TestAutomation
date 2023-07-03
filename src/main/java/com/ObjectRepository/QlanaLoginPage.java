package com.ObjectRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericLibrary.Constants;
import com.GenericLibrary.FileUtil;
import com.GenericLibrary.WebDriverUtil;

public class QlanaLoginPage {
	WebDriver driver;
	WebDriverUtil wdu=new WebDriverUtil();
	public QlanaLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	@FindBy(id="appUserName")private WebElement usernameTb;
	@FindBy(id="appPassword")private WebElement passwordTb;
	@FindBy(xpath ="//span[text()='Login']")private WebElement loginBtn;
	@FindBy(xpath ="//span[@class='icon-certificate']")private WebElement AppselctionBtn;
	@FindBy(xpath ="//span[@class='icon-cogs']")private WebElement administrationBtn;
	public WebElement getAdministrationBtn() {
		return administrationBtn;
	}
	@FindBy(xpath ="//img[@alt='logo']")private WebElement profileBtn;
	@FindBy(xpath ="//button[text()=' Logout ']")private WebElement logoutBtn;
	
	public WebElement getUsernameTb() {
		return usernameTb;
	}
	public WebElement getPasswordTb() {
		return passwordTb;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getAppselctionBtn() {
		return AppselctionBtn;
	}
	public WebElement getProfileBtn() {
		return profileBtn;
	}
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	public void loginToQlana() throws Throwable
	{
		FileUtil fu=new FileUtil();
		//WebDriverUtil wdu=new WebDriverUtil();
		String username = fu.readDataFromPropertyFile(Constants.properties_path, "username");
		String password = fu.readDataFromPropertyFile(Constants.properties_path, "password");
		//Thread.sleep(5000);
		wdu.waitForElement(20);
		getUsernameTb().sendKeys(username);
		getPasswordTb().sendKeys(password);
		getLoginBtn().click();
		//wdu.waitForElement(20);
		//getAppselctionBtn().click();
		//getAdministrationBtn().click();
	}
    public void logoutFromQlana()
    {
    	getProfileBtn().click();
    	getLogoutBtn().click();
    }
}
