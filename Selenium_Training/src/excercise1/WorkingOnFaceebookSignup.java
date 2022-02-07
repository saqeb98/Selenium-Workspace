package excercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnFaceebookSignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@class='_sv4'])[10]")).click();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Rohan");
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("R");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		

	}

}
