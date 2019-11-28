package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.sakValut.pages.LoginPage;
import com.sakValut.utility.DriverTestCase;
import com.sakValut.utility.getDriver;

public class executeTest extends getDriver {
	
	 //WebDriver driver;
	LoginPage loginpage;

	
	@Test
	public  void LoginIntoApp(){
	   LoginPage loginpage=new LoginPage(driver);
	  loginpage.LoginApp("TLT511", "xW7Sxp");
	  System.out.println("Testing a code");
	}
	
}
