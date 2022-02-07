package excercise1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnHTMLcheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/demo.html");
		List<WebElement> element1=driver.findElements(By.xpath("//table[2]/tbody/tr"));
		
		for(int i=2;i<element1.size()-1;i++) 
		{
			List<WebElement> element2=driver.findElements(By.xpath("//table[2]/tbody/tr["+i+"]/td[2]/input"));
			element2.clear();
		//	element2.c
		}
	}

}









