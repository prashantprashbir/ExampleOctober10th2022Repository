package com.javatpoint;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Question2 {
	
	public static WebDriver driver=null;
	public static JavaTpointActions opage=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		seleniumTutorialLink();
		
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
//			ChromeOptions option= new ChromeOptions();
//			option.setPageLoadStrategy(PageLoadStrategy.NONE);
//			Thread.sleep(2000);
			driver= new ChromeDriver();
			opage= new JavaTpointActions(driver);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			driver.navigate().to("https://www.javatpoint.com/selenium-tutorial");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void seleniumTutorialLink()
	{
		try
		{
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(opage.getClickSeleniumTutorialLink()));
			wait.until(ExpectedConditions.elementToBeClickable(opage.getClickSeleniumTutorialLink()));
			opage.getClickSeleniumTutorialLink().click();
			Thread.sleep(2000);
			opage.getNextButton().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
