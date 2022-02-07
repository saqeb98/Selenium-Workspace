package com.OrangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility_MethodOfOrangeHRM {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement loginTextField;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement pwdTextField;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement loginButton;
	
	public void login(String value)
	{
		enter_value_edit_field(loginTextField, value);
	}

	public void pwd(String value)
	{
		enter_value_edit_field(pwdTextField, value);
	}
	public void loginButton()
	{
		clickaction(loginButton);
	}
}
