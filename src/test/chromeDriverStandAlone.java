package test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sakValut.utility.getDriver;

public class chromeDriverStandAlone {
	

	
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		//URL url=new URL("http://localhost:4444/wb/hub");
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
	}

}
