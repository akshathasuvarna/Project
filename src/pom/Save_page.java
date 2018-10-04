package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Save_page {
	@FindBy(linkText="CONTINUE SHOPPING")
	private WebElement save;
	


public Save_page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
public void save()
{
	save.click();
}
}