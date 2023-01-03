package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationWithWebElement {
	
	public static WebDriver driver=null;
	

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();

	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			//by using navigate we can move forward,backward and toUrl
			driver.navigate().to("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			WebElement ele=driver.findElement(By.id("username"));
			ele.sendKeys("admin");
			Thread.sleep(1000);
			ele.clear();
			Thread.sleep(1000);
			ele.sendKeys("demo");
			Thread.sleep(1000);
			ele.clear();
			ele.sendKeys("admin");
			Thread.sleep(1000);
			ele.clear();
			Thread.sleep(1000);
			ele.sendKeys("demo");
			Thread.sleep(1000);
			ele.clear();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
