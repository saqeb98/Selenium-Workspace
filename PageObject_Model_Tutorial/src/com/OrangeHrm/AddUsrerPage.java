package com.OrangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUsrerPage extends Utility_MethodOfOrangeHRM{
	public AddUsrerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id='systemUser_userType']")
	WebElement userRoleDropDown;
	
	@FindBy(xpath="//input[@id='systemUser_employeeName_empName']")
	WebElement employeeNameTextField;
	
	@FindBy(xpath="//li[@class='ac_even ac_over']")
	WebElement employeeDrop;
	
	@FindBy(xpath="//input[@id='systemUser_userName']")
	WebElement userNameTextField;
	
	@FindBy(xpath="//input[@id='systemUser_password']")
		WebElement pwdTextField;
	
	@FindBy(xpath="//input[@id='systemUser_confirmPassword']")
	WebElement confirmPwdTextField;
	
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement saveButton;
	
	public void userRole(String value)
	{
		select_value(userRoleDropDown, value);
	}
	
	public void empname(String value)
	{
		enter_value_edit_field(employeeNameTextField, value);
		
	}
	
	public void empnamedropdown()
	{
		clickaction(employeeDrop);
	}
	public void userName(String value)
	{
		enter_value_edit_field(userNameTextField, value);
	}
	public void pwd(String value)
	{
		enter_value_edit_field(pwdTextField, value);
	}
	public void confpwd(String value)
	{
		enter_value_edit_field(confirmPwdTextField, value);
	}
	public void save()
	{
		clickaction(saveButton);
	}
}
