package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EcdcProjectWorkflow {
	
	WebDriver driver;
	public EcdcProjectWorkflow(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath = "//i[@class='icon-folder-open']")private WebElement projectIcon ;
	@FindBy(id = "title")private WebElement projectTitleTb ;
	@FindBy(xpath = "//span[@class='custom-control-label' and text()='Loan']")private WebElement loanRadioBtn ;
	@FindBy(xpath = "//label[text()='Select Product Sub Type']")private WebElement productSubTypeDd;
	@FindBy(xpath = "//span[@class='custom-control-label' and text()='Incentive']")private WebElement incentiveRadioBtn;
	@FindBy(xpath = "(//li[@role='option'])[2]")private WebElement productSubTypeOpt ;
	@FindBy(xpath = "//label[text()='Select product name']")private WebElement productnameDd ;
	@FindBy(xpath = "//li[@class='ui-dropdown-item ui-corner-all']")private WebElement productNameDdOpt;
	@FindBy(xpath = "//input[@placeholder='Search for company']")private WebElement barrowerTb ;
	@FindBy(xpath = "//div[text()='Lux (07660853885 - lux@mailinator.com)']")private WebElement company ;
	@FindBy(xpath = "//span[text()='Save & Continue']")private WebElement SaveandContinueBtn ;
	@FindBy(xpath = "(//a[@class='icon-eye'])[1]")private WebElement eyeIcon ;
	
	//Step-1
	//@FindAll({@FindBy(xpath = "(//div[@class='workflow-action-btn'])[1]"),
		//@FindBy(xpath ="(//div[@class='workflow-action-btn ng-star-inserted'])[1]")})	private WebElement workflowActionBtn ;
	@FindBy(xpath ="(//div[contains(@class,'workflow-action-btn')])[1]")private WebElement workflowActionBtn ;
	//@FindAll({@FindBy(xpath = "//label[text()='Select User']"),@FindBy(xpath = "//label[text()='Select Secretary']")})
	//private List<WebElement> assignToUserdd ;
	@FindBy(xpath ="//div[contains(@class,'select-field')]")private List<WebElement> assignToUserdd ;
	@FindBy(xpath = "(//li[@class='ui-dropdown-item ui-corner-all'])[1]")private WebElement user ;
	//@FindBy(xpath = "//li[@class='ui-dropdown-item ui-corner-all']")private WebElement user ;
	@FindBy(id="comment")private WebElement commentsTb;
	@FindBy(xpath = "(//span[@class='info'])[1]")private WebElement actionBtn ;
	//@FindBy(xpath = "//div[@class='select-field ng-star-inserted']")private WebElement assigneduserName ;
	//@FindAll({@FindBy(xpath = "(//div[@class='select-field ng-star-inserted'])[1]"),@FindBy(xpath = "(//div[@class='select-field'])[1}")})private WebElement assigneduserName ;
	@FindBy(xpath ="//div[contains(@class,'select-field')]")private WebElement assigneduserName ;
	@FindBy(xpath ="(//td[@class='ng-star-inserted'])[1]")private WebElement consultant;
	public WebElement getConsultant() {
		return consultant;
	}
	@FindBy(xpath = "//img[@alt='logo']")private WebElement profileLogo ;
	@FindBy(xpath = "//button[text()=' Logout ']")private WebElement logoutBtn ;
	@FindBy(xpath = "(//a[@id='dropdownBasic1'])[1]")private WebElement notificationsLogo ;
	@FindBy(xpath = "(//a[@class='zc-notification-item'])[1]")private WebElement notification ;
	@FindBy(xpath = "//span[text()='Click Here For More Details']")private WebElement clickHereForMoreBtn ;
	//@FindBy(xpath ="(//span[@class='bredcrumb-item ng-star-inserted'])[2]")private WebElement bredcrumb;
	@FindBy(xpath ="(//span[contains(@class,'bredcrumb-item')])[2]")private WebElement bredcrumb;
	
	public WebElement getBredcrumb() {
		return bredcrumb;
	}
	public WebElement getNotification() {
		return notification;
	}
	public void setNotification(WebElement notification) {
		this.notification = notification;
	}
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
	public WebElement getProductSubTypeOpt() {
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
	public WebElement getSaveandContinueBtn() {
		return SaveandContinueBtn;
	}
	public WebElement getEyeIcon() {
		return eyeIcon;
	}
	public WebElement getWorkflowActionBtn() {
		return workflowActionBtn;
	}
	public List<WebElement> getAssignToUserdd() {
		return assignToUserdd;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getCommentsTb() {
		return commentsTb;
	}
	public WebElement getActionBtn() {
		return actionBtn;
	}
	public WebElement getAssigneduserName() {
		return assigneduserName;
	}
	public WebElement getProfileLogo() {
		return profileLogo;
	}
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	public WebElement getNotificationsLogo() {
		return notificationsLogo;
	}
	public WebElement getClickHereForMoreBtn() {
		return clickHereForMoreBtn;
	}
	@FindBy(id="appUserName")private WebElement usernameTb;
	@FindBy(id="appPassword")private WebElement passwordTb;
	@FindBy(xpath ="//span[text()='Login']")private WebElement loginBtn;
	@FindBy(xpath ="//span[@class='icon-certificate']")private WebElement AppselctionBtn;
	@FindBy(id="modal-basic-title")private WebElement pageTitle;
	
	public WebElement getPageTitle() {
		return pageTitle;
	}
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
	//Login
	public void login(String loginUsername) throws Throwable
	{
		Thread.sleep(2000);
		getUsernameTb().sendKeys(loginUsername);
		getPasswordTb().sendKeys("Ecdc#1234");
		getLoginBtn().click();
		Thread.sleep(2000);
	}
	
	//Logout
	public void logout()
	{
		getProfileLogo().click();
		getLogoutBtn().click();
	}
	//Project Creation
	public void projectWorkflow(String projectName) throws Throwable
	{
		
		/*getProjectIcon().click();
		//String projectName="Project@55";
		getProjectTitleTb().sendKeys(projectName);
		getIncentiveRadioBtn().click();
		getProductSubTypeDd().click();
		Thread.sleep(2000);
		getProductSubTypeOpt().click();
		Thread.sleep(4000);
		getProductnameDd().click();
		getProductNameDdOpt().click();
		Thread.sleep(2000);
		getBarrowerTb().sendKeys("Lux");
		getCompany().click();
		Thread.sleep(4000);
		getSaveandContinueBtn().click();
		getEyeIcon().click();*/
		
		int step=1;
		String userName=null;
		String name=null;
		while (getWorkflowActionBtn().isDisplayed()) 
		{
			
			Thread.sleep(3000);
			String actionName = getWorkflowActionBtn().getText();
			getWorkflowActionBtn().click();
			Thread.sleep(2000);
			String actualPageTitle = getPageTitle().getText();
			String expectedPageTitle=projectName+" : "+actionName;
			Assert.assertEquals(actualPageTitle.toLowerCase(), expectedPageTitle.toLowerCase());
			
			if(getConsultant().isDisplayed()) {
				 name = getConsultant().getText();
				String[] allNames = name.split(" ");
				//String userName = allNames[0];
				userName = allNames[0];
			}
			else
			{
			List<WebElement> allUsers = getAssignToUserdd();
			
				System.out.println("At step:"+step+" "+allUsers.size()+" Users found");
				for (WebElement user : allUsers) {
					Thread.sleep(4000);
					user.click();
					Thread.sleep(4000);
					getUser().click();
					 name = getAssigneduserName().getText();
					String[] allNames = name.split(" ");
					//String userName = allNames[0];
					userName = allNames[0];
					
				}
			}
			
	/*	String name = getAssigneduserName().getText();
		String[] allNames = name.split(" ");
		String userName = allNames[0];*/
				
		getCommentsTb().sendKeys(actionName.toLowerCase());
			String actionBtnName = getActionBtn().getText();	
			Assert.assertEquals(actionBtnName.toLowerCase(), actionName.toLowerCase());
			Thread.sleep(3000);
			getActionBtn().click();
			Thread.sleep(2000);
			getBredcrumb().click();
			Thread.sleep(3000);
			getEyeIcon().click();
			Thread.sleep(5000);
			String url = driver.getCurrentUrl();
			System.out.println("At step "+step+"======"+url);
			System.out.println("At step:"+step+" "+ projectName+" project "+actionName+" action done and project moved to "+name);
			Thread.sleep(3000);
			logout();
			Thread.sleep(3000);
			login(userName);
			Thread.sleep(3000);
			driver.get(url);
			step++;
		}
		System.out.println(projectName+" project workflow completed");
		
	}

}
