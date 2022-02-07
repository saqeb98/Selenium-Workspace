package UtilityFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.*;
public class Utility_Method {
	public static WebDriver driver;

		//get url from properties file
		public String config1(String Key) throws IOException{
			String filePath="F:\\Eclipse\\DataDrivenTesting\\TestData\\config.properties";
			FileInputStream fil=new FileInputStream(filePath);
			Properties pro=new Properties();
			pro.load(fil);
			String url=pro.getProperty(Key);
			return url;
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


