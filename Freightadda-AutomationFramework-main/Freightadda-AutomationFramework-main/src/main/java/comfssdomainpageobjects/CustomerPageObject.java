package comfssdomainpageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.TestActions;
import com.utilitiesclasses.Constants;


public class CustomerPageObject extends TestActions{
	public WebDriver driver;
	public CustomerPageObject(WebDriver driver){
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@class='nav__items ']")
	public WebElement master_Module;

	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	public WebElement createNew;
	
	@FindBy(xpath="//button[@class='ant-btn ant-dropdown-trigger']")
	public WebElement exportAs;
	
	@FindBy(xpath="//i[@class='anticon anticon-file-excel']")
	public WebElement excel;
	
	@FindBy(xpath="//i[@class='anticon anticon-file']")
	public WebElement csv;
	
	@FindBy(xpath="//div[@class='ant-message-custom-content ant-message-info']")
	public WebElement excelgeneratedSuccessfully_Message;

	@FindBy(xpath="//div[@class='ant-message-custom-content ant-message-info']")
	public WebElement csvgeneratedSuccessfully_Message;
	
	@FindBy(xpath="//span[text()='Created Successfully']")
	public WebElement CreatedSuccessfully_Message;
	
	@FindBy(xpath="(//i[@aria-label='icon: edit'])[1]")
	public WebElement editIcon;
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
	public WebElement acceptAlert;
	
	@FindBy(xpath="//div[@class='ant-message-custom-content ant-message-success']")
	public WebElement updatedSuccessfully_Message;
	
	@FindBy(xpath="//i[@class='anticon anticon-eye']")
	public WebElement viewIcon;
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary ant-btn-round']")
	public WebElement filter_button;

	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[2]")
    public WebElement okFilter;
	

	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[1]")
	public WebElement save_button;

	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[2]")
	public WebElement cancel_button;
	
	@FindBy(xpath="//div[text()='Admin Card']")
	public WebElement adminCardtext;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement update_button;
	
	@FindBy(xpath="//span[text()='Edit']")
	public WebElement editButton;
	
	@FindBy(xpath="//button[@class='ant-btn close-btn ant-btn-primary']")
	public WebElement closeButton;
	
	@FindBy(xpath="(//span[text()='Master'])[2]")
	public WebElement masterLinkOnBreadcrumb;
	
	@FindBy(xpath="//i[@class='anticon anticon-undo']")
	public WebElement reloadSymbol;

	
	//
	@FindBy(xpath="(//div[@class='ant-card ant-card-bordered'])[3]")
	WebElement customer_Card;
	
	
	@FindBy(xpath="(//span[text()='Customer'])[1]")
	WebElement customerLinkOnBreadcrumb;
	
	@FindBy(id="customerName")
	WebElement client_name;
	
	
	@FindBy(xpath="(//span[text()='Yes'])[1]")
	WebElement kycRadiobtn;
	
	@FindBy(id="commodity")
	WebElement commodity;
	

	@FindBy(id="natureOfBusiness")
	WebElement natureOfBussiness;
	
	@FindBy(id="creditLimit")
	WebElement creditedLimit;
	
	@FindBy(id="paymentTerms")
	WebElement paymentTerms;
	
	@FindBy(id="email")
	WebElement clientEmail;
	
	@FindBy(id="website")
	WebElement clientWebsite;
	
	@FindBy(id="faxNo")
	WebElement faxNumber;
	
	@FindBy(id="vatNumber")
	WebElement vatNumber;
	
	@FindBy(id="mobileNo")
	@CacheLookup
	WebElement mobileNumber;
	
	@FindBy(xpath="(//span[text()='Yes'])[5]")
	WebElement radiobtnRegisterGST;
	
	@FindBy(xpath="//input[@id='gstNumber']")
	WebElement gstNumber;
	
	
	
	@FindBy(xpath="(//span[text()='Yes'])[3]")
	WebElement radiobtnclearance;
	
	@FindBy(xpath="(//span[text()='Yes'])[4]")
	WebElement radiobtnsez;
	
	@FindBy(xpath="(//span[text()='Yes'])[2]")
	WebElement radiobtnwarehouse;
	
	@FindBy(id="remark")
	WebElement remark;
	
	@FindBy(id="iec")
	WebElement iecCode;
	
	@FindBy(id="fssBranch")
	WebElement drop_Branch;
	
	@FindBy(xpath="//li[text()='Mumbai']")
	WebElement mumbai_Branch;
	
	@FindBy(id="typeOfBusiness")
	WebElement drop_TypeOfBusiness;
	
	@FindBy(xpath="//li[text()='Import']")
	WebElement import_TypeOfBusiness;
	
	@FindBy(xpath="//li[text()='Export']")
	WebElement export_TypeOfBusiness;
	
	@FindBy(id="salesExecutive")
	WebElement drop_SalesExecutive;
	
	@FindBy(xpath="//li[text()='Sales Wale']")
	WebElement select_SalesExecutive;
	
	
	
	@FindBy(id="billingCurrency")
	WebElement drop_BillingCurrency;
	
	@FindBy(xpath="//li[text()='INR']")
	WebElement iNR_BillingCurrency;
	

	@FindBy(xpath="//div[@id='gstState']")
	public WebElement dropGSTState;
	

	@FindBy(xpath="//li[text()='Maharashtra']")
	public WebElement stateMaharashtra;
	
	@FindBy(xpath="//button[@id='addAddress']")
    WebElement btnAddAdress;
	
	@FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[8]")
	WebElement drop_AdressType;
	
	@FindBy(xpath="//li[text()='Primary Address']")
	WebElement primary_AdressType;
	
	@FindBy(id="address[1][addressLine1]")
	WebElement adressLine1;
	
	
	@FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[9]")
	WebElement dropCountry;
	
	
	@FindBy(xpath="//li[text()='INDIA']")
	WebElement india_Country;
	
	@FindBy(id="address[1][city]")
	WebElement city;
	
	@FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[10]")
	WebElement dropState;
	
	
	@FindBy(id="address[1][phone]")
	WebElement phoneNumber;
	
	@FindBy(id="address[1][postalCode]")
	WebElement zipCode;

	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement saveAddress;
	
	@FindBy(xpath="//button[@id='addContact']")
	WebElement btnAddContact;
	
	@FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[11]")
	WebElement dropTitle;
	
	@FindBy(xpath="//li[text()='Mr']")
	WebElement mr;
			
	@FindBy(id="contactPerson[2][firstName]")
	WebElement firstName;
	
	@FindBy(id="contactPerson[2][middleName]")
	WebElement middleName;
	
	@FindBy(id="contactPerson[2][lastName]")
	WebElement lastName;
	
	@FindBy(id="contactPerson[2][email]")
	WebElement email;
	
	@FindBy(id="contactPerson[2][designation]")
	WebElement designation;
	
	@FindBy(id="contactPerson[2][phone]")
	WebElement phoneNo;
	
	@FindBy(xpath="//span[text()='Save']//parent::button")
	WebElement saveContact;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement saveAll;
	
	@FindBy(xpath="//span[text()='KYC Status']//parent::button")
	WebElement kycStatus;
	
	@FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[2]")
	WebElement dropKYCStatus;
	
	@FindBy(xpath="//li[text()='APPROVED']")
	WebElement approved;
	
	@FindBy(id="name")
	WebElement documentName;
	
	@FindBy(xpath="//button[@class='ant-btn']")
	WebElement upload;
	
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[3]")
	WebElement saveKYC;
	

	@FindBy(xpath="(//span[text()='Customer'])[2]")
	WebElement customertext;
	
	@FindBy(xpath="(//span[text()='Customer Create'])[2]")
	WebElement customerCreatetext;
	
	@FindBy(xpath="//div[@class='ant-card-meta-title']")
	WebElement customerdetailstext;
	
	@FindBy(xpath="(//span[text()='Customer Update'])[2]")
	WebElement customerUpdatetext;
	
	@FindBy(id="customerName[customerName]")
	WebElement customerNameOnFilterPage;
	
	
	@FindBy(xpath="//span[text()='KYC DOCUMENT.pdf']")
	WebElement kycDocumentPDF;

	public void navigateToAdminCardPageFromCustomerPage() {
		this.click(master_Module);
		this.click(customer_Card);
		this.click(masterLinkOnBreadcrumb);
	}

	public void navigateToAdminCardPageFromCustomerCreatePage() {
		this.click(customer_Card);
		this.click(createNew);
		this.click(masterLinkOnBreadcrumb);
	}
	
	public void navigateToAdminCardPageFromCustomerDetailsPage() throws InterruptedException {
		this.click(customer_Card);
		Thread.sleep(2000);
		this.click(viewIcon);
		this.click(acceptAlert);	
		this.click(masterLinkOnBreadcrumb);
	}
	
	public void navigateToAdminCardPageFromCustomerUpdatePage() throws InterruptedException {
		this.click(customer_Card);
		Thread.sleep(2000);
		this.click(editIcon);
		this.click(acceptAlert);	
		this.click(masterLinkOnBreadcrumb);
	}
	
	public void navigateToCustomerPageFromCustomerCreatePage() {
		this.click(customer_Card);
		this.click(createNew);
		this.click(customerLinkOnBreadcrumb);
	}
	
	public void navigateToCustomerPageFromCustomerDetailsPage() throws InterruptedException {
		Thread.sleep(2000);
		this.click(viewIcon);
		this.click(acceptAlert);	
		this.click(customerLinkOnBreadcrumb);
	}
	
	public void navigateToCustomerPageFromCustomerUpdatePage() throws InterruptedException {
		Thread.sleep(2000);
		this.click(editIcon);
		this.click(acceptAlert);	
		this.click(customerLinkOnBreadcrumb);
	}
	
	public void openCustomerCard() {
		this.click(master_Module);
		customer_Card.click();
	}
	
	public void clickOnCreateNew() {
		this.click(createNew);
	}
	
	public void downloadCustomerInEXCEL()  {
		this.click(exportAs);
		this.click(excel);
		this.click(excelgeneratedSuccessfully_Message);
	}
	
	public void downloadCustomerInCSV() throws InterruptedException {
		this.click(exportAs);
		this.click(csv);
		this.click(csvgeneratedSuccessfully_Message);
	}
	
	public void clickOnViewIcon() throws InterruptedException{
		Thread.sleep(2000);
		this.waitForEle(viewIcon);
		this.click(viewIcon);
		this.click(acceptAlert);	
	}
	public void clickOnEditIcon() throws InterruptedException{
		Thread.sleep(2000);
		this.click(editIcon);
		this.click(acceptAlert);
}

	public void viewCustomer() throws InterruptedException{
		Thread.sleep(2000);
		this.waitForEle(viewIcon);
		this.click(viewIcon);
		this.click(acceptAlert);	
	}
	public  void editCustomer(String mobNo) throws InterruptedException{
		Thread.sleep(2000);
		this.waitForEle(editIcon);
		this.click(editIcon);
		this.click(acceptAlert);
		Thread.sleep(3000);
		mobileNumber.click();
		mobileNumber.clear();
	    this.sendkeys(mobileNumber,mobNo);
		this.click(update_button);
}
	
	public void filterCustomer(String name) {
		this.click(filter_button);
		this.sendkeys(customerNameOnFilterPage, name);
		this.click(okFilter);
		this.click(reloadSymbol);
	}
	
	public void clickOnSaveButton() {
		this.click(save_button);
	} 
	public void clickOnCancelButton() {
		this.click(cancel_button);
	}
	public void clickOnCloseButton() {
		this.click(closeButton);
	}
	public String isAdminCardTextDisplayed() {
		String adminCardText=adminCardtext.getText();
		return adminCardText;
	}
	public String isCreateNewButtonTextDisplayed() {
		String CreateNewButtonText=createNew.getText();
		return CreateNewButtonText;
	}
	public String isExportAsButtonTextDisplayed() {
		String ExportAsButtonText=exportAs.getText();
		return ExportAsButtonText;
	}
	public String isFilterButtonTextDisplayed() {
		String FilterButtonText=filter_button.getText();
		return FilterButtonText;
	}
	public String isMasterLinkTextDisplayed() {
		String MasterLinkText=masterLinkOnBreadcrumb.getText();
		return MasterLinkText;
	}
	public String isCreatedSuccessfullyMessageDisplayed() {
		String CreatedSuccessfullyMessage=CreatedSuccessfully_Message.getText();
		return CreatedSuccessfullyMessage;
	}
	public String isEXCELgeneratedSuccessfullyMessageDisplayed() {
		String EXCELgeneratedSuccessfullyMessage=excelgeneratedSuccessfully_Message.getText();
		return EXCELgeneratedSuccessfullyMessage;
	}
	public String isCSVgeneratedSuccessfullyMessageDisplayed() {
		String CSVgeneratedSuccessfullyMessage=excelgeneratedSuccessfully_Message.getText();
		return CSVgeneratedSuccessfullyMessage;
	}
	
	
	public String isUpdatedSuccessfullyMessageDisplayed() {
		String UpdatedSuccessfullyMessage=updatedSuccessfully_Message.getText();
		return UpdatedSuccessfullyMessage;
	}
	
	
	public String isEditButtonTextDisplayed() {
		String EditButtonText=editButton.getText();
		return EditButtonText;
	}
	
	public String isCloseButtonTextDisplayed() {
		String CloseButtonText=closeButton.getText();
		return CloseButtonText;
	}
	
	public String isSaveButtonTextDisplayed() {
		String SaveButtonText=save_button.getText();
		return SaveButtonText;
	}
	public String isCancelButtonTextDisplayed() {
		String CancelButtonText=cancel_button.getText();
		return CancelButtonText;
	}
	
	public String isUpadateButtonDisplayed() {
		String 	updatebutton= update_button.getText();
		return updatebutton;
	}
	
	public String isKycDocumentPDFDisplayed() {
		String 	KycDocumentPDF= kycDocumentPDF.getText();
		return KycDocumentPDF;
	}

	public void enterClientdetails(String name,String NatureOfBussiness,String Commodity,String CreditLimit, 
	    String PaymentTerms,String Email,	String FaxNumber,String Website,
		String VatNumber,String MobileNumber,String GSTNumber,String Remark,String IECCode) throws InterruptedException {
		this.sendkeys(client_name, name);
		this.click(kycRadiobtn);
		this.click(drop_Branch);
		this.click(mumbai_Branch);
		this.sendkeys(natureOfBussiness, NatureOfBussiness);
		this.sendkeys(commodity, Commodity);
		this.click(drop_TypeOfBusiness);
		this.click(import_TypeOfBusiness);
		
		this.click(drop_SalesExecutive);
		this.click(select_SalesExecutive);
		this.click(drop_BillingCurrency);
		this.click(iNR_BillingCurrency);
		this.sendkeys(creditedLimit, CreditLimit);
		this.sendkeys(paymentTerms, PaymentTerms);
		this.sendkeys(clientEmail, Email);
		this.sendkeys(faxNumber, FaxNumber);
		this.sendkeys(clientWebsite, Website);
		this.sendkeys(vatNumber, VatNumber);
		this.sendkeys(mobileNumber, MobileNumber);
		this.click(radiobtnwarehouse);
		this.click(radiobtnclearance);
		this.click(radiobtnRegisterGST);
		this.click(dropGSTState);
		this.click(stateMaharashtra);
		this.click(radiobtnsez);
		this.sendkeys(remark, Remark);
		this.sendkeys(iecCode, IECCode);
		this.sendkeys(gstNumber, GSTNumber);
	}
	
	public void enterClientAddressdetails(String address,String City,String phone,String postalCode ) {
		this.click(btnAddAdress);
		this.click(drop_AdressType);
		this.click(primary_AdressType);
		this.sendkeys(adressLine1,address );
		this.click(dropCountry);
		this.click(india_Country);
		this.sendkeys(city,City);
		this.sendkeys(phoneNumber, phone);
		this.sendkeys(zipCode, postalCode);
		
		
	}
  public void enterClientContactdetails(String fName,String lName,String email_,String design,String phNo ) {
	    this.click(btnAddContact);
	 // Code for Scroll down
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(50, document.body.scrollHeight)");
	    this.click(dropTitle);
		this.click(mr);
		this.sendkeys(firstName,fName );
		this.sendkeys(lastName,lName);
		this.sendkeys(email, email_);
		this.sendkeys(designation, design);
		this.sendkeys(phoneNo, phNo);
		this.click(saveContact);
		this.click(CreatedSuccessfully_Message);
	}
  
  public void uploadKYCDocument(String name) throws AWTException {
	  this.click(kycStatus);
	  this.click(dropKYCStatus);
	  this.click(approved);
	  this.sendkeys(documentName, name);
	  this.click(upload);
	  Robot robot = new Robot();
      // Delay before starting the file upload process
      robot.delay(2000);
      // Type the file path using the Robot class
      StringSelection selection = new StringSelection(Constants.kycdocumentPath );
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
      robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      // Delay between pasting the file path and pressing Enter
      robot.delay(1000);
      // Press Enter to confirm the file upload
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);
	  this.click(saveKYC);
  }
	

public String isCustomerDetailsTextDisplayed() {
	String customerDetailsText=customerdetailstext.getText();
	return customerDetailsText;
}

public String isCustomerLinkTextDisplayed() {
	String customerLinkText=customerLinkOnBreadcrumb.getText();
	return customerLinkText;
}
public String isCustomerTextDispleyed() {
	String customerText=customertext.getText();
	return customerText;
}

public String isCustomerUpdateTextDisplayed() {
	String 	customerUpadateText= customerUpdatetext.getText();
	return customerUpadateText;
}
public String isCustomerCreateTextDispleyed() {
	String customerCreateText=customerCreatetext.getText();
	return customerCreateText;
}
		
	
	
    
}
     
