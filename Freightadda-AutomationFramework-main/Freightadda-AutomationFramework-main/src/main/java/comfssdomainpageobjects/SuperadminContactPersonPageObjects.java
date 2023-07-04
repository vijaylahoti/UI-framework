package comfssdomainpageobjects;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.TestActions;

public class SuperadminContactPersonPageObjects extends TestActions{

	WebDriver driver;
	//Logger log = Logger.getLogger(SuperadminContactPersonPageObjects .class);
		public  SuperadminContactPersonPageObjects (WebDriver driver) {
    	super(driver);
    	this.driver=driver;
		PageFactory.initElements(driver, this);
			}
		
		//Superadmin ClickOn_ContactPersonCard
		@FindBy(xpath="//span[text()='Contact Person']")
		public WebElement ClickOn_ContactPersonCard;
		
		
		//Superadmin ClickOn_ContactPersonCard Create New
		@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
		public WebElement ClickOn_CreateNew;
		
		
		//Superadmin ClickOn_title
		@FindBy(xpath="//div[@id='title']")
		public WebElement ClickOn_title;
		
		
		//Superadmin ClickOn_title
		@FindBy(xpath="//li[text()='Mr']")
		public WebElement ClickOn_titleMr;
		
		
		//Superadmin ClickOn_firstName
		@FindBy(xpath="//input[@id='firstName']")
		public WebElement ClickOn_firstName;
		
		
		//Superadmin ClickOn_middleName
		@FindBy(xpath="//input[@id='middleName']")
		public WebElement ClickOn_middleName;
		
		
		//Superadmin ClickOn_lastName'
		@FindBy(xpath="//input[@id='lastName']")
		public WebElement ClickOn_lastName;
		
		
		//Superadmin ClickOn_designation'
		@FindBy(xpath="//input[@id='designation']")
		public WebElement Enter_Designation;
		
		
		//Superadmin ClickOn_phone'
		@FindBy(xpath="//input[@id='phone']")
		public WebElement Enter_PhoneNo;
		
		
		//Superadmin ClickOn_email'
		@FindBy(xpath="//input[@type='email']")
		public WebElement Enter_email;
		
		
		//Superadmin ClickOn_Save'
		@FindBy(xpath="(//div[@class='ant-col ant-col-offset-19 ant-form-item-control-wrapper']//span//button[1])[1]")
		public WebElement ClickOn_Savebutton;
		
		
		
		//Superadmin ClickOn_Edit
		@FindBy(xpath="(//div[@class='fss-btn-view']//button[2])[1]")
		public WebElement Click_Edit;
		
		
		//Superadmin ClickOn_Cancel button
		@FindBy(xpath="//div[@class='fss-btn-view']//a//button")
		public WebElement Click_Cancelbutton;
		
		
		//Superadmin ClickOn_table raw
		@FindBy(xpath="//tbody[@class='ant-table-tbody']//tr[1]")
		public WebElement SelectRaw;
		
		
		//Superadmin clickOnEdit
		@FindBy(xpath="(//i[@aria-label='icon: edit'])[1]")
		public WebElement clickOnEdit;
		
		//Superadmin  clickOnEditokbutton;
		@FindBy(xpath="//div[@class='ant-popover-buttons']//button[2]")
		public WebElement clickOnEditokbutton;
		
		
		
		//Superadmin  clickOnupdatebutton;
		@FindBy(xpath="(//span[@class='ant-form-item-children']//button[1])[1]")
		public WebElement clickOnupdatebutton;
		
		
		//Superadmin  clickOnViewokbutton;
		@FindBy(xpath="(//i[@aria-label='icon: eye'])[1]")
		public WebElement clickOnViewbutton;
		
		//Superadmin  clickOnViewokbutton;
		@FindBy(xpath="//div[@class='ant-popover-buttons']//button[2]")
		public WebElement clickOnViewokbutton;
		
		
		//Superadmin  clickOnViewokbutton;
		@FindBy(xpath="//button[@class='ant-btn ant-dropdown-trigger']")
		public WebElement clickOnExportAsbutton;
		
		
		//Superadmin  clickOnViewokbutton;
		@FindBy(xpath="//ul[@class='ant-dropdown-menu ant-dropdown-menu-light ant-dropdown-menu-root ant-dropdown-menu-vertical']//li[1]")
		public WebElement clickOnExportAsExcelbutton;
		
		
		//Superadmin  clickOnViewokbutton;
		@FindBy(xpath="//ul[@class='ant-dropdown-menu ant-dropdown-menu-light ant-dropdown-menu-root ant-dropdown-menu-vertical']//li[2]")
		public WebElement clickOnExportAsCsvbutton;
		
		
		//Superadmin  clickOnDeletebutton
		@FindBy(xpath="(//i[@aria-label='icon: delete'])[1]")
		public WebElement clickOnDeletebutton;
		
		//Superadmin  clickOnDeleteokbutton;
		@FindBy(xpath="//div[@class='ant-popover-buttons']//button[2]")
		public WebElement clickOnDeleteokbutton;
		
		public void contactPersonCard() throws InterruptedException
		{
			this.click(ClickOn_ContactPersonCard);
			Thread.sleep(2000);
			this.click(ClickOn_CreateNew);
		}
		public void createNew() {
		this.click(ClickOn_CreateNew);
		}
		public void enterContactPersonDetails(String ContactPersonsfirstName,String ContactPersonsmiddleName,String ContactPersonslastName,String Designation,String EntercontactpersonPhoneNo ,String Entercontactpersonemail) throws InterruptedException
		{
			Thread.sleep(2000);
			this.click(ClickOn_title);
			this.click(ClickOn_titleMr);
			this.sendkeys(ClickOn_firstName, ContactPersonsfirstName);
			this.sendkeys(ClickOn_middleName, ContactPersonsmiddleName);
			this.sendkeys(ClickOn_lastName, ContactPersonslastName);	
			this.sendkeys(Enter_Designation, Designation);
			this.sendkeys(Enter_PhoneNo,EntercontactpersonPhoneNo );
			this.sendkeys(Enter_email, Entercontactpersonemail );
			this.click(ClickOn_Savebutton);
			this.click(Click_Cancelbutton);
			
		}
		public void clickButtonsEditUpdateCancelViewDelete(String ContactPersonsmiddleName) throws InterruptedException
		{
			Thread.sleep(2000);
			this.click(SelectRaw);
			this.click(clickOnEdit);
			this.click( clickOnEditokbutton);
			ClickOn_middleName.click();
			ClickOn_middleName.clear();
			this.sendkeys(ClickOn_middleName, ContactPersonsmiddleName);
			this.click(clickOnupdatebutton);
			this.click(Click_Cancelbutton);
			Thread.sleep(2000);
			this.click(SelectRaw);
			this.click(clickOnViewbutton);
			this.click( clickOnViewokbutton);
			this.click(Click_Cancelbutton);
			this.click(clickOnExportAsbutton);
			this.click(clickOnExportAsExcelbutton);
			this.click(clickOnExportAsbutton);
			this.click(clickOnExportAsCsvbutton);
			this.click(SelectRaw);
			this.click(clickOnDeletebutton);
			this.click(clickOnDeleteokbutton);
			
		}
		
		public String isExportAsButtonTextDisplayed() {
			String ExportAsButtonText=clickOnExportAsbutton.getText();
			return ExportAsButtonText;
		}
		
		
		public boolean validateCreateNewButtonEnable( ) {
		    return ClickOn_CreateNew.isEnabled();
	}
		public String isCreateNewButtonTextDisplayed() {
			String CreateNewButtonText=ClickOn_CreateNew.getText();
			return CreateNewButtonText;
		}
		
		public String isfirstNameTextisplayed() 
		{
			String firstNameText=ClickOn_firstName.getText();
			return firstNameText;
		}
		
		public String ismiddleNameTextDisplayed() {
			String middleNameText=ClickOn_middleName.getText();
			return middleNameText;
		}
}


