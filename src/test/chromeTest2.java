package test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.sakValut.utility.getDriver;

public class chromeTest2 {
	

	
	
	@Test
	public void test2() throws MalformedURLException
	{
		
		
		//URL url=new URL("http://localhost:4444/wb/hub");
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
		
		
	}

}
