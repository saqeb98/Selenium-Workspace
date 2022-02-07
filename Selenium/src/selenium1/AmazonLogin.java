package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		/*driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("rohankalalq@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("rohan1234");
		driver.findElement(By.id("signInSubmit")).click();*/
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//input[@type='submit'])[6]")).click();
		
		

	}

}
