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
		for(int i=0;i<dataArray.length;i++)
		{
		
		Thread.sleep(3000);
		Generic.enterValue("id", LandingSiteOR.firstName, dataArray[i].get("FirstName"));
		//Generic.enterValue("id", LandingSiteOR.lastName,dataArray[i].get("LastName"));
		Generic.enterValue("id", LandingSiteOR.email, dataArray[i].get("Email"));
		Generic.enterValue("id", LandingSiteOR.facilityName,dataArray[i].get("FacilityName"));
		Generic.enterValue("id", LandingSiteOR.domailURl, dataArray[i].get("DomainURL"));
		Generic.enterValue("id", LandingSiteOR.phoneNumber, dataArray[i].get("PhoneNumber"));
		Generic.clickElement("id", LandingSiteOR.getStartedNOw);
		}
		Thread.sleep(5000);
		status = true;
		return status;
	}
	
	
	

}
