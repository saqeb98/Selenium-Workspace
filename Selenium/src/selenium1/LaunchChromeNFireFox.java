package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeNFireFox {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		FirefoxDriver driver1=new FirefoxDriver();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.get("https://amazon.com");
		driver1.get("https://google.com");
		driver1.get("https://javapoint.com");
		Thread.sleep(10000);
		driver.close();
		driver1.quit();
		
		
		
		
		
		
	
		/*String s1=driver.getCurrentUrl();
		System.out.println(s1);
		String s2=driver.getTitle();
		System.out.println(s2);*/
	}

}
