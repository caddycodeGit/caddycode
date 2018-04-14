package com.caddycode.helper;

import java.util.Hashtable;
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
	
	
	public static Hashtable<String,String>[] getData(Xls_Reader xls,String sheetname,String testcaseName){
		
		int testcaseStartrow=1;
		while(!xls.getCellData(sheetname,testcaseStartrow, 0).equals(testcaseName)){
			testcaseStartrow++;
		}
		System.out.println(testcaseName+" start row num is "+testcaseStartrow);
		int testDataStartrownum=testcaseStartrow+2;
		int rows=0;
		while(!xls.getCellData(sheetname, testDataStartrownum+rows, 0 ).equals("")){
			rows++;
		}
		System.out.println(testcaseName+ " rows are "+rows);
		
		int colStartRownum=testcaseStartrow+1;
		int cols=0;
		while(!xls.getCellData(sheetname,colStartRownum, cols).equals("")){
			cols++;
		}
		System.out.println(testcaseName+ " cols are "+cols);
		Hashtable [] data=new Hashtable[rows];
		Hashtable<String,String> table=null;
		int index=0;
		for(int rNum=testDataStartrownum;rNum<testDataStartrownum+rows;rNum++){
			table=new Hashtable<String,String>();
			for(int cNum=0;cNum<cols;cNum++){
				String key=xls.getCellData(sheetname, colStartRownum, cNum);
				String value=xls.getCellData(sheetname, rNum,  cNum);
				//System.out.print(xls.getCellData(sheetname, cNum, rNum)+"--");
				table.put(key, value);
			}
			data[index]=table;
			index++;
			System.out.println();
		}
		return data;
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
