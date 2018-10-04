package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic.Auto_constants;
import generic.Data;
import pom.Home;
import pom.LoginPage;
import pom.LogoutPage;
import pom.Scroll_prod;
import pom.WelcomePage;
import pom.Wishlist;

import org.openqa.selenium.JavascriptExecutor;

public class Testcase7 implements Auto_constants{
	static {
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WelcomePage w=new WelcomePage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		w.logbtn(driver);
		w.login();
		  String us = Data.abc(excelpath, "Sheet1", 1, 0);
		  String pwd=Data.abc(excelpath,"Sheet1", 1, 1);
		  LoginPage l=new LoginPage(driver);
		  l.email(us);
		  l.pass(pwd);
		  l.login();
		  JavascriptExecutor js = (JavascriptExecutor) driver; 
		  Thread.sleep(3000);
		  js.executeScript("window.scrollBy(0,750)");
		  Home h=new Home(driver);
		  h.pic();
		  js.executeScript("window.scrollBy(0,2000)");
		  js.executeScript("window.scrollBy(0,-1900)");
		  Scroll_prod s=new Scroll_prod(driver);
		  Thread.sleep(3000);
		  s.pic(driver);
		  s.save(driver);
		  s.log(driver);
		  s.wishlist();
		  Wishlist wh=new Wishlist(driver);
		  wh.close();
		  LogoutPage lp=new LogoutPage(driver);
		  lp.log(driver);
		  lp.logout();
		  driver.close();
		  
		  
   

}
}