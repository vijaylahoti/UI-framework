package comfssdomainpageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.TestActions;

public class SuperadminShipmentActivityPageObjects extends TestActions {
	WebDriver driver;
	Logger log = Logger.getLogger(SuperadminShipmentActivityPageObjects.class);
	public  SuperadminShipmentActivityPageObjects(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//superadmin sidebar
	@FindBy(xpath="//img[@alt='Super Admin']")
	public WebElement superadminsidebar;
	
	//Superadmin ClickOn_ShipmentActivity
	@FindBy(xpath="//span[text()='Shipment Activity']")
	public WebElement ClickOn_ShipmentActivity;
	
	
	//Superadmin ClickOn_ShipmentActivity_createNew
	@FindBy(xpath="//div[@class='ant-card-body']//a//button[1]")
	public WebElement createNew;
	
	
	//Superadmin exportAsButton
		@FindBy(xpath="//button[@class='ant-btn ant-dropdown-trigger']")
		public WebElement exportAsButton;
		
		
		//Superadmin ActivityLinkOnBreadcrumb
		@FindBy(xpath="//div[@class='breadcrumb ant-breadcrumb']//span[5]//a[1]")
		public WebElement ActivityLinkOnBreadcrumb;
		
		
		//Superadmin Activity Create
		@FindBy(xpath="//div[@class='ant-card-meta-title']//span[1]")
		public WebElement ActivityCreate_text;
		
		
		//Superadmin Activity Name_text
		@FindBy(xpath="//span[text()='Name']")
		public WebElement Name_text;
		
		
		//Superadmin Activity Name
		@FindBy(xpath="//input[@id='name']")
		public WebElement enter_Name;
		
		//Superadmin Activity PickUp_Type
		@FindBy(xpath="//span[text()='PickUp Type']")
		public WebElement PickUp_Type;
		
		
		//Superadmin Activity PickUp Type
		@FindBy(xpath="//div[@class='ant-select-sm ant-select ant-select-enabled ant-select-allow-clear']")
		public WebElement click_PickUpType;
		
		
		//Superadmin Activity PickUp Type
		@FindBy(xpath="//li[text()='Pre']")
		public WebElement selectPickUpType;
		
		
		//Superadmin Activity Mode_of_Transport
		@FindBy(xpath="//span[text()='Mode of Transport']")
		public WebElement Mode_of_Transport;
		
		
		
		//Superadmin Activity Mode_of_Transport
		@FindBy(xpath="//div[@class='ant-radio-group ant-radio-group-outline']//label[1]")
		public WebElement selectMode_of_Transport;
				
		
		
		//Superadmin Activity Description
		@FindBy(xpath="//span[text()='Description']")
		public WebElement Description;
		
		
		//Superadmin Activity Description
		@FindBy(xpath="//textarea[@id='description']")
		public WebElement enterShipmentActivityDescription;
		
		
		//Superadmin ActivitySave
		@FindBy(xpath="//span[text()='Save']")
		public WebElement Save;
		
		
		//Superadmin ActivitySave
		@FindBy(xpath="(//div[@class='ant-row ant-form-item']//div//div//span//button[1])[1]")
		public WebElement SaveButton;
		
		
		//Superadmin Activity Edit_text
		@FindBy(xpath="//span[text()='Edit']")
		public WebElement Edit_text;				
		
		

		//Superadmin ActivityCancel
		@FindBy(xpath="//span[text()='Cancel']")
		public WebElement Cancel;
		
		
		//Superadmin ActivityCancel
		@FindBy(xpath="//div[@class='fss-btn-view']//a//button")
		public WebElement Cancelbutton;
		
		
				
	
	public void shipmentActivityCard()
	{
		this.click(ClickOn_ShipmentActivity);
	}
	
	public void clickOnCreateNew()
	{
		this.click(createNew);
	}
	
	public void enterShipmentActivityDetails(String enterName,String shipmentActivityDescription)
	{
		this.sendkeys(enter_Name, enterName);
        this.click(click_PickUpType);
        this.click(selectPickUpType);
		this.click(selectMode_of_Transport);
		this.sendkeys(enterShipmentActivityDescription,shipmentActivityDescription);
		this.click(SaveButton);
		//this.click(Cancelbutton);
	}
	
	
	public String isCreateNewButtonTextDisplayed() {
		String CreateNewButtonText=createNew.getText();
		return CreateNewButtonText;
	}

	
	public String isExportAsButtonTextDisplayed() {
		String ExportAsButtonText=exportAsButton.getText();
		return ExportAsButtonText;
	}
	public String isActivityLinkTextDisplayed() {
		String ActivityLinkText=ActivityLinkOnBreadcrumb.getText();
		return ActivityLinkText;
	}
	
	public String isActivityCreateTextDispleyed() {
		String ActivityCreateText=ActivityCreate_text.getText();
		return ActivityCreateText;
	}
	
	public String isNameTextDispleyed() {
		String NameText=Name_text.getText();
		return NameText;
	}
	
	public String isPickUpTypeTextDispleyed() {
		String PickUpTypeText=PickUp_Type.getText();
		return PickUpTypeText;
	}
	
	public String isModeofTransportTextDispleyed() {
		String ModeofTransportText=Mode_of_Transport.getText();
		return ModeofTransportText;
	}
	
	public String isDescriptionTextDispleyed() {
		String DescriptionText=Description.getText();
		return DescriptionText;
	}
	
	
	public String isCancelTextDispleyed() {
		String CancelText=Cancel.getText();
		return CancelText;
	}
	
	public String isSaveTextDispleyed() {
		String SaveText=Save.getText();
		return SaveText;
	}
	
	public String isEditTextDispleyed() {
		String EditText=Edit_text.getText();
		return EditText;
	}
	
	
}
