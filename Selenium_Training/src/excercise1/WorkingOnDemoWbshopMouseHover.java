package excercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingOnDemoWbshopMouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
		WebElement computers=driver.findElement(By.xpath("//a[contains(text(),'Computer')]"));
		Actions action=new Actions(driver);
		
		action.moveToElement(computers).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Notebooks')]"))).click().perform();
		driver.navigate().back();
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Cell')])[1]"))).click().perform();
	}

}
