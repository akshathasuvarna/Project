package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Giftcard3 {
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="cemail")
	private WebElement conemail;
	@FindBy(xpath="//span[.='1,000']")
	private WebElement amount;
	@FindBy(id="to")
	private WebElement tomail;
	@FindBy(xpath="//a[@class='user']")
	private WebElement log;
	@FindBy(xpath="//div[@class='button']")
	private WebElement logout;
	public Giftcard3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void email(String to)
	{
		email.sendKeys(to);
	}
	public void cmail(String con) {
		conemail.sendKeys(con);
	}
	public void amt()
	{
		amount.click();
	}
	public void tomail(String To)
	{
		tomail.sendKeys(To);

	}
	public void log(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(log).perform();
	}
	public void logout()
	{
		logout.click();
	}
	

}
