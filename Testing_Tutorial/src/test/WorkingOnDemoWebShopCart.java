package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WorkingOnDemoWebShopCart {
	WebDriver driver;
	@Parameters("URL")
	@BeforeClass
	public void setUp(String url)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32 (2).zip");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	@Test
	public void reg()
	{
		
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']"))).click().build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"))).click().build().perform();
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Shopping cart']"))).click().build().perform();
		String s1="14.1-inch Laptop";
		
		String text=driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[2]")).getText();
		if (s1.equalsIgnoreCase(text)) 
		{
			System.out.println("Product added successfully");
		}
	}
	@AfterClass

	public void tearDown()
	{
		driver.close();
	}
}
