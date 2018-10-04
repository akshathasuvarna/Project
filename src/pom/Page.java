package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	@FindBy(xpath="//div[.=' Edit Profile ']")
	private WebElement edit;
	@FindBy(xpath="//div[@class='desktop-userIconsContainer']")
	private WebElement log;
	@FindBy(xpath="(//div[@class='desktop-infoSection'])[3]")
	private WebElement gift;
	public Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void log(WebDriver driver) throws InterruptedException
	{
		//Actions a=new Actions(driver);
		//a.moveToElement(log).perform();
		Thread.sleep(3000);
		log.click();
	}
	public void edit()
	{
		edit.click();
	}
	public void gift()
	{
		gift.click();
	}
	
}
