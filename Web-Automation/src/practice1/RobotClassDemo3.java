package practice1;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassDemo3 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		gmail();

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
			driver.navigate().to("https://accounts.google.com/v3/signin/identifier?dsh=S370086322%3A1671684539456862&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh6PMNlT-5zdOreKXMeRtXelup0GlXeoaIM3FVIcMQ20LLJbaLhMRRJ7gUE72gZMGrbfDpjTQg");
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void gmail()
	{
		try
		{
			
			driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("prashantbiradarb@gmail.com");
			Robot robot1= new Robot();
			robot1.keyPress(KeyEvent.VK_ENTER);
			robot1.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("");
			Thread.sleep(2000);
			Robot robot2= new Robot();
			robot2.keyPress(KeyEvent.VK_ENTER);
			robot2.keyRelease(KeyEvent.VK_ENTER);
		}catch(Exception e)
		{
		e.printStackTrace();	
		}
	}
	

}
