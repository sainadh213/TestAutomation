package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericLibrary.TestData;
import com.GenericLibrary.WebDriverUtil;

public class CompanyForms {
	WebDriverUtil wdu=new WebDriverUtil();
	TestData td=new TestData();
	WebDriver driver;
	public CompanyForms(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath = "//h5[text()='Basic Company Information']")private WebElement companyInfoBtn;
	@FindBy(xpath = "//h5[text()='Company Contact Information']")private WebElement contactInfoBtn;
	@FindBy(xpath = "//h5[text()='Financial Information']")private WebElement financialInfoBtn;
	@FindBy(xpath = "//h5[text()='Key Company Data']")private WebElement keyCompanyDataBtn;
	@FindBy(xpath = "//h5[text()='Customers']")private WebElement customersBtn;
	@FindBy(xpath = "//h5[text()='Competitors']")private WebElement competitorsBtn;
	@FindBy(xpath = "//h5[text()='Suppliers']")private WebElement suppliersBtn;
	@FindBy(xpath = "//h5[text()='Business Canvas']")private WebElement businessCanvasBtn;
	@FindBy(xpath = "//h5[text()='SWOT']")private WebElement swotBtn;
	@FindBy(xpath = "//h5[text()='Market Analysis']")private WebElement marketAnalysisBtn;
	@FindBy(xpath = "//h5[text()='5 Forces of Poter']")private WebElement forcesofPoterBtn;
	@FindBy(xpath = "//h5[text()='5 Factors of Production']")private WebElement factorsofProductionBtn;

       //Basic Infromation Form
	@FindBy(xpath = "(//i[@class='icon-calendar ui-state-default ng-star-inserted'])[1]")
	private WebElement registrationdateDD;
	@FindBy(xpath = "//span[text()='6']")private WebElement date;
	@FindBy(id = "registration_number")private WebElement registrationNumbertb;
	@FindBy(id = "vat_registration_number")private WebElement vatregistrationNumbertb;
	@FindBy(xpath = "(//i[@class='icon-calendar ui-state-default ng-star-inserted'])[2]")
	private WebElement tradingDatedd ;
	@FindBy(id = "income_tax_reference_number")private WebElement incomeTaxRefNotb;
	@FindBy(xpath = "//label[text()='Select section']")private WebElement sectionDd;
	@FindBy(xpath = "//label[text()='Select division ']")private WebElement divisionDd;
	@FindBy(xpath = "//label[text()='Select group ']")private WebElement groupDd;
	@FindBy(xpath = "//label[text()='Select class']")private WebElement classDd;
	@FindBy(xpath = "//label[text()='Select sub class']")private WebElement subClassDd;
	@FindBy(xpath = "(//li[@class='ui-dropdown-item ui-corner-all'])[last()]") private WebElement ddOpt;
	@FindBy(xpath = "//span[text()='Save']")private WebElement saveBtn;
	@FindBy(xpath ="(//span[@class='bredcrumb-item ng-star-inserted'])[2]")private WebElement breadCrumb;
	
	//Contact Information
	@FindBy(id = "contact_info.first_name")private WebElement firstNameTb;
	@FindBy(id = "contact_info.last_name")private WebElement lastNameTb;
	@FindBy(xpath  = "//label[text()='Select representative type']")private WebElement representativeTypeDd;
	@FindBy(id = "email")private WebElement emailTb;
	@FindBy(id = "contact_info.address_line_alt")private WebElement addressLine1Tb;
	@FindBy(id = "contact_info.postal_address_line")private WebElement addressLine2Tb;
	@FindBy(xpath = "//label[text()='Select region']")private WebElement regionDd;
	@FindBy(xpath = "//label[text()='Select city/ town']")private WebElement cityDd;
	@FindBy(id = "contact_info.postal_code")private WebElement postalCodeTb;
	
	//Financial Information
	@FindBy(xpath = "//span[text()='Yes']")private List<WebElement> radioBtn;
	@FindBy(xpath = "//label[text()='Select value']")private List<WebElement> selectValueDd;
	@FindBy(xpath = "//input[@placeholder='Enter number']")private List<WebElement> numberTb;
	
	
	
	public WebElement getBreadCrumb() {
		return breadCrumb ;
	}
	public WebElement getCompanyInfoBtn() {
		return companyInfoBtn;
	}
	public WebElement getContactInfoBtn() {
		return contactInfoBtn;
	}
	public WebElement getFinancialInfoBtn() {
		return financialInfoBtn;
	}
	public WebElement getKeyCompanyDataBtn() {
		return keyCompanyDataBtn;
	}
	public WebElement getCustomersBtn() {
		return customersBtn;
	}
	public WebElement getCompetitorsBtn() {
		return competitorsBtn;
	}
	public WebElement getSuppliersBtn() {
		return suppliersBtn;
	}
	public WebElement getBusinessCanvasBtn() {
		return businessCanvasBtn;
	}
	public WebElement getSwotBtn() {
		return swotBtn;
	}
	public WebElement getMarketAnalysisBtn() {
		return marketAnalysisBtn;
	}
	public WebElement getForcesofPoterBtn() {
		return forcesofPoterBtn;
	}
	public WebElement getFactorsofProductionBtn() {
		return factorsofProductionBtn;
	}
	public WebElement getRegistrationdateDD() {
		return registrationdateDD;
	}
	public WebElement getRegistrationNumbertb() {
		return registrationNumbertb;
	}
	public WebElement getVatregistrationNumbertb() {
		return vatregistrationNumbertb;
	}
	public WebElement getTradingDatedd() {
		return tradingDatedd;
	}
	public WebElement getIncomeTaxRefNotb() {
		return incomeTaxRefNotb;
	}
	public WebElement getSectionDd() {
		return sectionDd;
	}
	public WebElement getDivisionDd() {
		return divisionDd;
	}
	public WebElement getGroupDd() {
		return groupDd;
	}
	public WebElement getClassDd() {
		return classDd;
	}
	public WebElement getSubClassDd() {
		return subClassDd;
	}
	public WebElement getDdOpt() {
		return ddOpt;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public WebElement getDate() {
		return date;
	}
	
	public WebElement getFirstNameTb() {
		return firstNameTb;
	}
	public WebElement getLastNameTb() {
		return lastNameTb;
	}
	public WebElement getRepresentativeTypeDd() {
		return representativeTypeDd;
	}
	public WebElement getEmailTb() {
		return emailTb;
	}
	public WebElement getAddressLine1Tb() {
		return addressLine1Tb;
	}
	public WebElement getAddressLine2Tb() {
		return addressLine2Tb;
	}
	public WebElement getRegionDd() {
		return regionDd;
	}
	public WebElement getCityDd() {
		return cityDd;
	}
	public WebElement getPostalCodeTb() {
		return postalCodeTb;
	}
	public List<WebElement> getRadioBtn() {
		return radioBtn;
	}
	public List<WebElement> getSelectValueDd() {
		return selectValueDd;
	}
	public List<WebElement> getNumberTb() {
		return numberTb;
	}
	public void fillBasicInfo() throws Throwable
	{
		wdu.waitForElement(3000);
		getCompanyInfoBtn().click();
		//Thread.sleep(5000);
		//System.out.println("Basic Information form opened");
		
		getRegistrationdateDD().click();
		getDate().click();
		String id = td.getPhone();
		getRegistrationNumbertb().sendKeys(id);
		getVatregistrationNumbertb().sendKeys(id);
		getTradingDatedd().click();
		getDate().click();
		getIncomeTaxRefNotb().sendKeys(id);
		getSectionDd().click();
		getDdOpt().click();
		System.out.println("section selected");
		getDivisionDd().click();
		System.out.println("division opened selected");
		getDdOpt().click();
		System.out.println("division selected");
		getGroupDd().click();
		getDdOpt().click();
		getClassDd().click();
		getDdOpt().click();
		getSubClassDd().click();
		getDdOpt().click();
		//getSaveBtn().click();
		System.out.println("Basic Informaation saved successfully");
		Thread.sleep(5000);
		getBreadCrumb().click();
	}
		public void contactInformation()
		{
			getFirstNameTb().sendKeys("Sai");
			getLastNameTb().sendKeys("Nadh");
			getRepresentativeTypeDd().click();
			getDdOpt().click();
			getEmailTb().sendKeys("sainadh@mailinator.com");
			getAddressLine1Tb().sendKeys("");
			getAddressLine2Tb().sendKeys("");
			getRegionDd().click();
			getDdOpt().click();
		}
		
		
	}
	
	
	
	

