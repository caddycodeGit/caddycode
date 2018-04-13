package com.caddycode.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.caddycode.ObjectRepository.LandingSiteOR;
import com.caddycode.browser.Browser;
import com.caddycode.helper.Generic;

public class LandingSitePageObj {
	private WebDriver driver;
	
	public LandingSitePageObj()
	{
		this.driver = Browser.driver;
	}
	
	
	public boolean signUpForFree() throws Exception
	{
		boolean status = false;
		Thread.sleep(3000);
		Generic.enterValue("id", LandingSiteOR.firstName, "firstName1");
		Generic.enterValue("id", LandingSiteOR.lastName, "lastName");
		Generic.enterValue("id", LandingSiteOR.email, "prasad457@yopmail.com");
		Generic.enterValue("id", LandingSiteOR.facilityName, "facilityName679");
		Generic.enterValue("id", LandingSiteOR.domailURl, "facilityName678");
		Generic.enterValue("id", LandingSiteOR.phoneNumber, "456789012473");
		Generic.clickElement("id", LandingSiteOR.getStartedNOw);
		Thread.sleep(3000);
		status = true;
		return status;
	}
	
	
	

}
