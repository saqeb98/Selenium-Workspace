package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_On_ContainsMethod {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[contains(@id,'nav-link-accountList-nav-line-1')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'continue')]")).click();
		
	}

}
