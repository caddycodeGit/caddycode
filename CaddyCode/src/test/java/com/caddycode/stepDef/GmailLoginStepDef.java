package com.caddycode.stepDef;

import com.caddycode.browser.Browser;
import com.caddycode.pageObjects.GmailLoginPageObj;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailLoginStepDef extends Browser {
	
	
	GmailLoginPageObj gmail = new GmailLoginPageObj();
	public GmailLoginStepDef()
	{
		super();
	}
	
	


@Given("^Open Firefox and start Application$")
public void open_Firefox_and_start_Application() throws Throwable {
	
}

@When("^I enter Valid User Name and password$")
public void i_enter_Valid_User_Name_and_password() throws Throwable {
   
}

@Then("^User should be able to login sucessfully$")
public void user_should_be_able_to_login_sucessfully() throws Throwable {
    
}
	
	
}
