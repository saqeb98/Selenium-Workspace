package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
public class WorkingOnDemoWebShopLogin {
	WebDriver driver;
	@Parameters("URL")
	@BeforeClass
	public void setUp(String url)
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	@Parameters({"Email","Pass"})
	@Test
	public void reg(String email,String pass)
	{
		
		
/*		System.setProperty("webdriver.chrome.driver","./Driverss/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
*/		
		//
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		//Login
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		
	}
	@AfterClass

	public void tearDown()
	{
		driver.close();
	}
}
