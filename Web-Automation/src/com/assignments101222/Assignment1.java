package com.assignments101222;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		automation();
		navigate();
		login();
		minimize();
		createuser();
		delete();
		//logout();
		//close();

	}
	
	private static void automation()
	{
		try
		{
		driver= new FirefoxDriver();
		Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
		driver.get("http://localhost/login.do");
		Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimize()
	{
		try
		{
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	private static void createuser()
	{
		try
		{
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void delete()
	{
		try
		{
		driver.findElement(By.xpath("//span[text()='user, Demo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(2000);
		Alert oalert=driver.switchTo().alert();
		oalert.getText();
		oalert.accept();
		Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void logout()
	{
		try
		{
			driver.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close()
	{
		try
		{
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
		
	}

}
