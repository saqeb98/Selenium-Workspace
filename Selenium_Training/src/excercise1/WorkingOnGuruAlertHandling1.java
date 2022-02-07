package excercise1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingOnGuruAlertHandling1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//input[@name='cusid']"))).click().sendKeys("1234").build().perform();
		action.moveToElement(driver.findElement(By.xpath("//input[@name='submit']"))).click().build().perform();
		
		
		Alert alt2=driver.switchTo().alert();
		Thread.sleep(2000);
		alt2.accept();
		
		Alert alt3=driver.switchTo().alert();
		Thread.sleep(2000);
		alt3.accept();
	}

}
