package com.utilityFunction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Utiliy_Functions {
	public static WebDriver driver;
	
	public static void precndition() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(config1());
		//driver.get("https://services.smartbear.com/samples/TestComplete14/smartstore/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
		@BeforeClass
		public static String config1() throws IOException{
		String filePath="./TestConfig/config.properties";
		FileInputStream fil=new FileInputStream(filePath);
		Properties pro=new Properties();
		pro.load(fil);
		String url=pro.getProperty("url");
		return url;
	}
	

	public static void postCondition() {
		driver.close();
	}
	
	
	//sendkeys
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
