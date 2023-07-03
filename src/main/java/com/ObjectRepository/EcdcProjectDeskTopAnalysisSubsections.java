package com.ObjectRepository;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericLibrary.BaseClass;
import com.GenericLibrary.Constants;

public class EcdcProjectDeskTopAnalysisSubsections {
	WebDriver driver;

	public EcdcProjectDeskTopAnalysisSubsections(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//i[@class='icon-folder-open ng-star-inserted']")private WebElement projectIcon;
    public WebElement getProjectIcon() {
		return projectIcon;
	}
   /* @FindBy(xpath ="//span[text()='$projectName']")private WebElement projectTitle;
	public WebElement getProjectTitle() {
		return projectTitle;
	}*/
	@FindBy(xpath ="(//span[@class='bredcrumb-item ng-star-inserted'])[2]")private WebElement bredcrumb;
	public WebElement getBredcrumb() {
		return bredcrumb;
	}
	@FindBy(xpath = "//h5[text()='Basic Information']")
	private WebElement basicInfo;
	@FindBy(xpath = "//h5[text()='Facility Information']")
	private WebElement facilityInfo;
	@FindBy(xpath = "//h5[text()='Pre-approval Checklist']")
	private WebElement preApprovalCheckList;
	@FindBy(xpath = "//h5[text()='Pre-approval Documents']")
	private WebElement preApprovalDoc;
	@FindBy(xpath = "//h5[text()='Submission Report']")
	private WebElement submissionReport;
	@FindBy(xpath = "//h5[text()='Financial Model']")
	private WebElement financialModel;
	@FindBy(xpath = "//h5[text()='Committee Minutes']")
	private WebElement committeeMinutes;
	@FindBy(xpath = "//h5[text()='Implementation Documents']")
	private WebElement implementationDocuments;
	@FindBy(xpath = "//h5[text()='Legal Agreement']")
	private WebElement legalAgreement;
	@FindBy(xpath = "//h5[text()='Disbursement Checklist']")
	private WebElement disbursementChecklist;
	@FindBy(xpath = "//h5[text()='Implementation Checklist - Legal Officer']")
	private WebElement implementationChecklistLegalOfficer;
	@FindBy(xpath = "//h5[text()='Implementation Checklist - Consultant']")
	private WebElement implementationChecklistConsultant;

	// Basic Information

	//@FindBy(xpath ="//p-dropdown[@id='formly_10_select_funding_3']")
	//@FindBy(xpath ="//span[@class='ui-dropdown-trigger-icon ui-clickable icon-angle-down']")
	@FindBy(id ="formly_10_select_funding_3")
	private WebElement FundingForDd;
	
	@FindBy(xpath = "//li[@role='option']")
	private WebElement ddOpt;
	@FindBy(id = "funding_amount")
	private WebElement funding_amountTb;
	@FindBy(xpath = "//span[text()='Yes']")
	private WebElement yesRadiobtn;
	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	private WebElement dateDD;
	@FindBy(xpath = "//span[text()='1']")
	private WebElement date;

	@FindAll({@FindBy(xpath ="(//span[text()='Save'])[2]"), @FindBy(id = "submitBtn"), @FindBy(id = "btnSave")})
	private WebElement saveBtn;
	@FindBy(xpath = "//span[text()='Save & Continue']")
	private WebElement SaveAndContinueBtn;
	@FindBy(xpath = "//i[@class='icon-angle-right']")
	private WebElement navigationBtn;

	// FacilityInformation

	@FindBy(xpath = "//span[text()='Add New Facility']")
	private WebElement addNewFacilityBtn;
	@FindBy(xpath = "//label[text()='Select Product Type']")
	private WebElement productTypeDd;
	@FindBy(xpath = "//span[text()='Loan']")
	private WebElement loanOpt;
	@FindBy(xpath = "//label[text()='Select Product Sub Type']")
	private WebElement productSubTypeDd;
	// (xpath ="//li[@role='option']")private WebElement subTypeDdOpt;
	@FindBy(xpath = "//label[text()='Select Product Name']")
	private WebElement productNameDd;
	@FindBy(xpath = "//input[@placeholder='Enter Facility Amount']")
	private WebElement facilityAmountTb;

	// Pre-approval Checklist

	@FindAll({ @FindBy(id = "C-17__ZC__SC-23__ZC__Q-141"), @FindBy(id = "financial_model.comments") })
	private WebElement commentsTb;

	// Pre-approval Documents
	@FindBy(xpath = "//span[text()='Upload Documents']")
	private WebElement uploadDocumentsBtn;
	@FindBy(xpath = "//label[text()='Select document type']")
	private WebElement documentTypeDd;
	@FindBy(xpath = "//input[@type='file']")
	private WebElement document;
	@FindBy(id = "description")
	private WebElement descriptionTb;

	// Submission Reports
	@FindBy(id = "submission_reports.item_no")
	private WebElement itemNumberTb;
	@FindBy(xpath  ="//body[@data-mce-placeholder='Enter financial information of support required']")private List<WebElement> fields;
	//@FindBy(xpath  ="(//div[@class='tox-edit-area'])[2]")private WebElement fields;
	@FindBy(xpath = "//div[@class='tox-statusbar']")
	private WebElement htmlFields;

	public WebElement getBasicInfo() {
		return basicInfo;
	}

	public WebElement getFacilityInfo() {
		return facilityInfo;
	}

	public WebElement getPreApprovalCheckList() {
		return preApprovalCheckList;
	}

	public WebElement getPreApprovalDoc() {
		return preApprovalDoc;
	}

	public WebElement getSubmissionReport() {
		return submissionReport;
	}

	public WebElement getFinancialModel() {
		return financialModel;
	}

	public WebElement getCommitteeMinutes() {
		return committeeMinutes;
	}

	public WebElement getImplementationDocuments() {
		return implementationDocuments;
	}

	public WebElement getLegalAgreement() {
		return legalAgreement;
	}

	public WebElement getDisbursementChecklist() {
		return disbursementChecklist;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getImplementationChecklistLegalOfficer() {
		return implementationChecklistLegalOfficer;
	}

	public WebElement getImplementationChecklistConsultant() {
		return implementationChecklistConsultant;
	}

	public WebElement getFundingForDd() {
		return FundingForDd;
	}

	public WebElement getDdOpt() {
		return ddOpt;
	}

	public WebElement getFunding_amountTb() {
		return funding_amountTb;
	}

	public WebElement getYesRadiobtn() {
		return yesRadiobtn;
	}

	public WebElement getDateDD() {
		return dateDD;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getSaveAndContinueBtn() {
		return SaveAndContinueBtn;
	}

	public WebElement getNavigationBtn() {
		return navigationBtn;
	}

	public WebElement getAddNewFacilityBtn() {
		return addNewFacilityBtn;
	}

	

	public WebElement getProductTypeDd() {
		return productTypeDd;
	}

	public WebElement getProductSubTypeDd() {
		return productSubTypeDd;
	}

	public WebElement getProductNameDd() {
		return productNameDd;
	}

	public WebElement getLoanOpt() {
		return loanOpt;
	}

	

	public WebElement getFacilityAmountTb() {
		return facilityAmountTb;
	}

	public WebElement getCommentsTb() {
		return commentsTb;
	}

	public WebElement getUploadDocumentsBtn() {
		return uploadDocumentsBtn;
	}

	public WebElement getDocumentTypeDd() {
		return documentTypeDd;
	}

	public WebElement getDocument() {
		return document;
	}

	public WebElement getDescriptionTb() {
		return descriptionTb;
	}

	public WebElement getItemNumberTb() {
		return itemNumberTb;
	}

	public WebElement getHtmlFields() {
		return htmlFields;
	}
	public List<WebElement> getFields() {
		return fields;
	}
	public void basicInfo() throws Throwable {
		getBasicInfo().click();
		Thread.sleep(5000);
		//WebDriverUtil wdu=new WebDriverUtil();
		//wdu.waitForElement(Duration.ofSeconds(30), FundingForDd);
		getFundingForDd().click();
		getDdOpt().click();
		if (getFunding_amountTb().isDisplayed()) {
			getFunding_amountTb().sendKeys("5254466200");
		}
		if (getYesRadiobtn().isDisplayed()) {
			getYesRadiobtn().click();
		}
		if (getDateDD().isDisplayed()) {
			
			getDateDD().click();
			getDate().click();
		}

		Thread.sleep(5000);
		//getSaveBtn().click();
		Thread.sleep(5000);
		//getBredcrumb().click();
	}
     public void facilityInfo()
     {
    	 getFacilityInfo().click();;
    	 getAddNewFacilityBtn().click();
    	 getProductTypeDd().click();
    	 getLoanOpt().click();
    	 getProductSubTypeDd().click();
    	 getDdOpt().click();
    	 getProductNameDd().click();
    	 getDdOpt().click();
    	 getFacilityAmountTb().sendKeys("5654412200");
    	 getSaveBtn().click();
    	 //getBredcrumb().click();
     }
     public void preApprovalChecklist() throws Throwable
     {
    	 getPreApprovalCheckList().click();
    	 Thread.sleep(3000);
    	/* if(commentsTb.isDisplayed())
    	 {
    	// getCommentsTb().sendKeys(data);
    	 }*/
    			List<WebElement> radioBtns = BaseClass.driver.findElements(By.xpath("//label[@class='custom-control custom-radio']"));
    			//System.out.println(radioBtns.size());
    			int count=1;
    			for (WebElement btn : radioBtns) {
    				if(count==1 || count==4 || count==6 || count==7 || count==10 || count==12|| count==13 || count==15 || count==18
    						|| count==19|| count==22|| count==24|| count==25|| count==27|| count==30|| count==31 || count==34 || count==35
    						|| count==37 || count==40 || count==42 || count==43)
    				{
    					Thread.sleep(3000);
					btn.click();
    				}
    				count++;
    				//System.out.println(btn.getText()+count);
				}
     }
     public void preApprovalDoc() throws Throwable
     {
    	 getPreApprovalDoc().click();
    	 getUploadDocumentsBtn().click();
    	 getDocumentTypeDd().click();
    	 getDdOpt().click();
    	 getDocument().sendKeys(Constants.file);
    	 getDescriptionTb().sendKeys(Constants.data);
    	 Thread.sleep(3000);
    	 getSaveBtn().click();
     }
     public void submissionReports() throws Throwable
     {
    	 getSubmissionReport().click();
    	 Thread.sleep(30000);
    	 getItemNumberTb().sendKeys("4558844155");
    	 try {
             // Attempt to find the frame element
             WebElement frame = BaseClass.driver.findElement(By.tagName("iframe"));
             System.out.println("Frame exists.");
             BaseClass.driver.switchTo().frame(frame);
             System.out.println("Entered into frame");
         	System.out.println(getFields().size());
         	BaseClass.driver.switchTo().defaultContent();
         	
         	 
         	 for (WebElement field : fields) {
         		 System.out.println(field.getText());
         		 Thread.sleep(10000);
         		field.sendKeys(Constants.data);
             	 System.out.println("Data Entered");
         		
         	 //System.out.println(getFields().isDisplayed());
         	 
     			//getFields().sendKeys(Constants.data);
     			
     		}
         } catch (NoSuchElementException e) {
             System.out.println("Frame does not exist.");
         }
    	/*BaseClass.driver.switchTo().frame("//iframe[@id='_tinymce-ib6uxip812f_ifr']");
    	System.out.println(getFields().size());
    	 
    	 for (WebElement field : fields) {
    		 System.out.println(field.getText());
    		 Thread.sleep(60000);
    		
        	 System.out.println("Data Entered");
    		field.sendKeys(Constants.data);
    	 //System.out.println(getFields().isDisplayed());
    	 
			//getFields().sendKeys(Constants.data);
			
		}*/
     }
     public void financialModel()
     {
    	 getFinancialModel().click();
    	 getCommentsTb().sendKeys(Constants.data);
    	 getDocument().sendKeys("C:\\Users\\SaiNadh\\Downloads\\FinancialModel (1).xlsx");
     }
     public void deskTopAnalysis(String projectTitle) throws Throwable
     {
    	 getProjectIcon().click();
    	 Thread.sleep(6000);
    	 BaseClass.driver.findElement(By.xpath("//span[text()='"+  projectTitle +  "']")).click();
    	 //getProjectTitle().click();
    	 basicInfo();
    	 Thread.sleep(5000);
    	 getBredcrumb().click();
    	 facilityInfo();
    	 Thread.sleep(5000);
    	 getBredcrumb().click();
    	 preApprovalChecklist();
    	 Thread.sleep(5000);
    	 getBredcrumb().click();
    	 preApprovalDoc();
    	 Thread.sleep(5000);
    	 getBredcrumb().click();
    	 if(getFinancialModel().isDisplayed())
    	 {
    		 financialModel();
    	 }
    	 
    	
    	 
     }

	
}
