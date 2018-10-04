package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit {
	@FindBy(xpath="//div[.='Change password']")
	private WebElement change;
	@FindBy(id="cur-password")
	private WebElement old;
	@FindBy(id="rp-password")
	private WebElement newpass;
	@FindBy(id="confirm-password")
	
	private WebElement conpass;
	@FindBy(id="change-submit")
	private WebElement confirm;
	@FindBy(xpath="//span[@class='pic header-sprite icon-user']")
	private WebElement log;
	@FindBy(xpath="(//div[.='Logout'])[1]")
	private WebElement logout;
	public Edit(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void edit()
	{
		change.click();
	}
	public void old(String oldpass)
	{
		old.sendKeys(oldpass);
	}
	public void newpass(String pass)
	{
		newpass.sendKeys(pass);
	}
	public void conpass(String con)
	{
		conpass.sendKeys(con);
	}
	public void confirm()
	{
		confirm.click();
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
