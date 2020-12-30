package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}

	
	@FindBy(id="email") WebElement email;
	@FindBy(how=How.ID, using="pass") WebElement password;
	@FindBy(how=How.XPATH, using="//button[@name='login' or @type='submit']") WebElement loginButton;
	
	
	public void validLogin(String uname, String pwd)
	{
		email.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();
	}
}
