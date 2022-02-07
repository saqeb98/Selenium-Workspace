package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WorkingOnDemoWebShopRegistera {
	WebDriver driver;
	@Parameters("URL")
	@BeforeClass
	public void setUp(String url)
	{
		System.setProperty("webdriver.chrome.driver","./Driverss/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	
	@Test
	public void reg()
	{

		
		//Register
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Rohan");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rohan@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("rohan1234");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("rohan1234");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();

		//driver.close();
	}
	@AfterClass

	public void tearDown()
	{
		driver.close();
	}
}

