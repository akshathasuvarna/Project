package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Giftcard2 {
	@FindBy(xpath="(//div[.='Birthday'])[1]")
      private WebElement birthday;
	@FindBy(xpath="//button[.='NEXT']")
	private WebElement next;
	public Giftcard2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void birth()
	{
		birthday.click();
	}
	public void next()
	{
		next.click();
	}
}
