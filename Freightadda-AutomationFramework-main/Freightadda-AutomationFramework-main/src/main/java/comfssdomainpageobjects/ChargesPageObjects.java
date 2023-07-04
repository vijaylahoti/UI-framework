package comfssdomainpageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.TestActions;

public class ChargesPageObjects extends TestActions {
	WebDriver  driver;
	Logger log = Logger.getLogger(ChargeTypePageObjects.class);
	public ChargesPageObjects (WebDriver  driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 

	@FindBy(xpath="//li[@class='nav__items ']")
	public WebElement master_Module;

	@FindBy(xpath="//a[@href='/admin/charge/charge-table']")
	public WebElement charges_Card;

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

	@FindBy(xpath="//span[text()='Cancel']//parent :: button")
	public WebElement cancel_button;
	
	@FindBy(xpath="//div[text()='Admin Card']")
	public WebElement admin_cardText;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement update_button;
	
	@FindBy(xpath="//span[text()='Edit']")
	public WebElement editButton;
	
	@FindBy(xpath="//span[text()='Close']//parent :: button")
	public WebElement closeButton;
	
	@FindBy(xpath="(//span[text()='Master'])[2]")
	public WebElement masterLinkOnBreadcrumb;
	
	@FindBy(xpath="//i[@class='anticon anticon-undo']")
	public WebElement reloadSymbol;
	
	//
	@FindBy(xpath="(//span[text()='Charges'])[1]")
	public WebElement chargesLinkOnBreadcrumb;
	
	@FindBy(xpath="//span[text()='Charges Details']//parent::div")
	public WebElement chargesdetails_text;

	@FindBy(xpath="//span[text()='Charges Create']//parent::div")
	public WebElement chargesCreate_text;
	
	@FindBy(xpath="//span[text()='Charges']//parent::div")
	public WebElement charges_text;
	
	@FindBy(xpath="//span[text()='Charges Update']//parent::a")
	public WebElement charges_update_text;
	
	@FindBy(id="name")
	public WebElement charge_Name;

	@FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[2]")
	public WebElement taxOnBy_dropdown;
	
	@FindBy(xpath="//li[text()='GST 10%']")
	public WebElement gst10Percent;
	
	@FindBy(xpath="(//li[text()='GST 12%'])[1]")
	public WebElement gst12Percent; 
	
	@FindBy(xpath="(//li[text()='GST 18%'])[1]")
	public WebElement gst18Percent; 
	
	@FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[3]")
	public WebElement taxOnSell_dropdown;
	
	@FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[4]")
	public WebElement chargeUnit_dropdown;
	
	@FindBy(xpath="(//li[text()='PER KGS '])[1]")
	public WebElement chargeUnit_PERKGS; 

	@FindBy(id="sacCode")
	public WebElement sacCode;
	
	@FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[5]")
	public WebElement chargeType_dropdown;
	
	@FindBy(xpath="(//li[text()='ORIGIN CHARGES'])[1]")
	public WebElement chargeType_ORIGINCHARGES;

	@FindBy(xpath="(//li[text()='FRIGHT CHARGES'])[1]")
	public WebElement chargeType_FRIGHTCHARGES;
	
	@FindBy(xpath="(//li[text()='DESTINATION CHARGES'])[1]")
	public WebElement chargeType_DESTINATIONCHARGES;
	
	@FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[6]")
	public WebElement vendor_dropdown;
	
	@FindBy(xpath="//li[text()='Ravi Patil']")
	public WebElement vendor_RaviPatil;		
	
	@FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[7]")
	public WebElement currency_dropdown;
	
	@FindBy(xpath="//li[text()='INR']")
	public WebElement currency_INR;
	
	@FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[8]")
	public WebElement standingCharge_dropdown; 
	
	@FindBy(xpath="//li[text()='INCOME']")
	public WebElement standingCharge_INCOME; 
	
	@FindBy(xpath="///li[text()='REIMBURSEMENT']")
	public WebElement standingCharge_REIMBURSEMENT; 
	
	@FindBy(xpath="//li[text()='COST']")
	public WebElement standingCharge_COST; 
	
	@FindBy(id="description")
	public WebElement charge_Description;
	
	@FindBy(id="name[name]")
	public WebElement chargesNameOnFilterPage;
	
	
	public void navigateToAdminCardPageFromChargesPage() {
		this.click(master_Module);
		this.click(charges_Card);
		this.click(masterLinkOnBreadcrumb);
	}

	public void navigateToAdminCardPageFromChargesCreatePage() {
		this.click(charges_Card);
		this.click(createNew);
		this.click(masterLinkOnBreadcrumb);
	}
	
	public void navigateToAdminCardPageFromChargesDetailsPage() throws InterruptedException {
		this.click(charges_Card);
		Thread.sleep(2000);
		this.click(viewIcon);
		this.click(acceptAlert);	
		this.click(masterLinkOnBreadcrumb);
	}
	
	public void navigateToAdminCardPageFromChargesUpdatePage() throws InterruptedException {
		this.click(charges_Card);
		Thread.sleep(2000);
		this.click(editIcon);
		this.click(acceptAlert);	
		this.click(masterLinkOnBreadcrumb);
	}
	
	public void navigateToChargesPageFromChargesCreatePage() {
		this.click(charges_Card);
		this.click(createNew);
		this.click(chargesLinkOnBreadcrumb);
	}
	
	public void navigateToChargesPageFromChargesDetailsPage() throws InterruptedException {
		Thread.sleep(2000);
		this.click(viewIcon);
		this.click(acceptAlert);	
		this.click(chargesLinkOnBreadcrumb);
	}
	
	public void navigateToChargesPageFromChargesUpdatePage() throws InterruptedException {
		Thread.sleep(2000);
		this.click(editIcon);
		this.click(acceptAlert);	
		this.click(chargesLinkOnBreadcrumb);
	}
	
	
	
	public void openChargesCard() {
		this.click(master_Module);
		this.click(charges_Card);
	}
	
	public void clickOnCreateNew() {
		this.click(createNew);
	}
	
	public void clickOnMasterLinkOnBreadcrumb() {
		this.click(masterLinkOnBreadcrumb);
	}
	
	public void downloadChargesDetailsInEXCEL()  {
		this.click(exportAs);
		this.click(excel);
		this.click(excelgeneratedSuccessfully_Message);
	}
	
	public void downloadChargesDetailsInCSV() throws InterruptedException {
		this.click(exportAs);
		this.click(csv);
		this.click(csvgeneratedSuccessfully_Message);
	}
	public void clickOnViewIcon() throws InterruptedException{
		Thread.sleep(2000);
		//this.waitForEle(viewIcon);
		this.click(viewIcon);
		this.click(acceptAlert);	
	}
	public void clickOnEditIcon() throws InterruptedException{
		Thread.sleep(2000);
		//this.waitForEle(editIcon);
		this.click(editIcon);
		this.click(acceptAlert);
}
	
	public void viewCharges() throws InterruptedException{
		Thread.sleep(3000);
		//this.waitForEle(viewIcon);
		this.click(viewIcon);
		this.click(acceptAlert);	
	}
	public  void editCharge(String description) throws InterruptedException{
		Thread.sleep(2000);
		//this.waitForEle(editIcon);
		this.click(editIcon);
		this.click(acceptAlert);
		charge_Description.click();
		charge_Description.clear();
	    this.sendkeys(charge_Description,description);
		this.click(update_button);
		this.click(updatedSuccessfully_Message);
		
}
	public void filterCharge(String name) {
		this.click(filter_button);
		this.sendkeys(chargesNameOnFilterPage, name);
		this.click(okFilter);
		this.click(reloadSymbol);
	}
	
	public void clickOnCancelButton() {
		this.click(cancel_button);
	}
	public void clickOnCloseButton() {
		this.click(closeButton);
	}
	
	public String isAdminCardTextDisplayed() {
		String admincardText=admin_cardText.getText();
		return admincardText;
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
		String CSVgeneratedSuccessfullyMessage=csvgeneratedSuccessfully_Message.getText();
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
	
	public boolean validateCreateNewButtonDisplay( ) {
	    return createNew.isDisplayed();
	}
    public boolean validateCreateNewButtonEnable( ) {
	    return createNew.isEnabled();
	}
    public boolean validateExportAsButtonDisplay( ) {
	    return exportAs.isDisplayed();
	}
    public boolean validateExportAsButtonEnable( ) {
	    return exportAs.isEnabled();
	}
    public boolean validateFilterButtonDisplay( ) {
	    return filter_button.isDisplayed();
	}
    public boolean validateFilterButtonEnable( ) {
	    return filter_button.isEnabled();
	}
	
	
	//
	
	public String isChargesLinkTextDisplayed() {
		String ChargesLinkText=chargesLinkOnBreadcrumb.getText();
		return ChargesLinkText;
	}

	public String isChargesDetailsTextDisplayed() {
		String ChargesDetailsText=chargesdetails_text.getText();
		return ChargesDetailsText;
	}

	public String isChargesTextDispleyed() {
		String ChargesText=charges_text.getText();
		return ChargesText;
	}
	public String isChargesCreateTextDispleyed() {
		String ChargesCreateText=chargesCreate_text.getText();
		return ChargesCreateText;
	}
	public String isChargesUpdateTextDisplayed() {
		String 	ChargesUpdateText= charges_update_text.getText();
		return ChargesUpdateText;
	}
	
	public void createNewCharge(String name, String saccode,String description ) throws InterruptedException {
		this.sendkeys(charge_Name, name);
		this.click(taxOnBy_dropdown);
		this.click(gst12Percent);
		this.click(chargeUnit_dropdown);
		this.click(chargeUnit_PERKGS);
		this.sendkeys(sacCode,saccode);
		this.click(chargeType_dropdown);
		this.click(chargeType_ORIGINCHARGES);
		this.click(vendor_dropdown);
		this.click(vendor_RaviPatil);
		this.click(currency_dropdown);
		this.click(currency_INR);
		this.click(standingCharge_dropdown);
		this.click(standingCharge_INCOME);
		this.sendkeys(charge_Description, description);
		this.click(taxOnSell_dropdown);
		this.click(gst12Percent);
		
		this.click(save_button);
		this.click(CreatedSuccessfully_Message);
	}
}
	
	
	
	

