package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3WithAttributeNameAndValue {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		createUser1();
		createUser2();
		createUser3();
		logout();
		loginasUser1();
		logoutasUser1();
		loginasUser2();
		logoutasUser2();
		loginasUser3();
		logoutasUser3();
		loginasUser1toModifyPassword();
		loginasUser2toModifyPassword();
		loginasUser3toModifyPassword();
		loginasUser1withsecondPassword();
		loginasUser2withsecondPassword();
		loginasUser3withsecondPassword();
		loginAsAdminToModifyPassword();
		loginasUser1withsecondnewPassword();
		loginasUser2withsecondnewPassword();
		loginasUser3withsecondnewPassword();
		loginAsAdminToDeleteUsers();

	}
	private static void launchBrowser()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
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
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='gettingStartedShortcutsPanelId']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser1()
	{
		try
		{
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='buttonText']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("user1");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("demo1");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pcb@gmail.com");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser1");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hello123");
			driver.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("hello123");
			driver.findElement(By.xpath("//span[@class='buttonTitle']")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser2()
	{
		try
		{
		driver.findElement(By.xpath("//div[@class='buttonText']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("user2");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("demo2");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pcb@gmail.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser2");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hello123");
		driver.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("hello123");
		driver.findElement(By.xpath("//span[@class='buttonTitle']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser3()
	{
		try
		{
		driver.findElement(By.xpath("//div[@class='buttonText']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("user3");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("demo3");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pcb@gmail.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser3");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hello123");
		driver.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("hello123");
		driver.findElement(By.xpath("//span[@class='buttonTitle']")).click();
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
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser1()
	{
		try
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser1");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("hello123");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutasUser1()
	{
		try
		{
			driver.findElement(By.xpath("//span[@class='startExploringText']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
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
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser2");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("hello123");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutasUser2()
	{
		try
		{
			driver.findElement(By.xpath("//span[@class='startExploringText']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
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
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser3");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("hello123");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutasUser3()
	{
		try
		{
			driver.findElement(By.xpath("//span[@class='startExploringText']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser1toModifyPassword()
	{
		try
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser1");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("hello123");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='demo1, user1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("helloworld123");
			driver.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("helloworld123");
			driver.findElement(By.xpath("//span[@class='buttonTitle']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser2toModifyPassword()
	{
		try
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser2");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("hello123");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='demo2, user2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("helloworld123");
			driver.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("helloworld123");
			driver.findElement(By.xpath("//span[@class='buttonTitle']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser3toModifyPassword()
	{
		try
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser3");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("hello123");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='demo3, user3']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("helloworld123");
			driver.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("helloworld123");
			driver.findElement(By.xpath("//span[@class='buttonTitle']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser1withsecondPassword()
	{
		try
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser1");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("helloworld123");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser2withsecondPassword()
	{
		try
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser2");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("helloworld123");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser3withsecondPassword()
	{
		try
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser3");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("helloworld123");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsAdminToModifyPassword()
	{
		try
		{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='demo1, user1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("helloworldnew123");
		driver.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("helloworldnew123");
		driver.findElement(By.xpath("//span[@class='buttonTitle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='demo2, user2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("helloworldnew123");
		driver.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("helloworldnew123");
		driver.findElement(By.xpath("//span[@class='buttonTitle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='demo3, user3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("helloworldnew123");
		driver.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("helloworldnew123");
		driver.findElement(By.xpath("//span[@class='buttonTitle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser1withsecondnewPassword()
	{
		try
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser1");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("helloworldnew123");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser2withsecondnewPassword()
	{
		try
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser2");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("helloworldnew123");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginasUser3withsecondnewPassword()
	{
		try
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demoUser3");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("helloworldnew123");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsAdminToDeleteUsers()
	{
		try
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='demo1, user1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='deleteContainer']")).click();
			Thread.sleep(2000);
			Alert oalert=driver.switchTo().alert();
			oalert.getText();
			System.out.println(oalert.getText());
			oalert.accept();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='demo2, user2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='deleteContainer']")).click();
			Thread.sleep(2000);
			Alert oalert1=driver.switchTo().alert();
			oalert1.getText();
			System.out.println(oalert1.getText());
			oalert1.accept();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='demo3, user3']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='deleteContainer']")).click();
			Thread.sleep(2000);
			Alert oalert2=driver.switchTo().alert();
			oalert2.getText();
			System.out.println(oalert2.getText());
			oalert2.accept();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
