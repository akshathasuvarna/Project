package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scroll_prod {
	@FindBy(xpath="(//img[@class='img-responsive'])[1]")
	private WebElement pic;
	@FindBy(xpath="(//span[.='save'])[1]")
	private WebElement save;
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconUser sprites-user']")
	private WebElement log;
	@FindBy(xpath="(//div[@class='desktop-infoSection'])[2]")
	private WebElement wish;
	
	
	public Scroll_prod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void pic(WebDriver driver) throws InterruptedException
	{
		Actions a=new Actions(driver);
		a.moveToElement(pic).perform();
		
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOf(pic));
	}
	public void save(WebDriver driver) throws InterruptedException
	{
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOf(save));
		
		save.click();
	}
	public void log(WebDriver driver)
	{
       Actions a=new Actions(driver);
       a.moveToElement(log).perform();
	}
	public void wishlist()
	{
		wish.click();
	}

}
