package sample1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingOnGet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/demo.html");
		
		
		WebElement listbox=driver.findElement(By.xpath("//select[@id='standard_cars']"));
		Select element=new Select(listbox);
		Thread.sleep(2000);
		List<WebElement> options=element.getOptions();
		for (int i = 0; i < options.size()-1; i++) 
		{
			element.selectByIndex(i);
		}
		

	}

}
