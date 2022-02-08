import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GreenCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String[] itemsNeeded = { "Brocolli", "Cucumber", "Beetroot" };
		addItems(driver, itemsNeeded);
		driver.findElement(By.xpath("//img[@alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"action-block\"]/button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@class=\"promoCode\"]")).sendKeys("rahulshetty");
		driver.findElement(By.xpath("//button[@class=\"promoBtn\"]")).click();
		
		//String verify=w.wait(ExpectedConditions.visibilityOfElementLocated(null)).findElement(By.xpath("//span[@class=\"promoInfo\"]")).getText();
		//d.until(ExpectedConditions.elementToBeClickable
		
		
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i <= products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			// Brocolli - 1 Kg
			// Brocolli , 1 Kg
			String formattedName = name[0].trim(); // to remove spaces

			List<String> itemsNeededList = Arrays.asList(itemsNeeded); // converting array to listof array
			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}
}
