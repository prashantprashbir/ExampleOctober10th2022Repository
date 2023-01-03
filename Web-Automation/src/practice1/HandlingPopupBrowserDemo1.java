package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopupBrowserDemo1 {
	
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
			//driver.manage().window().maximize();
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
			WebElement olink=driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
			System.out.println("before clicking on link,no. of popups :"+getPopupcount());
			olink.click();
			Thread.sleep(4000);
			System.out.println("after clicking link,no. of popups :"+getPopupcount());
			if(getPopupcount()>0)
			{
				popupTesting();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static int getPopupcount()
	{
		int count=0;
		count=driver.getWindowHandles().size()-1;
		return count;
	}
	
	private static void popupTesting()
	{
		try
		{
			String parentbrowser=driver.getWindowHandle();
			System.out.println("parent browser :"+parentbrowser);
			Object popups[]=driver.getWindowHandles().toArray();
			for(int i=0;i<popups.length;i++)
			{
				String childbrowser=popups[i].toString();
				System.out.println("child browser :"+childbrowser);
				Thread.sleep(2000);
				driver.switchTo().window(childbrowser);
				Thread.sleep(2000);
				String childBrowsertitle=driver.getTitle();
				System.out.println("title of childBrowser :"+childBrowsertitle);
				driver.findElement(By.linkText("Try Free")).click();
				Thread.sleep(2000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
