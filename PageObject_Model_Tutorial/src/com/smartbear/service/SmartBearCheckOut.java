package com.smartbear.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearCheckOut {

	public void SmartCheckOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()='Checkout']")
	WebElement chechOutButton;
	
	
	
	public void checkout() {
		chechOutButton.click();
	}
}
