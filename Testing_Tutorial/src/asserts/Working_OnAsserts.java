package asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Working_OnAsserts {
	@Test
	public void demo(){
	
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Assert.assertEquals("Hello", "Hello");
		driver.get("http://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals("Demo Web Shop",title, "The Title do not match");
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Register']")).isDisplayed());
		
		driver.close();
		
		
	
	
		
	}
}
