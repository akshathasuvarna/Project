package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	@FindBy(xpath="//input[@class='desktop-searchBar']")
	private WebElement search;
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")
	private WebElement searchbtn;
	@FindBy(xpath="(//img[@class='image-image undefined image-hand'])[1]")
	private WebElement img;
	@FindBy(xpath="//div[@class='desktop-userIconsContainer']")
	private WebElement log;
	//@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconUser sprites-user']")
	//private WebElement logo;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void srch(String product)
	{
		search.sendKeys(product);
	}
	public void sbtn()
	{
		searchbtn.click();
	}
	public void img(WebDriver driver)
	{
		WebDriverWait wd=new WebDriverWait(driver,15);
		wd.until(ExpectedConditions.visibilityOf(img));
		img.click();
	}
	
	

}
