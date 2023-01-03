package com.automation;

import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAdvancedTagNameAttributeName {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		//IdentifyElementByTagnameAttributenamecountLinks();
		//IdentifyNoOfDropDowns();
		//displayLinkNames();
		clickLinkWithEndsWith();

	}
	
	private static void launchBrowser()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
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
			driver.get("file:///D:/HTML/Sample.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void IdentifyElementByTagnameAttributenamecountLinks()
	{
		
			List<WebElement> olinks=driver.findElements(By.xpath("//a[@href]"));
			int count=olinks.size();
			System.out.println("no. of links are :"+count);
		
	}
	
	private static void IdentifyNoOfDropDowns()
	{
		List<WebElement> odropdown=driver.findElements(By.xpath("//select"));
		int count=odropdown.size();
		System.out.println("no. of dropdowns are :"+count);
	}
	
	private static void displayLinkNames()
	{
		List<WebElement> olinks=driver.findElements(By.xpath("//a[@href]"));
		Iterator<WebElement> ite=olinks.iterator();
		while(ite.hasNext())
		{
			WebElement link=ite.next();
			String str=link.getText();
			System.out.println("link names are :"+str);
		}
	}
	
	private static void clickLinkWithEndsWith()
	{
		try
		{
		List<WebElement> olink=driver.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olink.size();i++)
		{
			WebElement link=olink.get(i);
			String str=link.getText();
			System.out.println(str);
			if(str.endsWith("Institute"))
			{
				link.click();
				break;
			}
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
