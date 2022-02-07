package conf;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingOnLogin extends Utility_Method {
	@Test(dataProvider="logindata",dataProviderClass=Utility_Method.class)
	public void login(String Email, String Password) throws IOException{
		
		precondition();
		
		String appUrl=config1();
		driver.get(appUrl);
		WebElement login_button=driver.findElement(By.xpath("//a[text()='Log in']"));
		clickaction(login_button);
		
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		enter_value_edit_field(email, Email);
		
		WebElement pwd=driver.findElement(By.xpath("//input[@id='Password']"));
		enter_value_edit_field(pwd, Password);
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		clickaction(loginbutton);
		
		postCondition();
	}
	
	
	}

