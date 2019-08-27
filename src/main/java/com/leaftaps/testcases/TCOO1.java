package com.leaftaps.testcases;

import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecificMethods;

import co.leaftaps.pages.LoginPage;

public class TCOO1 extends ProjectSpecificMethods {
	@Test
	public void createNewLead() {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickSubmit()
		.verifyFirstName();
	}
}
