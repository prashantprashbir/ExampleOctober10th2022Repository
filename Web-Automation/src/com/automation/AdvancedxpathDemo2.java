package com.automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedxpathDemo2 {
	
	public static WebDriver driver= null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		//linksCount();
		//dropDownCount();
		//dislpayLinkNames();
		clickonLinkBasedOnEndsWith();

	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			Thread.sleep(1000);
			driver.manage().window().maximize();
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
	
	private static void linksCount()
	{
		List<WebElement> olinks=driver.findElements(By.xpath("//a[@href]"));
		int count=olinks.size();
		System.out.println("no. of links are :"+count);
	}
	
	private static void dropDownCount()
	{
		List<WebElement> odrop=driver.findElements(By.xpath("//select"));
		int count=odrop.size();
		System.out.println("no. of dropdowns are :"+count);
	}
	
	private static void dislpayLinkNames()
	{
		List<WebElement> olink=driver.findElements(By.xpath("//a[@href]"));
		Iterator<WebElement> ite=olink.iterator();
		while(ite.hasNext())
		{
			WebElement we=ite.next();
			String str=we.getText();
			System.out.println(str);
		}
	}
	
	private static void clickonLinkBasedOnEndsWith()
	{
		List<WebElement> olinks=driver.findElements(By.xpath("//a[@href]"));
		Iterator<WebElement> link=olinks.iterator();
		while(link.hasNext())
		{
			WebElement ele=link.next();
			String str=ele.getText();
			System.out.println(str);
			if(str.endsWith("Institute"))
			{
				ele.click();
				break;
			}
		}
	}

}
