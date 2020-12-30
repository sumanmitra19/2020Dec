package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Utility.BrowserFactory;
import Utility.ConfigDataProvider;
import Utility.Helper;

public class BaseClass {

	public WebDriver driver;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void suiteSetup()
	{
		config = new ConfigDataProvider();
	}
	
	@BeforeClass
	public void setUp()
	{
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getUrl());
	}
	
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.browserQuit(driver);
	}
	
	@AfterMethod
	public void failedTC(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			Helper.screenshotCapture(driver, result.getName());
		}
	}
	
}
