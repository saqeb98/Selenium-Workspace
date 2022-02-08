import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		int passangerCount=5;
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='1 Adult']")).getText());
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();	
		}
		
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers-done-cta\"]")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='"+passangerCount+" Adults']")).getText());
		
		
		//DynamicDropDown
		
		driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]")).click();
		driver.findElement(By.xpath("//div[text()='Ajmer']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
					//PARENT								CHILD
		////div[@class="css-1dbjc4n r-19yat4t r-5l11ed"] //div[text()='Aurangabad']
	}

}
