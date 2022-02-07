package selenium1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		String Url=driver.getCurrentUrl();
		String tittle=driver.getTitle();
		String src=driver.getPageSource();
		System.out.println(Url);
		System.out.println(tittle);
		System.out.println(src);
	}

}
