package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pic {
	@FindBy(xpath="(//img[@class='img-responsive'])[1]")
	private WebElement img;
	@FindBy(xpath="(//span[.='Add to bag'])[1]")
	private WebElement add;
	@FindBy(xpath="//button[.='S']")
	private WebElement size;
	
	public Pic(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void img(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(img).perform();
	}
	public void addtobag()
	{
		add.click();
	}
	public void size()
	{
		size.click();
	}
	
	

}
