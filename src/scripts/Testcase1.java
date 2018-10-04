package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic.Auto_constants;
import generic.Data;
import pom.Cart;
import pom.HomeMenu;
import pom.HomePage;
import pom.LoginPage;
import pom.LogoutPage;
import pom.ProductPage;
import pom.WelcomePage;

public class Testcase1 implements Auto_constants  {
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
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		w.login();
		  String us = Data.abc(excelpath, "Sheet1", 1, 0);
		  String pwd=Data.abc(excelpath,"Sheet1", 1, 1);
		  String product=Data.abc(excelpath, "Sheet1", 1, 3);
		  LoginPage l=new LoginPage(driver);
		  l.email(us);
		  l.pass(pwd);
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  l.login();
		 /* HomePage h=new HomePage(driver);
		  h.srch(product);
		  h.sbtn();*/
		  HomeMenu hm=new HomeMenu(driver);
		  hm.dropdown(driver);
		  Thread.sleep(3000);
		  hm.drpclk();
		  ProductPage p=new ProductPage(driver);
		//  p.brand();
		 // p.price();
		 // Thread.sleep(10000);
		  p.pic(driver);
		  Thread.sleep(5000);
		  p.add(driver);
		  Thread.sleep(3000);
		  p.select();
		  p.cart();
		  Cart c=new Cart(driver);
		  c.remove();
		  c.remove_con();
		  driver.navigate().back();
		  LogoutPage lg=new LogoutPage(driver);
		  lg.log(driver);
		  lg.logout();
		  driver.close();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		

	}

}
