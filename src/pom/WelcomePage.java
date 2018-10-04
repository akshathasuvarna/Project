package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	@FindBy(xpath="//div[@class='desktop-userIconsContainer']")
	private WebElement log;
	@FindBy(xpath="//a[.='login']")
	private WebElement logbtn;
	
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void logbtn(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(log).perform();
		
	}
	public void login()
	{
		logbtn.click();
	}
	
	

}
