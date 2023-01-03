package com.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Question5 {
	
	public static WebDriver driver=null;
	public static AmazonActions opage=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		amazonMiniTV();

	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			opage= new AmazonActions(driver);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			driver.navigate().to("https://www.amazon.in/");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void amazonMiniTV()
	{
		try
		{
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(opage.getClickMiniTV()));
			wait.until(ExpectedConditions.elementToBeClickable(opage.getClickMiniTV()));
			opage.getClickMiniTV().click();
			Thread.sleep(3000);
			opage.getMiniMovies().click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(opage.getWatchFree()));
			wait.until(ExpectedConditions.elementToBeClickable(opage.getWatchFree()));
			opage.getWatchFree().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
