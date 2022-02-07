package asserts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Working_On_Soft_Assertion {
	@Test
	public void softAssert()
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		SoftAssert ast=new SoftAssert();
		ast.assertEquals("Demo Web Shop",driver.getTitle());
		ast.assertTrue(driver.findElement(By.xpath("//input[@id='small-searchitems']")).isEnabled());
		ast.assertEquals("Demo Web Shop",driver.getTitle(),"true condition");
	}
}
