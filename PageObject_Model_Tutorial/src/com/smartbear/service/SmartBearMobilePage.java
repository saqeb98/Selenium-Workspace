package com.smartbear.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utilityFunction.*;
public class SmartBearMobilePage extends Utiliy_Functions {
	public SmartBearMobilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Phone Minus']")
	WebElement phoneMinusLink;
	
	public void phoneMinus() {
		clickaction(phoneMinusLink);
	}

}
