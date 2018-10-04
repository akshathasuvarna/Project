package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.Auto_constants;
import generic.Data;
import pom.Cart_logo;
import pom.Cart_page;
import pom.HomePage;
import pom.LoginPage;
import pom.LogoutPage;
import pom.Save_page;
import pom.WelcomePage;

public class Testcase2 implements Auto_constants {
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
		  String product=Data.abc(excelpath, "Sheet1", 1, 3);
		  LoginPage l=new LoginPage(driver);
		  l.email(us);
		  l.pass(pwd);
		  l.login();
		  Cart_logo cl=new Cart_logo(driver);
		  Thread.sleep(3000);
		  cl.cart();
		Cart_page cp=new Cart_page(driver);
		cp.cart_pg();
		Save_page s=new Save_page(driver);
		s.save();
		LogoutPage lp=new LogoutPage(driver);
		lp.log(driver);
		lp.logout();
	driver.close();
	

	}

}
