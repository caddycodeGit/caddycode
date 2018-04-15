package com.caddycode.pageObjects;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.caddycode.ObjectRepository.LandingSiteOR;
import com.caddycode.browser.Browser;
import com.caddycode.helper.Generic;
import com.caddycode.helper.Xls_Reader;

public class LandingSitePageObj {
	private WebDriver driver;
	private Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\Testdata.xlsx");
	public LandingSitePageObj()
	{
		this.driver = Browser.driver;
	}
	
	
	public boolean signUpForFree() throws Exception
	{
		boolean status = false;
		Hashtable<String,String>[] dataArray = Generic.getData(xls, "Sheet1", "SignUp");
		System.out.println(dataArray[0].get("FirstName"));
		
		Thread.sleep(3000);
		Generic.enterValue("id", LandingSiteOR.firstName, dataArray[0].get("FirstName"));
		Generic.enterValue("id", LandingSiteOR.lastName,dataArray[0].get("LastName"));
		Generic.enterValue("id", LandingSiteOR.email, dataArray[0].get("Email"));
		Generic.enterValue("id", LandingSiteOR.facilityName,dataArray[0].get("FacilityName"));
		Generic.enterValue("id", LandingSiteOR.domailURl, dataArray[0].get("DomainURL"));
		Generic.enterValue("id", LandingSiteOR.phoneNumber, dataArray[0].get("PhoneNumber"));
		Generic.clickElement("id", LandingSiteOR.getStartedNOw);
		Thread.sleep(5000);
		status = true;
		return status;
	}
	
	
	

}
