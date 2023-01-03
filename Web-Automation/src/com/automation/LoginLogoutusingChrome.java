package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutusingChrome {
	
	public static WebDriver obj=null;

	public static void main(String[] args) {
		
		log();
		navi();
		username();
		password();
		loginbtn();
		logoutbtn();
		minimize();
		close();
	}
	
	private static void log()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver","D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		obj= new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navi()
	{
		try
		{
		
		obj.get("http://localhost/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void username()
	{
		try
		{
		
		obj.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void password()
	{
		try
		{
		
		obj.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginbtn()
	{
		try
		{
		
		obj.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try  
		{
		
		obj.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutbtn()
	{
		try
		{
		
		obj.findElement(By.id("logoutLink")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close()
	{
		try
		{
		
		obj.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
