package com.eCommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver)

	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(xpath="html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")
	@CacheLookup
	WebElement screenTitle;
	
	@FindBy(xpath="html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/strong[1]")
	@CacheLookup
	WebElement screenMessage;	
	

	@FindBy(xpath = "//input[@id='Email']")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(xpath = ".//input[@value='admin']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = ".//button[@type='submit']")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath = ".//a[contains(text(),'Logout')]")
	@CacheLookup
	WebElement logOut;
	
	
	public String getScreenTitle()
	{	
	return screenTitle.getText();	
	}
	
	public String getScreenMessage()
	{
	return screenMessage.getText();	
	}
	

	public void setUserName(String uname) throws Exception {
		txtUserName.clear();
		txtUserName.sendKeys(uname);

	}

	public void setPassword(String pwd) throws Exception {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);

	}

	public void clickSubmit() {

		btnLogin.click();

	}

	public void clickLogout()

	{

		logOut.click();

	}

}