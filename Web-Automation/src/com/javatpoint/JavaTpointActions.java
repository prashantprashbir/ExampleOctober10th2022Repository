package com.javatpoint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaTpointActions {
	
	public JavaTpointActions(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//strong[text()='Selenium Tutorial']")
	private WebElement seltutorial;
	
	public WebElement getClickSeleniumTutorialLink()
	{
		return seltutorial;
	}
	
	@FindBy(xpath="//a[text()='next →']")
	private WebElement nextbutton;
	
	public WebElement getNextButton()
	{
		return nextbutton;
	}

}
