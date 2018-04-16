package com.caddycode.stepDef;

import org.junit.Assert;

import com.caddycode.ObjectRepository.AdminPortalOR;
import com.caddycode.browser.Browser;
import com.caddycode.helper.Generic;
import com.caddycode.pageObjects.AdminPortalPageObj;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AdminPortalStepDef extends Browser{
	AdminPortalPageObj admin = new AdminPortalPageObj();
	@Given("^User navigates to the Admin Page$")
	public void user_navigates_to_the_Admin_Page() throws Throwable {
		String AdminURL = prop.getProperty("adminUrl");
		Generic.navigateToURL(AdminURL);
	}
	
	@Given("^User provides the valid username and password$")
	public void user_provides_the_valid_password() throws Throwable {
		admin.loginAdminPortal();
	}

	@When("^User performs sign operation$")
	public void user_performs_sign_operation() throws Throwable {
		Assert.assertTrue(Generic.clickElement("id", AdminPortalOR.signIn));
	}

	@Then("^User navigates to Admin homepage$")
	public void user_navigates_to_Admin_homepage() throws Throwable {
		Thread.sleep(5000);
		Assert.assertTrue(Generic.verifyElement("id", AdminPortalOR.logout));
	}


}
