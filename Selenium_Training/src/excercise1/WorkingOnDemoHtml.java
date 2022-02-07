package excercise1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnDemoHtml {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/demo.html");
		List<WebElement> input=driver.findElements(By.xpath("//input[@name='download']"));
		
		for (WebElement webElement : input) 
		{
			
			webElement.click();
		}
	
		
		List<WebElement> input1=driver.findElements(By.xpath("//input[@name='fname']"));
		
		for (int i = 0; i < input1.size(); i++)
		{
			
			String[] arr={"asd","fre","adsfg","gdf","awer","awef","awefr","qregt","rqt"};
			input1.get(i).sendKeys(arr[i]);
			
		
	
		}
	}

	
	}



