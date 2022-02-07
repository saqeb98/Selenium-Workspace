package excercise1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingOnFlipkartAppAddToCart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//input[@name='q']"))).click().sendKeys("Apple").build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//button[@type='submit']"))).click().build().perform();
		
		
		act.moveToElement(driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Blue, 128 GB)']"))).click().build().perform();
		
		
		String parent_wind=driver.getWindowHandle();
		
		Set<String> childWin=driver.getWindowHandles();
		for (String window : childWin)
		{
			driver.switchTo().window(window);
			 
			
			
			
		
		}
		act.moveToElement(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"))).click().build().perform();
		
		driver.close();
		
		
		driver.switchTo().window(parent_wind);
		
		
		
		
		WebElement list=driver.findElement(By.xpath("//input[@name='q']"));
		
		
		act.moveToElement(driver.findElement(By.xpath("//input[@name='q']"))).doubleClick().build().perform();
		list.sendKeys(Keys.BACK_SPACE);
		
		
		act.moveToElement(driver.findElement(By.xpath("//input[@name='q']"))).click().sendKeys("Samsung").build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//button[@type='submit']"))).click().build().perform();
		
		
		act.moveToElement(driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"))).click().build().perform();
		
		
		Set<String> childWin1=driver.getWindowHandles();
		for (String string : childWin1)
		{
			driver.switchTo().window(string);
			
		}
		
		act.moveToElement(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"))).click().build().perform();
		
		driver.close();
		driver.switchTo().window(parent_wind);
		
		
		
		
		
		
		
		
		
		
		WebElement list1=driver.findElement(By.xpath("//input[@name='q']"));
		
		
		act.moveToElement(driver.findElement(By.xpath("//input[@name='q']"))).doubleClick().build().perform();
		list1.sendKeys(Keys.BACK_SPACE);
		
		
		act.moveToElement(driver.findElement(By.xpath("//input[@name='q']"))).click().sendKeys("Nokia").build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//button[@class='L0Z3Pu']"))).click().build().perform();
		
		
		act.moveToElement(driver.findElement(By.xpath("//div[@class='_4rR01T'][1]"))).click().build().perform();
		
		
		Set<String> childWin2=driver.getWindowHandles();
		for (String string1 : childWin2)
		{
			driver.switchTo().window(string1);
			
		}
		
		act.moveToElement(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"))).click().build().perform();
		
		driver.close();
		driver.switchTo().window(parent_wind);
		
		
		
		
		
WebElement list2=driver.findElement(By.xpath("//input[@name='q']"));
		
		
		act.moveToElement(driver.findElement(By.xpath("//input[@name='q']"))).doubleClick().build().perform();
		list2.sendKeys(Keys.BACK_SPACE);
		
		
		act.moveToElement(driver.findElement(By.xpath("//input[@name='q']"))).click().sendKeys("mi").build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//button[@class='L0Z3Pu']"))).click().build().perform();
		
		
		act.moveToElement(driver.findElement(By.xpath("//div[@class='_4rR01T'][1]"))).click().build().perform();
		
		
		Set<String> childWin3=driver.getWindowHandles();
		for (String string2 : childWin3)
		{
			driver.switchTo().window(string2);
			
		}
		
		act.moveToElement(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"))).click().build().perform();
		
		driver.close();
		driver.switchTo().window(parent_wind);
		
		
		
		
		
		
		
		
		
		
		
		act.moveToElement(driver.findElement(By.xpath("//a[@class='_3SkBxJ']"))).click().build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("((//div[text()='Remove']/parent::div)[1]/child::div)[2]"))).click().build().perform();
		//act.moveToElement(driver.findElement(By.xpath("//a[text()='Nokia 105 SS 2021']/../../../..//div[text()='Remove']"))).click().build().perform();
			
		
		
		//click on remove 
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Remove']"))).click().build().perform();
		
		
		//close the popup remove
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Remove']"))).click().build().perform();
		
		
	
		
		
		

				
		
		
		
		
		
		
		
		
	}

}
