import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.navigate().refresh();
		//From
		driver.findElement(By.xpath("//h4[text()='From']/..//input[contains(@placeholder,'Any')]")).sendKeys("ban");
		driver.findElement(By.xpath("//p[contains(text(),'Bangalore, IN')]")).click();
		//To
		driver.findElement(By.xpath("//h4[text()='To']/..//input[contains(@placeholder,'Any')]")).sendKeys("mum");
		driver.findElement(By.xpath("//p[contains(text(),'Mumbai, IN')]")).click();
		
		//Depat On
		driver.findElement(By.cssSelector("div[class=\"flex flex-middle p-relative homeCalender\"]")).click();
		driver.findElement(By.xpath("//div[@aria-label=\"Sat Dec 11 2021\"]")).click();
		System.out.println(driver.findElement(By.xpath("//h4[text()='Depart on']/./../../..//div[@class=\"fs-2 c-inherit flex flex-nowrap\"]")).getText());
		
		
	}

}
