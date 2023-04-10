package com.product_logistic_friegt_forwarding;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import comfssdomainpageobjects.AdminSignInPageObjects;
import comfssdomainpageobjects.LoginPage;
import comfssdomainpageobjects.BranchesPageObject;
import comfssdomainpageobjects.ChargeTypeObjects;
import comfssdomainpageobjects.ChargeUnitObjects;
import comfssdomainpageobjects.MasterModuleObject;
import comfssdomainpageobjects.ServiceTypeObjects;
import product_friegt_basepackage.TestBase;
import utility.Constants;
import utility.ExpectedValue;

@Listeners({com.product_logistic_friegt_forwarding.Itestlistners.class})
public class ErewhonTestScripts extends TestBase{

	public AdminSignInPageObjects signinpage;
	public  LoginPage airline;
	public BranchesPageObject branch;
	public ServiceTypeObjects service;
	public ChargeTypeObjects charge;
	public ChargeUnitObjects unit;
	// Logger log = Logger.getLogger(Producr_Frieght_Adda_Scenarios.class);

	/*
	 * This test case verifies admin login functionality
	 * @Parameters:
	 * @return: 
	 */
	@Test(priority=0,description="This testcase verifies admin login functionality",enabled=true)
	public void verifyAdminLoginFunctionality()  {
		
		// ErewhonLoginPage loginpage= new  ErewhonLoginPage(driver);
		
		/*
		 * adminLogin();
		 * Assert.assertEquals(signinpage.isAdminProfileNameDisplayed(),Constants.
		 * ExpectedProfilEText); Assert.assertEquals(signinpage.isAdminRoleDisplayed(),
		 * Constants.ExpectedadminroleText);
		 * Assert.assertEquals(signinpage.isUserNameDisplayed(),Constants.
		 * ExpectedusernameText);
		 */
	}

	/*
	 * This test case verifies create a airline
	 * @Parameters:
	 * @return: 
	 */
	@Test(priority=1,description="This testcase verifies create a airline",enabled=true)
	public void verifyLoginFunctuionality(){
		LoginPage Erewhon= new LoginPage(driver);
		Erewhon.enterEmailID(Constants.Username);
		Erewhon.enterPassword(Constants.Password);
		Erewhon.clickOnLogIn();
		Erewhon.clickOnSelectLocation();
		Erewhon.clickOnGroceries();
		
	}
	
	/*
	 * This test case verifies create a branch
	 * @Parameters:
	 * @return: 
	 */
	@Test(priority=2,description="This testcase verifies create a branches ",enabled=false)
	public void verifyCreateBranches() throws InterruptedException {
		adminLogin();
		clickOnMasterModule();
		branch=new BranchesPageObject(driver);
		branch.clickOnBranchFolder();
		branch.clickOnCreateNew();
		branch.enterBranchDetails(Constants.branchname,Constants.branchloaction,Constants.branchcode,Constants.branchemail,Constants.gstnumber);
		Assert.assertEquals(ExpectedValue.branchdetailstext,branch.isBranchDetailsTextDisplayed());
		Assert.assertEquals(ExpectedValue.companyname,branch.isCompanyNameDisplayed());
		Assert.assertEquals(ExpectedValue.branchnametext,branch.isBranchNameDisplayed());
	}
	/*
	 * This test case verifies CreateServiceType
	 * @Parameters:servicename,servicecode.
	 * @return: No
	 */
	
	@Test(priority=3,description="This testcase verifies create a service type ",enabled=true )
	public void verifyCreateServiceType() throws InterruptedException {
		adminLogin();
		clickOnMasterModule();
		service= new ServiceTypeObjects(driver);
		service.clickOnServiceTypeFolder();
		service.clickOnCreateNewOption();
		service.enterServiceTypeDetails(Constants.servicename, Constants.servicecode);  
		Assert.assertEquals(ExpectedValue.companyname,service.isCompanyNameDisplayed());
		Assert.assertEquals(ExpectedValue.servicetypedetailstext,service.isServiceTypeDetailsTextDisplayed());
		Assert.assertEquals(ExpectedValue.servicetypetext,service.isServiceTypeTextDisplayed());

	}
	/*
	 * This test case verifies create a ChargeType
	 * @Parameters:
	 * @return: No
	 */
	@Test(priority=4,description="This testcase verifies create a charge type ",enabled=false)
	public void veriyCreateChargeType() throws InterruptedException {
		adminLogin();
		clickOnMasterModule();
		charge= new ChargeTypeObjects(driver);
		charge.clickOnChargeTypeFolder();
		charge.clickOnCreateNewOption();
		charge.enterChargeTypeDetails(Constants.chargetypename,Constants.chargetypecode);
		Assert.assertEquals(ExpectedValue.chargetypedetailstext,charge.isChargeTypeDetailsPgageDisplayed());
		Assert.assertEquals(ExpectedValue.companyname,charge.isCompanyNameDisplayed());
		Assert.assertEquals(ExpectedValue.chargecode,charge.isChargeCodeDisplayed());
		Assert.assertEquals(ExpectedValue.chargetypename,charge.isChargetypediplayed());
	}
	/*
	 * This test case verifies create a ChageUnit
	 * @Parameters:
	 * @return: 
	 */
	@Test(priority=5,description="This testcase verifies create a charge unit ",enabled=false)
	public void verifyCreateChageUnit() throws InterruptedException {
		adminLogin();
		clickOnMasterModule();
	    unit= new ChargeUnitObjects(driver);
	    unit.clickOnChargeUnitFolder();
	    unit.clickOnCreateNew();
	    unit.enterChargeUnitDetails(Constants.chargeunitname,Constants.chargeunitcode);
		Assert.assertEquals(ExpectedValue.chargeunitdetailstext,unit.isChargeUnitDetailsTextDisplayed());
		Assert.assertEquals(ExpectedValue.chargeunitname,unit.isChargeUnitNameDisplayed());
		Assert.assertEquals(ExpectedValue.companyname,unit.isCompanyNameDisplayed()); 
	}

	public void clickOnMasterModule() {
		MasterModuleObject master= new MasterModuleObject(driver);
		master.clickOnMaterModule();

	}
	public void adminLogin() {
		signinpage= new AdminSignInPageObjects(driver);
		signinpage.navigateUrl(Constants.URL) ; 
		signinpage.enterAdminUserId(Constants.Username); 
		signinpage.enterAdminUserPassword(Constants.Password); 
		signinpage.clickOnLoginButton(); 	 
	}
	/*
	 * @Test public void google() { driver.get("https://www.google.com/");
	 * driver.findElement(By.xpath("q")).sendKeys("873687"); }
	 */
}
/*
 * airline.enterAirlineName(Constants.airlinename);
 * airline.enterIATACode(Constants.airlineiata);
 * airline.enterICAOCode(Constants.airlineicao); airline.clickOnSaveButton();
 */


/*
 * signinpage= new AdminSignInPageObjects(driver);
 * signinpage.navigateUrl(Constants.URL) ;
 * signinpage.enterAdminUserId(Constants.Username);
 * signinpage.enterAdminUserPassword(Constants.Password);
 * signinpage.clickOnLoginButton();
 */

















