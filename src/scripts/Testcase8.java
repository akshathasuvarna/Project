package scripts;

import java.time.Clock;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constants;
import generic.Data;
import pom.Clock_opt;
import pom.HomeMenu;
import pom.LoginPage;
import pom.LogoutPage;
import pom.WelcomePage;
import pom.Wishlist;

public class Testcase8 implements Auto_constants {
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
		  Thread.sleep(3000);
		  HomeMenu hm=new HomeMenu(driver);
		  hm.drop2(driver);
		  hm.option(driver);
		  Clock_opt c=new Clock_opt(driver);
		  c.checkbx1();
		  c.checkbx2();
		  c.checkbx3();
		  c.checkbx4();
		  c.checkbx5();
		  c.checkbx6();
		  c.checkbx7();
		  c.checkbx8();
		  c.pic(driver);
		  c.save();
		  c.log(driver);
		  c.wish();
		  Wishlist ws=new Wishlist(driver);
		  ws.bag();
		  ws.btn();
		  ws.done();
		  ws.cart();
		  driver.navigate().back();
		  LogoutPage lp=new LogoutPage(driver);
		  lp.log(driver);
		  lp.logout();
		  driver.close();
		
	}
}
