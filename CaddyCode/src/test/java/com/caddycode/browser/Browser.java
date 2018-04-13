package com.caddycode.browser;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver driver;
	public static Properties prop;
	public static String strDriveval;
	
	public Browser()
	{
		if(!(driver==null)) 
		{
			if(!(driver.toString()==null))
			{
				strDriveval = driver.toString();
				
			}
			else
			{
				strDriveval = "";
			}
			
		}
		if(driver==null || strDriveval.contains("null")) {
			Browser.LoadConfigFile();
			Browser.launchApplication();
			try {
				driver.get(prop.getProperty("url"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}catch(Exception e)
			{
				System.out.println(e.getLocalizedMessage());
			}
		}
	}

	
	public static Properties LoadConfigFile()
	{
		try {
			File file = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\commonProperties.properties");
			FileInputStream fileinput = new FileInputStream(file);
			prop=new Properties();
			prop.load(fileinput);;
			
			return prop;
		}catch(Exception e)
		{
			throw new RuntimeException("Could not load properties file",e);
		}
	}
	
	public static void launchApplication()
	{
		String browserName = prop.getProperty("browserName");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	
}
