package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingOnKeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement search=driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		Actions action=new Actions(driver);
		action.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("PUMMA").build().perform();
		Thread.sleep(1000);
		WebElement shoes=driver.findElement(By.xpath("(//li[contains(@class,'desktop-suggestion null')])[9]"));
		action.moveToElement(shoes).click().perform();

	}

}
