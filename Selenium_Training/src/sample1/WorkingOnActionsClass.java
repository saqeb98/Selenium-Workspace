package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingOnActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		
		WebElement sign_up=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions action=new Actions(driver);
		action.moveToElement(sign_up).build().perform();
		
		WebElement sign_button=driver.findElement(By.xpath("//span[@class='nav-action-inner'][1]"));
		action.moveToElement(sign_button).click().perform();
		
		WebElement signin_Click=driver.findElement(By.xpath("//input[@id='ap_email']"));
		action.moveToElement(signin_Click).click().perform();
		signin_Click.sendKeys("abcd@gmail.com");                                        
		

	}

}
