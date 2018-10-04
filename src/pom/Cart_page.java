package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {
@FindBy(linkText="+Add items from wishlist")
private WebElement cart;
public Cart_page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void cart_pg()
{
	cart.click();
}
}
