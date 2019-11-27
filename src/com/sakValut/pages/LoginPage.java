package com.sakValut.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sakValut.utility.DriverHelper;


public class LoginPage {
	
	/*@FindBy(xpath="//input[@name='empNo']")
	private WebElement unTextBox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pwTextBox;
	
	

	@FindBy(xpath="//input[@type='submit']")
	private WebElement login;*/	
	
	@FindBy(id="edit-name")
	WebElement userName;
	
	@FindBy(id="edit-pass")
	WebElement ppassword;
	
	@FindBy(id="edit-submit")
	WebElement loginButton;

	 WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		//super(driver);
		
		PageFactory.initElements(driver, this);
	}
	
	
	public  HomePage LoginApp(String username, String password){
	
		userName.sendKeys(username);
		ppassword.sendKeys(password);
		loginButton.click();
		
		return PageFactory.initElements(driver, HomePage.class);
		
	}
	
	
	
	
	
}
