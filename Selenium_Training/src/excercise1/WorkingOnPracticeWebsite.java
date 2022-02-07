package excercise1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WorkingOnPracticeWebsite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.qaclickacademy.com/");

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");	
		//System.out.println(driver.getTitle());


		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		//radio button

		
		WebElement sugg=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		Actions act=new Actions(driver);
		act.moveToElement(sugg).click().sendKeys("india").click().build().perform();
		Thread.sleep(2000);
		WebElement sugg2=driver.findElement(By.xpath("(//div[text()='India'])[1]"));
		act.moveToElement(sugg2).click().build().perform();
		
		//Dynamic dropdown







		WebElement drop=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dropdown=new Select(drop);
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Option2");
		
		//Dropdown





		//driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		//single check box
		Thread.sleep(2000);

		List<WebElement> checkbox=driver.findElements(By.xpath("//input[contains(@value,'option')]"));
		for (WebElement webElement : checkbox){
			webElement.click();
		}
		
		//multiple check box


		Thread.sleep(2000);
		
		String parentWindow=driver.getWindowHandle();
		
		
		WebElement newWindow=driver.findElement(By.xpath("//button[@id='openwindow']"));
		newWindow.click();
		System.out.println(newWindow.getText());

		Set<String> childwindow=driver.getWindowHandles();

		for (String string : childwindow) {
			driver.switchTo().window(string);
			if (driver.getTitle().contains("QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy")){
				driver.findElement(By.xpath("//a[contains(text(),'Courses')][1]")).click();
				Thread.sleep(5000);
				driver.close();
			}
		}
		
		//close a new window


		driver.switchTo().window(parentWindow);


		Thread.sleep(5000);
		WebElement newTab=driver.findElement(By.xpath("//a[@id='opentab']"));
		newTab.click();
		Set<String> childTab=driver.getWindowHandles();
		for (String tab : childTab) {
			driver.switchTo().window(tab);
			if (driver.getTitle().contains("Rahul Shetty Academy")){
				driver.findElement(By.xpath("//a[@class='theme-btn register-btn']")).click();
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		//close a tab

		driver.switchTo().window(parentWindow);



		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//input[@id='name']"))).click().sendKeys("25rw").build().perform();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(By.xpath("//input[@id='alertbtn']"))).click().build().perform();
		Thread.sleep(2000);
		Alert alt =driver.switchTo().alert();
		alt.accept();
		//alert handling


		Thread.sleep(2000);
		List<WebElement> table=driver.findElements(By.xpath("(//table)[1]/tbody/tr"));
		for (int i = 2; i <=table.size(); i++){
			WebElement pricecol=driver.findElement(By.xpath("(//table)[1]/tbody/tr["+i+"]/td[3]"));
			System.out.println(pricecol.getText());
		}

		//multiple table




		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Reload']"))).click().build().perform();


			Thread.sleep(2000);
		driver.close();
	}

}
