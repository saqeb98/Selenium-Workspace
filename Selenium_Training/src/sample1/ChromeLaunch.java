package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Eclipse\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		String s1=driver.getTitle();
		System.out.println(s1);
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.close();
		
		

	}

}
