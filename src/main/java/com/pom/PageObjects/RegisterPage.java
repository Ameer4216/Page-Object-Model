package com.pom.PageObjects;

import org.openqa.selenium.By;

import com.pom.TestBase.BaseClass;
import com.pom.TestUtility.DriverHelper;

public class RegisterPage extends BaseClass {
	private By firstNameField = By.name("firstname");
	private By surNameField = By.name("lastname");
	private By mobileNumberField = By.xpath("//input[starts-with(@name,'reg_email')]");
	private By passwordField = By.xpath("//input[starts-with(@name,'reg_passwd')]");

	
	public void createNewAccount(String firstName,String lastName,String emailOrMoblieNum,String password) {
		enterfirstNameField( firstName);
		entersurNameField( lastName);
		entermobileNumberField(emailOrMoblieNum);
		enterpasswordField( password);
		
	}
	
	public void enterfirstNameField(String firstName) {
		DriverHelper.sendKeys(firstNameField, firstName);
	}

	public void entersurNameField(String lastName) {
		DriverHelper.sendKeys(surNameField, lastName);
	}

	public void entermobileNumberField(String emailOrMoblieNum) {
		DriverHelper.sendKeys(mobileNumberField, emailOrMoblieNum);
	}

	public void enterpasswordField(String password) {
		DriverHelper.sendKeys(passwordField, password);
	}
}
