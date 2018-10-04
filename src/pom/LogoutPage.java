package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	@FindBy(xpath="//div[@class='desktop-userIconsContainer']")
	private WebElement log;
	@FindBy(xpath="(//div[.=' Logout '])[1]")
	private WebElement logout;
	public LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void log(WebDriver driver)
	{
       Actions a=new Actions(driver);
       a.moveToElement(log).perform();;
       
	}
	public void logout()
	{
		logout.click();
	}

}
