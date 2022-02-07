package conf;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WorkingOnConfig_PropertiesFile extends Utility_Method { 


	@Test(dataProvider="Data_Register",dataProviderClass=Utility_Method.class)
	public void config(String FirstName,String LastName,String Email,String Password,String ConfirmPwd) throws IOException{
		//Launch,Maximize,implicitWait
		precondition();

		//URL
		String appUrl=config1();
		driver.get(appUrl);
		//RegisterLink
		WebElement Register_Xpath=driver.findElement(By.xpath("//a[text()='Register']"));
		clickaction(Register_Xpath);
		//Gender
		WebElement radioButton=driver.findElement(By.xpath("//input[@id='gender-male']"));
		clickaction(radioButton);
		//FirstName
		WebElement fi=driver.findElement(By.xpath("//input[@id='FirstName']"));
		enter_value_edit_field(fi,FirstName);
		//LastName
		WebElement lastName=driver.findElement(By.xpath("//input[@id='LastName']"));
		enter_value_edit_field(lastName,LastName);
		//Email
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		enter_value_edit_field(email,Email);
		//Password
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		enter_value_edit_field(password, Password);
		//ConfirmPassword
		WebElement confirmPwd=driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
		enter_value_edit_field(confirmPwd, ConfirmPwd);
		//ClickONRegisterButton
		WebElement clickReg=driver.findElement(By.xpath("//input[@id='register-button']"));
		clickaction(clickReg);

		//ClickOnSearchTextField		
		WebElement search_Xpath=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		enter_value_edit_field(search_Xpath,"Books");
		//EnterTheValueInSearchTextField
		WebElement button_Xpath=driver.findElement(By.xpath("//input[@class='button-1 search-box-button']"));
		clickaction(button_Xpath);

		//Close
		postCondition();
	}	
}





























































/*	

public static void enterTheValue(WebElement Xpath_value, String value){
	Xpath_value.sendKeys(value);
}
public static void clicksearch(WebElement Xpath){
	Xpath.click();
}




public static void selectRadioButton(WebElement XpathRadio)
{
	XpathRadio.click();
}

public static void enterFirstName(WebElement Xpath_Fname,String value){
	Xpath_Fname.sendKeys(value);
}

public static void enterLastName(WebElement Xpath_Lname,String value){
	Xpath_Lname.sendKeys(value);
}



public static void enterEmail(WebElement Xpath_Email,String value){
	Xpath_Email.sendKeys(value);
}

public static void enterPassword(WebElement Xpath_Password,String value){
	Xpath_Password.sendKeys(value);
}

public static void enterConfPwd(WebElement Xpath_confirmPwd,String value){
	Xpath_confirmPwd.sendKeys(value);
}
 */	