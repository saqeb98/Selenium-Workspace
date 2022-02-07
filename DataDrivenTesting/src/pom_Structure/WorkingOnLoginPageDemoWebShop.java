package pom_Structure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityFunctions.Utility_Method;

public class WorkingOnLoginPageDemoWebShop extends Utility_Method{

	public WorkingOnLoginPageDemoWebShop(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


/*	@FindBy(xpath="//a[text()='Log in']")
	WebElement loginLink;
*/
	@FindBy(xpath="//input[@id='Email']")
	WebElement emailTextField;

	@FindBy(xpath="//input[@id='Password']")
	WebElement passTextField;

	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement loginbutton;


	public void emailtext(String value){

		enter_value_edit_field(emailTextField, value);

	}

	public void password(String value){

		enter_value_edit_field(passTextField, value);

	}

	public void  loginfield(){

		clickaction(loginbutton);

	}

}
