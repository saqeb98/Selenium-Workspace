package com.Google.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Google.Search.GooglePage;
import com.Google.Search.Search_Page;
import com.Google.Search.TestNgHomePage;

public class GoogleSearchTC {
	@Test(dataProvider="searchData")
	public void TC01(String Search)
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		GooglePage gp=new GooglePage(driver);
		gp.enter_The_Value(Search);
		gp.clickAction();
		Search_Page sp=new Search_Page(driver);
		sp.clickAction();
		TestNgHomePage tp=new TestNgHomePage(driver);
		tp.clickAction();
		
		driver.close();
		
	}
	@DataProvider(name="searchData")
	public Object[][] data()
	{
		Object[][] value=new Object[1][1];
		value[0][0]="Selenium";
		
		return value;
	}
}
