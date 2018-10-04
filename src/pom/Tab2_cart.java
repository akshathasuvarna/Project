package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tab2_cart {
	@FindBy(xpath="//span[.='REMOVE']")
	private WebElement remove;
	@FindBy(xpath="//button[.='REMOVE']")
	private WebElement confirm;
	public Tab2_cart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void remove()
	{
		remove.click();
	}
	public void confirm()
	{
		confirm.click();
	}
	

}
