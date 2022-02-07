package com.OrangeHrm;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility_MethodOfOrangeHRM {
	static WebDriver driver;
	static String filePath="/TestConfig/orangeHRMconfig.properties";
	public static String config1() throws IOException{
		
		FileInputStream fil=new FileInputStream(filePath);
		Properties pro=new Properties();
		pro.load(fil);
		String url=pro.getProperty("url");
		return url;
	}
	
	public static void preCondition() throws IOException {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//String appurl=config1();
	//driver.get(appurl);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
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
