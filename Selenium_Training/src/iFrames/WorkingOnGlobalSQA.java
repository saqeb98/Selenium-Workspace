package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingOnGlobalSQA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='iFrame']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[4]")));
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//input[@id='s'])[1]")).sendKeys("hello");
		Thread.sleep(2000);
		
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='All']"))).click().build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Automation']"))).click().build().perform();
	}
	
}
