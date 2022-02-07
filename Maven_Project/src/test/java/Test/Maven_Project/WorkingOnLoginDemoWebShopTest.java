package Test.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WorkingOnLoginDemoWebShopTest extends Utility_MethodTest {
	@Test(dataProvider="logindata",dataProviderClass=Utility_MethodTest.class)
	public void loginPage(String Email, String Password)
	{
		precondition();
		
		WebElement login_button=driver.findElement(By.xpath("//a[text()='Log in']"));
		clickaction(login_button);
		
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		enter_value_edit_field(email, Email);
		
		WebElement pwd=driver.findElement(By.xpath("//input[@id='Password']"));
		enter_value_edit_field(pwd, Password);
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		clickaction(loginbutton);
		
		driver.close();
		
		
	}
}
