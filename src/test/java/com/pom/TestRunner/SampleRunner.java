package com.pom.TestRunner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pom.PageObjects.RegisterPage;
import com.pom.TestBase.BaseClass;
import com.pom.TestBase.Constants;
import com.pom.TestUtility.DriverHelper;
import com.pom.TestUtility.ExcelHelper;
import com.pom.TestUtility.ListenersHelper;

@Listeners(ListenersHelper.class)
public class SampleRunner extends BaseClass {

	RegisterPage registerPage;
	ExcelHelper excel;	

	@BeforeClass
	public void setup() {
		
		// ChromeOptions opt = new ChromeOptions();

		// opt.addArguments(Constants.headless);

		// driver = new ChromeDriver(opt);
		// driver = new ChromeDriver();

		getDriver(Constants.getBrowser(), Constants.incognito, Constants.maximized);
		DriverHelper.maximize();

		DriverHelper.implicitlyWait(2);

		DriverHelper.get(Constants.getPageURL());

		registerPage = new RegisterPage();
		excel= new ExcelHelper(Constants.excelPath,"Sheet1");

	}

	@Test(priority = 1)
	public void tc_001() {
		System.out.println(DriverHelper.getTitle());
	}

	@Test(priority = 2)
	public void tc_002() {
		System.out.println(DriverHelper.getCurrentUrl());

	}

	//dataProvider = "qadata", dataProviderClass = DataGenarator.class
	@Test(priority = 3)
	public void tc_003(String firstName, String lastName, String mobileNumber, String password) {
//		String value = excel.findValue(0, 0);
//		String value2 = excel.findValue(0, 1);
//		String value3 = excel.findValue(0, 2);
//		String value4 = excel.findValue(0, 3);
//		
		registerPage.createNewAccount("iejtu", "HWBF", "UESDGH", "SHBFHSB");

	}
	/*
	 * WebElement emailField = driver.findElement(By.id("email"));
	 * 
	 * WebElement passwordField = driver.findElement(By.id("pass"));
	 * 
	 * emailField.sendKeys(Constants.userName);
	 * 
	 * passwordField.sendKeys(Constants.passWord);
	 * 
	 * System.out.println("============================================");
	 * 
	 * String userName = Constants.getUserName();
	 * 
	 * String password = Constants.getPassword();
	 * 
	 * String pageURL = Constants.getPageURL();
	 * 
	 * System.out.println(userName);
	 * 
	 * System.out.println(password);
	 * 
	 * System.out.println(pageURL);
	 */

}
