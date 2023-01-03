package com.assignments101222;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchbrowser();
		 navigate();
		 login();
		 createCustomer();
		// deleteCustomer();
		 //logoutandClose();
		

	}
	
	private static void launchbrowser()
	{
		try
		{
		System.setProperty("web.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
	
	private static void createCustomer()
	{
		try
		{
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("Relaiance");
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("it is a big company");
		driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
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
		driver.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='ACTIONS']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Delete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutandClose()
	{
		try
		{
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
