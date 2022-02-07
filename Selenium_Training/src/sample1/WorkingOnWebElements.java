package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnWebElements 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement element=driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]"));
		element.sendKeys("Shoes");
		String text3=element.getText();
		System.out.println(text3);
		String text=element.getText();
		System.out.println(text);
		String text1=element.getAttribute("class");
		System.out.println(text1);
		
		
		
		//Suscribe Button
	/*	WebElement element1=driver.findElement(By.xpath("(//input[contains(@type,'button')])[1]"));
		String text2=element1.getText();
		System.out.println(text2);//get text
		element1.click();
		String text3=element1.getAttribute("id");
		System.out.println(text3);//get attribute of subscribe button
		driver.close();*/
		
		


	}

}
