package com.assignmenttestng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment2 {
	
	public static WebDriver driver=null;

	@Test(priority = 1)
	private static void launchbrowser()
	{
		try
		{
		System.setProperty("web.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		Assert.assertNotNull(driver);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 2)
	private static void navigate()
	{
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
		driver.get("http://localhost/login.do");
		actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 3)
	private static void login()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
			WebElement oEle=driver.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 4)
	private static  void createUser()
	{
		try
		{
			String expected,actual;
			expected="account12, useraccount123";
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Add User']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("useraccount123");
		driver.findElement(By.name("lastName")).sendKeys("account12");
		driver.findElement(By.name("email")).sendKeys("useraccount1236994@gmail.com");
		driver.findElement(By.name("username")).sendKeys("demoaccountsuser456");
		driver.findElement(By.name("password")).sendKeys("accounts987645");
		driver.findElement(By.name("passwordCopy")).sendKeys("accounts987645");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create User']")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"));
		actual=ele.getText();
		Assert.assertTrue(expected.contains(actual));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	@Test(priority = 5)
	private static void modifyUser()
	{
		try
		{
			String expected,actual;
			expected="accounts, useraccounts";
			driver.findElement(By.xpath("//span[text()='account12, useraccount123']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).clear();
			driver.findElement(By.name("firstName")).sendKeys("useraccounts");
			driver.findElement(By.name("lastName")).clear();
			driver.findElement(By.name("lastName")).sendKeys("accounts");
			driver.findElement(By.name("password")).sendKeys("accounts987623");
			driver.findElement(By.name("passwordCopy")).sendKeys("accounts987623");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			WebElement ele=driver.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"));
			actual=ele.getText();
			Assert.assertTrue(expected.contains(actual));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 6)
	private static void deleteUser()
	{
		try
		{
			String expected,actual;
			expected="user, Demo";
		driver.findElement(By.xpath("//span[text()='accounts, useraccounts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(1000);
		Alert oalert=driver.switchTo().alert();
		oalert.getText();
		oalert.accept();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//span[text()='accounts, useraccounts']"));
		actual=ele.getText();
		Assert.assertNotEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 7)
	private static void logout()
	{
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}	
	@Test(priority = 8)
	private static void close()
	{
		try
		{
			driver.quit();
			Thread.sleep(3000);
			driver=null;
			Assert.assertNull(driver);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}	
	
	

}
