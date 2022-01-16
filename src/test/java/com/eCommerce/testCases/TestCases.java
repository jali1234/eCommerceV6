package com.eCommerce.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.eCommerce.pageObjects.AddNewCustomer;
import com.eCommerce.pageObjects.LoginPage;

public class TestCases extends BaseClass {

	@Test
	public void tc01_loginTest() throws IOException, Exception {
		driver.get(baseURL);
		logger.info("The URL Browsed");		
		Thread.sleep(6000);
		captureScreenshot(driver, "TC01.ss");
		LoginPage lp = new LoginPage(driver);
		lp.getScreenTitle();
		String actualTitle=lp.getScreenTitle();
		lp.getScreenMessage();
		String actualMessage=lp.getScreenMessage();
		lp.setUserName(username);
		lp.setPassword(password);
		System.out.println("User has entered User Name and Password successfully");
		logger.info("User has entered User Name and Password successfully");
		captureScreenshot(driver, "TC01.ss");
		lp.clickSubmit();
		System.out.println("User has Logged in successfully");
		//logger.info("User has Logged in successfully");
		captureScreenshot(driver, "TC01.ss");		
		Assert.assertEquals(actualTitle,"Admin area demo");
		System.out.println("ScreenTitle is as expected");
		Assert.assertEquals(actualMessage,"Welcome, please sign in!");	
		System.out.println("ScreenMessage is as expected");
		Thread.sleep(10000);
		lp.clickLogout();
		logger.info("UserLoggedOut");
		
	}
	
	@Test
	public void tc02_AddNewCustomer() throws Exception {

		driver.get(baseURL);
		Thread.sleep(6000);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		//logger.info("User Logged in successfully");
		AddNewCustomer anc = new AddNewCustomer();		
		//anc.navigateAddNewCustomer();
		Thread.sleep(4000);
		//logger.info("User Clicked Customer Link");
		Thread.sleep(4000);
		//anc.navigateAddNewCustomersLink();
		Thread.sleep(4000);
		//logger.info("User Clicked Customer Link");
		anc.clickAddNewButton();
		anc.addEmail("test.@gmail.com");
		anc.addPassword("Test12345");
		anc.addFirstName("Test");
		anc.addLastName("User");
		anc.addDateOfBirth("08/08/1982");
		anc.addCompanyName("IBM India Pvt LTD");
		// anc.addNewsLater("NEWSLATER");
		anc.addAdminComment("Test Automation");
		anc.clickLogout();

	}

}
