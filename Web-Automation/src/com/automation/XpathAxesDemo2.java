package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo2 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		//enterSalaryforSachinTendulkar();
		//enterSalaryfoNexttoSachinTendulkar();
		//makestatusactiveforfreedomfighter();
		//sachinTendulkarPrevious2ndRecordMaketheStatusasActive();
		//BasedOntheSalaryTextFieldofRahulDravidGettheTableAttributeValue();
		BasedOntheTableIts4thRecordEnterTheSalary();

	}
	
	private static void launchBrowser()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(1000);
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
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void enterSalaryforSachinTendulkar()
	{
		try
		{
			driver.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td[3]/input")).sendKeys("25000");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void enterSalaryfoNexttoSachinTendulkar()
	{
		try
		{
		driver.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::td[10]/input")).sendKeys("35000");	
		Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void makestatusactiveforfreedomfighter()
	{
		try
		{
			driver.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td/input")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void sachinTendulkarPrevious2ndRecordMaketheStatusasActive()
	{
		try
		{
			driver.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[2]/td[1]/input")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void BasedOntheSalaryTextFieldofRahulDravidGettheTableAttributeValue()
	{
		WebElement ele=driver.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table"));
		String str=ele.getAttribute("id");
		System.out.println(str);
	}
	
	private static void BasedOntheTableIts4thRecordEnterTheSalary()
	{
		driver.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[4]/td[6]/input")).sendKeys("25000");
	}

}
