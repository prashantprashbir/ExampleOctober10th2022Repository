package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Practice1 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		flip();

	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			ChromeOptions options= new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			driver= new ChromeDriver(options);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			driver.navigate().to("https://www.flipkart.com/");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void flip()
	{
		try
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			Thread.sleep(2000);
			Actions action= new Actions(driver);
			WebElement ele=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div"));
			action.moveToElement(ele).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[3]/a/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
