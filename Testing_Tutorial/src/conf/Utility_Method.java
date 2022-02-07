package conf;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Utility_Method {
	static WebDriver driver;
	@BeforeTest
	public static void precondition(){
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	//get url from properties file
		public static String config1() throws IOException{
			String filePath="./Test_Config/Config.properties";
			FileInputStream fil=new FileInputStream(filePath);
			Properties pro=new Properties();
			pro.load(fil);
			String url=pro.getProperty("URL");
			return url;
		}
	@AfterTest
	public static void postCondition(){
		driver.close();
	}
	//Data for register
	@DataProvider(name="Data_Register")
	public Object[][] test_Data(){
		Object[][] values=new Object[2][5];
		//First user
		values[0][0]="Rohan";
		values[0][1]="s";
		values[0][2]="rohana@gmail.com";
		values[0][3]="rohan1234";
		values[0][4]="rohan1234";


		//Second user
		values[1][0]="S";
		values[1][1]="Rohan";
		values[1][2]="srohan@gmail.com";
		values[1][3]="srohan";
		values[1][4]="srohan";
		return values;
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


	//Select Class	
	public static void select_index(WebElement element,int value){
		Select sel=new Select(element);
		sel.selectByIndex(value);
	}
	public static void select_value(WebElement element,String value){
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public static void select_visible_text(WebElement element,String value){
		Select sel=new Select(element);
		sel.selectByVisibleText(value);
	}
}


