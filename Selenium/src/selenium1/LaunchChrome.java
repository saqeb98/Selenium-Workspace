package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome 
{
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./Software/chromeDriver.exe";
		System.setProperty(key, value);
		@SuppressWarnings("unused")
		ChromeDriver driver=new ChromeDriver();
	} 
	
}
//System.setProperty("webdriver.chrome.driver","./Software/chromeDriver.exe");