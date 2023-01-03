package com.assignments171222;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import practice1.CreatingWebElementsofactiTimeDemo1;

public class Assignment5 {
	
	public static WebDriver driver=null;
	public static CreatingWebElementsofactiTimeDemo1 opage=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		createCustomer();
		modifyCustomer();
		deleteCustomer();
		logoutAndClose();

	}
	
	private static void  launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			opage= new CreatingWebElementsofactiTimeDemo1(driver);
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
			opage.getusername().sendKeys("admin");
			opage.getpwd().sendKeys("manager");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getgettingStartedShortcutsPanelId().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createCustomer()
	{
		try
		{
			opage.getTasks().click();
			Thread.sleep(2000);
			opage.getAddnewTask().click();
			Thread.sleep(2000);
			opage.getNewCustomer().click();
			Thread.sleep(2000);
			opage.getEnterCustomerName().sendKeys("Reliance");
			opage.getCustomerDiscription().sendKeys("it is a power supplying company");
			opage.getClickCreateCustomer().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyCustomer()
	{
		try
		{
			opage.getEditButtonOfCustomer().click();
			Thread.sleep(2000);
			opage.getReliance().click();
			Thread.sleep(2000);
			opage.getBlankReliance().clear();
			Thread.sleep(2000);
			opage.getBlankReliance().sendKeys("reliance pvt ltd");
			Thread.sleep(2000);
			opage.getCrossButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteCustomer()
	{
		try
		{
			opage.getEditButtonOfCustomer().click();
			Thread.sleep(2000);
			opage.getActions().click();
			opage.getDeletePopUp().click();
			Thread.sleep(2000);
			opage.getDeletePermanently().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutAndClose()
	{
		try
		{
			opage.getlogout().click();
			Thread.sleep(2000);
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
