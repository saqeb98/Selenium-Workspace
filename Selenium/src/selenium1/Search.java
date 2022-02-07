package selenium1;
import org.openqa.selenium.chrome.ChromeDriver;
public class Search 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="./Software/chromeDriver.exe";
		System.setProperty(key, value);
		//@SuppressWarnings("unused")
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://google.com");

		driver.get("https://mail.google.com/mail/&ogbl");
		
		/*WebElement k=driver.findElement(By.name("q"));
		k.sendKeys("java");
		k.submit();
		Thread.sleep(5000);
		//driver.quit();
		/*WebElement h=driver.findElement(By.name("h3"));
		h.sendKeys("Java | Oracle");
		h.submit();*/
		//Thread.sleep(1000);		
	}

}
