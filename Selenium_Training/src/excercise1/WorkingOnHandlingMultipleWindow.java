package excercise1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnHandlingMultipleWindow {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		String parent_window=driver.getWindowHandle();
		
				
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		
		Set<String> child_Window=driver.getWindowHandles();
		
		for (String window : child_Window)
		{
			driver.switchTo().window(window);
			
			if (driver.getTitle().contains("Facebook"))
			{
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohan@gmail.com");
				Thread.sleep(5000);
				driver.close();
			}
			
			
		}
		
		
		driver.switchTo().window(parent_window);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("books");
		Thread.sleep(5000);
		driver.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		Thread.sleep(10000);
		Set<String> window=driver.getWindowHandles();
		
		for (String string : window) 
		{
			driver.switchTo().window(string);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohan@gmail.com");
			driver.switchTo().window(string);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("books");
			
		}
		Thread.sleep(5000);
		
		
		driver.close();
		
		
		/*Set<String> window2=driver.getWindowHandles();
		for (String string1 : window2)
		{
			driver.switchTo().window(string1);
		}
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("books");
		Thread.sleep(5000);
		driver.close();*/
		
	}

}
