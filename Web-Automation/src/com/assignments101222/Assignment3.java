package com.assignments101222;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchbrowser();
		navigate();
		login();
		createUserone1();
		createUsertwo2();
		createUserthree3();
		logout();
		loginasUser1();
		logoutasuser1();
		loginasUser2();
		logoutasuser2();
		loginasUser3();
		logoutasuser3();
		loginasUser1tomodifypassword();
		logoutasUser1Aftermodifypassword();
		loginasUser2tomodifypassword();
		logoutasUser2Aftermodifypassword();
		loginasUser3tomodifypassword();
		logoutasUser3Aftermodifypassword();
		loginUser1withnewPassword();
		logoutasuser1withnewPassword();
		loginasUser2withnewPassword();
		logoutasuser2withnewPassword();
		loginasUser3withnewPassword();
		logoutasuser3withnewPassword();
		loginAsAdmin();
		modifyPasswordOfUser1User2User3();
		logoutAsAdmin();
		loginUser1withnewSecondPassword();
		logoutasuser1withsecondnewPassword();
		loginasUser2withSecondnewPassword();
		logoutasuser2withSecondnewPassword();
		loginasUser3withSecondnewPassword();
		logoutasuser3withSecondnewPassword();
		loginAsAdminAgain();
		deleteUser1();
		deleteUser2();
		deleteUser3();
		logoutAsAdminAgain();

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
	
	private static  void createUserone1()
	{
		try
		{
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Add User']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("useraccount1");
		driver.findElement(By.name("lastName")).sendKeys("account1");
		driver.findElement(By.name("email")).sendKeys("useraccount1236994@gmail.com");
		driver.findElement(By.name("username")).sendKeys("useraccountone1");
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
	
	private static  void createUsertwo2()
	{
		try
		{
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Add User']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("useraccount2");
		driver.findElement(By.name("lastName")).sendKeys("account2");
		driver.findElement(By.name("email")).sendKeys("useraccount2236994@gmail.com");
		driver.findElement(By.name("username")).sendKeys("useraccounttwo2");
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
	
	private static  void createUserthree3()
	{
		try
		{
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Add User']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("useraccount3");
		driver.findElement(By.name("lastName")).sendKeys("account3");
		driver.findElement(By.name("email")).sendKeys("useraccount3236994@gmail.com");
		driver.findElement(By.name("username")).sendKeys("useraccountthree3");
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
	
	private static void logout()
	{
		try
		{
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(4000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser1()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("useraccountone1");
			driver.findElement(By.name("pwd")).sendKeys("accounts987645");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutasuser1()
	{
		try
		{
		driver.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser2()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("useraccounttwo2");
			driver.findElement(By.name("pwd")).sendKeys("accounts987645");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutasuser2()
	{
		try
		{
		driver.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasUser3()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("useraccountthree3");
			driver.findElement(By.name("pwd")).sendKeys("accounts987645");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutasuser3()
	{
		try
		{
		driver.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser1tomodifypassword()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("useraccountone1");
			driver.findElement(By.name("pwd")).sendKeys("accounts987645");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='account1, useraccount1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("newpassword123");
			driver.findElement(By.name("passwordCopy")).sendKeys("newpassword123");
			driver.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutasUser1Aftermodifypassword()
	{
		try
		{
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser2tomodifypassword()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("useraccounttwo2");
			driver.findElement(By.name("pwd")).sendKeys("accounts987645");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='account2, useraccount2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("newpassword123");
			driver.findElement(By.name("passwordCopy")).sendKeys("newpassword123");
			driver.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutasUser2Aftermodifypassword()
	{
		try
		{
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser3tomodifypassword()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("useraccountthree3");
			driver.findElement(By.name("pwd")).sendKeys("accounts987645");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='account3, useraccount3']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("newpassword123");
			driver.findElement(By.name("passwordCopy")).sendKeys("newpassword123");
			driver.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutasUser3Aftermodifypassword()
	{
		try
		{
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginUser1withnewPassword()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("useraccountone1");
			driver.findElement(By.name("pwd")).sendKeys("newpassword123");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutasuser1withnewPassword()
	{
		try
		{
		//driver.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser2withnewPassword()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("useraccounttwo2");
			driver.findElement(By.name("pwd")).sendKeys("newpassword123");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutasuser2withnewPassword()
	{
		try
		{
		//driver.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser3withnewPassword()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("useraccountthree3");
			driver.findElement(By.name("pwd")).sendKeys("newpassword123");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutasuser3withnewPassword()
	{
		try
		{
		//driver.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsAdmin()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyPasswordOfUser1User2User3()
	{
		try
		{
	    
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='account1, useraccount1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secondnewpassword123");
		driver.findElement(By.name("passwordCopy")).sendKeys("secondnewpassword123");
		driver.findElement(By.xpath("//span[text()='Save Changes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='account2, useraccount2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secondnewpassword123");
		driver.findElement(By.name("passwordCopy")).sendKeys("secondnewpassword123");
		driver.findElement(By.xpath("//span[text()='Save Changes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='account3, useraccount3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secondnewpassword123");
		driver.findElement(By.name("passwordCopy")).sendKeys("secondnewpassword123");
		driver.findElement(By.xpath("//span[text()='Save Changes']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutAsAdmin()
	{
		try
		{
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginUser1withnewSecondPassword()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("useraccountone1");
			driver.findElement(By.name("pwd")).sendKeys("secondnewpassword123");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutasuser1withsecondnewPassword()
	{
		try
		{
		//driver.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser2withSecondnewPassword()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("useraccounttwo2");
			driver.findElement(By.name("pwd")).sendKeys("secondnewpassword123");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutasuser2withSecondnewPassword()
	{
		try
		{
		//driver.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser3withSecondnewPassword()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("useraccountthree3");
			driver.findElement(By.name("pwd")).sendKeys("secondnewpassword123");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutasuser3withSecondnewPassword()
	{
		try
		{
		//driver.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsAdminAgain()
	{
		try
		{
			
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\\\"gettingStartedShortcutsPanelId\\\"]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser1()
	{
		try
		{
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='account1, useraccount1']")).click();
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
	
	private static void deleteUser2()
	{
		try
		{
		//driver.findElement(By.xpath("//*[@id=\\\"topnav\\\"]/tbody/tr[1]/td[5]/a")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='account2, useraccount2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(1000);
		Alert oalert1=driver.switchTo().alert();
		oalert1.getText();
		oalert1.accept();
		Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser3()
	{
		try
		{
		//driver.findElement(By.xpath("//*[@id=\\\"topnav\\\"]/tbody/tr[1]/td[5]/a")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='account3, useraccount3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(1000);
		Alert oalert2=driver.switchTo().alert();
		oalert2.getText();
		oalert2.accept();
		Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutAsAdminAgain()
	{
		try
		{
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
