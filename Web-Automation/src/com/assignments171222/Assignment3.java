package com.assignments171222;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practice1.CreatingWebElementsofactiTimeDemo1;

public class Assignment3 {
	
	public static WebDriver driver=null;
	public static CreatingWebElementsofactiTimeDemo1 opage=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		createUser1();
		createUser2();
		createUser3();
		loginAsUser1();
		loginAsUser2();
		loginAsUser3();
     	loginAsUsersToModifyPassword();
//		loginAsUsersAfterModifyingPassword();
//		loginagain();
//		modifyPasswordofUsersAfterAdminLogin();
//		loginagain();
//		deleteUsers();

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
	
	private static void createUser1()
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
	
	private static void createUser2()
	{
		try
		{
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getfirstName().sendKeys("user2");
			opage.getlastName().sendKeys("demo2");
			opage.getemail().sendKeys("pcb@gmail.com");
			opage.getusernameField().sendKeys("demoUser2");
			opage.getpassword().sendKeys("welcome123");
			opage.getpasswordCopy().sendKeys("welcome123");
			opage.getCreateUser().click();
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
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getfirstName().sendKeys("user3");
			opage.getlastName().sendKeys("demo3");
			opage.getemail().sendKeys("pcb@gmail.com");
			opage.getusernameField().sendKeys("demoUser3");
			opage.getpassword().sendKeys("welcome123");
			opage.getpasswordCopy().sendKeys("welcome123");
			opage.getCreateUser().click();
			Thread.sleep(2000);
			opage.getlogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsUser1()
	{
		try
		{
			opage.getusername().sendKeys("demoUser1");
			opage.getpwd().sendKeys("welcome123");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getStartExploring().click();
			opage.getlogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsUser2()
	{
		try
		{
			opage.getusername().sendKeys("demoUser2");
			opage.getpwd().sendKeys("welcome123");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getStartExploring().click();
			opage.getlogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsUser3()
	{
		try
		{
			opage.getusername().sendKeys("demoUser3");
			opage.getpwd().sendKeys("welcome123");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getStartExploring().click();
			opage.getlogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsUsersToModifyPassword()
	{
		try
		{
			opage.getusername().sendKeys("demoUser1");
			opage.getpwd().sendKeys("welcome123");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getusers().click();
			Thread.sleep(2000);
			opage.getDemoUser1().click();
			Thread.sleep(2000);
			opage.getpassword().sendKeys("helloworld123");
			opage.getpasswordCopy().sendKeys("helloworld123");
			opage.getsaveChanges().click();
			Thread.sleep(2000);
			opage.getlogout().click();
			Thread.sleep(2000);
			opage.getusername().sendKeys("demoUser2");
			opage.getpwd().sendKeys("welcome123");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getusers().click();
			Thread.sleep(2000);
			opage.getDemoUser2().click();
			Thread.sleep(2000);
			opage.getpassword().sendKeys("helloworld123");
			opage.getpasswordCopy().sendKeys("helloworld123");
			opage.getsaveChanges().click();
			Thread.sleep(2000);
			opage.getlogout().click();
			Thread.sleep(2000);
			opage.getusername().sendKeys("demoUser3");
			opage.getpwd().sendKeys("welcome123");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getusers().click();
			Thread.sleep(2000);
			opage.getDemoUser3().click();
			Thread.sleep(2000);
			opage.getpassword().sendKeys("helloworld123");
			opage.getpasswordCopy().sendKeys("helloworld123");
			opage.getsaveChanges().click();
			Thread.sleep(2000);
//			opage.getlogout().click();
//			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsUsersAfterModifyingPassword()
	{
		try
		{
			opage.getusername().sendKeys("demoUser1");
			opage.getpwd().sendKeys("helloworld123");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getlogout().click();
			Thread.sleep(2000);
			opage.getusername().sendKeys("demoUser2");
			opage.getpwd().sendKeys("helloworld123");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getlogout().click();
			Thread.sleep(2000);
			opage.getusername().sendKeys("demoUser3");
			opage.getpwd().sendKeys("helloworld123");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getlogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginagain()
	{
		try
		{
			opage.getusername().sendKeys("admin");
			opage.getpwd().sendKeys("manager");
			opage.getloginButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyPasswordofUsersAfterAdminLogin()
	{
		try
		{
			opage.getusers().click();
			Thread.sleep(2000);
			opage.getDemoUser1().click();
			Thread.sleep(2000);
			opage.getpassword().sendKeys("helloworld12345");
			opage.getpasswordCopy().sendKeys("helloworld12345");
			opage.getsaveChanges().click();
			Thread.sleep(2000);
			opage.getusers().click();
			Thread.sleep(2000);
			opage.getDemoUser2().click();
			Thread.sleep(2000);
			opage.getpassword().sendKeys("helloworld12345");
			opage.getpasswordCopy().sendKeys("helloworld12345");
			opage.getsaveChanges().click();
			Thread.sleep(2000);
			opage.getusers().click();
			Thread.sleep(2000);
			opage.getDemoUser3().click();
			Thread.sleep(2000);
			opage.getpassword().sendKeys("helloworld12345");
			opage.getpasswordCopy().sendKeys("helloworld12345");
			opage.getsaveChanges().click();
			Thread.sleep(2000);
			opage.getlogout().click();
			Thread.sleep(2000);
			opage.getusername().sendKeys("demoUser1");
			opage.getpwd().sendKeys("helloworld12345");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getlogout().click();
			Thread.sleep(2000);
			opage.getusername().sendKeys("demoUser2");
			opage.getpwd().sendKeys("helloworld12345");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getlogout().click();
			Thread.sleep(2000);
			opage.getusername().sendKeys("demoUser3");
			opage.getpwd().sendKeys("helloworld12345");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getlogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUsers()
	{
		try
		{
			opage.getusers().click();
			Thread.sleep(2000);
			opage.getDemoUser1().click();
			Thread.sleep(2000);
			opage.getDelete().click();
			Thread.sleep(2000);
			Alert oalert=driver.switchTo().alert();
			System.out.println(oalert.getText());
			oalert.accept();
			Thread.sleep(2000);
			opage.getDemoUser2().click();
			Thread.sleep(2000);
			opage.getDelete().click();
			Thread.sleep(2000);
			Alert oalert1=driver.switchTo().alert();
			System.out.println(oalert1.getText());
			oalert1.accept();
			Thread.sleep(2000);
			opage.getDemoUser3().click();
			Thread.sleep(2000);
			opage.getDelete().click();
			Thread.sleep(2000);
			Alert oalert2=driver.switchTo().alert();
			System.out.println(oalert2.getText());
			oalert2.accept();
			Thread.sleep(2000);
			opage.getlogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
