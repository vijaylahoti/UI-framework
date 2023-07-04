package com.utilitiesclasses;

import org.openqa.selenium.WebDriver;

import com.basepackage.TestActions;

public class Constants extends TestActions{
	public Constants(WebDriver driver) {
	super(driver);
	}
	
	public static final String URL = "http://app-lb-926247714.ap-south-1.elb.amazonaws.com/\r\n"+ "";
	public static final String ExpectedEmailText="Adming@gmail.com";
//	public static final String adminUsername = "ramesh";
//	public static final String adminPassword = "ramesh";
	public static final String adminUsername = "Adming";
	public static final String adminPassword = "Adming";
	public static final String ExpectedadminroleText = "admin";
	public static final String ExpectedusernameText = "Adming Jadhav";

    // Superadmin Constant
     public static final String superadminUsername = "superadmin"; 
	 public static final String superadminPassword = "jbsuper@123";
	 public static final String ExpectedUsernameText = " Superadmin";
	 public static final String CompanyName ="Freight";
	 public static final String Email ="demo@gmail.com";
	 public static final String Currency ="INR";
	 public static final String MobileNumber ="9876543210";
	 public static final String PinCode ="411045";
	 public static final String StateName ="Maharashtra";
	 public static final String Countryname ="India";
	 public static final String WebsiteName ="www.demo.com";
	 public static final String Location = "Office no. 303, 1st Mezzanine floor EFC Prime business centre, Mumbai Banglore highway, Baner, Pune, Maharashtra";
     public static final String FAXNumber = "3322747944";
     public static final String FIATACode ="7654";
     public static final String IATACode ="4563";
     public static final String VATNumber="5643";
     public static final String  GSTNumber ="07AAGFF2194N1Z2";
     public static final String EnterDescription ="CARGO SERVICE";
     public static final String BankAccountNumber="SBI321456098";
     public static final String EnterAccountHolder="";
     public static final String BankName ="Bank of india";
     public static final String BankBranch="Pune";
     public static final String BeneficiaryName="S";
     public static final String IFSCODE="BOI0011513";
     public static final String Enterdescription="CARGO SERVICE1";
     
     //SUPERADMIN CREATE NEW BRANCH INPUTS
     public static final String  EnterBranchName ="mumbai";
     public static final String  EnterLocation="mumbai, Maharashtra 411045";
     public static final String EnterbranchCode="PMB";
     public static final String Enteremail ="branchmumbai4@gmail.com";
     public static final String EntergstNumber="07AAGFF2194N1Z3";
     public static final String  EntergstState="MAHARASHTRA";
     public static final String  EnterAddress1="mumbai";
     public static final String  EnterAddress2=" Maharashtra 411045";
     public static final String EnterPhoneNo="976543222";
     public static final String Entercity="MUMBAI";
     public static final String Enterdistrict="mumbai";
     public static final String Enterzipcode ="42220";
     
     
     //SUPERADMIN CREATE NEW Role INPUTS
     public static final String EnterRolename ="Role_Admin 9 ";
     public static final String EnterRoledescription="Admin can access everymodule";
     
     //SUPERADMIN CREATE NEW Employee INPUTS
     public static final String EnterfirstName="johan";
     public static final String EntermiddleName="S ";
     public static final String EnterlastName="Soni";
     public static final String EnterEmployeeemail="johan21@gmail.com";
     public static final String EnterEnteruserName="UserName";
     public static final String Enterpassword="johan@123";
     public static final String EnterconfirmPassword="johan@123";
     
   //superadmin contact person inputs     
     public static final String  ContactPersonsfirstName=" suraj ";
     public static final String ContactPersonsmiddleName="suresh";
     public static final String ContactPersonslastName="sharma";
     public static final String Designation ="Manager";
     public static final String EntercontactpersonPhoneNo ="9876543210";
     public static final String Entercontactpersonemail = "suraj6@gmail.com";
     
     //SUPERADMIN SHIPMENT ACTIVITY
      
    // public static final String enterName="SEA EXPORT DOCUMENT DISPATCH";
     //public static final String shipmentActivityDescription="SEA EXPORT DOCUMENT DISPATCH";
     public static final String enterName="AIR EXPORT BOOKING";
     public static final String shipmentActivityDescription="AIR EXPORT BOOKING";
    		//Airline details 
     public static final String airlineName = "Indigo airline";
     public static final String airlineIATA =generateRandomString(4);
     public static final String newairlineIATA = "AAA";
     public static final String airlineICAO =generateRandomString(4);
     public static final String airlineAlias="";
     public static final String airlineCallsign="";
     public static final String airlinedetailsText = "Airline Details";
     public static final String searchMumbaiAirlines="Mumbai Airlines";
     //Branch details
     public static final String branchName = "Mumbai";
     public static final String branchloaction ="Mumbai";
     public static final String branchCode = generateRandomString(4);
     public static final String branchState = "Maharashtra";
     public static final String branchEmail = generateRandomEmail(10);
     public static final String branchGSTNo ="27AADCA1395A1Z3";
 	public static final String branchAddress ="Mumbai";
 	public static final String branchCity ="Mumbai";
 	public static final String branchZipCode ="456345";
 	public static final String branchPhoneNo ="9876898765";
 	
     //Customer
 	public static final String clientName ="KELVIN EXPORTS";
    public static final String commodity = "RICE";
    public static final String natureOfBussiness = "Logitics-Transport";
    public static final String creditedLimit = "100000";
    public static final String paymentTerm = "30";
    public static final String email = generateRandomEmail(10);
    public static final String website = "www.kelvinexportshh1.com";
    public static final String faxNo = "1234567890";
    public static final String vatNo = "MH1234567890123";
    public static final String mobileNo = "9866543672";
    public static final String gstNo = "27AADCA1395A1Z3";
    public static final String remark = "";
    public static final String iecCODE = "123456";
    public static final String phoneNo = "09800150136";
    public static final String adressLine1="2nd Floor, Room no, 205,";
    public static final String city="Kolkata";
    public static final String zipCODE = "700001";
    public static final String firstNAME = "Soumya";
    public static final String lastNAME = "Hazra";
    public static final String middleNAME = "Adsaf";
    public static final String contactEmail = generateRandomEmail(10);
    public static final String designation = "Manager";
    public static final String phone = "09800150136";
    public static final String kycdocumentName = "KYC";
    public static final String kycdocumentPath = "C:\\Users\\OWNER\\Desktop\\KYC DOCUMENT.pdf";
   
    //Service Type
	public static final String serviceType1Name = "PORT TO PORT";
	public static final String serviceType1Code =generateRandomString(4);
	public static final String serviceType2Name = "PORT TO DOOR";
	public static final String serviceType2Code = generateRandomString(4);
	public static final String serviceType3Name = "DOOR TO PORT";
	public static final String serviceType3Code = generateRandomString(4);
	public static final String serviceType4Name = "DOOR TO DOOR";
	public static final String serviceType4Code = generateRandomString(4);
   //Charge Type
    public static final String chargeType1Name = "ORIGIN CHARGES";
    public static final String chargeType1Code = generateRandomString(4);
    public static final String chargeType2Name = "FRIGHT CHARGES";
    public static final String chargeType2Code = generateRandomString(4);
    public static final String chargeType3Name = "DESTINATION CHARGES";
    public static final String chargeType3Code = generateRandomString(4);
    //Tax Type
    public static final String taxTypeName = "GST ";
    public static final String taxTypeDescription = "GST TAX"; 
  //Charge Unit
    public static final String chargeUnit1Name = "PER KGS ";
    public static final String chargeUnit1Code = generateRandomString(4); 
    public static final String chargeUnit2Name = "PER SHIPPING BILL ";
    public static final String chargeUnit2Code = generateRandomString(4);  
    public static final String chargeUnit3Name = "PER BILL OF LODING ";
    public static final String chargeUnit3Code = generateRandomString(4);  
    public static final String chargeUnit4Name = "PER AIRWAY BILL ";
    public static final String chargeUnit4Code = generateRandomString(4); 
    public static final String chargeUnit5Name = "PER SHIPMENT";
    public static final String chargeUnit5Code = generateRandomString(4); 
    //Tax SubType
    public static final String taxSubType1Name = "CGST ";
    public static final String taxSubType2Name = "IGST ";
    public static final String taxSubType3Name = "SGST ";
    public static final String taxSubTypeDescription = "Tax SubType Description"; 
    //Taxes
    public static final String tax1Name = "GST 12%";
    public static final String tax2Name = "GST 10%";
    public static final String taxPercentage = "12";
    public static final String taxDescription = "GST 12% TAX"; 
    
  //Charges
    public static final String charge1Name = "LOADING CHARGE";
    public static final String charge2Name = "UNLOADING CHARGE";
    public static final String charge3Name = "PORT TO WAREHOUSE";
    public static final String charge4Name = "LABOUR  CHARGE";
    public static final String charge5Name = "WAREHOUSE TO DESTINATION";
    public static final String charge6Name = "TERMINAL HANDLING CHARGES";
    public static final String charge7Name = "DAMRAGE CHARGE";
    public static final String charge8Name = "PORT TO PORT";
    public static final String charge9Name = "CUSTOM CLEARANCE";
    public static final String charge10Name = "WAREHOUSE TO PORT";
    public static final String charge11Name = "SOURCE TO WAREHOUSE";
    public static final String sacCode = "123456";
    public static final String chargeDescription = "Charge Description"; 
    
    
    
    
    
    
    
    
    
    
    
    
    
}
