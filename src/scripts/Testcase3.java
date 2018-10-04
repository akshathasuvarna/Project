package scripts;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constants;
import generic.Data;
import pom.HomePage;
import pom.LoginPage;
import pom.LogoutPage;
import pom.Product_page2;

import pom.Tab2;
import pom.WelcomePage;

public class Testcase3 implements Auto_constants {
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
		  String product=Data.abc(excelpath, "Sheet3", 1, 0);
		  LoginPage l=new LoginPage(driver);
		  l.email(us);
		  l.pass(pwd);
		  l.login();
		  HomePage h=new HomePage(driver);
		  Thread.sleep(3000);
		  h.srch(product);
		  h.sbtn();
		  Product_page2 p=new Product_page2(driver);
		  p.sort(driver);
		  p.sortbtn();
		  p.pic();
		 Tab2 pg=new Tab2(driver);
		  ArrayList<String> tab2 = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tab2.get(1));
		  pg.size();
		  pg.add();
		  driver.close();
		  driver.switchTo().window(tab2.get(0));
		  LogoutPage lp=new LogoutPage(driver);
		  lp.log(driver);
		  lp.logout();
		  driver.close();
		  
	}


}
