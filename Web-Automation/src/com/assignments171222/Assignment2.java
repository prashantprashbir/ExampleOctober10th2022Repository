package com.assignments171222;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practice1.CreatingWebElementsofactiTimeDemo1;

public class Assignment2 {
	
	public static WebDriver driver=null;
	public static CreatingWebElementsofactiTimeDemo1 opage=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		createUser();
		modifyUser();
		deleteUser();
		logoutAndClose();

	}
	
	private static void  launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			opage= new CreatingWebElementsofactiTimeDemo1(driver);
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
			driver.navigate().to("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			opage.getusername().sendKeys("admin");
			opage.getpwd().sendKeys("manager");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getgettingStartedShortcutsPanelId().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser()
	{
		try
		{
			opage.getusers().click();
			Thread.sleep(2000);
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getfirstName().sendKeys("user1");
			opage.getlastName().sendKeys("demo1");
			opage.getemail().sendKeys("pcb@gmail.com");
			opage.getusernameField().sendKeys("demoUser1");
			opage.getpassword().sendKeys("welcome123");
			opage.getpasswordCopy().sendKeys("welcome123");
			opage.getCreateUser().click();
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
			opage.getDemoUser1().click();
			Thread.sleep(2000);
			opage.getfirstName().clear();
			opage.getfirstName().sendKeys("User111");
			opage.getlastName().clear();
			opage.getlastName().sendKeys("demo111");
			opage.getsaveChanges().click();
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
			opage.getUser111().click();
			Thread.sleep(2000);
			opage.getDelete().click();
			Thread.sleep(2000);
			Alert oalert=driver.switchTo().alert();
			System.out.println(oalert.getText());
			oalert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutAndClose()
	{
		try
		{
			opage.getlogout().click();
			Thread.sleep(2000);
			driver.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
