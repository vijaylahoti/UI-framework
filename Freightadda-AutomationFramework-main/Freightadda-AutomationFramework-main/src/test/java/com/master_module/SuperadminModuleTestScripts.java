package com.master_module;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.basepackage.TestBase;
import com.utilitiesclasses.Constants;
import com.utilitiesclasses.ExpectedValue;

import comfssdomainpageobjects.SidebarObjects;
import comfssdomainpageobjects.SuperAdminCompanyCardPageObjects;
import comfssdomainpageobjects.SuperAdminSignInpageObjects;
import comfssdomainpageobjects.SuperadminBranchPageObjects;
import comfssdomainpageobjects.SuperadminContactPersonPageObjects;
import comfssdomainpageobjects.SuperadminEmployeePageObjects;
import comfssdomainpageobjects.SuperadminRolePageObjects;
import comfssdomainpageobjects.SuperadminShipmentActivityPageObjects;

public class SuperadminModuleTestScripts extends TestBase{
	public SuperAdminSignInpageObjects superadminsigninpage ;
	public SuperAdminCompanyCardPageObjects superadmincompany;
	public SuperadminBranchPageObjects SuperadminBranchcard;
	public SuperadminRolePageObjects SuperadminRolechcard;
	public SuperadminEmployeePageObjects SuperadminEmployeeCard;
	public SuperadminContactPersonPageObjects superadminContactPersonCard;
	public SuperadminShipmentActivityPageObjects shipmentActivityCard;

	Logger log = Logger.getLogger(SuperadminModuleTestScripts.class);

	//superadmin login method
	public void SuperadminLogin() {
		superadminsigninpage= new SuperAdminSignInpageObjects(driver);
		superadminsigninpage.navigateUrl(Constants.URL) ; 
		superadminsigninpage.enterSuperAdminUserId(Constants.superadminUsername); 
		superadminsigninpage.enterSuperAdminuserPassword(Constants.superadminPassword); 
		superadminsigninpage.clickOnSuperAdminLoginButton(); 	 
	}
	//superadmin login test case
	@Test(priority=0,description="This testcase verifies super admin login functionality",enabled=true)
	public void verifySuperAdminLoginFunctionality() throws InterruptedException {
		SuperadminLogin(); 
		Assert.assertEquals(superadminsigninpage.isUserNameDisplayed(),Constants.ExpectedUsernameText);	  
		Assert.assertEquals(superadminsigninpage.isUserNameDisplayed(),Constants.ExpectedUsernameText);	
		Assert.assertTrue(superadminsigninpage.isUsernameTextboxDisplayed(),"The Username Textbox is not Displayed on Signin Page.");
		Assert.assertTrue(superadminsigninpage.isPasswordTextboxDisplayed(),"The Password Textbox is not Displayed on Signin Page.");
		Assert.assertTrue(superadminsigninpage.isRememberMeCheackboxSelected(),"The Remember Me Cheackbox is not Selected on Signin Page.");
		Assert.assertTrue(superadminsigninpage.isLOGINButtonEnabled(),"The LOGIN Button is not Enabled on Signin Page.");
	}

	@Test(priority=1,description="This testcase verifies user able to create company",enabled=true)
	public void verifycreatenewcompany() throws InterruptedException{
		SuperadminLogin();
		//SidebarObjects superadmin_sidebar = new SidebarObjects(driver);
		//superadmin_sidebar.clickOnsuperadminsidebar();
		superadmincompany =new SuperAdminCompanyCardPageObjects(driver);
		superadmincompany.superadminCompanyCardMethod();
		superadmincompany.clickOnCreateNew();
		superadmincompany.enterCreatenewCompanyDetails(Constants.CompanyName, Constants.Email,Constants.MobileNumber,Constants.PinCode,Constants.StateName,Constants.Countryname,Constants.WebsiteName,Constants.Location,Constants.FAXNumber,Constants.FIATACode,Constants.IATACode,Constants.VATNumber,Constants.GSTNumber,Constants.EnterDescription,Constants.BankAccountNumber,Constants.EnterAccountHolder,Constants.BankName,Constants.BankBranch,Constants.BeneficiaryName,Constants.IFSCODE);	
		Assert.assertEquals(ExpectedValue.CompanyName,superadmincompany.validateCreateNewButtonEnable());
		Assert.assertEquals(superadmincompany.validateCreateNewButtonDisplay( ), "The Create New Button is not Displayed on create new  Page" );
		Assert.assertEquals(superadmincompany.validateCreateNewButtonEnable( ), "The Create New ButtonEnable is not Displayed on create new  Page" );
		Assert.assertEquals(superadmincompany.validateSaveButtonDisplay( ), "The Save Button is not Displayed on create new  Page" );
	}

	@Test(priority=2,description="This test case verifies user able to edit,view,update,cancel created company",enabled=true)
	public void verifyCreatedCompanyEditUpdateCancelViewDelete() throws InterruptedException
	{
		Thread.sleep(2000);
		SuperadminLogin();
		superadmincompany =new SuperAdminCompanyCardPageObjects(driver);
		superadmincompany.superadminCompanyCardMethod();
		superadmincompany.ClickonEditUpdateViewCancel(Constants.EnterDescription);
		superadmincompany.clickonExportAsbutton();
		Assert.assertEquals(superadmincompany.isViewCompanytDisplayed(),"The View Company  Button is not Displayed on create new  Page" );
		Assert.assertEquals(superadmincompany.isViewCompanyOKButtonDisplay(),"The View Company OK Button is not Displayed on create new  Page" );	
	}

	@Test(priority=3,description="This test case verifies user able to create new branch in created company and able to view,edit,update,cancel",enabled=true)
	public void verifySuperAdminCreateNewViewEditUpdateCancelBranch() throws InterruptedException
	{
		SuperadminLogin();
		superadmincompany =new SuperAdminCompanyCardPageObjects(driver);
		superadmincompany.superadminCompanyCardMethod();
		superadmincompany.companySettings();
		SuperadminBranchcard = new SuperadminBranchPageObjects (driver);
		SuperadminBranchcard.clickonBranchCard();
		SuperadminBranchcard.CreateNewBranch();
		SuperadminBranchcard.enterCreatenewBranchDetails(Constants.EnterBranchName,Constants.Location,Constants.EnterbranchCode,Constants.Enteremail,Constants.EntergstNumber);
		SuperadminBranchcard.enterBranchAddressDetails(Constants.EnterAddress1,Constants.EnterAddress2, Constants.EnterPhoneNo, Constants.Entercity, Constants.Entercity, Constants.Enterdistrict);
		Thread.sleep(2000);
		SuperadminBranchcard.ClickOnbuttonEditViewUpdateExportAS(Constants.EnterbranchCode);
		Assert.assertEquals(ExpectedValue.CreateNewBranch,SuperadminBranchcard.isCreateNewButtonTextDisplayed());
		Assert.assertEquals(ExpectedValue.Location,SuperadminBranchcard.isBranchLocationTextDisplayed());
		Assert.assertEquals(ExpectedValue.branchCode,SuperadminBranchcard.isBranchCodeTextDisplayed());
		Assert.assertEquals(ExpectedValue.gstState,SuperadminBranchcard.isBranchGSTstateTextDisplayed());
		Assert.assertEquals(ExpectedValue.SubmitButton,SuperadminBranchcard.isSubmitButtonTextDisplayed() );
		Assert.assertEquals(ExpectedValue.CreatedSuccessfull,SuperadminBranchcard.isCreatedSuccessfullyMessageDisplayed());
		Assert.assertEquals(ExpectedValue.BranchAddressbutton,SuperadminBranchcard.isBranchAddressbuttonDisplayed());

	}
	@Test(priority=4,description="This test case verifies user able to create new Role in created company and able to view,edit,update,cancel",enabled=true)
	public void verifySuperAdminCreateNewViewEditUpdateCancelRole() throws InterruptedException
	{
		SuperadminLogin();
		superadmincompany =new SuperAdminCompanyCardPageObjects(driver);
		superadmincompany.superadminCompanyCardMethod();
		superadmincompany.companySettings();
		SuperadminRolechcard= new SuperadminRolePageObjects (driver);
		SuperadminRolechcard.clickonRolecard();
		SuperadminRolechcard.clickonCreatenewRole();
		SuperadminRolechcard.EnterCreateNewRole(Constants.EnterRolename,Constants.EnterRoledescription);
		SuperadminRolechcard.ClickonEditUpdateViewCancelExpoetAs(Constants.EnterRoledescription);
		Assert.assertEquals(ExpectedValue.CreateNewBranch,SuperadminRolechcard.isCreateNewButtonTextDisplayed());
		Assert.assertEquals(ExpectedValue.RoledescriptionText,SuperadminRolechcard.isRoledescriptionTextDisplayed());
		Assert.assertEquals(ExpectedValue.createdRoleText,SuperadminRolechcard.iscreatedRroleTextDisplayed());
		Assert.assertEquals(ExpectedValue.ActiveRoleText,SuperadminRolechcard.isActiveRoleTextDisplayed());
		Assert.assertEquals(ExpectedValue.SubmitButton,SuperadminRolechcard.isSubmitButtonTextDisplayed() );
		Assert.assertEquals(ExpectedValue.CreatedSuccessfull,SuperadminRolechcard.isCreatedSuccessfullyMessageDisplayed());

	}
	@Test(priority=5,description="This test case verifies user able to create new Employee in created company and able to view,edit,update,cancel",enabled=true)
	public void verifySuperAdminCreateNewViewEditUpdateCancelEmployee() throws InterruptedException
	{
		SuperadminLogin();
		superadmincompany =new SuperAdminCompanyCardPageObjects(driver);
		superadmincompany.superadminCompanyCardMethod();
		superadmincompany.companySettings();
		SuperadminEmployeeCard =new SuperadminEmployeePageObjects (driver);
		SuperadminEmployeeCard.clickonEmployeescard();
		SuperadminEmployeeCard.clickonCreateNew();
		SuperadminEmployeeCard.EnterEmployeeDetails(Constants.EnterfirstName,Constants.EntermiddleName,Constants.EnterlastName,Constants.EnterEmployeeemail,Constants.EnterEnteruserName,Constants.Enterpassword,Constants.EnterconfirmPassword);
		SuperadminEmployeeCard.EditUpdateViewCancelExportAsEmployeeDetails(Constants.EnterfirstName,Constants.EntermiddleName);
		Assert.assertEquals(ExpectedValue.CreateNewBranch,SuperadminEmployeeCard.isCreateNewButtonTextDisplayed());
		Assert.assertEquals(ExpectedValue.middleNameText,SuperadminEmployeeCard.ismiddleNameTextDisplayed());
		Assert.assertEquals(ExpectedValue.firstNameText,SuperadminEmployeeCard.isfirstNameTextisplayed());
		Assert.assertEquals(ExpectedValue.activebutton,SuperadminEmployeeCard.isactivebuttonDisplayed());
		Assert.assertEquals(ExpectedValue.SubmitButton,SuperadminEmployeeCard.isSubmitButtonTextDisplayed() );
		Assert.assertEquals(ExpectedValue.CreatedSuccessfull,SuperadminEmployeeCard.isCreatedSuccessfullyMessageDisplayed());

	}
	@Test(priority=7,description="This test case verifies user able to create new contact person in created company and able to view,edit,update,cancel",enabled=true)
    public void verifySuperAdminCreateNewViewEditUpdateCancelContactPerson() throws InterruptedException
    {
        superAdminLogin();
        superadmincompany =new SuperAdminCompanyCardPageObjects(driver);
        superadmincompany.superadminCompanyCardMethod();
        superadmincompany.companySettings();
        superadminContactPersonCard= new SuperadminContactPersonPageObjects (driver);
        superadminContactPersonCard.contactPersonCard();
        Assert.assertEquals(ExpectedValue.createNewButtonText,superadminContactPersonCard.isCreateNewButtonTextDisplayed());
        superadminContactPersonCard.createNew();
        //superadminContactPersonCard.enterContactPersonDetails(Constants.ContactPersonsfirstName,Constants.ContactPersonsmiddleName,Constants.ContactPersonslastName,Constants.designation,Constants.EntercontactpersonPhoneNo,Constants.Entercontactpersonemail);
        Assert.assertEquals(ExpectedValue.middleNameText,superadminContactPersonCard.ismiddleNameTextDisplayed());
        Assert.assertEquals(ExpectedValue.firstNameText,superadminContactPersonCard.isfirstNameTextisplayed());
        
        superadminContactPersonCard.clickButtonsEditUpdateCancelViewDelete(Constants.ContactPersonsmiddleName);
        Assert.assertEquals(ExpectedValue.exportAsButtonText,superadminContactPersonCard.isExportAsButtonTextDisplayed());
    }
    @Test(priority = 8,description="This test case verifies user is able to create new,Edit,Update,View,Cancel shipment activity in created company",enabled=true)
    public void verifySuperAdminCreateNewViewEditUpdateCancelShipmentActivity()
    {
    	superAdminLogin();
        superadmincompany =new SuperAdminCompanyCardPageObjects(driver);
        superadmincompany.companySettings();
        shipmentActivityCard = new SuperadminShipmentActivityPageObjects(driver);
        shipmentActivityCard.shipmentActivityCard();
        Assert.assertEquals(ExpectedValue.createNewButtonText,shipmentActivityCard.isCreateNewButtonTextDisplayed());
        Assert.assertEquals(ExpectedValue.exportAsButtonText,shipmentActivityCard.isExportAsButtonTextDisplayed());
        Assert.assertEquals(ExpectedValue.ActivityLinkText,shipmentActivityCard.isActivityLinkTextDisplayed());
        shipmentActivityCard.clickOnCreateNew();
        Assert.assertEquals(ExpectedValue.ActivityCreateText,shipmentActivityCard.isActivityCreateTextDispleyed());
        Assert.assertEquals(ExpectedValue.NameText,shipmentActivityCard.isNameTextDispleyed());
        Assert.assertEquals(ExpectedValue.PickUpTypeText,shipmentActivityCard.isPickUpTypeTextDispleyed());
        Assert.assertEquals(ExpectedValue.ModeofTransportText,shipmentActivityCard.isModeofTransportTextDispleyed());
        Assert.assertEquals(ExpectedValue.DescriptionText,shipmentActivityCard.isDescriptionTextDispleyed());
        Assert.assertEquals(ExpectedValue.SaveText,shipmentActivityCard.isSaveTextDispleyed());
        Assert.assertEquals(ExpectedValue.CancelText,shipmentActivityCard.isCancelTextDispleyed());
        shipmentActivityCard.enterShipmentActivityDetails(Constants.enterName,Constants.shipmentActivityDescription);
        Assert.assertEquals(ExpectedValue.EditText,shipmentActivityCard.isEditTextDispleyed());
        Assert.assertEquals(ExpectedValue.CancelText,shipmentActivityCard.isCancelTextDispleyed());
        
    }
    public void superAdminLogin() {
        superadminsigninpage= new SuperAdminSignInpageObjects(driver);
        superadminsigninpage.navigateUrl(Constants.URL) ; 
        superadminsigninpage.enterSuperAdminUserId(Constants.superadminUsername); 
        superadminsigninpage.enterSuperAdminuserPassword(Constants.superadminPassword); 
        superadminsigninpage.clickOnSuperAdminLoginButton();     
    }
}