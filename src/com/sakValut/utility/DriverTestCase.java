package com.sakValut.utility;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.sakValut.pages.HomePage;
import com.sakValut.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverTestCase {
	private static boolean killedProcessInitially;
	public static  WebDriver driver=null;
	public String browser = "";
	PropertyReader propertyReader = new PropertyReader();
	private LoginPage LoginPage;

	//@SuppressWarnings("deprecation")
	@BeforeClass
	public WebDriver getDriver() {
		boolean retryAgain = true;
		int retryCount = 1;
		int maxRetryCounts = 3;
		this.browser = propertyReader.readApplicationFile("Browser");
		while (retryAgain && retryCount++ <= maxRetryCounts) {
			if (this.browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				// this.killGeckoDriver();
				// this.killFirefoxBrowser();
				// this.initializeFirefox();
			}

		/*	else if (this.browser.equalsIgnoreCase("chrome")) {

				WebDriverManager.chromedriver().setup();
				this.killChromeDriver();
				this.killChromeBrowser();
				this.initializeChrome();
				DriverTestCase.driver=new ChromeDriver();
			  	DesiredCapabilities cap=DesiredCapabilities.chrome();
		           cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		           System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		           DriverTestCase.driver=new ChromeDriver(cap);

			}*/
			
			  else if(browser.equalsIgnoreCase("chrome"))
		       {
		    	   DesiredCapabilities cap=DesiredCapabilities.chrome();
		           cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		           System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		    	   driver=new ChromeDriver(cap);
		       }

			else if (this.browser.equalsIgnoreCase("IE")) {

			}

		}
		
	     return DriverTestCase.driver;

	}

	private void killChromeDriver() {
		try {
			if (DriverTestCase.killedProcessInitially == false) {
				DriverTestCase.killedProcessInitially = true;
				Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
			}
		} catch (final IOException e) {
			// logger.debug("Chrome Driver Server kill failed with error: " +
			// e.getMessage());
		}
	}

	private void killChromeBrowser() {
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
		} catch (final IOException e) {
			// logger.debug("Chrome Browser kill failed with error: " +
			// e.getMessage());
		}
	}

	private void initializeChrome() {
		try {
			final ChromeOptions options = new ChromeOptions();
			this.driver = new ChromeDriver(options);
		} catch (Exception e) {

		}
	}
	
	/*public LoginPage login(){
		 DriverTestCase.driver.get("https://www.google.com/");  
		 DriverTestCase.driver.manage().window().maximize();
		return PageFactory.initElements(driver, LoginPage.class);
		
		
	}*/
	
	
	
	public LoginPage login() throws InterruptedException {
		//System.out.println("Open application url: " + DriverTestCase.url);
		this.initializePageHelpersAndOtherRequiredObjects();
		DriverTestCase.driver.navigate().to("https://www.google.com/");
		return PageFactory.initElements(DriverTestCase.driver, LoginPage.class);
	}
	
	private void initializePageHelpersAndOtherRequiredObjects() {
		this.LoginPage = new LoginPage(DriverTestCase.driver);
	}

	public WebDriver getWebDriver() {
		return this.driver;
	}

/*	@AfterClass
	public void tearDown() {
		driver.quit();
	}*/
	
	public static void main(String[] args) {
		DriverTestCase obj=new DriverTestCase();
		obj.getDriver();
	}
}
