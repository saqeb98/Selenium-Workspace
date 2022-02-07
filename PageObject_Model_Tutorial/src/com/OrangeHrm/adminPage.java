package com.OrangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adminPage extends Utility_MethodOfOrangeHRM {
	
	public adminPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//b[text()='Admin']")
	WebElement adminbutton;
	
	
	
	
	public void admin()
	{
		clickaction(adminbutton);
	}
}
