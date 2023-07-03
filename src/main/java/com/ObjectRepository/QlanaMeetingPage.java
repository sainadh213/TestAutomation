package com.ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericLibrary.TestData;
import com.GenericLibrary.WebDriverUtil;

public class QlanaMeetingPage {
	WebDriverUtil wdu=new WebDriverUtil();
	WebDriver driver;
	public QlanaMeetingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//i[@class='icon-book']")private WebElement contacticon;
	@FindBy(xpath ="//i[@class='icomoon-company2']")private WebElement companyIcon;
	@FindBy(xpath ="//i[@class='icomoon-collateral']")private WebElement collateralIcon;
	@FindBy(xpath ="//i[@class='icon-folder-open']")private WebElement projectIcon;
	@FindBy(xpath ="//i[@class='icomoon-meeting2']")private WebElement meetingIcon;
	
	public WebDriverUtil getWdu() {
		return wdu;
	}

	public WebElement getMeetingIcon() {
		return meetingIcon;
	}
	@FindBy(id ="mat-tab-label-0-1")private WebElement meetingTabBtn;
	@FindBy(xpath= "//span[text()='Create Meeting']")private WebElement createMeetingBtn;
	@FindBy(id= "title")private WebElement titleTb;
	@FindBy(id= "where")private WebElement whereTb;
	@FindBy(xpath =  "//input[@placeholder='Select Meeting Date']")private WebElement whenDd;
	@FindBy(xpath= "//span[text()='31']")private WebElement date;
	//@FindBy(xpath= "//input[@class='ng-tns-c27-9 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")
	//private WebElement startDd;
	@FindBy(xpath ="//input[@placeholder='Start Time']")private WebElement startDd;
	@FindBy(xpath= "//span[@class='pi pi-chevron-up']")private WebElement upArrow;
	//@FindBy(xpath= "//input[@class='ng-tns-c27-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")
	//private WebElement enddd;
	@FindBy(xpath ="//input[@placeholder='End Time']")private WebElement enddd;
	@FindBy(id= "agenda")private WebElement agendaTb;
	@FindBy(xpath = "//body//p")private WebElement meetingAgendaTb;
	public WebElement getMeetingAgendaTb() {
		return meetingAgendaTb;
	}
	@FindBy(xpath= "//span[text()='Select invite guests']")private WebElement inviteGuestDd;
	@FindBy(xpath= "//li[@class='ui-multiselect-item ui-corner-all']")private WebElement inviteGuest;
	@FindBy(xpath ="//span[@class='pi pi-times']") private WebElement crossmarkbtn;
	@FindBy(xpath= "//input[@class='undefined']")private WebElement guestTb;
	@FindBy(xpath= "//span[text()='Save']")private WebElement saveBtn;
	@FindBy(xpath= "(//i[@id='dropdownBasic1'])[2]")private WebElement meetingOptBtn;
	@FindBy(xpath= "//span[text()='Complete Meeting']")private WebElement completeMeetingBtn;
	@FindBy(xpath= "//span[text()='Cancel Meeting']")private WebElement cancelMeetingBtn;
	@FindBy(id= "mom")private WebElement meetingMinutesTb;
	@FindBy(xpath= "//span[text()='Complete']")private WebElement completeBtn;
	@FindBy(id= "comments")private WebElement commentsTb;
	@FindBy(xpath= "//span[text()='Cancel']")private WebElement cancelBtn;
	@FindBy(xpath = "(//td[@class='ng-star-inserted'])[2]")private WebElement records ;
	@FindBy(id= "dialog-okay-btn")private WebElement cancelAlertBtn;
	
	
	public WebElement getCompanyIcon() {
		return companyIcon;
	}

	public WebElement getCollateralIcon() {
		return collateralIcon;
	}

	public WebElement getProjectIcon() {
		return projectIcon;
	}
	public WebElement getContacticon() {
		return contacticon;
	}
	
	public WebElement getCrossmarkbtn() {
		return crossmarkbtn;
	}
	public WebElement getMeetingTabBtn() {
		return meetingTabBtn;
	}
	public WebElement getCreateMeetingBtn() {
		return createMeetingBtn;
	}
	public WebElement getTitleTb() {
		return titleTb;
	}
	public WebElement getWhereTb() {
		return whereTb;
	}
	public WebElement getWhenDd() {
		return whenDd;
	}
	public WebElement getDate() {
		return date;
	}
	public WebElement getStartDd() {
		return startDd;
	}
	public WebElement getUpArrow() {
		return upArrow;
	}
	public WebElement getEnddd() {
		return enddd;
	}
	public WebElement getAgendaTb() {
		return agendaTb;
	}
	public WebElement getInviteGuestDd() {
		return inviteGuestDd;
	}
	public WebElement getInviteGuest() {
		return inviteGuest;
	}
	public WebElement getGuestTb() {
		return guestTb;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getMeetingOptBtn() {
		return meetingOptBtn;
	}
	public WebElement getCompleteMeetingBtn() {
		return completeMeetingBtn;
	}
	public WebElement getCancelMeetingBtn() {
		return cancelMeetingBtn;
	}
	public WebElement getMeetingMinutesTb() {
		return meetingMinutesTb;
	}
	public WebElement getCompleteBtn() {
		return completeBtn;
	}
	public WebElement getCommentsTb() {
		return commentsTb;
	}
	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
	public WebElement getRecords() {
		return records;
	}
	public WebElement getCancelAlertBtn() {
		return cancelAlertBtn;
	}
	
	public void createMeeting(WebElement moduleName) throws Throwable
	{   
		TestData td=new TestData();
		//WebDriverUtil wdu=new WebDriverUtil();
		wdu.waitForElement(20);
		moduleName.click();
		Thread.sleep(5000);
		getRecords().click();
		Thread.sleep(3000);
		getMeetingTabBtn().click();
		getCreateMeetingBtn().click();
		
		getTitleTb().sendKeys("Meeting 0"+td.getNumber());
		getWhereTb().sendKeys("Machilipatnam");
		Thread.sleep(3000);
		getWhenDd().click();
		getDate().click();
		getStartDd().click();
		getUpArrow().click();
		getEnddd().click();
		getUpArrow().click();
		getUpArrow().click();
		if(moduleName !=getMeetingIcon())
		{
		getAgendaTb().sendKeys("An agenda is a list of meeting activities in the order in which they are to be taken up, beginning with the call to order and ending with adjournment. It usually includes one or more specific items of business to be acted upon. It may, but is not required to, include specific times for one or more activities.");
		}
		else 
		{
			Thread.sleep(3000);
			getMeetingAgendaTb().sendKeys("Added");
		}
		getInviteGuestDd().click();
		getInviteGuest().click();
		getCrossmarkbtn().click();
		Thread.sleep(3000);
		getGuestTb().sendKeys("sainadh@mailinator.com");
		wdu.enterKey();
		Thread.sleep(3000);
		getSaveBtn().click();
		Thread.sleep(5000);
	}
	
	public void completeMeeting() throws Throwable
	{
		Thread.sleep(5000);
		getMeetingOptBtn().click();
		Thread.sleep(15000);
		getCompleteMeetingBtn().click();
		getMeetingMinutesTb().sendKeys("Meeting Completed Successfully");
		Thread.sleep(3000);
		getCompleteBtn().click();
		//getCancelBtn().click();
	}
	public void cancelMeeting() throws Throwable
	{
		wdu.waitForElement(20);
		Thread.sleep(5000);
		getMeetingOptBtn().click();
		//Thread.sleep(15000);
	 wdu.waitForElement(Duration.ofSeconds(50), getCancelMeetingBtn());
		
		getCancelMeetingBtn().click();
		getCommentsTb().sendKeys("Meeting Cancelled");
		Thread.sleep(3000);
		getCancelBtn().click();
		Thread.sleep(3000);
		getCancelAlertBtn().click();
		
		
	}

	
	}
