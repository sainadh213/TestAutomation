package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericLibrary.TestData;

public class QlanaTaskPage {
	WebDriver driver;

	public QlanaTaskPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//td[@class='ng-star-inserted'])[2]")
	private WebElement records;
	public WebElement getCrossmarkbtn() {
		return crossmarkbtn;
	}

	@FindBy(xpath ="//span[@class='pi pi-times']") private WebElement crossmarkbtn;
	@FindBy(id ="mat-tab-label-0-5")
	private WebElement taskTab;
	@FindBy(xpath = "//span[contains(text(),'Create Task')]")
	private WebElement createTaskBtn;
	@FindBy(id = "title")
	private WebElement titleTb;
	@FindBy(id = "description")
	private WebElement descriptionTb;
	@FindBy(xpath = "//input[@placeholder='Select Due Date']")
	private WebElement dueDateDd;
	@FindBy(xpath = "//span[text()='31']")
	private WebElement date;
	
	@FindAll({@FindBy(xpath ="//span[text()='Select Assigned To']"),@FindBy(xpath ="//span[text()='Select assigned to']")})
	//@FindBy(xpath = "//span[text()='Select Assigned To']")
	private WebElement assignedToDd;
	@FindBy(xpath = "//li[@class='ui-multiselect-item ui-corner-all']")
	private WebElement assignedToDdOpt;
	@FindBy(xpath = "//input[@type='file']")
	private WebElement file;
	@FindBy(xpath = "//span[text()='Save']")
	private WebElement saveBtn;
	@FindBy(xpath ="(//i[@id='dropdownBasic1'])[2]")
	private WebElement actions;
	@FindBy(xpath = "//span[text()='Delete']")
	private WebElement deleteBtn;
	@FindBy(xpath = "//span[text()='Complete Task']")
	private WebElement completeTaskBtn;
	@FindBy(id = "dialog-okay-btn")
	private WebElement alertBtn;
	@FindBy(id = "comments")
	private WebElement commentsTb;
	@FindAll({@FindBy(xpath ="//span[text()='Complete']"),@FindBy(id ="submitBtn")})
	//@FindBy(xpath = "//span[text()='Complete']")
	private WebElement completeBtn;
	@FindBy(xpath = "//i[@class='icon-book']")
	private WebElement contacticon;
	@FindBy(xpath = "//i[@class='icomoon-company2']")
	private WebElement companyIcon;
	@FindBy(xpath = "//i[@class='icomoon-collateral']")
	private WebElement collateralIcon;
	@FindBy(xpath = "//i[@class='icon-folder-open']")
	private WebElement projectIcon;
	
	public WebElement getRecords() {
		return records;
	}
	public WebElement getTaskTab() {
		return taskTab;
	}
	public WebElement getCreateTaskBtn() {
		return createTaskBtn;
	}
	public WebElement getTitleTb() {
		return titleTb;
	}
	public WebElement getDescriptionTb() {
		return descriptionTb;
	}
	public WebElement getDueDateDd() {
		return dueDateDd;
	}
	public WebElement getDate() {
		return date;
	}
	public WebElement getAssignedToDd() {
		return assignedToDd;
	}
	public WebElement getAssignedToDdOpt() {
		return assignedToDdOpt;
	}
	public WebElement getFile() {
		return file;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getActions() {
		return actions;
	}
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	public WebElement getCompleteTaskBtn() {
		return completeTaskBtn;
	}
	public WebElement getAlertBtn() {
		return alertBtn;
	}
	public WebElement getCommentsTb() {
		return commentsTb;
	}
	public WebElement getCompleteBtn() {
		return completeBtn;
	}
	public WebElement getContacticon() {
		return contacticon;
	}
	public WebElement getCompanyIcon() {
		return companyIcon;
	}
	public WebElement getCollateralIcon() {
		return collateralIcon;
	}
	public WebElement getProjectIcon() {
		return projectIcon;
	}
	
	public void createTask(WebElement modulename) throws Throwable
	{
		TestData td=new TestData();
		String des="A task description is a document that outlines the key deliverables, milestones, activities, and timelines for a project or initiative. It is important to develop a clear and concise task description so that all stakeholders have a shared understanding of the work that needs to be accomplished.";
		modulename.click();
		Thread.sleep(2000);
		getRecords().click();
		Thread.sleep(2000);
		getTaskTab().click();
		getCreateTaskBtn().click();
		getTitleTb().sendKeys("Task@0"+td.getNumber());
		getDescriptionTb().sendKeys(des);
		getDueDateDd().click();
		getDate().click();
		getAssignedToDd().click();
		getAssignedToDdOpt().click();
		getCrossmarkbtn().click();
		getFile().sendKeys("D:\\Testing\\Png\\11 Kb.png");
		getSaveBtn().click();
		System.out.println("Task Created Successfully");
	}
	public void completeTask() throws Throwable
	{
		Thread.sleep(5000);
		getActions().click();
		getCompleteTaskBtn().click();
		getCommentsTb().sendKeys("Task Completed Successfully");
		getCompleteBtn().click();
		System.out.println("Task Completed Successfully");
	}
	public void deleteTask() throws Throwable
	{
		Thread.sleep(5000);
		getActions().click();
		getDeleteBtn().click();
		getAlertBtn().click();
		System.out.println("Task Deleted Successfully");
	}

}
