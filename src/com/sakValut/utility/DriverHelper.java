package com.sakValut.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DriverHelper {

	
	protected WebDriverWait wait;
	protected WebDriver driver;
	protected PropertyReader propertyReader;
	private String time;
	private int TIME_OUT;
	private String pageLoadTime;
	private int PAGE_LOAD_TIME_OUT;
	
	// Declare objects
    public DriverHelper(WebDriver webdriver) {
        this.driver = webdriver;
        this.propertyReader = new PropertyReader();
        this.time = this.propertyReader.readApplicationFile("Time_Out");
        this.TIME_OUT = Integer.parseInt(this.time);
        this.pageLoadTime = this.propertyReader.readApplicationFile("Page_Load_Time_Out");
        this.PAGE_LOAD_TIME_OUT = Integer.parseInt(this.pageLoadTime);
        this.wait = new WebDriverWait(this.driver, this.TIME_OUT);
    }
	
}
