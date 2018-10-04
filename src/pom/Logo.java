package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logo {
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconUser sprites-user']")
	private WebElement logo;
	@FindBy(xpath="(//div[@class='desktop-infoSection'])[1]")
	private WebElement order;
	
	public Logo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void logo(WebDriver driver) throws InterruptedException
	{
		Actions a=new Actions(driver);
				a.moveToElement(logo).perform();
				WebDriverWait w=new WebDriverWait(driver,10);
				w.until(ExpectedConditions.visibilityOf(logo));
	}
	public void order(WebDriver driver) throws InterruptedException
	{
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOf(order));
		order.click();
	}

}
