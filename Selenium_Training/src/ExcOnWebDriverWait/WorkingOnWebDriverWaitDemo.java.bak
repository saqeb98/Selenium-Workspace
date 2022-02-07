package ExcOnWebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingOnWebDriverWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
	
	
		
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Register']")))).click();
		//wait.until(ExpectedConditions.el)
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='gender-male']")))).click();
	
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='FirstName']")))).sendKeys("Rohan");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='LastName']")))).sendKeys("S");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='Email']")))).sendKeys("rohans@gmail.com");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='Password']")))).sendKeys("Rohan1234");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='ConfirmPassword']")))).sendKeys("Rohan1234");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='register-button']")))).click();
		
		//Register
		
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Log in']")))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='Email']")))).sendKeys("rohans@gmail.com");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='Password']")))).sendKeys("rohan1234");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@value='Log in']")))).click();
		String s1="rohans@gmail.com";
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='rohans@gmail.com']"))));
		
		String text=driver.findElement(By.xpath("//a[text()='rohans@gmail.com']")).getText();
	
		if (s1.equalsIgnoreCase(text))
		{
			System.out.println("Sucessful");
		}
		//driver.close();
			
		}
		
		
		
		
	}

