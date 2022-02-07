package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnIframehtml {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/iframe.html");
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='No Thanks']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='CRICKET']")).click();
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//a[text()='Not Now']")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Google']")).click();

	}

}
