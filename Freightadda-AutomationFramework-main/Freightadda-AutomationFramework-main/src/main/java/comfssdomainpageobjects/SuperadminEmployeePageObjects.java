package comfssdomainpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.basepackage.TestActions;

public class SuperadminEmployeePageObjects extends TestActions{
	WebDriver driver;
	Logger log = Logger.getLogger(SuperadminRolePageObjects .class);
		public  SuperadminEmployeePageObjects (WebDriver driver) {
    	super(driver);
    	this.driver=driver;
		PageFactory.initElements(driver, this);
			}//span[text()='Employees']	
		
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
		
		//click on Employees card
		@FindBy(xpath="//span[text()='Employees']	")
		public WebElement Employeescard;
		
		
		//click on CreateNew_Employeescard
		@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']	")
		public WebElement CreateNew_Employeescard;
		
		
		
		
		//click on Title_dropdown
		@FindBy(xpath="//div[@class='ant-select-sm ant-select ant-select-enabled ant-select-allow-clear']//div//span//i[1]	")
		public WebElement  Title_dropdown;
		
		//click on Select_dropdown
		@FindBy(xpath="//ul[@role='listbox']//li[1]")
		public WebElement  Select_dropdown;
		
		//click on Enter_firstName
		@FindBy(xpath="//input[@id='firstName']")
		public WebElement  Enter_firstName;
		
		//click on Enter_	middleName
		@FindBy(xpath="	//input[@id='middleName']")
		public WebElement  Enter_middleName;	
		
		
		//click on Enter_lastName
		@FindBy(xpath="//input[@id='lastName']")
		public WebElement  Enter_lastName;
		
		//click on Gendor_dropdown
		@FindBy(xpath="(//div[@id='gender']//div//div)")
		public WebElement  Gendor_dropdown;
		
		//click on Gendor_dropdown
		@FindBy(xpath="//li[text()='Male']")
		public WebElement  Select_Gendor_dropdown;
		
		//click on Enter_email
		@FindBy(xpath="//input[@id='email']")
		public WebElement  Enter_EnterEmployeeemail;
		
		
		//click on Enter_EnteruserName;
		@FindBy(xpath="//input[@id='userName']")
		public WebElement  Enter_EnteruserName;
		
		
		
		//click on Enter_password
		@FindBy(xpath="//input[@id='password']")
		public WebElement  Enter_password;
		
		
		//click on Enter_confirmPassword
		@FindBy(xpath="//input[@id='confirmPassword']")
		public WebElement  Enter_confirmPassword;
		
		//click on Enter_firstName
		@FindBy(xpath="//div[@class='ant-select-selection__rendered']//ul//li//div//input")
		public WebElement  Select_Branch;
		
		
		
		//click on  Select_BranchPune
		@FindBy(xpath="//li[text()='PUNE']")
		public WebElement  Select_BranchPune;
				
		
		//click on roles
		@FindBy(xpath="	//div[@id='roles']//div//div//ul//li")
		public WebElement  Select_roles;
		
		//click on  Select_ROLE
		@FindBy(xpath="//li[text()='Role_Admin']//i")
		public WebElement  Select_ROLE;
		
		
		//click on Sideclick
		@FindBy(xpath="//label[text()='Active']")
		public WebElement  Sideclick;
		
		
		//click on active\
		@FindBy(xpath="	//div[@id='active']//div//div")
		public WebElement  Select_active;
		
		
		//click on Select_active_Yes
		@FindBy(xpath="	//li[text()='Yes']")
		public WebElement  Select_active_Yes;
		
		
		//click on Select_active_Yes
		@FindBy(xpath="	//span[@class='ant-form-item-children']//button[1]")
		public WebElement  Save_Button;
		
		//click on  ClickOn_Select_Employee
		@FindBy(xpath="//tbody[@class='ant-table-tbody']")
		public WebElement  Select_Employee;
		
		
		
		//click on Select_View_Button
		@FindBy(xpath="//tbody[@class='ant-table-tbody']//tr[1]//td[5]//span//i[2]")
		public WebElement  View_Button;
		
		
		//click on Select_View_Button
		@FindBy(xpath="//div[@class='ant-popover-buttons']//button[2]")
		public WebElement  View_OK_Button;
		
		
		
		
		
		//click on Select_Edit_Button
		@FindBy(xpath="//div[@class='fss-btn-view']//button//span")
		public WebElement  Edit_Button;
		
		
		
		
		
		
		//click on  ClickOn_Edit_Button
		@FindBy(xpath="//i[@aria-label='icon: edit'][1]")
		public WebElement  ClickOn_Edit_Button;
		
		//click on  ClickOn_OK_Button
		@FindBy(xpath="//div[@class='ant-popover-buttons']//button[2]")
		public WebElement  ClickOn_OK_Button;
		
		//click on   ClickOn_Update_Button
		@FindBy(xpath="//span[@class='ant-form-item-children']//button[1]")
		public WebElement  ClickOn_Update_Button;
		
		//click on  ClickOn_close_Button
		@FindBy(xpath="//div[@class='fss-btn-view']//a//button[1]")
		public WebElement  ClickOn_close_Button;

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

		public void clickonEmployeescard()
		{
			this.click(Employeescard);
		}
		
		public void clickonCreateNew()
		{
			this.click(CreateNew_Employeescard);
		}
		
       public void EnterEmployeeDetails(String EnterfirstName,String EntermiddleName,String EnterlastName,String EnterEnterEmployeeemail,String EnterEnteruserName,String Enterpassword,String EnterconfirmPassword) throws InterruptedException
       {
    	   this.click( Title_dropdown);
    	   this.click(Select_dropdown);
    	   this.sendkeys(Enter_firstName, EnterfirstName);
    	   this.sendkeys(Enter_middleName,EntermiddleName);
    	   this.sendkeys(Enter_lastName, EnterlastName);
    	   this.click(Gendor_dropdown);
    	   this.click(Select_Gendor_dropdown);
    	   this.sendkeys(Enter_EnteruserName, EnterEnteruserName); 
    	   this.sendkeys(Enter_EnterEmployeeemail, EnterEnterEmployeeemail);
    	   this.sendkeys(Enter_password, Enterpassword);
    	   this.sendkeys(Enter_confirmPassword, EnterconfirmPassword);
    	   this.click(Select_Branch);
    	   this.click(Select_BranchPune);
    	   this.click(Select_roles);
    	   this.click(Select_ROLE);
    	   this.click(Sideclick);
    	   Thread.sleep(200);
    	   this.click(Select_active);
    	   this.click(Select_active_Yes);
    	   this.click(Save_Button);
       }
       
       public void EditUpdateViewCancelExportAsEmployeeDetails(String EnterfirstName,String EntermiddleName) throws InterruptedException
       {
    	 Thread.sleep(2000);
    	 this.click(Select_Employee);
    	 Thread.sleep(2000);
	     this.click( ClickOn_Edit_Button);
	     this.click( ClickOn_OK_Button); 
	     Thread.sleep(2000);
    	 this.sendkeys(Enter_firstName, EnterfirstName);
    	 Enter_firstName.click();
    	 Enter_firstName.clear();
    	 this.sendkeys(Enter_middleName,EntermiddleName);
    	 Enter_middleName.click();
    	 Enter_middleName.clear();
    	 this.click( ClickOn_Update_Button);
    	 this.click(ClickOn_close_Button);
    	 Thread.sleep(2000);
    	 this.click(Select_Employee);
    	 Thread.sleep(2000);
    	 this.click(View_Button);
    	 this.click(View_OK_Button);
    	 Thread.sleep(2000);
    	 this.click(ClickOn_close_Button);
    	 Thread.sleep(2000);
    	 this.click(ExportAsbutton);
   	     this.click(Excelbutton);
   	     this.click(ExportAsbutton);
   	     this.click(CSVbutton);
   	     Thread.sleep(2000);   
         this.click(ClickOn_CompanySetting);
       }
       public String isCreateNewButtonTextDisplayed() {
			String CreateNewButtonText=CreateNew_Employeescard.getText();
			return CreateNewButtonText;
		}
		public String isCreatedSuccessfullyMessageDisplayed() {
			String CreatedSuccessfullyMessage=CreatedSuccessfully.getText();
			return CreatedSuccessfullyMessage;
		}
		public String isSubmitButtonTextDisplayed() {
			String SaveButtonText=Save_Button.getText();
			return SaveButtonText;
        }
		
		public String isfirstNameTextisplayed() 
		{
			String firstNameText=Enter_firstName.getText();
			return firstNameText;
		}
		
		public String ismiddleNameTextDisplayed() {
			String middleNameText=Enter_middleName.getText();
			return middleNameText;
		}
		public String isactivebuttonDisplayed() {
			String activebutton=Select_active_Yes.getText();
			return activebutton;
		}
		
		/*
		 * public void ClickButtons() throws InterruptedException {
		 * this.click(ExportAsbutton); this.click(Excelbutton);
		 * this.click(ExportAsbutton); this.click(CSVbutton);
		 * this.click(Select_Employee); Thread.sleep(2000); this.click(
		 * ClickOn_Edit_Button); this.click( ClickOn_OK_Button); Thread.sleep(2000); }
		 */

		
       
}


