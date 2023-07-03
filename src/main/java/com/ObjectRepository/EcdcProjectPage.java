package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericLibrary.WebDriverUtil;

public class EcdcProjectPage {
	private static final String option = null;
	WebDriverUtil wdu=new WebDriverUtil();
	WebDriver driver;
	public EcdcProjectPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//i[@class='icon-folder-open']")private WebElement projectIcon ;
	@FindBy(id = "title")private WebElement projectTitleTb ;
	@FindBy(xpath = "//span[@class='custom-control-label' and text()='Loan']")private WebElement loanRadioBtn ;
	@FindBy(xpath = "//label[text()='Select Product Sub Type']")private WebElement productSubTypeDd;
	@FindBy(xpath = "//span[@class='custom-control-label' and text()='Incentive']")private WebElement incentiveRadioBtn;
	@FindBy(xpath = "(//li[@role='option'])['option']")private List <WebElement> productSubTypeOpt ;
	@FindBy(xpath = "//label[text()='Select product name']")private WebElement productnameDd ;
	@FindBy(xpath = "//li[@class='ui-dropdown-item ui-corner-all']")private WebElement productNameDdOpt;
	@FindBy(xpath = "//input[@placeholder='Search for company']")private WebElement barrowerTb ;
	@FindBy(xpath = "//div[text()='Zepto (8555835664 - sainadhb1996@gmail.com)']")private WebElement company ;
	@FindBy(xpath = "//span[text()='Save']")private WebElement saveBtn ;
	public WebElement getProjectIcon() {
		return projectIcon;
	}
	public WebElement getProjectTitleTb() {
		return projectTitleTb;
	}
	public WebElement getLoanRadioBtn() {
		return loanRadioBtn;
	}
	public WebElement getProductSubTypeDd() {
		return productSubTypeDd;
	}
	public WebElement getIncentiveRadioBtn() {
		return incentiveRadioBtn;
	}
	public List <WebElement> getProductSubTypeOpt() {
		return productSubTypeOpt;
	}
	public WebElement getProductnameDd() {
		return productnameDd;
	}
	public WebElement getProductNameDdOpt() {
		return productNameDdOpt;
	}
	public WebElement getBarrowerTb() {
		return barrowerTb;
	}
	public WebElement getCompany() {
		return company;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
     
   public void createProject() throws InterruptedException
   {
	   getProjectIcon().click();
	   int count=1;
	  // int option=6;
	   for(int i=1;i<=7;i++)
	   {
		   int option=1;
	   //getProjectIcon().click();
	   getProjectTitleTb().sendKeys("Project_UAT@00"+i);
	  if(count<=4)
	   {
		   getLoanRadioBtn().click();
		   
	   }
	   else
	   {
		   getIncentiveRadioBtn().click();
	   
	 //  getProductSubTypeDd().click();
	 // getProductSubTypeOpt().click();
	   }
	  // getIncentiveRadioBtn().click();
	   
	   getProductSubTypeDd().click();
	   Thread.sleep(4000);
	   ((WebElement) getProductSubTypeOpt()).click();
	   Thread.sleep(4000);
	   getProductnameDd().click();
	   Thread.sleep(4000);
	   getProductNameDdOpt().click();
	   getBarrowerTb().sendKeys("Zepto");
	   Thread.sleep(5000);
	   getCompany().click();
	   Thread.sleep(5000);
	   //getSaveBtn().click();
	   System.out.println(count);

         count++;
         option++;
	   
	   Thread.sleep(15000);
   }
   }
}
