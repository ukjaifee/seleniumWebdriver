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
	  System.out.println("Right now switching to master, let me work on master first then I will switch back dev and get dev chages");
	  System.out.println("Test");
	  
	  
	  
	  
	}
	
}
