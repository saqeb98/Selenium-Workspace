package selenium1;

import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		String value="./Software/geckodriver.exe";
		System.setProperty(key, value);
		@SuppressWarnings("unused")
		FirefoxDriver driver =new FirefoxDriver();
	}

}
