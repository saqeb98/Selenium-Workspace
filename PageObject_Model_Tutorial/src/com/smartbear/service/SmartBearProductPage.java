package com.smartbear.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utilityFunction.*;
public class SmartBearProductPage extends Utiliy_Functions{
	public SmartBearProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	@FindBy(xpath="(//span[text()='Mobile phone'])[2]")
	WebElement clickLink;
	
	
	public void _clickmobile()
	{
		clickaction(clickLink);
	}
	
}
