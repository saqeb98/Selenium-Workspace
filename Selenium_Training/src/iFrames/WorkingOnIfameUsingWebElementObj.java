package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnIfameUsingWebElementObj {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/iframe.html");
		
		WebElement element=driver.findElement(By.xpath("//iframe[@id='FR1']"));
		driver.switchTo().frame(element
				);
		
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("//a[text()='No Thanks']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='BUSINESS']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
