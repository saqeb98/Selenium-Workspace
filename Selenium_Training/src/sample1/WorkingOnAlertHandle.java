package sample1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingOnAlertHandle {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");	
		
		WebElement button=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(button).doubleClick().build().perform();
	
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Cut']"))).click().build().perform();
		Alert alt1=driver.switchTo().alert();
		Thread.sleep(2000);
		alt1.accept();
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Copy']"))).click().build().perform();
		Alert alt2=driver.switchTo().alert();
		Thread.sleep(2000);
		alt2.accept();
		
		driver.close();
	}

}
