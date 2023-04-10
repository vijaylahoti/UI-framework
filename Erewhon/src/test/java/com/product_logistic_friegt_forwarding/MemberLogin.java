package com.product_logistic_friegt_forwarding;

import org.testng.annotations.Test;

import comfssdomainpageobjects.ErewhonMemberLogin;
import product_friegt_basepackage.TestBase;
import utility.Constants;

public class MemberLogin extends TestBase{
	
	@Test(priority=1,description="This testcase verifies memeber login",enabled=true)
	public void verifyLoginFunctuionality(){
		ErewhonMemberLogin Ere= new ErewhonMemberLogin(driver);
		Ere.clickOnmemberlogin();
		Ere.entermobileno(Constants.Phone);
		

}
}
