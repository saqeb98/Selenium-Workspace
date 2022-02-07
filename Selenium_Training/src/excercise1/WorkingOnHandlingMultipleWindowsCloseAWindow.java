package excercise1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnHandlingMultipleWindowsCloseAWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		
		Set<String> win=driver.getWindowHandles();
		for (String string : win)
		{
			String s1="Tech Mahindra";
			String title=driver.switchTo().window(string).getTitle();
			String act=title.replace(" ", "");
			String exp=s1.replace(" ", "");
			if (act.equalsIgnoreCase(exp))
			{
				System.out.println(title);
				driver.close();
				
			}
		}
/*driver.switchTo.window(title)
 * if(driver.getTitle().equals(s1);
 *           driver.close();
 */
	}

}
