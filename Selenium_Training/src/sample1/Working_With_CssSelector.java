package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_CssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Chicken");
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("computer");
		
		driver.findElement(By.cssSelector("input.button-1.search-box-button")).click();
	}

}
