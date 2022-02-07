package excercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingOnMyntraMouseOverAction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");	
		WebElement men=driver.findElement(By.xpath("//a[@class='desktop-main']"));
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(men).build().perform();
		WebElement causual=driver.findElement(By.xpath("(//a[@class='desktop-categoryLink'])[2]"));
		action.moveToElement(causual).click().perform();
	}

}
