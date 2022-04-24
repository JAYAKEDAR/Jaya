package com.hybridframework.testcases;

import org.testng.annotations.Test;

import com.hybridframework.projectobject.DashBoardPage;
import com.hybridframework.testbase.TestBase;

public class LoginPageTC001 extends TestBase {

	@Test

	public void VerifyLoginFuctionality() throws InterruptedException {

		/*LoginPage login = new LoginPage(driver);
		login.username();
		login.password();
		login.Loginbtn();*/
		
		DashBoardPage db = new DashBoardPage(driver);
		//db.newCustomer();
		//db.editCustomer();
		//db.deleteCustomer();
		db.newAccount();
		
		
	}

}


     




