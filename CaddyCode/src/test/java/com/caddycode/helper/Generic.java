package com.caddycode.helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.caddycode.browser.Browser;

public class Generic extends Browser {
	
	
	
	
	public static void navigateToURL(String url)
	{
		driver.get(url);
	}
	
	public static boolean clickElement(String locator,String locatorVal)
	{
		boolean status = false;
		List<WebElement> elements = null;
		switch(locator)
		{
		case "id":
			elements = driver.findElements(By.id(locatorVal));
			break;
		case "xpath":
			elements = driver.findElements(By.xpath(locatorVal));
			break;
		case "className":
			elements = driver.findElements(By.className(locatorVal));
			break;
		case "name":
			elements = driver.findElements(By.name(locatorVal));
			break;
		}
		if(elements.size()>0)
		{
			if(elements.get(0).isDisplayed() && elements.get(0).isEnabled())
			{
				elements.get(0).click();
				status = true;
			}
			else
			{
				status = false;
			}
		}
		else
		{
			status = false;
		}
			
			
		return status;
		
	}
	
	
	
	
	
	public static boolean verifyElement(String locator,String locatorVal)
	{
		boolean status = false;
		List<WebElement> elements = null;
		switch(locator)
		{
		case "id":
			elements = driver.findElements(By.id(locatorVal));
			break;
		case "xpath":
			elements = driver.findElements(By.xpath(locatorVal));
			break;
		case "className":
			elements = driver.findElements(By.className(locatorVal));
			break;
		case "name":
			elements = driver.findElements(By.name(locatorVal));
			break;
		}
		if(elements.size()>0 && elements.get(0).isDisplayed() && elements.get(0).isEnabled())
		{
			status = true;
		}
		else
		{
			status = false;
		}
			
			
		return status;
		
	}
	
	public static boolean enterValue(String locator,String locatorVal,String value)
	{
		boolean status = false;
		List<WebElement> elements = null;
		switch(locator)
		{
		case "id":
			elements = driver.findElements(By.id(locatorVal));
			break;
		case "xpath":
			elements = driver.findElements(By.xpath(locatorVal));
			break;
		case "className":
			elements = driver.findElements(By.className(locatorVal));
			break;
		case "name":
			elements = driver.findElements(By.name(locatorVal));
			break;
		}
		if(elements.size()>0)
		{
			if(elements.get(0).isDisplayed() && elements.get(0).isEnabled())
			{
				elements.get(0).clear();
				elements.get(0).sendKeys(value);
				status = true;
			}
			else
			{
				status = false;
			}
		}
		else
		{
			status = false;
		}
			
			
		return status;
		
	}
	
	
	
	

}
