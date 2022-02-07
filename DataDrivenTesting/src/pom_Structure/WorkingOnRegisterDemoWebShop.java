package pom_Structure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import UtilityFunctions.*;
public class WorkingOnRegisterDemoWebShop extends Utility_Method {


	public WorkingOnRegisterDemoWebShop(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Register']")
	WebElement registerLink;

	@FindBy(xpath="//input[@id='gender-male']")
	WebElement genderRadioButton;

	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstNameText;

	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastNameText;

	@FindBy(xpath="//input[@id='Email']")
	WebElement emailText;

	@FindBy(xpath="//input[@id='Password']")
	WebElement pwdtextField;

	@FindBy(xpath="//input[@name='ConfirmPassword']")
	WebElement conpwdtextField;

	@FindBy(xpath="//input[@id='register-button']")
	WebElement registerbutton;


	/*	
	public void register()
	{
		clickaction(registerLink);
	}
	 */	
	public void gender() {
		clickaction(genderRadioButton);
	}
	public void firstName(String value) {
		enter_value_edit_field(firstNameText, value);
	}

	public void lastname(String value) {
		enter_value_edit_field(lastNameText, value);
	}
	public void email(String value) {
		enter_value_edit_field(emailText, value);
	}
	public void pwd(String value) {
		enter_value_edit_field(pwdtextField, value);
	}
	public void conpwd(String value) {
		enter_value_edit_field(conpwdtextField, value);
	}
	public void registerbutton() {
		clickaction(registerbutton);
	}


}
