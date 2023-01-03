package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo1 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		//enterSalaryforSachinTendulkar();
		//enterSalaryforSachinTendulkarBasedOnIndex();
		//enterSalaryNextToSachinTendulkar();
		//makeStatusActiveforFreedomFighter();
		//sachinTendulkarPreviousSecondActiveStatus();
		//basedOnDravidInputGetTableAttributeValue();
	}
	
	private static void launchBrowser()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
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
			driver.get("file:///D:/HTML/WebTableHTML.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void enterSalaryforSachinTendulkar()
	{
		driver.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("25000");
		
	}
	
	private static void enterSalaryforSachinTendulkarBasedOnIndex()
	{
		driver.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
	}
	
	private static void enterSalaryNextToSachinTendulkar()
	{
		driver.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("25000");
	}
	
	private static void makeStatusActiveforFreedomFighter()
	{
		driver.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td/input")).click();
	}
	
	private static void sachinTendulkarPreviousSecondActiveStatus()
	{
		driver.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[2]/td[1]/input")).click();
	}
	
	private static void basedOnDravidInputGetTableAttributeValue()
	{
		WebElement val=driver.findElement(By.xpath("//input[@id='edit3']/ancestor::td/ancestor::tr/ancestor::table"));
		String str=val.getAttribute("id");
		System.out.println(str);
	}

}
