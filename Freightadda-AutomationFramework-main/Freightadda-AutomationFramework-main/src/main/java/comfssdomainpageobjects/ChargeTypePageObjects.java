package comfssdomainpageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.TestActions;


public class ChargeTypePageObjects extends TestActions {
	WebDriver  driver;
	Logger log = Logger.getLogger(ChargeTypePageObjects.class);
	public ChargeTypePageObjects (WebDriver  driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@class='nav__items ']")
	public WebElement master_Module;

	@FindBy(xpath="//a[@href='/admin/charge-type/charge-type-table']")
	public WebElement chargeType_Card;

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
	@FindBy(xpath="(//span[text()='Charge Type'])[1]")
	public WebElement chargeTypeLinkOnBreadcrumb;
	
	@FindBy(xpath="//span[text()='Charge Type Details']//parent::div")
	public WebElement chargeTypedetails_text;

	@FindBy(xpath="//span[text()='Charge Type Create']//parent::div")
	public WebElement chargeTypeCreate_text;
	
	@FindBy(xpath="//span[text()='Charge Type']//parent::div")
	public WebElement chargeType_text;
	
	@FindBy(xpath="//span[text()='Charge Type Update']//parent::a")
	public WebElement chargeType_update_text;
	
	@FindBy(id="name")
	public WebElement chargeType_Name;

	@FindBy(id="code")
	public WebElement chargeType_Code;
	
	@FindBy(id="name[name]")
	public WebElement chargeTypeNameOnFilter;
	
	public void navigateToAdminCardPageFromChargeTypePage() {
		this.click(master_Module);
		this.click(chargeType_Card);
		this.click(masterLinkOnBreadcrumb);
	}

	public void navigateToAdminCardPageFromChargeTypeCreatePage() {
		this.click(chargeType_Card);
		this.click(createNew);
		this.click(masterLinkOnBreadcrumb);
	}
	
	public void navigateToAdminCardPageFromChargeTypeDetailsPage() throws InterruptedException {
		this.click(chargeType_Card);
		Thread.sleep(2000);
		this.click(viewIcon);
		this.click(acceptAlert);	
		this.click(masterLinkOnBreadcrumb);
	}
	
	public void navigateToAdminCardPageFromChargeTypeUpdatePage() throws InterruptedException {
		this.click(chargeType_Card);
		Thread.sleep(2000);
		this.click(editIcon);
		this.click(acceptAlert);	
		this.click(masterLinkOnBreadcrumb);
	}
	
	public void navigateToChargeTypePageFromChargeTypeCreatePage() {
		this.click(chargeType_Card);
		this.click(createNew);
		this.click(chargeTypeLinkOnBreadcrumb);
	}
	
	public void navigateToChargeTypePageFromChargeTypeDetailsPage() throws InterruptedException {
		Thread.sleep(2000);
		this.click(viewIcon);
		this.click(acceptAlert);	
		this.click(chargeTypeLinkOnBreadcrumb);
	}
	
	public void navigateToChargeTypePageFromChargeTypeUpdatePage() throws InterruptedException {
		Thread.sleep(2000);
		this.click(editIcon);
		this.click(acceptAlert);	
		this.click(chargeTypeLinkOnBreadcrumb);
	}
	
	public void openChargeTypeCard() {
		this.click(master_Module);
		this.click(chargeType_Card);
	}
	
	public void clickOnCreateNew() {
		this.click(createNew);
	}
	
	public void downloadChargeTypeDetailsInEXCEL()  {
		this.click(exportAs);
		this.click(excel);
		this.click(excelgeneratedSuccessfully_Message);
	}
	
	public void downloadChargeTypeDetailsInCSV() throws InterruptedException {
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
	
	public void viewChargeType() throws InterruptedException{
		Thread.sleep(3000);
		//this.waitForEle(viewIcon);
		this.click(viewIcon);
		this.click(acceptAlert);	
	}
	public  void editChargeType(String code) throws InterruptedException{
		Thread.sleep(2000);
		//this.waitForEle(editIcon);
		this.click(editIcon);
		this.click(acceptAlert);
		chargeType_Name.click();
		chargeType_Name.clear();
	    this.sendkeys(chargeType_Name,code);
		this.click(update_button);
		this.click(updatedSuccessfully_Message);
		
}
	public void filterChargeType(String name) {
		this.click(filter_button);
		this.sendkeys(chargeTypeNameOnFilter, name);
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
	
	public void clickOnChargeTypeLinkOnBreadcrumb() {
		this.click(chargeTypeLinkOnBreadcrumb);
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
	
	public String isChargeTypeLinkTextDisplayed() {
		String ChargeTypeLink=chargeTypeLinkOnBreadcrumb.getText();
		return ChargeTypeLink;
	}

	public String isChargeTypeDetailsTextDisplayed() {
		String ChargeTypeDetailsText=chargeTypedetails_text.getText();
		return ChargeTypeDetailsText;
	}

	public String isChargeTypeTextDispleyed() {
		String ChargeTypetext=chargeType_text.getText();
		return ChargeTypetext;
	}
	public String isChargeTypeCreateTextDispleyed() {
		String ChargeTypeCreateText=chargeTypeCreate_text.getText();
		return ChargeTypeCreateText;
	}
	public String isChargeTypeUpdateTextDisplayed() {
		//this.waitForEle(airline_update_text);
		String 	ChargeTypedupadatetext= chargeType_update_text.getText();
		return ChargeTypedupadatetext;
	}
	
	public void createChargeType(String name, String code) {
		this.sendkeys(chargeType_Name, name);
		this.sendkeys(chargeType_Code, code);
		this.click(save_button);
		this.click(CreatedSuccessfully_Message);
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

