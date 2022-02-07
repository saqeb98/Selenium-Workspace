package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/Selenium/Assignment2.html");
		driver.findElement(By.id("a1"));
		driver.findElement(By.id("a2")).sendKeys("hello");
		Thread.sleep(2000);
		driver.findElement(By.id("a2")).clear();
		driver.findElement(By.id("a3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("a3")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("a4")).click();
	}

}
