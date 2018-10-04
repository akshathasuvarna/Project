package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clock_opt {
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[1]")
	private WebElement check1;
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[2]")
	private WebElement check2;
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[3]")
	private WebElement check3;
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[4]")
	private WebElement check4;
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[5]")
	private WebElement check5;
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[6]")
	private WebElement check6;
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[7]")
	private WebElement check7;
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[8]")
	private WebElement check8;
	@FindBy(xpath="(//img[@class='img-responsive'])[1]")
	private WebElement pic;
	@FindBy(xpath="(//span[.='save'])[1]")
	private WebElement save;
	@FindBy(xpath="//div[@class='desktop-userIconsContainer']")
	private WebElement log;
	@FindBy(xpath="(//div[@class='desktop-infoSection'])[2]")
	private WebElement wish;
	
	
	public Clock_opt(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void checkbx1()
	{
		check1.click();
	}
	public void checkbx2()
	{
		check2.click();
	}
	public void checkbx3()
	{
		check3.click();
	}
	public void checkbx4()
	{
		check4.click();
	}
	public void checkbx5()
	{
		check5.click();
	}
	public void checkbx6()
	{
		check6.click();
	}
	public void checkbx7()
	{
		check7.click();
	}
	public void checkbx8()
	{
		check8.click();
	}
	public void pic(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(pic).perform();
	}
	public void save()
	{
		save.click();
	}
	public void log(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(log).perform();
	}
	public void wish()
	{
		wish.click();
	}

}
