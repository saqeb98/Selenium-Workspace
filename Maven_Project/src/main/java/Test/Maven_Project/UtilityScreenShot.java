package Test.Maven_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityScreenShot {

	
	public static void takeScrrenShot(WebDriver driver,String screenshot) throws IOException {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("./ScreenShot/"+screenshot+".png"));
		System.out.println("screenshot captured");
}
}