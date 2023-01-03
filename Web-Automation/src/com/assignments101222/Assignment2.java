package com.assignments101222;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchbrowser();
		navigate();
		login();
		createUser();
		modifyUser();
		deleteUser();
		logout();

	}
	
	private static void launchbrowser()
	{
		try
		{
		System.setProperty("web.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
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
		driver.get("http://localhost/login.do");
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
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static  void createUser()
	{
		try
		{
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	private static void modifyUser()
	{
		try
		{
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try
		{
		driver.findElement(By.xpath("//span[text()='accounts, useraccounts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(1000);
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
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		driver.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}
