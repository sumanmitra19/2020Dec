package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BaseClass;
import Pages.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test
	public void loginApp()
	{
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.validLogin(config.getUsername(), config.getPassword());
	}
}
