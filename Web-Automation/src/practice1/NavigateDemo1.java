package practice1;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateDemo1 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();

	}

private static void launchBrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
		driver.navigate().to("http://localhost/login.do");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

}
