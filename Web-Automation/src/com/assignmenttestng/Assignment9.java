package com.assignmenttestng;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment9 {
	
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
	private static void importTasks()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[13]/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"dropzoneClickableArea\"]")).click();
			Thread.sleep(2000);
			String filepath="C:\\Users\\prash\\Downloads\\Sample.csv";
			copyFilePath(filepath);
			Robot robot1= new Robot();
			robot1.keyPress(KeyEvent.VK_CONTROL);
			robot1.keyPress(KeyEvent.VK_V);
			robot1.keyRelease(KeyEvent.VK_CONTROL);
			robot1.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot1.keyPress(KeyEvent.VK_ENTER);
			robot1.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"loadTasksFromCSVPopup_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"closeLoadTasksFromCSVPopupButton\"]")).click();
			Thread.sleep(4000);
			WebElement ele=driver.findElement(By.xpath("//div[text()='Customer A ']"));
			Assert.assertTrue(ele.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void copyFilePath(String path)
	{
		StringSelection strselection= new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
	}
	@Test(priority = 5)
	private static void deleteTask()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/table/tbody/tr/td[1]/div/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[3]/div/div/div[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"deleteTaskPopup_deleteConfirm_submitBtn\"]")).click();
			Thread.sleep(2000);
			WebElement ele=driver.findElement(By.xpath("//p[text()='There are no tasks']"));
			Assert.assertTrue(ele.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 6)
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
	@Test(priority = 7)
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
