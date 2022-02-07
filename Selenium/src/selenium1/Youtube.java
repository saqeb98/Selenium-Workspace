package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.id("search")).click();
		driver.findElement(By.id("search")).sendKeys("akshay");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a/yt-formatted-string")).click();
		
		driver.findElement(By.xpath("//*[@id='video-title']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='skip-button:6']/span/button/span")).click();
	}
	
	}


