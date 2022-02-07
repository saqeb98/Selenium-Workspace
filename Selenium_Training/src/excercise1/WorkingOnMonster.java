package excercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingOnMonster {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[@data-check='menutab'])[1]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("(//a[text()='Jobs by Skills'])"))).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("(//a[@href='https://www.monsterindia.com/search/java-jobs'])[1]"))).click().build().perform();
	}

}
