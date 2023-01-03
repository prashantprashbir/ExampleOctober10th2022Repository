package practice1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopupBrowsersDemo6 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		handlechildBrowsers();

	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
//			driver.manage().window().maximize();
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
	
	private static int popupcount()
	{
		int count=0;
		count=driver.getWindowHandles().size()-1;
		return count;
	}
	
	private static void handlechildBrowsers()
	{
		try
		{
			WebElement olink=driver.findElement(By.xpath("//*[@id=\"copyRight\"]/nobr/a"));
			System.out.println("before clicking :"+popupcount());
			olink.click();
			Thread.sleep(6000);
			System.out.println("after clicking :"+popupcount());
			Set<String> str=driver.getWindowHandles();
			Iterator<String> ite=str.iterator();
			String parent=ite.next();
			String child=ite.next();
			for(String i:str)
			{
				System.out.println(i);
			}
			for(String i:str)
			{
				String s1=driver.switchTo().window(child).getTitle();
				Thread.sleep(2000);
				System.out.println(s1);
				Thread.sleep(2000);
				String s2=driver.switchTo().window(parent).getTitle();
				System.out.println(s2);
				break;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
