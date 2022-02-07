package excercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingONDemoShopSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		Thread.sleep(2000);
		WebElement sortby=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select element1=new Select(sortby);
	//	element1.selectByValue("http://demowebshop.tricentis.com/books?orderby=0");
		element1.selectByIndex(5);
		
		WebElement display=driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select element2=new Select(display);
		element2.selectByIndex(2);
		
		WebElement viewas=driver.findElement(By.xpath("//select[@id='products-viewmode']"));
		Select element3=new Select(viewas);
	//	element3.selectByIndex(2);
		element3.selectByVisibleText("List");
		
	}

}
