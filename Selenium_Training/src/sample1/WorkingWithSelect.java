package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/demo.html");
		WebElement listbox=driver.findElement(By.xpath("//select[@id='standard_cars']"));
		//Select Class
		Select element=new Select(listbox);
		element.selectByValue("bmw");
		Thread.sleep(2000);
		element.selectByVisibleText("Audi");
		Thread.sleep(2000);
		element.selectByIndex(1);
		Thread.sleep(5000);
		driver.close();
		
	}

}
