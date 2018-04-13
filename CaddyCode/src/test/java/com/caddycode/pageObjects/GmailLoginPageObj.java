package com.caddycode.pageObjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.caddycode.ObjectRepository.GmailLoginOR;
import com.caddycode.browser.Browser;

public class GmailLoginPageObj {
	
	private WebDriver driver;
	private Properties prop;
	
	public GmailLoginPageObj()
	{
		this.driver = Browser.driver;
		this.prop=Browser.prop;
	}

	public void gmailLogin()
	{
		driver.findElement(By.xpath(GmailLoginOR.userName)).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.xpath(GmailLoginOR.next)).click();
		driver.findElement(By.xpath(GmailLoginOR.password)).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(GmailLoginOR.next)).click();
	}
	
}
