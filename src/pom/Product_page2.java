package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_page2 {
	@FindBy(xpath="//div[@class='sort-sortBy']")
	private WebElement sort;
	@FindBy(xpath="(//label[@class='sort-label '])[1]")
	private WebElement sortbtn;@FindBy(xpath="(//img[@class='img-responsive'])[1]")
	private WebElement img;
	public Product_page2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sort(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(sort).perform();
	}
	public void sortbtn()
	{
		sortbtn.click();
	}
public void pic()
{
	img.click();
}
}
