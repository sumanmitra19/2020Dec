package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	
	public static void screenshotCapture(WebDriver driver, String screenshotName)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String destination = "./Screenshot" + screenshotName + ".png";
		File dest = new File(destination);
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			System.out.println("Exception message is : " + e.getMessage());
		}
	}
}
