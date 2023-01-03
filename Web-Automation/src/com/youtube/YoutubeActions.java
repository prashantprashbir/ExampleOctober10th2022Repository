package com.youtube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YoutubeActions {
	
	public YoutubeActions(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='History']")
	private WebElement history;
	
	public WebElement getHistory()
	{
		return history;
	}
	
	@FindBy(xpath="//*[@id=\"contents\"]/ytd-button-renderer[1]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")
	private WebElement clear;
	
	public WebElement getClearWatchHistory()
	{
		return clear;
	}
	
	@FindBy(xpath="//*[@id=\"confirm-button\"]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")
	private WebElement confirmclear;
	
	public WebElement getConfirmClear()
	{
		return confirmclear;
	}
	

}
