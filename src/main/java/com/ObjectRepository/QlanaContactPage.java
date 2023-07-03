package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericLibrary.TestData;
import com.GenericLibrary.WebDriverUtil;

public class QlanaContactPage {
WebDriver driver;
public QlanaContactPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements( driver,this);
	}

  @FindBy(xpath = "//i[@class='icon-book']")private WebElement contacticon;
  @FindBy(xpath = "//label[text()='Select']")private WebElement prefixdd;
  @FindBy(xpath = "(//li[@class='ui-dropdown-item ui-corner-all'])[1]")private WebElement prefixvalue;
  @FindBy(id = "first_name")private WebElement firstNameTb;
  @FindBy(id = "last_name")private WebElement lastNameTb;
  @FindBy(id = "email")private WebElement emailTb;
  @FindBy(id = "phone_main")private WebElement phoneTb;
  @FindBy(xpath = "//label[text()='Select contact type']")private WebElement contectTypedd;
  @FindBy(xpath = "(//li[@class='ui-dropdown-item ui-corner-all'])[2]")private WebElement contectTypeddValues;
  @FindBy(xpath = "//span[text()='Save & Continue']")private WebElement saveBtn;
  
  
  
  public WebElement getContacticon() {
	return contacticon;
}

public WebElement getPrefixdd() {
	return prefixdd;
}



public WebElement getPrefixvalue() {
	return prefixvalue;
}



public WebElement getFirstNameTb() {
	return firstNameTb;
}



public WebElement getLastNameTb() {
	return lastNameTb;
}



public WebElement getEmailTb() {
	return emailTb;
}



public WebElement getPhoneTb() {
	return phoneTb;
}



public WebElement getContectTypedd() {
	return contectTypedd;
}



public WebElement getContectTypeddValues() {
	return contectTypeddValues;
}



public WebElement getSaveBtn() {
	return saveBtn;
}



public void createContact() throws Throwable
  {
	  WebDriverUtil wdu=new WebDriverUtil();
	  TestData td=new TestData();
			  
	  wdu.waitForElement(20);
	  getContacticon().click();
	  getPrefixdd().click();
	  getPrefixvalue().click();
	 // Thread.sleep(3000);
	  getFirstNameTb().sendKeys(td.getfirstname());
	  getLastNameTb().sendKeys(td.getlastName());
	  getEmailTb().sendKeys(td.getEmail());
	  getPhoneTb().sendKeys(td.getPhone());
	  getContectTypedd().click();
	  getContectTypeddValues().click();
	 // getSaveBtn().click();
	  
  }
}
