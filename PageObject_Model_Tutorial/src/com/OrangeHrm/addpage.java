package com.OrangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addpage extends Utility_MethodOfOrangeHRM {
public addpage(WebDriver driver)
{
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath="//input[@id='btnAdd']")
	WebElement addButton;
	
	
	public void add()
	{
		clickaction(addButton);
	}


}
