package com.assignmenttestng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment1 {
	
	public static WebDriver driver=null;

	
	@Test(priority = 1)
	private static void automation()
	{
		try
		{
		driver= new FirefoxDriver();
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		WebElement oEle=driver.findElement(By.xpath("//td[text()='Enter Time-Track']"));
		Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 4)
	private static void minimize()
	{
		try
		{
			String expected,actual;
			expected="Getting Started Shortcuts";
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			WebElement oEle=driver.findElement(By.xpath("//div[text()='Getting Started Shortcuts']"));
			actual=oEle.getText();
			Assert.assertTrue(expected.contains(actual));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 5)
	private static void createuser()
	{
		try
		{
			String expected,actual;
			expected="user, Demo";
			driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[5]/a/div[1]")).click();
			driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[2]/div/div/div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("Demo");
			driver.findElement(By.name("lastName")).sendKeys("user");
			driver.findElement(By.name("email")).sendKeys("prashantcb@gmail.com");
			driver.findElement(By.name("username")).sendKeys("demouser699196312455");
			driver.findElement(By.name("password")).sendKeys("12345well");
			driver.findElement(By.name("passwordCopy")).sendKeys("12345well");
			driver.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			WebElement ele=driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"));
			actual=ele.getText();
			Assert.assertTrue(expected.contains(actual));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 6)
	private static void delete()
	{
		try
		{
			String expected,actual;
			expected="user, Demo";
		driver.findElement(By.xpath("//span[text()='user, Demo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(2000);
		Alert oalert=driver.switchTo().alert();
		oalert.getText();
		oalert.accept();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//span[text()='user, Demo']"));
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
			driver.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
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
