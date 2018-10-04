package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Giftcard1 {
	@FindBy(xpath="//button[.='SEND GIFT CARD']")
	private WebElement sendgift;
	public Giftcard1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendgift()
	{
		sendgift.click();
	}

}
