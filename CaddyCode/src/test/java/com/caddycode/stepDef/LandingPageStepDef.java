package com.caddycode.stepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.caddycode.ObjectRepository.LandingSiteOR;
import com.caddycode.browser.Browser;
import com.caddycode.helper.Generic;
import com.caddycode.pageObjects.LandingSitePageObj;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LandingPageStepDef extends Browser {
	
	
	LandingSitePageObj landingsite = new LandingSitePageObj();
	public LandingPageStepDef() {
	
		super();
	}
	
	
	@Given("^User navigates to the Landing Page$")
	public void user_navigates_to_the_Landing_Page() throws Throwable {
		Generic.clickElement("xpath", LandingSiteOR.landingSignUP);
	}

	@When("^User perfrom SignUp operation$")
	public void user_perfrom_SignUp_operation() throws Throwable {
		Generic.verifyElement("xpath", LandingSiteOR.signupPage);
	}

	@Then("^User navigates the landing signup page$")
	public void user_navigates_the_landing_signup_page() throws Throwable {
	  }

	@When("^User insert the signup information$")
	public void user_insert_the_signup_information() throws Throwable {
		Assert.assertTrue(landingsite.signUpForFree());
	 	}

	@When("^User perform GetstartedNow operation$")
	public void user_perform_GetstartedNow_operation() throws Throwable {
	
	}

	
	@Then("^User verify welcome to (\\d+)Strorage page$")
	public void user_verify_wwelcome_to_Strorage_page(int arg1) throws Throwable {
		Assert.assertTrue(Generic.verifyElement("id", LandingSiteOR.registrationConfrim));
	}
	

}
