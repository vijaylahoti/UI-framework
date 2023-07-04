package com.master_module;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.basepackage.TestActions;
import com.basepackage.TestBase;
import com.utilitiesclasses.Constants;
import com.utilitiesclasses.ExpectedValue;

import comfssdomainpageobjects.AdminSignInPageObjects;
import comfssdomainpageobjects.AirLinePageObject;
import comfssdomainpageobjects.BranchesPageObject;
import comfssdomainpageobjects.ChargeTypePageObjects;
import comfssdomainpageobjects.ChargeUnitPageObjects;
import comfssdomainpageobjects.ChargesPageObjects;
import comfssdomainpageobjects.CustomerPageObject;
import comfssdomainpageobjects.ServiceTypeObjects;
import comfssdomainpageobjects.TaxSubTypePageObjects;
import comfssdomainpageobjects.TaxTypePageObjects;
import comfssdomainpageobjects.TaxesPageObjects;
@Listeners({com.master_module.Itestlistners.class})
public class MasterModuleTestScripts extends TestBase{
	public AdminSignInPageObjects signinpage;
	public  AirLinePageObject airline;
	public BranchesPageObject branch;
	public CustomerPageObject customer ;
	public ServiceTypeObjects serviceType;
	public ChargeTypePageObjects chargeType;
	public ChargeUnitPageObjects chargeUnit;
	public TaxTypePageObjects taxType;
	public TaxSubTypePageObjects taxSubType;
	public TaxesPageObjects taxes;
	public ChargesPageObjects charges ;
	
	@Test(priority=0,description="This testcase verifies login functionality",enabled=true)
	public void verifyAdminLoginPage() {
		signinpage= new AdminSignInPageObjects(driver);
		signinpage.navigateUrl(Constants.URL) ; 
		Assert.assertTrue(signinpage.isUsernameTextboxDisplayed(),"The Username Textbox is not Displayed on Signin Page.");
		Assert.assertTrue(signinpage.isPasswordTextboxDisplayed(),"The Password Textbox is not Displayed on Signin Page.");
		Assert.assertTrue(signinpage.isforgotPasswordLinkEnabled(),"The Forgot Password Link is not Enabled on Signin Page.");
		Assert.assertTrue(signinpage.isforgotPasswordLinkDisplayed(),"The Forgot Password Link is not Displayed on Signin Page.");
		Assert.assertTrue(signinpage.isRememberMeCheackboxSelected(),"The Remember Me Cheackbox is not Selected on Signin Page.");
		Assert.assertTrue(signinpage.isLOGINButtonEnabled(),"The LOGIN Button is not Enabled on Signin Page.");
		Assert.assertEquals(ExpectedValue.loginButtonText,signinpage.isLOGINButtonTextDisplayed());
		signinpage.enterAdminUsername(Constants.adminUsername); 
		signinpage.enterAdminPassword(Constants.adminPassword); 
		signinpage.clickOnLoginButton(); 
		//Assert.assertEquals(ExpectedValue.companyName,signinpage.isCompanyNameDisplayed());
	}
	
	@Test(priority=1,description="This testcase verifies Admin is able to Create,View,ExportAs,Edit,Filter the Airlines.",enabled=true)
	public void verifyAirlineCreateViewExportAsEditFilter() throws InterruptedException  {
		signinpage= new AdminSignInPageObjects(driver);
    	signinpage.adminLogin();
		airline = new AirLinePageObject(driver);
		airline.openAirlineCard();
		Assert.assertEquals(ExpectedValue.createNewButtonText,airline.isCreateNewButtonTextDisplayed());
		Assert.assertEquals(ExpectedValue.exportAsButtonText,airline.isExportAsButtonTextDisplayed());
		Assert.assertEquals(ExpectedValue.filterButtonText,airline.isFilterButtonTextDisplayed());
		Assert.assertEquals(ExpectedValue.masterlinkText,airline.isMasterLinkTextDisplayed());
		Assert.assertEquals(ExpectedValue.airlineLinkText,airline.isAirlineLinkTextDisplayed());
		Assert.assertEquals(ExpectedValue.airlinesText,airline.isAirlinesTextDispleyed());
		airline.clickOnCreateNew();
		Assert.assertEquals(ExpectedValue.airlineCreateText,airline.isAirlineCreateTextDispleyed());
		Assert.assertEquals(ExpectedValue.airlineNameText,airline.isNameTextDisplayed());
		Assert.assertEquals(ExpectedValue.airlineiataText,airline.isIATATextDisplayed());
		Assert.assertEquals(ExpectedValue.airlineiacoText,airline.isICAOTextDisplayed());
		Assert.assertEquals(ExpectedValue.airlineAliasText,airline.isAliasTextDisplayed());
		Assert.assertEquals(ExpectedValue.airlineCallsignText,airline.isCallsignTextDisplayed());
		Assert.assertEquals(ExpectedValue.saveButtonText,airline.isSaveButtonTextDisplayed());
		Assert.assertEquals(ExpectedValue.cancelButtonText,airline.isCancelButtonTextDisplayed());
		airline.createAirline(Constants.airlineName, Constants.airlineIATA, Constants.airlineICAO,Constants.airlineCallsign, Constants.airlineAlias);
		//CreatedSuccessfully 
		Assert.assertEquals(ExpectedValue.expectedCreatedSuccessfullMessage,airline.isCreatedSuccessfullyMessageDisplayed());  
	    Assert.assertEquals(ExpectedValue.airlineDetailsText,airline.isAirlinesDetailsTextDisplayed());  
		Assert.assertEquals(ExpectedValue.editButtonText,airline.isEditButtonTextDisplayed());
		Assert.assertEquals(ExpectedValue.cancelButtonText,airline.isCancelButtonTextDisplayed());
		airline.clickOnCancelButton();
		airline.viewAirline();
		Assert.assertEquals(ExpectedValue.airlineDetailsText,airline.isAirlinesDetailsTextDisplayed());  
		Assert.assertEquals(ExpectedValue.editButtonText,airline.isEditButtonTextDisplayed());
		Assert.assertEquals(ExpectedValue.cancelButtonText,airline.isCancelButtonTextDisplayed());
		airline.clickOnCancelButton();
		airline.editAirline(Constants.newairlineIATA);
		Assert.assertEquals(ExpectedValue.expectedUpdateSuccessfullMessage,airline.isUpdatedSuccessfullyMessageDisplayed());
		airline.clickOnCancelButton();
		airline.downloadAirlineInEXCEL();
		Assert.assertEquals(ExpectedValue.expectedEXCELDownloadSuccessfullMessage,airline.isEXCELgeneratedSuccessfullyMessageDisplayed());
		airline.filterAirline(Constants.airlineName);	
	}
	
    @Test(priority=2,description="This testcase verifies Admin is able to Navigate to the  Admin Card Page & Airline Page from Airline Create, Airline Details and Airline Update Pages.",enabled=true)
	public void verifyNavigateFunctionalityInAirlines() throws InterruptedException{
    	signinpage= new AdminSignInPageObjects(driver);
    	signinpage.adminLogin();
		airline = new AirLinePageObject(driver);
		airline.navigateToAdminCardPageFromAirlinePage();
		Assert.assertEquals(ExpectedValue.adminCardText,airline.isAdminCardTextDisplayed());
		airline.navigateToAdminCardPageFromAirlineCreatePage();
		Assert.assertEquals(ExpectedValue.adminCardText,airline.isAdminCardTextDisplayed());
		airline.navigateToAdminCardPageFromAirlineDetailsPage();
		Assert.assertEquals(ExpectedValue.adminCardText,airline.isAdminCardTextDisplayed());
		airline.navigateToAdminCardPageFromAirlineUpdatePage();
		Assert.assertEquals(ExpectedValue.adminCardText,airline.isAdminCardTextDisplayed());
		airline.navigateToAirlinePageFromAirlineCreatePage();
		Assert.assertEquals(ExpectedValue.airlinesText,airline.isAirlinesTextDispleyed());
		airline.navigateToAirlinePageFromAirlineDetailsPage();
		Assert.assertEquals(ExpectedValue.airlinesText,airline.isAirlinesTextDispleyed());
		airline.navigateToAirlinePageFromAirlineUpdatePage();
		Assert.assertEquals(ExpectedValue.airlinesText,airline.isAirlinesTextDispleyed());
	}
	
    @Test(priority=3,description="This testcase verifies Admin is able to Create,View,ExportAs,Edit,Filter the Branches.",enabled=true)
    public void verifyBranchesCreateViewExportAsEditFilter() throws InterruptedException {
    	signinpage= new AdminSignInPageObjects(driver);
    	signinpage.adminLogin();
    	branch = new BranchesPageObject(driver);
    	branch.openBranchCard();  
    	Assert.assertEquals(ExpectedValue.createNewButtonText,branch.isCreateNewButtonTextDisplayed());
    	Assert.assertEquals(ExpectedValue.exportAsButtonText,branch.isExportAsButtonTextDisplayed());
    	Assert.assertEquals(ExpectedValue.filterButtonText,branch.isFilterButtonTextDisplayed());
    	Assert.assertEquals(ExpectedValue.masterlinkText,branch.isMasterLinkTextDisplayed());
    	Assert.assertEquals(ExpectedValue.branchesLinkText,branch.isBranchesLinkTextDisplayed());
    	Assert.assertEquals(ExpectedValue.branchesText,branch.isBranchesTextDispleyed());
    	branch.clickOnCreateNew();
    	Assert.assertEquals(ExpectedValue.branchNameText,branch.isBranchNameTextDisplayed());
    	Assert.assertEquals(ExpectedValue.branchCompanyText,branch.isBranchCompanyTextDisplayed());
    	Assert.assertEquals(ExpectedValue.branchLocationText,branch.isBranchLocationTextDisplayed());
    	Assert.assertEquals(ExpectedValue.branchCodeText,branch.isBranchCodeTextDisplayed());
    	Assert.assertEquals(ExpectedValue.branchEmailText,branch.isBranchEmailTextDisplayed());
    	Assert.assertEquals(ExpectedValue.branchGSTNoText,branch.isBranchGSTNumberTextDisplayed());
    	Assert.assertEquals(ExpectedValue.branchStateText,branch.isBranchGSTstateTextDisplayed());
    	Assert.assertEquals(ExpectedValue.branchAddressText,branch.isBranchAddressTextDisplayed());
    	Assert.assertEquals(ExpectedValue.branchAddAddressButtonText,branch.isBranchAddAddressButtonTextDisplayed());
    	Assert.assertEquals(ExpectedValue.saveButtonText,branch.isSaveButtonTextDisplayed());
    	Assert.assertEquals(ExpectedValue.cancelButtonText,branch.isCancelButtonTextDisplayed());
    	branch.enterBranchDetails(Constants.branchName,Constants.branchloaction,Constants.branchCode,Constants.branchEmail,Constants.branchGSTNo);
    	branch.enterBranchAddressDetails(Constants.branchAddress,Constants.branchPhoneNo,Constants.branchCity,Constants.branchZipCode);
    	Assert.assertEquals(ExpectedValue.branchDetailsText,branch.isBranchDetailsTextDisplayed());  
    	Assert.assertEquals(ExpectedValue.editButtonText,branch.isEditButtonTextDisplayed());
    	Assert.assertEquals(ExpectedValue.closeButtonText, branch.isCloseButtonTextDisplayed()); 
    	branch.clickOnCloseButton();
    	branch.viewBranch();
    	Assert.assertEquals(ExpectedValue.branchDetailsText,branch.isBranchDetailsTextDisplayed());  
    	Assert.assertEquals(ExpectedValue.editButtonText,branch.isEditButtonTextDisplayed());
    	Assert.assertEquals(ExpectedValue.closeButtonText, branch.isCloseButtonTextDisplayed()); 
    	branch.clickOnCloseButton();
    	branch.editBranch(Constants.branchloaction);
    	Assert.assertEquals(ExpectedValue.expectedUpdateSuccessfullMessage,branch.isUpdatedSuccessfullyMessageDisplayed());
    	branch.clickOnCloseButton();
    	branch.downloadBranchesInEXCEL();
    	Assert.assertEquals(ExpectedValue.expectedEXCELDownloadSuccessfullMessage,branch.isEXCELgeneratedSuccessfullyMessageDisplayed());
    	branch.filterBranch(Constants.branchName);	
    }

    @Test(priority=4,description="This testcase verifies Admin is able to Navigate to the  Admin Card Page & Branch Page from Branch Create, Branch Details and Branch Update Pages.",enabled=true)
    public void verifyNavigateFunctionalityInBranches() throws InterruptedException{
    	signinpage= new AdminSignInPageObjects(driver);
    	signinpage.adminLogin();
    	branch = new BranchesPageObject(driver);
    	branch.navigateToAdminCardPageFromBranchesPage();
    	Assert.assertEquals(ExpectedValue.adminCardText,branch.isAdminCardTextDisplayed());
    	branch.navigateToAdminCardPageFromBranchesCreatePage();
    	Assert.assertEquals(ExpectedValue.adminCardText,branch.isAdminCardTextDisplayed());
    	branch.navigateToAdminCardPageFromBranchesDetailsPage();
    	Assert.assertEquals(ExpectedValue.adminCardText,branch.isAdminCardTextDisplayed());
    	branch.navigateToAdminCardPageFromBranchesUpdatePage();
    	Assert.assertEquals(ExpectedValue.adminCardText,branch.isAdminCardTextDisplayed());
    	branch.navigateToBranchesPageFromBranchesCreatePage();
    	Assert.assertEquals(ExpectedValue.branchesText,branch.isBranchesTextDispleyed());
    	branch.navigateToBranchesPageFromBranchesDetailsPage();
    	Assert.assertEquals(ExpectedValue.branchesText,branch.isBranchesTextDispleyed());
    	branch.navigateToBranchesPageFromBranchesUpdatePage();
    	Assert.assertEquals(ExpectedValue.branchesText,branch.isBranchesTextDispleyed());
    }
       
   @Test(priority=6,description="This testcase verifies Admin is able to Navigate to the  Admin Card Page & Customer Page from Customer Create, Customer Details and Customer Update Pages.",enabled=true)
   	public void verifyNavigateFunctionalityInCustomer() throws InterruptedException{
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   customer = new CustomerPageObject(driver);
	   customer.navigateToAdminCardPageFromCustomerPage();
	   Assert.assertEquals(ExpectedValue.adminCardText,customer.isAdminCardTextDisplayed());
	   customer.navigateToAdminCardPageFromCustomerCreatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,customer.isAdminCardTextDisplayed());
	   customer.navigateToAdminCardPageFromCustomerDetailsPage();
	   Assert.assertEquals(ExpectedValue.adminCardText,customer.isAdminCardTextDisplayed());
	   customer.navigateToAdminCardPageFromCustomerUpdatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,customer.isAdminCardTextDisplayed());
	   customer.navigateToCustomerPageFromCustomerCreatePage();
	   Assert.assertEquals(ExpectedValue.customerText,customer.isCustomerTextDispleyed());
	   customer.navigateToCustomerPageFromCustomerDetailsPage();
	   Assert.assertEquals(ExpectedValue.customerText,customer.isCustomerTextDispleyed());
	   customer.navigateToCustomerPageFromCustomerUpdatePage();
	   Assert.assertEquals(ExpectedValue.customerText,customer.isCustomerTextDispleyed());
   	}
   
   @Test(priority=7,description="This testcase verifies Admin is able to Create the Customer.",enabled=true)
	  public void verifyCustomerCreate() throws InterruptedException, AWTException {
	  signinpage= new AdminSignInPageObjects(driver);
  	  signinpage.adminLogin();
	  customer = new CustomerPageObject(driver);
	  customer.openCustomerCard(); 
	  Assert.assertEquals(ExpectedValue.createNewButtonText,customer.isCreateNewButtonTextDisplayed());
	  Assert.assertEquals(ExpectedValue.exportAsButtonText,customer.isExportAsButtonTextDisplayed());
	  Assert.assertEquals(ExpectedValue.filterButtonText,customer.isFilterButtonTextDisplayed());
	  Assert.assertEquals(ExpectedValue.masterlinkText,customer.isMasterLinkTextDisplayed());
	  Assert.assertEquals(ExpectedValue.customerLinkText,customer.isCustomerLinkTextDisplayed());
	  Assert.assertEquals(ExpectedValue.customerText,customer.isCustomerTextDispleyed());
	  customer.clickOnCreateNew();
	  Assert.assertEquals(ExpectedValue.customerCreateText,customer.isCustomerCreateTextDispleyed());
	  Assert.assertEquals(ExpectedValue.saveButtonText,customer.isSaveButtonTextDisplayed());
	  Assert.assertEquals(ExpectedValue.cancelButtonText,customer.isCancelButtonTextDisplayed());
	  customer.enterClientdetails(Constants.clientName, Constants.natureOfBussiness, Constants.commodity, Constants.creditedLimit , 
			  Constants.paymentTerm,Constants.email, Constants.faxNo, Constants.website, Constants.vatNo, Constants.mobileNo, 
			  Constants.gstNo, Constants.remark, Constants.iecCODE);
     customer.enterClientAddressdetails(Constants.adressLine1, Constants.city, Constants.phoneNo, Constants.zipCODE);
	  customer.enterClientContactdetails(Constants.firstNAME, Constants.lastNAME,Constants.contactEmail, Constants.designation, Constants.phone);
	  Assert.assertEquals(ExpectedValue.expectedCreatedSuccessfullMessage,customer.isCreatedSuccessfullyMessageDisplayed());  
	  Assert.assertEquals(ExpectedValue.customerDetailsText,customer.isCustomerDetailsTextDisplayed());
	  customer.uploadKYCDocument(Constants.kycdocumentName);
	  Assert.assertEquals(ExpectedValue.kycDocumentPDF,customer.isKycDocumentPDFDisplayed());
   }
   
   @Test(priority=8,description="This testcase verifies Admin is able to View,ExportAs,Edit,Filter the Customer.",enabled=true)
   public void verifyCustomerViewExportAsEditFilter() throws InterruptedException {
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   customer = new CustomerPageObject(driver);
	   customer.openCustomerCard(); 
	   customer.viewCustomer();
	   Assert.assertEquals(ExpectedValue.customerDetailsText,customer.isCustomerDetailsTextDisplayed());  
	   Assert.assertEquals(ExpectedValue.editButtonText,customer.isEditButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.closeButtonText, customer.isCloseButtonTextDisplayed()); 
	   customer.clickOnCloseButton();
	   customer.editCustomer(Constants.mobileNo);
	   Assert.assertEquals(ExpectedValue.expectedUpdateSuccessfullMessage,customer.isUpdatedSuccessfullyMessageDisplayed());
	   customer.clickOnCloseButton();
	   customer.downloadCustomerInEXCEL();
	   Assert.assertEquals(ExpectedValue.expectedEXCELDownloadSuccessfullMessage,customer.isEXCELgeneratedSuccessfullyMessageDisplayed());
	   customer.filterCustomer(Constants.clientName);
   }
   
   @Test(priority=9,description="This testcase verifies Admin is able to Create,View,ExportAs,Edit,Filter the Service Type.",enabled=true)
   public void verifyServiceTypeCreateViewExportAsEditFilter() throws InterruptedException {
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   serviceType = new ServiceTypeObjects(driver);
	   serviceType.openServiceTypeCard(); 
	   Assert.assertEquals(ExpectedValue.createNewButtonText,serviceType.isCreateNewButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.exportAsButtonText,serviceType.isExportAsButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.filterButtonText,serviceType.isFilterButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.masterlinkText,serviceType.isMasterLinkTextDisplayed());
	   Assert.assertEquals(ExpectedValue.serviceTypeLinkText,serviceType.isServiceTypeLinkTextDisplayed());
	   Assert.assertEquals(ExpectedValue.serviceTypeText,serviceType.isServiceTypeTextDispleyed());
	   serviceType.clickOnCreateNew();
	   Assert.assertEquals(ExpectedValue.serviceTypeCreateText,serviceType.isServiceTypeCreateTextDispleyed());
	   Assert.assertEquals(ExpectedValue.saveButtonText,serviceType.isSaveButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.cancelButtonText,serviceType.isCancelButtonTextDisplayed());
	   serviceType.createServiceType(Constants.serviceType1Name,Constants.serviceType1Code);
	   
	   Assert.assertEquals(ExpectedValue.expectedCreatedSuccessfullMessage,serviceType.isCreatedSuccessfullyMessageDisplayed());  
	   Assert.assertEquals(ExpectedValue.serviceTypeDetailsText,serviceType.isServiceTypeDetailsTextDisplayed());  
	   Assert.assertEquals(ExpectedValue.editButtonText,serviceType.isEditButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.cancelButtonText,serviceType.isCancelButtonTextDisplayed());
	   serviceType.clickOnCancelButton();
	   serviceType.viewServiceType();
	   Assert.assertEquals(ExpectedValue.serviceTypeDetailsText,serviceType.isServiceTypeDetailsTextDisplayed());  
	   Assert.assertEquals(ExpectedValue.editButtonText,serviceType.isEditButtonTextDisplayed());
	   serviceType.clickOnCancelButton();
	   serviceType.editServiceType(Constants.serviceType1Name);
	   Assert.assertEquals(ExpectedValue.expectedUpdateSuccessfullMessage,serviceType.isUpdatedSuccessfullyMessageDisplayed());
	   serviceType.clickOnCancelButton();
	   serviceType.downloadServiceTypeInEXCEL();
	   Assert.assertEquals(ExpectedValue.expectedEXCELDownloadSuccessfullMessage,serviceType.isEXCELgeneratedSuccessfullyMessageDisplayed());
	   serviceType.filterServiceType(Constants.serviceType1Name);
}

   @Test(priority=10,description="This testcase verifies Admin is able to Navigate to the  Admin Card Page & Service Type Page from Service Type Create, Service Type Details and Customer Update Pages.",enabled=true)
   public void verifyNavigateFunctionalityInServiceTypeCard() throws InterruptedException{
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   serviceType = new ServiceTypeObjects(driver);
	   serviceType.navigateToAdminCardPageFromServiceTypePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,serviceType.isAdminCardTextDisplayed());
	   serviceType.navigateToAdminCardPageFromServiceTypeCreatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,serviceType.isAdminCardTextDisplayed());
	   serviceType.navigateToAdminCardPageFromServiceTypeDetailsPage();
	   Assert.assertEquals(ExpectedValue.adminCardText,serviceType.isAdminCardTextDisplayed());
	   serviceType.navigateToAdminCardPageFromServiceTypeUpdatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,serviceType.isAdminCardTextDisplayed());
	   serviceType.navigateToServiceTypePageFromServiceTypeCreatePage();
	   Assert.assertEquals(ExpectedValue.serviceTypeText,serviceType.isServiceTypeTextDispleyed());
	   serviceType.navigateToServiceTypePageFromServiceTypeDetailsPage();
	   Assert.assertEquals(ExpectedValue.serviceTypeText,serviceType.isServiceTypeTextDispleyed());
	   serviceType.navigateToServiceTypePageFromServiceTypeUpdatePage();
	   Assert.assertEquals(ExpectedValue.serviceTypeText,serviceType.isServiceTypeTextDispleyed());
   }

   @Test(priority=11,description="This testcase verifies Admin is able to Create,View,ExportAs,Edit,Filter the Charge Type.",enabled=true)
   public void verifyChargeTypeCreateViewExportAsEditFilter() throws InterruptedException {
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   chargeType = new ChargeTypePageObjects(driver);
	   chargeType.openChargeTypeCard(); 
	   Assert.assertEquals(ExpectedValue.createNewButtonText,chargeType.isCreateNewButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.exportAsButtonText,chargeType.isExportAsButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.filterButtonText,chargeType.isFilterButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.masterlinkText,chargeType.isMasterLinkTextDisplayed());
	   Assert.assertEquals(ExpectedValue.chargeTypeLinkText,chargeType.isChargeTypeLinkTextDisplayed());
	   Assert.assertEquals(ExpectedValue.chargeTypeText,chargeType.isChargeTypeTextDispleyed());
	   chargeType.clickOnCreateNew();
	   Assert.assertEquals(ExpectedValue.chargeTypeCreateText,chargeType.isChargeTypeCreateTextDispleyed());
	   Assert.assertEquals(ExpectedValue.saveButtonText,chargeType.isSaveButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.cancelButtonText,chargeType.isCancelButtonTextDisplayed());
	   chargeType.createChargeType(Constants.chargeType1Name,Constants.chargeType1Code);
       Assert.assertEquals(ExpectedValue.expectedCreatedSuccessfullMessage,chargeType.isCreatedSuccessfullyMessageDisplayed());  
	   Assert.assertEquals(ExpectedValue.chargeTypeDetailsText,chargeType.isChargeTypeDetailsTextDisplayed());  
	   Assert.assertEquals(ExpectedValue.editButtonText,chargeType.isEditButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.closeButtonText,chargeType.isCloseButtonTextDisplayed());
	   chargeType.clickOnCloseButton();
	   chargeType.viewChargeType();;
	   Assert.assertEquals(ExpectedValue.chargeTypeDetailsText,chargeType.isChargeTypeDetailsTextDisplayed());  
	   Assert.assertEquals(ExpectedValue.editButtonText,chargeType.isEditButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.closeButtonText, chargeType.isCloseButtonTextDisplayed()); 
	   chargeType.clickOnCloseButton();
	   chargeType.editChargeType(Constants.chargeType2Name);
	   Assert.assertEquals(ExpectedValue.expectedUpdateSuccessfullMessage,chargeType.isUpdatedSuccessfullyMessageDisplayed());
	   chargeType.clickOnCloseButton();
	   chargeType.downloadChargeTypeDetailsInEXCEL();
	   Assert.assertEquals(ExpectedValue.expectedEXCELDownloadSuccessfullMessage,chargeType.isEXCELgeneratedSuccessfullyMessageDisplayed());
	   chargeType.filterChargeType(Constants.chargeType1Name);
   
   }
   @Test(priority=12,description="This testcase verifies Admin is able to Navigate to the  Admin Card Page & Charge Type Page from Charge Type Create, Charge Type Details and Charge Type Update Pages.",enabled=true)
   public void verifyNavigateFunctionalityInChargeTypeCard() throws InterruptedException{
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   chargeType = new ChargeTypePageObjects(driver);
	   chargeType.navigateToAdminCardPageFromChargeTypePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,chargeType.isAdminCardTextDisplayed());
	   chargeType.navigateToAdminCardPageFromChargeTypeCreatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,chargeType.isAdminCardTextDisplayed());
	   chargeType.navigateToAdminCardPageFromChargeTypeDetailsPage();
	   Assert.assertEquals(ExpectedValue.adminCardText,chargeType.isAdminCardTextDisplayed());
	   chargeType.navigateToAdminCardPageFromChargeTypeUpdatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,chargeType.isAdminCardTextDisplayed());
	   chargeType.navigateToChargeTypePageFromChargeTypeCreatePage();
	   Assert.assertEquals(ExpectedValue.chargeTypeText,chargeType.isChargeTypeTextDispleyed());
	   chargeType.navigateToChargeTypePageFromChargeTypeDetailsPage();
	   Assert.assertEquals(ExpectedValue.chargeTypeText,chargeType.isChargeTypeTextDispleyed());
	   chargeType.navigateToChargeTypePageFromChargeTypeUpdatePage();
	   Assert.assertEquals(ExpectedValue.chargeTypeText,chargeType.isChargeTypeTextDispleyed());
   }
   @Test(priority=13,description="This testcase verifies Admin is able to Create,View,ExportAs,Edit,Filter the Charge Unit.",enabled=true)
   public void verifyChargeUnitCreateViewExportAsEditFilter() throws InterruptedException {
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   chargeUnit = new ChargeUnitPageObjects(driver);
	   chargeUnit.openChargeUnitCard(); 
	   Assert.assertEquals(ExpectedValue.createNewButtonText,chargeUnit.isCreateNewButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.exportAsButtonText,chargeUnit.isExportAsButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.filterButtonText,chargeUnit.isFilterButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.masterlinkText,chargeUnit.isMasterLinkTextDisplayed());
	   Assert.assertEquals(ExpectedValue.chargeUnitLinkText,chargeUnit.isChargeUnitLinkTextDisplayed());
	   Assert.assertEquals(ExpectedValue.chargeUnitText,chargeUnit.isChargeUnitTextDispleyed());
	   chargeUnit.clickOnCreateNew();
	   Assert.assertEquals(ExpectedValue.chargeUnitCreateText,chargeUnit.isChargeUnitCreateTextDispleyed());
	   Assert.assertEquals(ExpectedValue.saveButtonText,chargeUnit.isSaveButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.cancelButtonText,chargeUnit.isCancelButtonTextDisplayed());
	   chargeUnit.createChargeUnit(Constants.chargeUnit1Name,Constants.chargeUnit1Code);
       Assert.assertEquals(ExpectedValue.expectedCreatedSuccessfullMessage,chargeUnit.isCreatedSuccessfullyMessageDisplayed());  
	   Assert.assertEquals(ExpectedValue.chargeUnitDetailsText,chargeUnit.isChargeUnitDetailsTextDisplayed());  
	   Assert.assertEquals(ExpectedValue.editButtonText,chargeUnit.isEditButtonTextDisplayed());
	   chargeUnit.clickOnCloseButton();
	   chargeUnit.viewChargeUnit();;
	   Assert.assertEquals(ExpectedValue.chargeUnitDetailsText,chargeUnit.isChargeUnitDetailsTextDisplayed());  
	   Assert.assertEquals(ExpectedValue.editButtonText,chargeUnit.isEditButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.closeButtonText, chargeUnit.isCloseButtonTextDisplayed()); 
	   chargeUnit.clickOnCloseButton();
	   chargeUnit.editChargeUnit(Constants.chargeUnit2Name);
	   Assert.assertEquals(ExpectedValue.expectedUpdateSuccessfullMessage,chargeUnit.isUpdatedSuccessfullyMessageDisplayed());
	   chargeUnit.clickOnCloseButton();
	   chargeUnit.downloadChargeUnitDetailsInEXCEL();
	   Assert.assertEquals(ExpectedValue.expectedEXCELDownloadSuccessfullMessage,chargeUnit.isEXCELgeneratedSuccessfullyMessageDisplayed());
	   chargeUnit.filterChargeUnit(Constants.chargeUnit1Name); 
}
   @Test(priority=14,description="This testcase verifies Admin is able to Navigate to the  Admin Card Page & Charge Unit Page from Charge Unit Create, Charge Unit Details and Charge Unit Update Pages.",enabled=true)
   public void verifyNavigateFunctionalityInChargeUnitCard() throws InterruptedException{
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   chargeUnit = new ChargeUnitPageObjects(driver);
	   chargeUnit.navigateToAdminCardPageFromChargeUnitPage();
	   Assert.assertEquals(ExpectedValue.adminCardText,chargeUnit.isAdminCardTextDisplayed());
	   chargeUnit.navigateToAdminCardPageFromChargeUnitCreatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,chargeUnit.isAdminCardTextDisplayed());
	   chargeUnit.navigateToAdminCardPageFromChargeUnitDetailsPage();
	   Assert.assertEquals(ExpectedValue.adminCardText,chargeUnit.isAdminCardTextDisplayed());
	   chargeUnit.navigateToAdminCardPageFromChargeUnitUpdatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,chargeUnit.isAdminCardTextDisplayed());
	   chargeUnit.navigateToChargeUnitPageFromChargeUnitCreatePage();
	   Assert.assertEquals(ExpectedValue.chargeUnitText,chargeUnit.isChargeUnitTextDispleyed());
	   chargeUnit.navigateToChargeUnitPageFromChargeUnitDetailsPage();
	   Assert.assertEquals(ExpectedValue.chargeUnitText,chargeUnit.isChargeUnitTextDispleyed());
	   chargeUnit.navigateToChargeUnitPageFromChargeUnitUpdatePage();
	   Assert.assertEquals(ExpectedValue.chargeUnitText,chargeUnit.isChargeUnitTextDispleyed());
   }
   
   @Test(priority=15,description="This testcase verifies Admin is able to Create,View,ExportAs,Edit,Filter the Tax Type.",enabled=true)
   public void verifyTaxTypeCreate() throws InterruptedException {
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   taxType = new TaxTypePageObjects(driver);
	   taxType.openTaxTypeCard(); 
	   Assert.assertEquals(ExpectedValue.createNewButtonText,taxType.isCreateNewButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.exportAsButtonText,taxType.isExportAsButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.filterButtonText,taxType.isFilterButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.masterlinkText,taxType.isMasterLinkTextDisplayed());
	   Assert.assertEquals(ExpectedValue.taxTypeLinkText,taxType.isTaxTypeLinkTextDisplayed());
	   Assert.assertEquals(ExpectedValue.taxTypeText,taxType.isTaxTypeTextDispleyed());
	   taxType.clickOnCreateNew();
	   Assert.assertEquals(ExpectedValue.taxTypeCreateText,taxType.isTaxTypeCreateTextDispleyed());
	   Assert.assertEquals(ExpectedValue.saveButtonText,taxType.isSaveButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.cancelButtonText,taxType.isCancelButtonTextDisplayed());
	   taxType.createTaxType(Constants.taxTypeName,Constants.taxTypeDescription);
	 //  Assert.assertEquals(ExpectedValue.expectedCreatedSuccessfullMessage,taxType.isCreatedSuccessfullyMessageDisplayed());  
	   Assert.assertEquals(ExpectedValue.taxTypeDetailsText,taxType.isTaxTypeDetailsTextDisplayed());  
	   Assert.assertEquals(ExpectedValue.editButtonText,taxType.isEditButtonTextDisplayed());
   }

   @Test(priority=16,description="This testcase verifies Admin is able to View,ExportAs,Edit,Filter the Tax Type.",enabled=true)
   public void verifyTaxTypeViewExportAsEditFilter() throws InterruptedException {
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   taxType = new TaxTypePageObjects(driver);
	   taxType.openTaxTypeCard(); 
	   taxType.viewTaxType();
	   Assert.assertEquals(ExpectedValue.taxTypeDetailsText,taxType.isTaxTypeDetailsTextDisplayed());  
	   Assert.assertEquals(ExpectedValue.editButtonText,taxType.isEditButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.closeButtonText, taxType.isCloseButtonTextDisplayed()); 
	   taxType.clickOnCloseButton();
	   taxType.editTaxType(Constants.taxTypeName);
	   Assert.assertEquals(ExpectedValue.expectedUpdateSuccessfullMessage,taxType.isUpdatedSuccessfullyMessageDisplayed());
	   taxType.clickOnCloseButton();
	   taxType.downloadTaxTypeDetailsInEXCEL();
	   Assert.assertEquals(ExpectedValue.expectedEXCELDownloadSuccessfullMessage,taxType.isEXCELgeneratedSuccessfullyMessageDisplayed());
	   taxType.filterTaxType(Constants.taxTypeName);
   }
   
   @Test(priority=17,description="This testcase verifies Admin is able to Navigate to the  Admin Card Page & Tax Type Page from Tax Type Create, Tax Type Details and Tax Type Update Pages.",enabled=true)
   public void verifyNavigateFunctionalityInTaxTypeCard() throws InterruptedException{
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   taxType = new TaxTypePageObjects(driver);
	   taxType.navigateToAdminCardPageFromTaxTypePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,taxType.isAdminCardTextDisplayed());
	   taxType.navigateToAdminCardPageFromTaxTypeCreatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,taxType.isAdminCardTextDisplayed());
	   taxType.navigateToAdminCardPageFromTaxTypeDetailsPage();
	   Assert.assertEquals(ExpectedValue.adminCardText,taxType.isAdminCardTextDisplayed());
	   taxType.navigateToAdminCardPageFromTaxTypeUpdatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,taxType.isAdminCardTextDisplayed());
	   taxType.navigateToTaxTypePageFromTaxTypeCreatePage();
	   Assert.assertEquals(ExpectedValue.taxTypeText,taxType.isTaxTypeTextDispleyed());
	   taxType.navigateToTaxTypePageFromTaxTypeDetailsPage();
	   Assert.assertEquals(ExpectedValue.taxTypeText,taxType.isTaxTypeTextDispleyed());
	   taxType.navigateToTaxTypePageFromTaxTypeUpdatePage();
	   Assert.assertEquals(ExpectedValue.taxTypeText,taxType.isTaxTypeTextDispleyed());
   }
   @Test(priority=18,description="This testcase verifies Admin is able to Create,View,ExportAs,Edit,Filter the Tax Subtype.",enabled=true)
   public void verifyTaxSubTypeCreateViewExportAsEditFilter() throws InterruptedException {
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   taxSubType = new TaxSubTypePageObjects(driver);
	   taxSubType.openTaxSubTypeCard(); 
	   Assert.assertEquals(ExpectedValue.createNewButtonText,taxSubType.isCreateNewButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.exportAsButtonText,taxSubType.isExportAsButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.filterButtonText,taxSubType.isFilterButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.masterlinkText,taxSubType.isMasterLinkTextDisplayed());
	   Assert.assertEquals(ExpectedValue.taxSubTypeLinkText,taxSubType.isTaxSubTypeLinkTextDisplayed());
	   Assert.assertEquals(ExpectedValue.taxSubTypeText,taxSubType.isTaxSubTypeTextDispleyed());
	   taxSubType.clickOnCreateNew();
	   Assert.assertEquals(ExpectedValue.taxSubTypeCreateText,taxSubType.isTaxSubTypeCreateTextDispleyed());
	   Assert.assertEquals(ExpectedValue.saveButtonText,taxSubType.isSaveButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.cancelButtonText,taxSubType.isCancelButtonTextDisplayed());
	   taxSubType.createTaxSubType(Constants.taxSubType1Name,Constants.taxSubTypeDescription);
       Assert.assertEquals(ExpectedValue.expectedCreatedSuccessfullMessage,taxSubType.isCreatedSuccessfullyMessageDisplayed());  
	   Assert.assertEquals(ExpectedValue.taxSubTypeDetailsText,taxSubType.isTaxSubTypeDetailsTextDisplayed());  
	   Assert.assertEquals(ExpectedValue.editButtonText,taxSubType.isEditButtonTextDisplayed());
	   taxSubType.clickOnCloseButton();
	   taxSubType.viewTaxSubType();;
	   Assert.assertEquals(ExpectedValue.taxSubTypeDetailsText,taxSubType.isTaxSubTypeDetailsTextDisplayed());  
	   Assert.assertEquals(ExpectedValue.editButtonText,taxSubType.isEditButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.closeButtonText, taxSubType.isCloseButtonTextDisplayed()); 
	   taxSubType.clickOnCloseButton();
	   taxSubType.editTaxSubType(Constants.taxSubTypeDescription);
	   Assert.assertEquals(ExpectedValue.expectedUpdateSuccessfullMessage,taxSubType.isUpdatedSuccessfullyMessageDisplayed());
	   taxSubType.clickOnCloseButton();
	   taxSubType.downloadTaxSubTypeDetailsInEXCEL();
	   Assert.assertEquals(ExpectedValue.expectedEXCELDownloadSuccessfullMessage,taxSubType.isEXCELgeneratedSuccessfullyMessageDisplayed());
	   taxSubType.filterTaxSubType(Constants.taxSubType1Name); 
}
   @Test(priority=19,description="This testcase verifies Admin is able to Navigate to the  Admin Card Page & Tax SubType Page from Tax SubType Create, Tax SubType Details and Tax SubType Update Pages.",enabled=true)
   public void verifyNavigateFunctionalityInTaxSubTypeCard() throws InterruptedException{
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   taxSubType = new TaxSubTypePageObjects(driver);
	   taxSubType.navigateToAdminCardPageFromTaxSubTypePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,taxSubType.isAdminCardTextDisplayed());
	   taxSubType.navigateToAdminCardPageFromTaxSubTypeCreatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,taxSubType.isAdminCardTextDisplayed());
	   taxSubType.navigateToAdminCardPageFromTaxSubTypeDetailsPage();
	   Assert.assertEquals(ExpectedValue.adminCardText,taxSubType.isAdminCardTextDisplayed());
	   taxSubType.navigateToAdminCardPageFromTaxSubTypeUpdatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,taxSubType.isAdminCardTextDisplayed());
	   taxSubType.navigateToTaxSubTypePageFromTaxSubTypeCreatePage();
	   Assert.assertEquals(ExpectedValue.taxSubTypeText,taxSubType.isTaxSubTypeTextDispleyed());
	   taxSubType.navigateToTaxSubTypePageFromTaxSubTypeDetailsPage();
	   Assert.assertEquals(ExpectedValue.taxSubTypeText,taxSubType.isTaxSubTypeTextDispleyed());
	   taxSubType.navigateToTaxSubTypePageFromTaxSubTypeUpdatePage();
	   Assert.assertEquals(ExpectedValue.taxSubTypeText,taxSubType.isTaxSubTypeTextDispleyed());
   }
   @Test(priority=20,description="This testcase verifies Admin is able to Create,View,ExportAs,Edit,Filter the Taxes.",enabled=true)
   public void verifyTaxesCreateViewExportAsEditFilter() throws InterruptedException {
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   taxes = new TaxesPageObjects(driver);
	   taxes.openTaxesCard(); 
	   Assert.assertEquals(ExpectedValue.createNewButtonText,taxes.isCreateNewButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.exportAsButtonText,taxes.isExportAsButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.filterButtonText,taxes.isFilterButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.masterlinkText,taxes.isMasterLinkTextDisplayed());
	   Assert.assertEquals(ExpectedValue.taxesLinkText,taxes.isTaxesLinkTextDisplayed());
	   Assert.assertEquals(ExpectedValue.taxesText,taxes.isTaxesTextDispleyed());
	   taxes.clickOnCreateNew();
	   Assert.assertEquals(ExpectedValue.taxesCreateText,taxes.isTaxesCreateTextDispleyed());
	   Assert.assertEquals(ExpectedValue.saveButtonText,taxes.isSaveButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.cancelButtonText,taxes.isCancelButtonTextDisplayed());
	   
	   taxes.createTaxes(Constants.tax1Name,Constants.taxPercentage,Constants.taxDescription);
       Assert.assertEquals(ExpectedValue.expectedCreatedSuccessfullMessage,taxes.isCreatedSuccessfullyMessageDisplayed());  
	   Assert.assertEquals(ExpectedValue.taxesDetailsText,taxes.isTaxesDetailsTextDisplayed());  
	   Assert.assertEquals(ExpectedValue.editButtonText,taxes.isEditButtonTextDisplayed());
	   taxes.clickOnCloseButton();
	   taxes.viewTaxes();;
	   Assert.assertEquals(ExpectedValue.taxesDetailsText,taxes.isTaxesDetailsTextDisplayed());  
	   Assert.assertEquals(ExpectedValue.editButtonText,taxes.isEditButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.closeButtonText, taxes.isCloseButtonTextDisplayed()); 
	   taxes.clickOnCloseButton();
	   taxes.editTaxes(Constants.taxDescription);
	   Assert.assertEquals(ExpectedValue.expectedUpdateSuccessfullMessage,taxes.isUpdatedSuccessfullyMessageDisplayed());
	   taxes.clickOnCloseButton();
	   taxes.downloadTaxesDetailsInEXCEL();
	   Assert.assertEquals(ExpectedValue.expectedEXCELDownloadSuccessfullMessage,taxes.isEXCELgeneratedSuccessfullyMessageDisplayed());
	   taxes.filterTaxes(Constants.tax1Name);
}
   @Test(priority=21,description="This testcase verifies Admin is able to Navigate to the  Admin Card Page & Taxes Page from Taxes Create, Taxes Details and Tax SubType Update Pages.",enabled=true)
   public void verifyNavigateFunctionalityInTaxesCard() throws InterruptedException{
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   taxes = new TaxesPageObjects(driver);
	   taxes.navigateToAdminCardPageFromTaxesPage();
	   Assert.assertEquals(ExpectedValue.adminCardText,taxes.isAdminCardTextDisplayed());
	   taxes.navigateToAdminCardPageFromTaxesCreatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,taxes.isAdminCardTextDisplayed());
	   taxes.navigateToAdminCardPageFromTaxesDetailsPage();
	   Assert.assertEquals(ExpectedValue.adminCardText,taxes.isAdminCardTextDisplayed());
	   taxes.navigateToAdminCardPageFromTaxesUpdatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,taxes.isAdminCardTextDisplayed());
	   taxes.navigateToTaxesPageFromTaxesCreatePage();
	   Assert.assertEquals(ExpectedValue.taxesText,taxes.isTaxesTextDispleyed());
	   taxes.navigateToTaxesPageFromTaxesDetailsPage();
	   Assert.assertEquals(ExpectedValue.taxesText,taxes.isTaxesTextDispleyed());
	   taxes.navigateToTaxesPageFromTaxesUpdatePage();
	   Assert.assertEquals(ExpectedValue.taxesText,taxes.isTaxesTextDispleyed());
   }
   @Test(priority=22,description="This testcase verifies Admin is able to Create,View,ExportAs,Edit,Filter the Charges.",enabled=true)
   public void verifyChargesCreateViewExportAsEditFilter() throws InterruptedException {
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   charges = new ChargesPageObjects(driver);
	   charges.openChargesCard();
	  /* Assert.assertEquals(ExpectedValue.createNewButtonText,charges.isCreateNewButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.exportAsButtonText,charges.isExportAsButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.filterButtonText,charges.isFilterButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.masterlinkText,charges.isMasterLinkTextDisplayed());
	   Assert.assertEquals(ExpectedValue.chargesLinkText,charges.isChargesLinkTextDisplayed());
	   Assert.assertEquals(ExpectedValue.chargesText,charges.isChargesTextDispleyed());
	   charges.clickOnCreateNew();
	   Assert.assertEquals(ExpectedValue.chargesCreateText,charges.isChargesCreateTextDispleyed());
	   Assert.assertEquals(ExpectedValue.saveButtonText,charges.isSaveButtonTextDisplayed());
	   Assert.assertEquals(ExpectedValue.cancelButtonText,charges.isCancelButtonTextDisplayed());
	   
	   charges.createNewCharge(Constants.charge2Name,Constants.sacCode,Constants.chargeDescription);
       Assert.assertEquals(ExpectedValue.expectedCreatedSuccessfullMessage,charges.isCreatedSuccessfullyMessageDisplayed());  
	   Assert.assertEquals(ExpectedValue.chargesDetailsText,charges.isChargesDetailsTextDisplayed());  
	   Assert.assertEquals(ExpectedValue.editButtonText,charges.isEditButtonTextDisplayed());
	   charges.clickOnCloseButton();*/
	   
}
   @Test(priority=23,description="This testcase verifies Admin is able to Navigate to the  Admin Card Page & Charges Page from Charges Create, Charges Details and Charges Update Pages.",enabled=true)
   public void verifyNavigateFunctionalityInChargesCard() throws InterruptedException{
	   signinpage= new AdminSignInPageObjects(driver);
	   signinpage.adminLogin();
	   charges = new ChargesPageObjects(driver);
	   charges.navigateToAdminCardPageFromChargesPage();
	   Assert.assertEquals(ExpectedValue.adminCardText,charges.isAdminCardTextDisplayed());
	   charges.navigateToAdminCardPageFromChargesCreatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,charges.isAdminCardTextDisplayed());
	   charges.navigateToAdminCardPageFromChargesDetailsPage();
	   Assert.assertEquals(ExpectedValue.adminCardText,charges.isAdminCardTextDisplayed());
	   charges.navigateToAdminCardPageFromChargesUpdatePage();
	   Assert.assertEquals(ExpectedValue.adminCardText,charges.isAdminCardTextDisplayed());
	   charges.navigateToChargesPageFromChargesCreatePage();
	   Assert.assertEquals(ExpectedValue.chargesText,charges.isChargesTextDispleyed());
	   charges.navigateToChargesPageFromChargesDetailsPage();
	   Assert.assertEquals(ExpectedValue.chargesText,charges.isChargesTextDispleyed());
	   charges.navigateToChargesPageFromChargesUpdatePage();
	   Assert.assertEquals(ExpectedValue.chargesText,charges.isChargesTextDispleyed());
   }
   
}