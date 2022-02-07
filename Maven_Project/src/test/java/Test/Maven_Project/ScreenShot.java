package Test.Maven_Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Test.Maven_Project.UtilityScreenShot;
public class ScreenShot extends UtilityScreenShot {
	static WebDriver driver;
	@Test
	public void tc01() throws IOException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		takeScrrenShot(driver, "linkopening");


}
}
