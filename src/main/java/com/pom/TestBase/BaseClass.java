package com.pom.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	protected static WebDriver driver;
	
	public void getDriver(String browserName,String... arguments) {
		
		if(browserName.equalsIgnoreCase(Constants.chromeBrowser)) {
			driver=new ChromeDriver(new OptionsFactory().chromeOptions());
		}
		else if(browserName.equalsIgnoreCase(Constants.edgeBrowser)) {
			driver=new EdgeDriver(new OptionsFactory().edgeOptions(arguments));
		}
		else if(browserName.equalsIgnoreCase(Constants.firefoxBrowser)) {
			driver=new FirefoxDriver(new OptionsFactory().firefoxOptions(arguments));
		}
		else {
			System.out.println(Constants.warningMassage);
			throw new IllegalArgumentException("Browser Name Invalid");
		}
		
	}
}
