package com.automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo2 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		//absoluteXpath();
		//usingonlyTagName();
		//usingTagnameWithIndex();
		//usingTagnameAttributeNameAttributeValue();
		//usingAttributeNameAndValueIrrespectiveofTagname();
		//usingAttributevalualoneIrrespectiveofTagnameandAttributeName();
	//	usingmultipleAttributeNameAndValue();
		//usingmultipleAttributenameAndValueWithOrOperator();
		//partialMatching();
		//partialMatchingusingTextContent();
		//findLinksCount();
		//findDropDownCount();
		//displayLinkNames();
		//linkNames();
		//linkBasedonEndsWith();
		endsWith();

	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
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
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void absoluteXpath()
	{
		try
		{
			driver.findElement(By.xpath("html/body/div/form/input")).sendKeys("demouser1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void usingonlyTagName()
	{
		try
		{
			driver.findElement(By.xpath("//a")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void usingTagnameWithIndex()
	{
		try
		{
			driver.findElement(By.xpath("//a[3]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void usingTagnameAttributeNameAttributeValue()
	{
		try
		{
			driver.findElement(By.xpath("//input[@id='btn1submit1button1']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void usingAttributeNameAndValueIrrespectiveofTagname()
	{
		try
		{
			driver.findElement(By.xpath("//*[@value='Submit']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void usingAttributevalualoneIrrespectiveofTagnameandAttributeName()
	{
		try
		{
			driver.findElement(By.xpath("//*[@*='Submit']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void usingmultipleAttributeNameAndValue()
	{
		try
		{
			driver.findElement(By.xpath("//input[@type='button' and @class='submit1btn1']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void usingmultipleAttributenameAndValueWithOrOperator()
	{
		try
		{
			driver.findElement(By.xpath("//input[@type='button' or @name='submit1btn1']")).click();
		}catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}
	
	private static void partialMatching() 
	{
		try
		{
			driver.findElement(By.xpath("//input[starts-with(@name,'sub')]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void partialMatchingusingTextContent()
	{
		try
		{
			driver.findElement(By.xpath("//a[contains(text(),'nium')]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void findLinksCount()
	{
		List<WebElement> olinks=driver.findElements(By.xpath("//a[@href]"));
		int count=olinks.size();
		System.out.println("no. of links are :"+count);
	}
	
	private static void findDropDownCount()
	{
		List<WebElement> odrop=driver.findElements(By.xpath("//select"));
		int count=odrop.size();
		System.out.println("no. of dropdowns are :"+count);
	}
	
	private static void displayLinkNames()
	{
		List<WebElement> olink=driver.findElements(By.xpath("//a[@href]"));
		Iterator<WebElement> ite=olink.iterator();
		while(ite.hasNext())
		{
			WebElement ele=ite.next();
			String str=ele.getText();
			System.out.println(str);
		}
	}
	
	private static void linkNames()
	{
		List<WebElement> olink=driver.findElements(By.xpath("//a[@href]"));
		Iterator<WebElement> ite=olink.iterator();
		while(ite.hasNext())
		{
			WebElement ele=ite.next();
			String str=ele.getText();
			System.out.println(str);
		}
	}
	
	private static void linkBasedonEndsWith()
	{
		List<WebElement> olink=driver.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olink.size();i++)
		{
			WebElement ele=olink.get(i);
			String str=ele.getText();
			System.out.println(str);
			if(str.endsWith("HQ"))
			{
				ele.click();
				break;
			}
		}
	}
	
	private static void endsWith()
	{
		List<WebElement> olink=driver.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olink.size();i++)
		{
			WebElement ele=olink.get(i);
			String str=ele.getText();
			System.out.println(str);
			if(str.endsWith("Tool"))
			{
				ele.click();
				break;
			}
		}
	}

}
