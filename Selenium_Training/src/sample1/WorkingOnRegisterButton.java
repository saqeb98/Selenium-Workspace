package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnRegisterButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Rohan");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.close();
	}

}
