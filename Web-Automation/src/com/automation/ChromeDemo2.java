package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo2 {
	
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		
		chromebrowser();
		launchbrowser();
		close();

	}
	
	private static void chromebrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe" );
			oBrowser = new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void launchbrowser()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void close()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
