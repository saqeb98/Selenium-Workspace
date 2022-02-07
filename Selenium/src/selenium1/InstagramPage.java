package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rohankalalq@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rohan1234");
		Thread.sleep(10000);
		
		
		/*Enter password manually
		Click manually login button*/
		//html/body/div[6]/div/div/div/div[3]/button[2]
		
		driver.findElement(By.xpath("//*[@id='loginForm']/div/div[3]/button/div")).click();//login
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();//not now
		Thread.sleep(8000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[2]")).click();//turn off
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[2]/div[1]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[2]/div[1]")).sendKeys("Instagram");
		//Search
	//	driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[2]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[2]/div[3]/div/div[2]/div/ul/div/a/div/div[2]/div[1]/div/div/div[1]")).click();
		//click
		
	//	driver.findElement(By.xpath("/html/body/div[1]/section/main/section/div[1]/div[2]/div/article[1]/header/div[2]/div[1]/div/span/a")).click();
		//instagram link
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//span[text()='Reels']")).click();
		//reels link
		Thread.sleep(8000);
		//driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[3]/div/div[1]/div/div[1]/a[1]/div/div[1]")).click();
		//first video
	//	Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[3]/article/div[1]/div/div[1]/div[1]/a/div/div[2]")).click();
		//first post
		//driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/article/div[2]/div/div/span/div")).click();//unmute
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[text()='Next']")).click();
		Thread.sleep(4000);
		
		for (int reel= 1; reel <=5; reel++) 
		{
			driver.findElement(By.xpath("//a[text()='Next']")).click();
			Thread.sleep(15000);
		//next
		}
		
		driver.close();
	}
	

}
