import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.id("pollanswers-1")).click();
		//System.out.println(driver.findElement(By.id("pollanswers-1")).isSelected());
		Assert.assertFalse(driver.findElement(By.id("pollanswers-1")).isSelected());
		
		
		//count
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		
		
	}

}
