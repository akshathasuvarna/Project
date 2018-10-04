package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	@FindBy(xpath="//span[.='REMOVE']")
	private WebElement remove1;
	@FindBy(xpath="//button[.='REMOVE']")
	private WebElement remove2; 
	public Cart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void remove()
	{
		remove1.click();
	}
	public void remove_con()
	{
		remove2.click();
	}

}
