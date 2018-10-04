package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[1]")
	private WebElement checkbox1;
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[11]")
	private WebElement checkbox2;
@FindBy(xpath="//img[@class='img-responsive']")
private WebElement img;
	@FindBy(xpath="(//span[.='Add to bag'])[1]")
	private WebElement addcart;
	@FindBy(xpath="(//button[@class='product-sizeButton'])[2]")
	private WebElement size;
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconBag sprites-bag']")
	private WebElement cart;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void brand()
	{
		checkbox1.click();
		
	}
	public void price()
	{
		checkbox2.click();
	}
	public void pic(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(img).perform();;
		
	}
	
	
	public void select()
	{
		size.click();
	}
	
	public void cart()
	{
		cart.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void add(WebDriver driver)
	{
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOf(addcart));
		addcart.click();
	}
	
	

}
