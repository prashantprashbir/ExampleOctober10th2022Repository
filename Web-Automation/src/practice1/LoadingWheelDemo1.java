package practice1;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadingWheelDemo1 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		explore();

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
			driver.navigate().to("https://www.irctc.co.in/nget/booking/train-list");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"disha-banner-close\"]")).click();
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//*[@id=\"login_header_disable\"]/div/div/div[2]/a")).click();
			//Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void explore()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).click();
			driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("beng");
			Thread.sleep(4000);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		//	driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).click();
			driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("kalabura");
			Thread.sleep(4000);
			Robot robot1= new Robot();
			robot1.keyPress(KeyEvent.VK_ENTER);
			robot1.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div")).click();
//			driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[2]/app-modify-search/div/form/div[3]/button[1]")).click();
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[3]/span[2]/button[2]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
