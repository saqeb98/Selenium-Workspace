package excercise1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/demo.html");
		driver.findElement(By.xpath("//table[2]/tbody/tr[5]/td[2]/input")).click();
		
		//get text of particular table
		WebElement element=driver.findElement(By.xpath("//table[4]/tbody/tr[4]/td[2]"));
		System.out.println(element.getText());

	}

}
