package pom_Structure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityFunctions.Utility_Method;

public class WorkingOnHmePageDemoWebShop extends Utility_Method{
	public WorkingOnHmePageDemoWebShop(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement registerLink;
	
	@FindBy(xpath="//a[text()='Log in']")
	WebElement loginLink;
	
	public void register() {
		clickaction(registerLink);
	}
	public void  login() {

		clickaction(loginLink);

	}
	
}
