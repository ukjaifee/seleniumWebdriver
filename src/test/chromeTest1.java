package test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sakValut.utility.getDriver;

public class chromeTest1 {
	
   @BeforeTest
   public static void DockerScale() throws Exception, Exception{
	   
	   StartDocker.startfile();
   }
   
   @AfterTest
   public static void DokcerDeleteFile() throws IOException, Exception{
	   
	   StopDocker.stopfile();
	   
   }
	
	
	@Test
	public void test1() throws MalformedURLException
	{
		
		
		//URL url=new URL("http://localhost:4444/wb/hub");
		 DesiredCapabilities cap=DesiredCapabilities.chrome();
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
	}

}
