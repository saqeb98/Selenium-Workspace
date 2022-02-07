package Test.Maven_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Utility_MethodTest {
	static WebDriver driver;
	public static void precondition(){
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	//data for login
	@DataProvider(name="logindata")
	public Object[][] loginDetaild(){
		Object[][] value=new Object[1][2];
		value[0][0]="rohana@gmail.com";
		value[0][1]="rohan1234";
		return value;
	}
	
		//SendKeys
		public static void enter_value_edit_field(WebElement element,String value){
			element.sendKeys(value);
		}
		//ClickAction
		public static void clickaction(WebElement elementRegister){
			elementRegister.click();
		}
				
}

