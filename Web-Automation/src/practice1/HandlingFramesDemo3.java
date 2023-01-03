package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesDemo3 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		frames();

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
			driver.navigate().to("http://www.selenium.dev/");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void frames()
	{
		try
		{
			driver.findElement(By.xpath("//span[text()='Downloads']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/main/div[5]/div[3]/div/div[2]/p[4]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Frames']")).click();
			Thread.sleep(2000);
			driver.switchTo().frame("packageListFrame");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.switchTo().frame("packageFrame");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.switchTo().frame("classFrame");
			Thread.sleep(2000);
			WebElement ele=driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li/div"));
			String str=ele.getText();
			System.out.println(str);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
