package com.Google.Search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {
	
	public  Search_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3[text()='Selenium']")
	
		WebElement clickOnLink;
	
	public void clickAction()
	{
		clickOnLink.click();
	}
	
}
