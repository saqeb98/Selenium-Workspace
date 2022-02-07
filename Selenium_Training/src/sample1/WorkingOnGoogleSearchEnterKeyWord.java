package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingOnGoogleSearchEnterKeyWord {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		Actions action=new Actions(driver);
		action.moveToElement(search).sendKeys("hello");
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).build().perform();

		
	}

}
