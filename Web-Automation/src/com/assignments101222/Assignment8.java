package com.assignments101222;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		launchbrowser();
		navigate();
		login();
		createCustomer();
		createProject();
		createTasks();
	  //  deleteTasks();
//		deleteProject();
//		deleteCustomer();
//		logoutandClose();

	}
	
	private static void launchbrowser()
	{
		try
		{
		System.setProperty("web.chrome.driver", "D:\\EXAMPLEAUTOMATION\\AUTOMATION\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
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
		driver.get("http://localhost/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createCustomer()
	{
		try
		{
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("JSW");
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("it is a steel work company");
		driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createProject()
	{
		try
		{
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='+ New Project']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("Hot metal Production");
		Thread.sleep(2000);
		driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("project time as per agreement");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		Thread.sleep(2000);
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createTasks()
	{
		try
		{
		driver.findElement(By.xpath("//div[text()='Add New Task']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Create new tasks']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("ore extraction");
		driver.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]/td[1]/input")).sendKeys("sending ore to pallet plant");
		driver.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[3]/td[1]/input")).sendKeys("transfer to stock house");
		driver.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[4]/td[1]/input")).sendKeys("import coal and lime");
		driver.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[5]/td[1]/input")).sendKeys("dumping in BlastFurnace");
		driver.findElement(By.xpath("//span[text()='Create Tasks']")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteTasks()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Delete']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("deleteTaskPopup_deleteConfirm_submitBtn")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/table/tbody/tr/td[1]/div/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[3]/div/div/div[4]/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"deleteTaskPopup_deleteConfirm_submitBtn\"]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteProject()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(2000);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteCustomer()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutandClose()
	{
		try
		{
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
