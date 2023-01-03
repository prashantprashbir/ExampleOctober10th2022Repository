package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonActions {
	
	public AmazonActions(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Amazon miniTV']")
	private WebElement minitv;
	
	public WebElement getClickMiniTV()
	{
		return minitv;
	}
	
	@FindBy(xpath="//h1[text()='mini Movies']")
	private WebElement minimovies;
	
	public WebElement getMiniMovies()
	{
		return minimovies;
	}
	
	@FindBy(xpath="//*[@id=\"__next\"]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div[2]/ul/li[2]/div")
	private WebElement free;
	
	public WebElement getWatchFree()
	{
		return free;
	}

}
