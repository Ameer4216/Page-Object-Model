package com.pom.TestBase;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OptionsFactory {

	
	public ChromeOptions chromeOptions(String... arguments) {
		return new ChromeOptions().addArguments(arguments);
	}
	
	public  EdgeOptions edgeOptions(String... arguments) {
		return new EdgeOptions().addArguments(arguments);
	}
	public FirefoxOptions firefoxOptions(String... arguments) {
		return new FirefoxOptions().addArguments(arguments);
	}
}
