package practice1;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import javax.print.attribute.standard.MediaSize.JIS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyAppAutomation1 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		dummyModel();

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
			driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void dummyModel()
	{
		try
		{
			driver.findElement(By.name("firstname")).sendKeys("parsu");
			driver.findElement(By.name("lastname")).sendKeys("biru");
			driver.findElement(By.xpath("//input[@value='Male']")).click();
			driver.findElement(By.xpath("//input[@value='3']")).click();
			driver.findElement(By.id("datepicker")).sendKeys("22-10-20");
			driver.findElement(By.id("profession-1")).click();
			driver.findElement(By.id("continents")).click();
			Thread.sleep(2000);
			Robot robot= new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
			Robot robot2= new Robot();
			robot2.keyPress(KeyEvent.VK_DOWN);
			robot2.keyRelease(KeyEvent.VK_DOWN);
			robot2.keyPress(KeyEvent.VK_DOWN);
			robot2.keyRelease(KeyEvent.VK_DOWN);
			robot2.keyPress(KeyEvent.VK_DOWN);
			robot2.keyRelease(KeyEvent.VK_DOWN);
			robot2.keyPress(KeyEvent.VK_DOWN);
			robot2.keyRelease(KeyEvent.VK_DOWN);
			robot2.keyPress(KeyEvent.VK_CONTROL);
			robot2.keyPress(KeyEvent.VK_E);
			robot2.keyRelease(KeyEvent.VK_E);
			robot2.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			robot2.keyPress(KeyEvent.VK_ESCAPE);
			robot2.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(2000);
			robot2.keyPress(KeyEvent.VK_ESCAPE);
			robot2.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(2000);
			Robot robot4= new Robot();
			robot4.keyPress(KeyEvent.VK_DOWN);
			robot4.keyRelease(KeyEvent.VK_DOWN);
			robot4.keyPress(KeyEvent.VK_DOWN);
			robot4.keyRelease(KeyEvent.VK_DOWN);
			driver.findElement(By.xpath("//*[@id=\"photo\"]")).click();
			Thread.sleep(2000);
			String filepath="\"C:\\Users\\prash\\OneDrive\\Pictures\\Screenshots\\Screenshot_20221209_121533.jpg\"";
			copyFile(filepath);
			Robot robot3= new Robot();
			robot3.keyPress(KeyEvent.VK_CONTROL);
			robot3.keyPress(KeyEvent.VK_V);
			robot3.keyRelease(KeyEvent.VK_CONTROL);
			robot3.keyRelease(KeyEvent.VK_V);
			robot3.keyPress(KeyEvent.VK_ENTER);
			robot3.keyRelease(KeyEvent.VK_ENTER);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void copyFile(String path)
	{
		StringSelection select=new 	StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
	}

}
