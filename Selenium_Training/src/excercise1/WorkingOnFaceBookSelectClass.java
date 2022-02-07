package excercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingOnFaceBookSelectClass {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		
		Thread.sleep(5000);
		//driver.close();
		
		WebElement daydropdown=driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(5000);
		Select element=new Select(daydropdown);
		element.selectByValue("4");
		Thread.sleep(3000);
		
		WebElement monthdropdown=driver.findElement(By.xpath("//select[@id='month']"));
		Select element1=new Select(monthdropdown);
		element1.selectByValue("8");
		Thread.sleep(3000);
		
		WebElement yeardropdown=driver.findElement(By.xpath("//select[@id='year']"));
		Select element2=new Select(yeardropdown);
		element2.selectByValue("1905");
		
		

	}

}
