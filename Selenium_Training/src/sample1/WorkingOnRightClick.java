package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingOnRightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement button= driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action =new Actions(driver);
		action.moveToElement(button).contextClick().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Delete']"))).click().perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Paste']"))).click().perform();
		

	}

}
