package demoWebShopTestCase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import UtilityFunctions.TestDataLibrary;
import pom_Structure.WorkingOnHmePageDemoWebShop;
import pom_Structure.WorkingOnRegisterDemoWebShop;

public class RegisterTC extends TestDataLibrary
{
	static WebDriver driver;
	@Test(dataProvider="data")
	public void tc01(String First ,String Last, String Email,String Pwd,String ConPwd) throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		WorkingOnHmePageDemoWebShop wp=new WorkingOnHmePageDemoWebShop(driver);
		driver.get(wp.config1("URL"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		wp.register();
		
		
		
		
		WorkingOnRegisterDemoWebShop ws=new WorkingOnRegisterDemoWebShop(driver);

		ws.gender();
		ws.firstName(First);
		ws.lastname(Last);
		ws.email(Email);
		ws.pwd(Pwd);
		ws.conpwd(ConPwd);
		ws.registerbutton();
		
		driver.close();
	}
	
	@DataProvider(name="data")
	public Object[][] registerDatalibray() throws IOException
	{
		String sheetname="Register";
		Object[][] data=testData(sheetname);
		
		
		return data;	
	}
}
