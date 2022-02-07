package excercise1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		
		Set<String>child_window=driver.getWindowHandles();
		System.out.println(child_window);
		Thread.sleep(5000);
		for (String window : child_window)
		{
			driver.switchTo().window(window);
			Thread.sleep(3000);
			driver.close();
		}
		
		
	}

}
