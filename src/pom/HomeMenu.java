package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.Data;

public class HomeMenu {
	@FindBy(linkText="Men")
	private WebElement drop;
	@FindBy(linkText="T-Shirts")
	private WebElement dropdwn;
	@FindBy(linkText="Home & Living")
	private WebElement drop2;
	@FindBy(linkText="Clocks")
	private WebElement opt; 
	public HomeMenu(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void dropdown(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(drop).perform();
	}
	public void drpclk()
	{
		dropdwn.click();
	}
	public void drop2(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(drop2).perform();
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOf(drop2));
		
	}
	public void option(WebDriver driver) throws InterruptedException
	{
		//WebDriverWait w=new WebDriverWait(driver,10);
		//w.until(ExpectedConditions.elementToBeClickable(opt));
		opt.click();
	}

}
