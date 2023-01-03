package com.youtube;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Question1 {
	
	public static WebDriver driver=null;
	public static YoutubeActions opage=null;
	
	
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		clearHistory();

	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			opage= new YoutubeActions(driver);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			driver.navigate().to("https://www.youtube.com/");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void clearHistory()
	{
		try
		{
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(opage.getHistory()));
			wait.until(ExpectedConditions.elementToBeClickable(opage.getHistory()));
			opage.getHistory().click();
			Thread.sleep(2000);
			opage.getClearWatchHistory().click();
			Thread.sleep(2000);
			opage.getConfirmClear().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
