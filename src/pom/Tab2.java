package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tab2 {
	@FindBy(xpath="(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[1]")
	private WebElement size;
	@FindBy(xpath="//div[@class='pdp-add-to-bag pdp-button pdp-flex pdp-center']")
	private WebElement cart;
	@FindBy(xpath="//div[@class='pdp-add-to-bag pdp-button pdp-flex pdp-center']")
	private WebElement tocart;
	public Tab2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void size()
	{
		size.click();
	}
	public void add()
	{
		cart.click();
	}
	public void tocart()
	{
		tocart.click();
	}
	
	

}
