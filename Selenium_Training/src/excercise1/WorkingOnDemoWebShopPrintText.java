package excercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnDemoWebShopPrintText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		Thread.sleep(2000);
		WebElement sortby=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		String text=sortby.getText();
		System.out.println(text);
	}

}
