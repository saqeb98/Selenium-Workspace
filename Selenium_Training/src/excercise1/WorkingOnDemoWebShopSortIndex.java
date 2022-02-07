package excercise1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingOnDemoWebShopSortIndex {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		
		
		WebElement sortby=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select element1=new Select(sortby);
		Thread.sleep(2000);
		List<WebElement> options=element1.getOptions();
		
		
		for (int i = 0; i < options.size()-1; i++)
		{
			WebElement sortbys=driver.findElement(By.xpath("//select[@id='products-orderby']"));
			Select element2=new Select(sortbys);
			element2.selectByIndex(i);
			
		}
	
		
		
	}
}
