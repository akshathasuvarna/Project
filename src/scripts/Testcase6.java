package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.html.Image;

import generic.Auto_constants;
import generic.Data;
import pom.Cartlogo;
import pom.HomePage;
import pom.LoginPage;
import pom.LogoutPage;
import pom.Pic;
import pom.Tab2_cart;
import pom.WelcomePage;

public class Testcase6 implements Auto_constants {
	static {
		System.setProperty(key, value);
	}


	public static void main(String[] args) throws AWTException, InterruptedException {
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
		Pic i=new Pic(driver);
		i.img(driver);
		i.addtobag();
		i.size();
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_T);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  r.keyRelease(KeyEvent.VK_T);
		 ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		
		 driver.switchTo().window(a.get(1));
		 driver.navigate().to("https://www.myntra.com/");
		 Cartlogo c=new Cartlogo(driver);
		 c.cart();
		 Tab2_cart t=new Tab2_cart(driver);
		 t.remove();
		 t.confirm();
		 driver.navigate().back();
		 driver.close();
		 driver.switchTo().window(a.get(0));
		 driver.navigate().refresh();
		 LogoutPage lp=new LogoutPage(driver);
		 lp.log(driver);
		 lp.logout();
		 driver.close();

	}

}
