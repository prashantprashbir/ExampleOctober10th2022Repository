package practice1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopupBrowserDemo5 {
	
	public static WebDriver drivers=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		
		handlebrowsers();

	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			drivers= new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			drivers.navigate().to("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static int browsercount()
	{
		int count=0;
		count=drivers.getWindowHandles().size()-1;
		return count;
	}
	
	private static void handlebrowsers()
	{
		try
		{
			WebElement olink=drivers.findElement(By.xpath("//*[@id=\"copyRight\"]/nobr/a"));
			System.out.println("before popups :"+browsercount());
			olink.click();
			Thread.sleep(6000);
			System.out.println("After click :"+browsercount());
			Thread.sleep(2000);
			Set<String> str=drivers.getWindowHandles();
			Iterator<String> ite=str.iterator();
			String parent=ite.next();
			String child=ite.next();
			for(String i:str)
			{
				System.out.println(i);
				
			}
			for(String i:str)
			{
				Thread.sleep(2000);
				String childtitle=drivers.switchTo().window(child).getTitle();
				Thread.sleep(2000);
				System.out.println(childtitle);
				Thread.sleep(2000);
				String parenttitle=drivers.switchTo().window(parent).getTitle();
				Thread.sleep(2000);
				System.out.println(parenttitle);
				break;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
