package sample1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnFindelements 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	java.util.List<WebElement> inputElement=driver.findElements(By.xpath("//input"));
	
	Thread.sleep(2000);
	for (WebElement webElement : inputElement)
	{
		System.out.println(webElement.getAttribute("class"));
	}
	System.out.println("**********");
	System.out.println("**********");
	List<WebElement> inputElement1=driver.findElements(By.xpath("//a"));
	
	for (int i = 0; i< inputElement1.size(); i++) 
	{
		System.out.println(inputElement1.get(i).getAttribute("text"));
	}
	
	Thread.sleep(5000);
	driver.close();
	}

}
