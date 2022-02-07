package com.Google.Search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	public  GooglePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='q']")
		WebElement searchField;
	
	@FindBy(name="btnK")
		WebElement clicksearchButton;

	public void enter_The_Value(String value)
	{
		searchField.sendKeys(value);
	}
	public void clickAction()
	{
		clicksearchButton.click();
	}
}
