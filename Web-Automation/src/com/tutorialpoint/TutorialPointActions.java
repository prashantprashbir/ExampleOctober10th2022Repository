package com.tutorialpoint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TutorialPointActions {
	
	public TutorialPointActions(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/header/nav/div/div[2]/a")
	private WebElement login;
	
	public WebElement getLoginButton()
	{
		return login;
	}
	
	private WebElement user_email;
	
	public WebElement getUserEmail()
	{
		return user_email;
	}
	
	private WebElement user_password;
	
	public WebElement getUserPassword()
	{
		return user_password;
	}

}
