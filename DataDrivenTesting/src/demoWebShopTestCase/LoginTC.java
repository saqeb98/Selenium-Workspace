package demoWebShopTestCase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import UtilityFunctions.TestDataLibrary;
import pom_Structure.WorkingOnHmePageDemoWebShop;
import pom_Structure.WorkingOnLoginPageDemoWebShop;

public class LoginTC extends TestDataLibrary {
	static WebDriver driver;
	@Test(dataProvider="data")
	public void tc01(String Email,String Pwd) throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		WorkingOnHmePageDemoWebShop wp=new WorkingOnHmePageDemoWebShop(driver);
		driver.get(wp.config1("URL"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	driver.manage().window().maximize();
		wp.login();
		
		WorkingOnLoginPageDemoWebShop ls=new WorkingOnLoginPageDemoWebShop(driver);
		
		ls.emailtext(Email);
		ls.password(Pwd);
		ls.loginfield();
		
		
		driver.close();
		
		
		
	}
	
	
/*	
	@Test(dataProvider="data")
		public void tc02(String Email,String Pwd) {
		WorkingOnLoginPageDemoWebShop ls=new WorkingOnLoginPageDemoWebShop(driver);
		
		ls.emailtext(Email);
		ls.password(Pwd);
		ls.loginfield();
		
		
		driver.close();
	}
	
	*/
	@DataProvider(name="data")
	public Object[][] testDataOfLogin() throws IOException
	{
		String sheetname="Login";
		Object[][] data1=testData(sheetname);
		
		return data1;
	}
	
}

