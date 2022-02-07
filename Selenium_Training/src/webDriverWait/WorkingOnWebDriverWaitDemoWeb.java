package webDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingOnWebDriverWaitDemoWeb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,1);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Register']"))));
		driver.findElement(By.xpath("//a[text()='Register']")).sendKeys("mobile");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"))));
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[3]"))));
		driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[3]")).click();
		
		driver.close();
		
		
	}

}
