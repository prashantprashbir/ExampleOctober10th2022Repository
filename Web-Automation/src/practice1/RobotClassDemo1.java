package practice1;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassDemo1 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		robotclass();

	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
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
	
	private static void robotclass()
	{
		try
		{
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
			driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[13]/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"dropzoneClickableArea\"]")).click();
			Thread.sleep(2000);
			String filepath="C:\\Users\\prash\\Downloads\\Sample.csv";
			copyFilepath(filepath);
			Robot robot1=new Robot();
			robot1.keyPress(KeyEvent.VK_CONTROL);
			robot1.keyPress(KeyEvent.VK_V);
			robot1.keyRelease(KeyEvent.VK_CONTROL);
			robot1.keyRelease(KeyEvent.VK_V);
			Thread.sleep(2000);
			robot1.keyPress(KeyEvent.VK_ENTER);
			robot1.keyRelease(KeyEvent.VK_ENTER);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void copyFilepath(String filepath)
	{
		StringSelection selectfile= new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectfile, null);
	}

}
