package comfssdomainpageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.TestActions;


public class ChargeUnitPageObjects extends TestActions {
	Logger log = Logger.getLogger(ChargeUnitPageObjects.class);

	WebDriver driver;
	public ChargeUnitPageObjects(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	} 


	@FindBy(xpath="//li[@class='nav__items ']")
	public WebElement master_Module;

	@FindBy(xpath="//a[@href='/admin/charge-unit/charge-unit-table']")
	public WebElement chargeUnit_Card;

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
	@FindBy(xpath="(//span[text()='Charge Unit'])[1]")
	public WebElement chargeUnitLinkOnBreadcrumb;
	
	@FindBy(xpath="//span[text()='Charge Unit Details']//parent::div")
	public WebElement chargeUnitdetails_text;

	@FindBy(xpath="//span[text()='Charge Unit Create']//parent::div")
	public WebElement chargeUnitCreate_text;
	
	@FindBy(xpath="//span[text()='Charge Unit']//parent::div")
	public WebElement chargeUnit_text;
	
	@FindBy(xpath="//span[text()='Charge Unit Update']//parent::a")
	public WebElement chargeUnit_update_text;
	
	@FindBy(id="name")
	public WebElement chargeUnit_Name;

	@FindBy(id="code")
	public WebElement chargeUnit_code;
	
	@FindBy(id="name[name]")
	public WebElement chargeUnitNameOnFilter;
	
	public void navigateToAdminCardPageFromChargeUnitPage() {
		this.click(master_Module);
		this.click(chargeUnit_Card);
		this.click(masterLinkOnBreadcrumb);
	}

	public void navigateToAdminCardPageFromChargeUnitCreatePage() {
		this.click(chargeUnit_Card);
		this.click(createNew);
		this.click(masterLinkOnBreadcrumb);
	}
	
	public void navigateToAdminCardPageFromChargeUnitDetailsPage() throws InterruptedException {
		this.click(chargeUnit_Card);
		Thread.sleep(2000);
		this.click(viewIcon);
		this.click(acceptAlert);	
		this.click(masterLinkOnBreadcrumb);
	}
	
	public void navigateToAdminCardPageFromChargeUnitUpdatePage() throws InterruptedException {
		this.click(chargeUnit_Card);
		Thread.sleep(2000);
		this.click(editIcon);
		this.click(acceptAlert);	
		this.click(masterLinkOnBreadcrumb);
	}
	
	public void navigateToChargeUnitPageFromChargeUnitCreatePage() {
		this.click(chargeUnit_Card);
		this.click(createNew);
		this.click(chargeUnitLinkOnBreadcrumb);
	}
	
	public void navigateToChargeUnitPageFromChargeUnitDetailsPage() throws InterruptedException {
		Thread.sleep(2000);
		this.click(viewIcon);
		this.click(acceptAlert);	
		this.click(chargeUnitLinkOnBreadcrumb);
	}
	
	public void navigateToChargeUnitPageFromChargeUnitUpdatePage() throws InterruptedException {
		Thread.sleep(2000);
		this.click(editIcon);
		this.click(acceptAlert);	
		this.click(chargeUnitLinkOnBreadcrumb);
	}

	public void openChargeUnitCard() {
		this.click(master_Module);
		this.click(chargeUnit_Card);
	}
	
	public void clickOnCreateNew() {
		this.click(createNew);
	}
	
	public void downloadChargeUnitDetailsInEXCEL()  {
		this.click(exportAs);
		this.click(excel);
		this.click(excelgeneratedSuccessfully_Message);
	}
	
	public void downloadchargeUnitDetailsInCSV() throws InterruptedException {
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
	
	public void viewChargeUnit() throws InterruptedException{
		Thread.sleep(3000);
		//this.waitForEle(viewIcon);
		this.click(viewIcon);
		this.click(acceptAlert);	
	}
	public  void editChargeUnit(String name) throws InterruptedException{
		Thread.sleep(2000);
		//this.waitForEle(editIcon);
		this.click(editIcon);
		this.click(acceptAlert);
		chargeUnit_Name.click();
		chargeUnit_Name.clear();
	    this.sendkeys(chargeUnit_Name,name);
		this.click(update_button);
		this.click(updatedSuccessfully_Message);
}
	public void filterChargeUnit(String name) {
		this.click(filter_button);
		this.sendkeys(chargeUnitNameOnFilter, name);
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
	
	public String isChargeUnitLinkTextDisplayed() {
		String ChargeUnitLinkText=chargeUnitLinkOnBreadcrumb.getText();
		return ChargeUnitLinkText;
	}

	public String isChargeUnitDetailsTextDisplayed() {
		String ChargeUnitDetailsText=chargeUnitdetails_text.getText();
		return ChargeUnitDetailsText;
	}

	public String isChargeUnitTextDispleyed() {
		String ChargeUnitText=chargeUnit_text.getText();
		return ChargeUnitText;
	}
	public String isChargeUnitCreateTextDispleyed() {
		String ChargeUnitCreateText=chargeUnitCreate_text.getText();
		return ChargeUnitCreateText;
	}
	public String isChargeUnitUpdateTextDisplayed() {
		//this.waitForEle(airline_update_text);
		String 	ChargeUnitUpdateText= chargeUnit_update_text.getText();
		return ChargeUnitUpdateText;
	}
	
	public void createChargeUnit(String name, String code) {
		this.sendkeys(chargeUnit_Name, name);
		this.sendkeys(chargeUnit_code, code);
		this.click(save_button);
		this.click(CreatedSuccessfully_Message);
	}

}











