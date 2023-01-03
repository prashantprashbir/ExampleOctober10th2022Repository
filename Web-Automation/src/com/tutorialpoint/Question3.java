package com.tutorialpoint;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Question3 {
	
	public static WebDriver driver=null;
	public static TutorialPointActions opage=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		tutorialspoint();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			ChromeOptions options= new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			driver= new ChromeDriver(options);
			opage= new TutorialPointActions(driver);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			driver.navigate().to("https://www.tutorialspoint.com/selenium/index.htm");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void tutorialspoint()
	{
		try
		{
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(opage.getLoginButton()));
			wait.until(ExpectedConditions.elementToBeClickable(opage.getLoginButton()));
			opage.getLoginButton().click();
			Thread.sleep(3000);
			opage.getUserEmail().sendKeys("prashant");
			opage.getUserPassword().sendKeys("welcome");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
