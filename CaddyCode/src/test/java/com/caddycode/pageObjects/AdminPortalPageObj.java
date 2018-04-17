package com.caddycode.pageObjects;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.caddycode.ObjectRepository.AdminPortalOR;
import com.caddycode.browser.Browser;
import com.caddycode.helper.Generic;

public class AdminPortalPageObj {
	
	private WebDriver driver;
	Properties prop;
	public AdminPortalPageObj()
	{
		this.driver =Browser.driver;
		this.prop = Browser.prop;
	}
	public void loginAdminPortal()
	{
		String userName = prop.getProperty("AdminUserName");
		String password = prop.getProperty("AdminPwd");
		Generic.enterValue("id", AdminPortalOR.UserName, userName);
		Generic.enterValue("id", AdminPortalOR.password, password);
		
	}

}
