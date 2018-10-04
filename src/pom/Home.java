package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	@FindBy(xpath="//img[@class='image-image undefined image-hand']")
	private WebElement pic;
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void pic()
	{
		pic.click();
	}

}
