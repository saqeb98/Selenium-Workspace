package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("//C:/Users/user/Downloads/css_selector.html");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Hello");
		driver.findElement(By.xpath("/html/body/input[@type='password']")).sendKeys("hello123");

	}

}
