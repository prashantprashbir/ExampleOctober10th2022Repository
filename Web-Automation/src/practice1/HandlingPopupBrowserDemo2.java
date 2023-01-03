package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopupBrowserDemo2 {
	
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
			WebElement oLink=driver.findElement(By.linkText("actiTIME Inc."));
			System.out.println("Before click on link,Numbers of popups :"+getPopupCount());
			oLink.click();
			Thread.sleep(3000);
			System.out.println("After click on link,Numbers of popups :"+getPopupCount());
			if(getPopupCount()>0)
			{
				popupsTesting();
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static int getPopupCount()
	{
		int count=0;
		count=driver.getWindowHandles().size()-1;
		return count;
	}

	private static void popupsTesting()
	{
		try
		{
			String parentBrowser=driver.getWindowHandle();
			System.out.println("Parent Borwser :"+parentBrowser);
			Object popups[]=driver.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String childBrowser=popups[i].toString();
				System.out.println("Child Browser :"+childBrowser);
				Thread.sleep(2000);
				driver.switchTo().window(childBrowser);
				Thread.sleep(4000);
				String childBrowserTitle=driver.getTitle();
				System.out.println("childBrowserTitle :"+childBrowserTitle);
				driver.findElement(By.linkText("Try Free")).click();
				Thread.sleep(2000);
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
