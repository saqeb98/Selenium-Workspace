package excercise1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnHandlingMultipleWindowGetTittle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		
		Set<String> windows=driver.getWindowHandles();
		
		for (String win : windows)
		{
			System.out.println(driver.switchTo().window(win).getTitle());
			driver.close();
		}
		

	}

}
