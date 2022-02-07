package com.Google.Search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestNgHomePage {
	public TestNgHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Downloads']")
	WebElement testnglink;
	
	public void clickAction()
	{
		testnglink.click();
	}
}
