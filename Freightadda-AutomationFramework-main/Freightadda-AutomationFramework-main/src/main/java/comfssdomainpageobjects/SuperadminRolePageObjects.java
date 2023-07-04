package comfssdomainpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.basepackage.TestActions;

public class SuperadminRolePageObjects extends TestActions {
	WebDriver driver;
	Logger log = Logger.getLogger(SuperadminRolePageObjects .class);
		public  SuperadminRolePageObjects (WebDriver driver) {
    	super(driver);
    	this.driver=driver;
		PageFactory.initElements(driver, this);
			}	
		
		//Superadmin Active company
		@FindBy(xpath="//i[@class='anticon anticon-apple']")
		public WebElement ActiveCompany;
		
		//select company
		@FindBy(xpath="//td[text()='Freight']")
		public WebElement Company;
		
		//clickon SettingCompany
		@FindBy(xpath="//tbody[@class='ant-table-tbody']//tr[2]//td[4]//span//i[4]")
		public WebElement SettingCompany;
		
		//SettingCompanyOkButton
		@FindBy(xpath="//div[@class='ant-popover-inner']//button[2]")
		public WebElement SettingCompanyOkButton;
		
		//click on role card
		@FindBy(xpath="//span[text()='Role']")
		public WebElement Rolecard;
		
		//click on CREATE NEW ROLE
		@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
		public WebElement CreatenewRole;
		
		
		//click on Enter_Rolename
		@FindBy(xpath="//input[@id='name']")
		public WebElement Enter_Rolename;
		
		
		
		//click on Enter_description
		@FindBy(xpath="//textarea[@id='description']")
		public WebElement Enter_Roledescription;
		

		//click on Active Role dropdown
		@FindBy(xpath="//div[@id='active']")
		public WebElement Active_Roledropdown;
		
		//click on Yes Active Role dropdown
		@FindBy(xpath="//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']//li[1]")
		public WebElement Select_ActiveRole;
		
		
		//click on ClickOn_SaveButton
		@FindBy(xpath="//span[@class='ant-form-item-children']//button[1]")
		public WebElement SubmitButton;
		
		@FindBy(xpath="//span[text()='Created Successfully']")
		public WebElement CreatedSuccessfully;
		
		//export as button
		@FindBy(xpath="//button[@class='ant-btn ant-dropdown-trigger']")
		public WebElement ExportAsbutton;
		
		
		//Excelbutton
		@FindBy(xpath="//i[@class='anticon anticon-file-excel']")
		public WebElement Excelbutton;
		

		
		
		//CSV button
		@FindBy(xpath="//i[@class='anticon anticon-file']")
		public WebElement CSVbutton;
		
		
		
		//click select_createdRrole
		@FindBy(xpath="//tbody[@class='ant-table-tbody']//tr[1]")
		public WebElement select_createdRrole;
		
		//click on ClickOn_ViewButton
		@FindBy(xpath="(//i[contains(@class,'anticon anticon-eye')])[1]")
		public WebElement ClickOn_ViewButton;
		
		
		//click on ClickOn_ViewOKButton
		@FindBy(xpath="//div[@class='ant-popover-inner-content']//div[2]//button[2]")
		public WebElement ClickOn_ViewOKButton;
		
		
		//div[@class='fss-btn-view']//a//button//span
		
		//click on ClickOn_ViewCancelButton
		@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[2]")
		public WebElement ClickOn_ViewCancelButton;
		
				
		//click on ClickOn_EditButton
		@FindBy(xpath="//tbody[@class='ant-table-tbody']//tr[1]//td[3]//span//i[1]")
	    public WebElement ClickOn_EditButton;
		
		//click on ClickOn_editOKButton
		@FindBy(xpath="//div[@class='ant-popover-buttons']//button[2]")
		public WebElement ClickOn_editOKButton;
		
		//click on ClickOn_updateButton
		@FindBy(xpath="//span[@class='ant-form-item-children']//button[1]")
		public WebElement ClickOn_UpdateButton;
		
		//click on ClickOn_CancelButton
		@FindBy(xpath="//div[@class='fss-btn-view']//a//button[1]")
		public WebElement ClickOn_CancelButton;
		
		
	//click on ClickOn_CompanySetting
	@FindBy(xpath="(//span[@class='ant-breadcrumb-link'])[4]")
	public WebElement ClickOn_CompanySetting;
		
		
		public void clickonActiveCompany()
		{
			this.click(ActiveCompany);
		}
		
		public void clickonCompany()
		{
			this.click( Company);
		}
		
		public void clickonSettingCompany()
		{
			this.click( SettingCompany);
		}
		
		public void clickonSettingCompanyOkButton()
		{
			this.click( SettingCompanyOkButton);
		}

		public void clickonRolecard()
		{
			this.click(Rolecard);
		}

		public void clickonCreatenewRole()
		{
			this.click(CreatenewRole);
		}
		
		public void EnterCreateNewRole(String EnterRolename,String EnterRoledescription) throws InterruptedException
		{
			this.sendkeys(Enter_Rolename, EnterRolename);
			this.sendkeys(Enter_Roledescription, EnterRoledescription);
			this.click(Active_Roledropdown);
			this.click(Select_ActiveRole);
			this.click(SubmitButton);
			this.click(ClickOn_CancelButton);				
		}
		public void ClickonEditUpdateViewCancelExpoetAs(String EnterRoledescription ) throws InterruptedException 
		{
			
		 Thread.sleep(2000); this.click(select_createdRrole);
		 this.click(ClickOn_EditButton); this.click(ClickOn_editOKButton);
		 Thread.sleep(2000); this.sendkeys(Enter_Roledescription,
		 EnterRoledescription); Enter_Roledescription.click();
		 Enter_Roledescription.clear(); Thread.sleep(2000); 
		 this.click(ClickOn_UpdateButton); 
		 this.click(ClickOn_CancelButton); Thread.sleep(2500);
		 Thread.sleep(2000);
	     this.click(select_createdRrole);
	     this.click(ClickOn_ViewButton);
		 Thread.sleep(2000);
	     this.click(ClickOn_ViewOKButton);
		 Thread.sleep(2000);
		 this.click(ClickOn_ViewCancelButton);
         Thread.sleep(2000);
         this.click(ExportAsbutton);
  	     this.click(Excelbutton);
  	     Thread.sleep(2000);
         this.click(ExportAsbutton);
  	     this.click(CSVbutton);
	         Thread.sleep(2000);   
         this.click(ClickOn_CompanySetting);
		}
		
		public String isCreateNewButtonTextDisplayed() {
			String CreateNewButtonText=select_createdRrole.getText();
			return CreateNewButtonText;
		}
		public String isCreatedSuccessfullyMessageDisplayed() {
			String CreatedSuccessfullyMessage=CreatedSuccessfully.getText();
			return CreatedSuccessfullyMessage;
		}
		public String isSubmitButtonTextDisplayed() {
			String SaveButtonText=SubmitButton.getText();
			return SaveButtonText;
        }
		
		public String isRoledescriptionTextDisplayed() {
			String RoledescriptionText=Enter_Roledescription.getText();
			return RoledescriptionText;
		}
		public String iscreatedRroleTextDisplayed() {
			String createdRroleText=select_createdRrole.getText();
			return createdRroleText;
		}
		public String isActiveRoleTextDisplayed() {
			String ActiveRoleText=Select_ActiveRole.getText();
			return ActiveRoleText;
		}		
		
		/*
		 * this.click(select_createdRrole); Thread.sleep(2000);
		 * this.click(ClickOn_EditButton); this.click(ClickOn_ViewButton);
		 * this.click(ClickOn_ViewOKButton); this.click( ClickOn_UpdateButton);
		 * this.click(ClickOn_CancelButton); this.click(ExportAsbutton);
		 * this.click(Excelbutton); this.click(CSVbutton);
		 */
}


