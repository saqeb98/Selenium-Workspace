package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/Selenium/Assignment1.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("n1")).sendKeys("hello");
		Thread.sleep(2000);
		driver.findElement(By.id("a2")).clear();
		driver.findElement(By.linkText("amazon")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Rohan Kalal");
		driver.findElement(By.id("ap_email")).sendKeys("rohankalalq@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("rohan1234");
		driver.findElement(By.id("ap_password_check")).sendKeys("rohan1234");
		driver.findElement(By.id("continue")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bag");
		Thread.sleep(500);
		driver.findElement(By.id("nav-search-submit-button")).click();*/
	}

}
