package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="email")
	private WebElement username;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(xpath="//button[.='Log in']")
	private WebElement login;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void email(String us)
	{
		username.sendKeys(us);
	}
	public void pass(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void login()
	{
		login.click();
		
	}
}
