package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	
	public static WebDriver obj= null;

	public static void main(String[] args) {
		
		method();
		

	}
	private static void method()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		obj= new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		obj.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8747912012");
		Thread.sleep(1000);
		obj.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("87479120122012");
		Thread.sleep(1000);
		obj.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		Thread.sleep(2000);
		obj.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
