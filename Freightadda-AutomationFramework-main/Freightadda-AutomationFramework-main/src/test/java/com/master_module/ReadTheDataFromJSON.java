package com.master_module;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.basepackage.TestBase;
import com.jayway.jsonpath.JsonPath;
import com.utilitiesclasses.Constants;
import com.utilitiesclasses.ExpectedValue;

import comfssdomainpageobjects.AdminSignInPageObjects;
import comfssdomainpageobjects.AirLinePageObject;

public class ReadTheDataFromJSON extends TestBase {
	AdminSignInPageObjects signinpage;
	AirLinePageObject airline;
	JSONParser jsonp;
	FileReader reader;
	File jsonfile;
	Object data;
	
	public   void jsonResource(String element) throws IOException {
		File jsonfile= new File("C:\\Users\\OWNER\\git\\FSSFreightAddaProject-\\src\\main\\java\\com\\UtilitiesClasses\\data.json");
		Object data=JsonPath.read(jsonfile,"$."+element);
		
	}

//	public void login(String element) throws IOException {
//		jsonResource("login.username");
//		jsonResource("login.password");
//		System.out.println(data);
//		
//	}
	
	@Test(priority=1,description="This testcase verifies Admin is able to Create,View,ExportAs,Edit,Filter the Airlines.",enabled=true)
	public void verifyAirlineCreateViewExportAsEditFilter() throws InterruptedException  {
		signinpage= new AdminSignInPageObjects(driver);
    	signinpage.adminLogin();
		airline = new AirLinePageObject(driver);
		airline.openAirlineCard();
		airline.clickOnCreateNew();
	//	airline.createAirline(jsonResource("Airline.name"), jsonResource("Airline.iata"),jsonResource("Airline.icao"),jsonResource("Airline.alias"), jsonResource("Airline.callsign"));
}
	
	
}
	
	
	
	
	

