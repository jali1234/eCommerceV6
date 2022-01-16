package com.eCommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {

	WebDriver ldriver;

	public void LoginPage(WebDriver rdriver)

	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]/p[1]")
	@CacheLookup
	WebElement CustomerLink;

	@FindBy(xpath = "//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/p[1]")
	@CacheLookup
	WebElement CustomersLink;

	@FindBy(xpath = "//body/div[3]/div[1]/form[1]/div[1]/div[1]/a[1]")
	@CacheLookup
	WebElement AddNewButton;

	@FindBy(xpath = "html[1]/body[1]/div[3]/div[1]/form[1]/div[1]/h1[1]")
	@CacheLookup
	WebElement PageName;

	@FindBy(xpath = ".//div[@id='customer-info']/div[2]/div[1]/div[2]/input[1]")
	@CacheLookup
	WebElement EmailID;

	@FindBy(xpath = ".//input[@autocomplete='new-password']")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = ".//div[@id='customer-info']/div[2]/div[3]/div[2]/input[1]")
	@CacheLookup
	WebElement FirstName;

	@FindBy(xpath = ".//div[@id='customer-info']/div[2]/div[4]/div[2]/input[1]")
	@CacheLookup
	WebElement LastName;

	@FindBy(xpath = ".//input[@type='date']")
	@CacheLookup
	WebElement Gender;

	@FindBy(xpath = ".//div[@id='customer-info']/div[2]/div[6]/div[2]/span[1]/span[1]/input[1]")
	@CacheLookup
	WebElement DateOfBirth;

	@FindBy(xpath = ".//div[@id='customer-info']/div[2]/div[7]/div[2]/input[1]")
	@CacheLookup
	WebElement CompanyName;

	@FindBy(xpath = ".//div[@id='customer-info']/div[2]/div[9]/div[2]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement NewsLater;

	@FindBy(xpath = ".//div[@id='customer-info']/div[2]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement CustomerRole;

	@FindBy(xpath = ".//div[@id='customer-info']/div[2]/div[11]/div[2]/select[1]")
	@CacheLookup
	WebElement ManagerOfVendor;

	@FindBy(xpath = ".//div[@id='customer-info']/div[2]/div[13]/div[2]/textarea[1]")
	@CacheLookup
	WebElement AdminComment;

	@FindBy(xpath = ".//input[@type='submit']")
	@CacheLookup
	WebElement Submit;

	@FindBy(xpath = ".//*[contains(text(),'Logout')]")
	@CacheLookup
	WebElement logOut;

	public void navigateAddNewCustomer() {

		CustomerLink.click();
	}

	public void navigateAddNewCustomersLink() {

		CustomersLink.click();
	}

	public void clickAddNewButton() {

		AddNewButton.click();
	}

	public void pageName() {
		PageName.getText();

	}

	public void addEmail(String emid) {

		EmailID.sendKeys(emid);

	}

	public void addPassword(String pwd) {

		Password.sendKeys(pwd);

	}

	public void addFirstName(String firstname) {

		FirstName.sendKeys(firstname);

	}

	public void addLastName(String lastname) {

		LastName.sendKeys(lastname);

	}

	public void selectGender() {

		Gender.click();

	}

	public void addDateOfBirth(String dob) {

		DateOfBirth.sendKeys(dob);

	}

	public void addCompanyName(String cmpnyname) {

		CompanyName.sendKeys(cmpnyname);

	}

	public void addNewsLater(String nwsltr) {

		NewsLater.sendKeys(nwsltr);

	}

	public void addCustomerRole(String cr) {

		CustomerRole.sendKeys(cr);

	}

	public void addManagerOfVendor(String vendrmgr) {

		ManagerOfVendor.sendKeys(vendrmgr);

	}

	public void addAdminComment(String admcomment) {

		AdminComment.sendKeys(admcomment);

	}

	public void submit() {

		Submit.click();

	}

	public void clickLogout()

	{

		logOut.click();

	}

}
