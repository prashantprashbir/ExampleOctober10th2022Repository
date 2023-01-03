package com.assignmenttestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment6 {
	
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
	private static void createCustomer()
	{
		try
		{
			String expected,actual;
			expected="Tata ";
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("Tata");
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("it is a big company");
		driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//div[text()='Tata ']"));
		actual=ele.getText();
		Assert.assertTrue(expected.contains(actual));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 5)
	private static void createProject()
	{
		try
		{
			String expected,actual;
			expected="PowerControl ";
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='+ New Project']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("PowerControl");
		Thread.sleep(2000);
		driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("project time as per aggriment");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//div[text()='PowerControl ']"));
		actual=ele.getText();
		Assert.assertTrue(expected.contains(actual));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 6)
	private static void deleteProject()
	{
		try
		{   
			String expected,actual;
			expected="Tata ";
		driver.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//div[text()='Tata ']"));
		actual=ele.getText();
		Assert.assertTrue(expected.contains(actual));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 7)
	private static void deleteCustomer()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			WebElement ele=driver.findElement(By.xpath("//div[text()='There are no customers or projects']"));
			
			Assert.assertTrue(ele.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 8)
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
	@Test(priority = 9)
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
