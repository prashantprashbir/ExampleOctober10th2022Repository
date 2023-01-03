package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		 automation();
		

	}
	private static void automation()
	{
		try
		{
		System.setProperty("web.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
