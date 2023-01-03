package practice1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeautomationUsingWebElements {
	
	public static WebDriver driver=null;
	public static CreatingWebElementsofactiTimeDemo1 opage=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		createUsers();
		loginAsUser1();
		loginAsUser2();
		loginAsUser3();
		loginAsUser1ToModifyPassword();
		loginAsUser2ToModifyPassword();
		loginAsUser3ToModifyPassword();
		login();
		deleteUsers();

	}
	
	private static void launchBrowser()
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
			Thread.sleep(1000);
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
		} catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	private static void minimizeflyoutwindow()
	{
		try 
		{
			opage.getgettingStartedShortcutsPanelId().click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void createUsers()
	{
		try 
		{
			opage.getusers().click();
			Thread.sleep(2000);
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getfirstName().sendKeys("user1");
			opage.getlastName().sendKeys("demo1");
			opage.getemail().sendKeys("pcg@gmail.com");
			opage.getusernameField().sendKeys("demoUser1");
			opage.getpassword().sendKeys("hello123");
			opage.getpasswordCopy().sendKeys("hello123");
			opage.getCreateUser().click();
			Thread.sleep(2000);
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getfirstName().sendKeys("user2");
			opage.getlastName().sendKeys("demo2");
			opage.getemail().sendKeys("pcg@gmail.com");
			opage.getusernameField().sendKeys("demoUser2");
			opage.getpassword().sendKeys("hello123");
			opage.getpasswordCopy().sendKeys("hello123");
			opage.getCreateUser().click();
			Thread.sleep(2000);
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getfirstName().sendKeys("user3");
			opage.getlastName().sendKeys("demo3");
			opage.getemail().sendKeys("pcg@gmail.com");
			opage.getusernameField().sendKeys("demoUser3");
			opage.getpassword().sendKeys("hello123");
			opage.getpasswordCopy().sendKeys("hello123");
			opage.getCreateUser().click();
			Thread.sleep(2000);
			opage.getlogout().click();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsUser1()
	{
		try
		{
			opage.getusername().sendKeys("demoUser1");
			opage.getpwd().sendKeys("hello123");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getStartExploring().click();
			Thread.sleep(2000);
			opage.getlogout().click();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsUser2()
	{
		try
		{
			opage.getusername().sendKeys("demoUser2");
			opage.getpwd().sendKeys("hello123");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getStartExploring().click();
			Thread.sleep(2000);
			opage.getlogout().click();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsUser3()
	{
		try
		{
			opage.getusername().sendKeys("demoUser3");
			opage.getpwd().sendKeys("hello123");
			opage.getloginButton().click();
			Thread.sleep(2000);
			opage.getStartExploring().click();
			Thread.sleep(2000);
			opage.getlogout().click();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsUser1ToModifyPassword()
	{
		try
		{
			opage.getusername().sendKeys("demoUser1");
			opage.getpwd().sendKeys("hello123");
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
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsUser2ToModifyPassword()
	{
		try
		{
			opage.getusername().sendKeys("demoUser2");
			opage.getpwd().sendKeys("hello123");
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsUser3ToModifyPassword()
	{
		try
		{
			opage.getusername().sendKeys("demoUser3");
			opage.getpwd().sendKeys("hello123");
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
			Alert oalert= driver.switchTo().alert();
			System.out.println(oalert.getText());
			oalert.accept();
			Thread.sleep(2000);
			opage.getDemoUser2().click();
			Thread.sleep(2000);
			opage.getDelete().click();
			Thread.sleep(2000);
			Alert oalert1= driver.switchTo().alert();
			System.out.println(oalert1.getText());
			oalert1.accept();
			Thread.sleep(2000);
			opage.getDemoUser3().click();
			Thread.sleep(2000);
			opage.getDelete().click();
			Thread.sleep(2000);
			Alert oalert2= driver.switchTo().alert();
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
