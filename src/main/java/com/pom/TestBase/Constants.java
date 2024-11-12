package com.pom.TestBase;

import com.pom.TestUtility.PropertiesReader;

public class Constants {

	final public static int shortWait = 10;

	final public static int mediumWait = 20;

	final public static int longWait = 30;
	
	final public static String chromeBrowser = "chrome";
	
	final public static String firefoxBrowser = "firefox";
	
	final public static String edgeBrowser = "edge";
	
	final public static String headless = "--headless";
	
	final public static String incognito = "--incognito";
	
	final public static String notifications = "--disable-notifications";
	
	final public static String maximized = "start-maximized";
	
	final public static String screenshotPath = ".\\src\\test\\resources\\screenshots";
	
	final public static String reportsPath = ".\\src\\test\\resources\\reports";
	
	final public static String excelPath = "C:\\Users\\HP\\eclipse-workspace\\Pom\\src\\test\\resources\\excelsheets\\Sample.xlsx";
	
	final public static String pageURL = "https://www.facebook.com/";
	
	final public static String userName = "admin";
	
	final public static String passWord = "Admin@123";
	
	final public static String warningMassage="please check the Browser Configuration";
	
	final public static String getUserName() { 
		PropertiesReader property = new PropertiesReader(".\\login.properties");
	  return property.getProperty("userName");
	  }
	 final public static String getPassword() {
		 PropertiesReader property = new PropertiesReader(".\\login.properties");
		 return property.getProperty("password");
	 }
	final public static String getPageURL() {
		 PropertiesReader property = new PropertiesReader(".\\login.properties");
		 return property.getProperty("pageURL");
	 }
	final public static String getBrowser() {
		 PropertiesReader property = new PropertiesReader(".\\login.properties");
		 return property.getProperty("browser");
	 }
}
