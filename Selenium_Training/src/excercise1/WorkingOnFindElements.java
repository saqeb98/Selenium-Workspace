package excercise1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnFindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> inputElement1=driver.findElements(By.xpath("//a"));
		
		for (int i = 0; i< inputElement1.size(); i++) 
		{
			System.out.println(inputElement1.get(i).getAttribute("text"));
		}
		
		Thread.sleep(5000);
		driver.close();
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://demowebshop.tricentis.com/");
		List<WebElement> input=driver1.findElements(By.xpath("//img"));
		for (int i = 0; i < input.size(); i++)
		{
			System.out.println(input.get(i).getAttribute("title"));
			
		}
	}

}
