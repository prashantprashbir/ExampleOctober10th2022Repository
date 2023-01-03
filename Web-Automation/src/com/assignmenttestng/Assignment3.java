package com.assignmenttestng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import practice1.CreatingWebElementsofactiTimeDemo1;

public class Assignment3 {
	
	public static WebDriver driver=null;
	public static CreatingWebElementsofactiTimeDemo1 opage=null;

	
	@Test(priority = 1)
	private static void  launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			opage= new CreatingWebElementsofactiTimeDemo1(driver);
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
			driver.navigate().to("http://localhost/login.do");
			Thread.sleep(2000);
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
			opage.getusername().sendKeys("admin");
			opage.getpwd().sendKeys("manager");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getgettingStartedShortcutsPanelId().click();
			Thread.sleep(2000);
			WebElement oEle=driver.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 4)
	private static void createUser1()
	{
		try
		{
			String expected,actual;
			expected="demo1, user1";
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
			WebElement ele=driver.findElement(By.xpath("//span[text()='demo1, user1']"));
			actual=ele.getText();
			Assert.assertTrue(expected.contains(actual));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 5)
	private static void createUser2()
	{
		try
		{
			String expected,actual;
			expected="demo2, user2";
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
			WebElement ele=driver.findElement(By.xpath("//span[text()='demo2, user2']"));
			actual=ele.getText();
			Assert.assertTrue(expected.contains(actual));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 6)
	private static void createUser3()
	{
		try
		{
			String expected,actual;
			expected="demo3, user3";
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getfirstName().sendKeys("user3");
			opage.getlastName().sendKeys("demo3");
			opage.getemail().sendKeys("pcb@gmail.com");
			opage.getusernameField().sendKeys("demoUser3");
			opage.getpassword().sendKeys("welcome123");
			opage.getpasswordCopy().sendKeys("welcome123");
			opage.getCreateUser().click();
			Thread.sleep(4000);
			WebElement ele=driver.findElement(By.xpath("//span[text()='demo3, user3']"));
			actual=ele.getText();
			Assert.assertTrue(expected.contains(actual));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 7)
	private static void logout55()
	{
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
			driver.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
			actual=driver.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 8)
	private static void loginAsUser1()
	{
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
			opage.getusername().sendKeys("demoUser1");
			opage.getpwd().sendKeys("welcome123");
			opage.getloginButton().click();
			Thread.sleep(4000);
			
			opage.getStartExploring().click();
			opage.getlogout().click();
			Thread.sleep(2000);
			actual=driver.getTitle();
			Assert.assertEquals(expected, actual);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 9)
	private static void loginAsUser2()
	{
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
			opage.getusername().sendKeys("demoUser2");
			opage.getpwd().sendKeys("welcome123");
			opage.getloginButton().click();
			Thread.sleep(4000);
			
			opage.getStartExploring().click();
			opage.getlogout().click();
			Thread.sleep(2000);
			actual=driver.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 10)
	private static void loginAsUser3()
	{
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
			opage.getusername().sendKeys("demoUser3");
			opage.getpwd().sendKeys("welcome123");
			opage.getloginButton().click();
			Thread.sleep(4000);
			opage.getStartExploring().click();
			opage.getlogout().click();
			Thread.sleep(2000);
			actual=driver.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 11)
	private static void loginAsUsersToModifyPassword()
	{
		try
		{
			String expected,actual;
			expected="demo1, user1";
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
			Thread.sleep(4000);
			WebElement ele=driver.findElement(By.xpath("//span[text()='demo1, user1']"));
			actual=ele.getText();
			Assert.assertTrue(expected.contains(actual));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 12)
	private static void logout1()
	{
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
			opage.getlogout().click();
			Thread.sleep(2000);
			actual=driver.getTitle();
			Assert.assertEquals(expected, actual);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 13)
	private static void loginAsUsersAfterModifyingPassword()
	{
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
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
			actual=driver.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 14)
	private static void loginagain()
	{
		try
		{
			opage.getusername().sendKeys("admin");
			opage.getpwd().sendKeys("manager");
			opage.getloginButton().click();
			Thread.sleep(2000);
			WebElement oEle=driver.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 15)
	private static void modifyPasswordofUsersAfterAdminLogin()
	{
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
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
			Thread.sleep(4000);
			opage.getlogout().click();
			Thread.sleep(4000);
			
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
			Thread.sleep(4000);
			opage.getlogout().click();
			Thread.sleep(4000);
			actual=driver.getTitle();
			Assert.assertEquals(expected, actual);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 16)
	private static void login3()
	{
		try
		{
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		WebElement oEle=driver.findElement(By.xpath("//td[text()='Enter Time-Track']"));
		Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 17)
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
			Thread.sleep(4000);
			WebElement ele=driver.findElement(By.xpath("//span[text()='4 accounts left']"));
			Assert.assertTrue(ele.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 18)
	private static void logout()
	{
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(4000);
		actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}	
	@Test(priority = 19)
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
