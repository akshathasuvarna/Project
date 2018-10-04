package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constants;
import generic.Data;
import pom.LoginPage;
import pom.Tab3;
import pom.WelcomePage;

public class Testcase9 implements Auto_constants{
	static {
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
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
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_T);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  r.keyRelease(KeyEvent.VK_T);
		
		  ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
			Thread.sleep(3000);
			 driver.switchTo().window(a.get(1));
			 Thread.sleep(3000);
			 driver.navigate().to("https://www.myntra.com/");
			 Tab3 t=new Tab3(driver);
			 t.log(driver);
			 t.logout();
			 driver.switchTo().window(a.get(0));
			 driver.navigate().refresh();
			 t.log(driver);
			 driver.close();
			 driver.quit();
			 
	} 
	
}
