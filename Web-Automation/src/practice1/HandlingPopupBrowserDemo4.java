package practice1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopupBrowserDemo4 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		handlingPopups();

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
			driver.navigate().to("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void handlingPopups()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id=\"copyRight\"]/nobr/a")).click();
			Thread.sleep(2000);
			Set<String> s=driver.getWindowHandles();
			Iterator<String> ite=s.iterator();
			String parent=ite.next();
			String child=ite.next();
			for(String i:s)
			{
				System.out.println(i);
				
			}
			
			for(String i:s)
			{
				Thread.sleep(2000);
				String s1=driver.switchTo().window(child).getTitle();
				Thread.sleep(2000);
				System.out.println(s1);
				break;
			}
			String s3=driver.findElement(By.xpath("//*[@id=\"home-page-banner\"]/div/div[2]")).getText();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"home-page-banner\"]/div/div[2]")).getText();
			Thread.sleep(2000);
			String texts=driver.findElement(By.xpath("//*[@id=\"home-page-banner\"]/div/div[2]")).getText().split(",")[1].trim().split("track")[1].split("and")[0];
			Thread.sleep(2000);
			System.out.println(texts);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
