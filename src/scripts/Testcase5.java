package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constants;
import generic.Data;
import pom.Giftcard1;
import pom.Giftcard2;
import pom.Giftcard3;
import pom.LoginPage;
import pom.Page;
import pom.WelcomePage;

public class Testcase5 implements Auto_constants {
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
		  String to=Data.abc(excelpath, "Sheet5", 1, 0);
		  String con=Data.abc(excelpath, "Sheet5", 1, 1);
		  String To=Data.abc(excelpath, "Sheet5", 1, 1);
		  LoginPage l=new LoginPage(driver);
		  l.email(us);
		  l.pass(pwd);
		  l.login();
		Page p=new Page(driver);
		p.log(driver);
		p.gift();
		Giftcard1 g=new Giftcard1(driver);
		g.sendgift();
		Thread.sleep(3000);
		Giftcard2 g2=new Giftcard2(driver);
		g2.birth();
		g2.next();
		Giftcard3 g3=new Giftcard3(driver);
		g3.email(to);
		
		g3.cmail(con);
		g3.amt();
		g3.tomail(To);
		g3.log(driver);
		g3.logout();
		driver.close();
		

	}

}
