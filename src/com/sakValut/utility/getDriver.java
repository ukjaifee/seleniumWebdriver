package com.sakValut.utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import com.sakValut.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getDriver {
	private static boolean killedProcessInitially;

	public String browser = "";
	PropertyReader propertyReader = new PropertyReader();
	private LoginPage LoginPage;
	protected static WebDriver driver;
	
	ConstantVariables constantvariables;

	@BeforeClass
	public static WebDriver setup() {

		killChromeDriver();
		killChromeBrowser();
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver", ConstantVariables.chromeDriver);
		 driver = new ChromeDriver(cap);
        driver.manage().window().maximize();		 
		driver.navigate().to(ConstantVariables.appURL);
		return driver;

	}

	private static void killChromeDriver() {
		try {
			if (getDriver.killedProcessInitially == false) {
				getDriver.killedProcessInitially = true;
				Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
			}
		} catch (final IOException e) {
			// logger.debug("Chrome Driver Server kill failed with error: " +
			// e.getMessage());
		}
	}

	private static void killChromeBrowser() {
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
		} catch (final IOException e) {
			// logger.debug("Chrome Browser kill failed with error: " +
			// e.getMessage());
		}
	}

	public static void main(String[] args) {
		getDriver obj = new getDriver();
		obj.setup();

	}

}
