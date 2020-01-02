package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class firefoxStandAlone {
	
	
	

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		//URL url=new URL("http://localhost:4444/wb/hub");
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
	}
	

}
