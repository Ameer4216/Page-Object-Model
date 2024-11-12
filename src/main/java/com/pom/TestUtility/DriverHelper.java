package com.pom.TestUtility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.pom.TestBase.BaseClass;
import com.pom.TestBase.Constants;

public class DriverHelper extends BaseClass {
	static Select select;

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(Constants.longWait));
	}
	public static void implicitlyWait(int wait) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
	}

	public static void get(String pageURL) {
		driver.get(pageURL);
	}

	public static String getTitle() {
		return driver.getTitle();
	}

	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	

	public static void getScreenShot(String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File screenshotTo = new File(Constants.screenshotPath+"//"+fileName+System.currentTimeMillis()+".png");
		try {
			FileHandler.copy(screenshotAs, screenshotTo);
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}

	}

	public static void sendKeys(By locator, String value) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(value);
	}

	public static void click(By locator) {
		WebElement element = driver.findElement(locator);
		element.click();
	}

	public static void clear(By locator) {
		WebElement element = driver.findElement(locator);
		element.clear();
	}
	
	public static void getIntoFrame(int index) {
		driver.switchTo().frame(index);
	}
	public static void getIntoFrame(String nameOrld) {
		driver.switchTo().frame(nameOrld);
	}
	public static void getIntoFrame(By locator) {
		WebElement element = driver.findElement(locator);
		driver.switchTo().frame(element);
	}
	public static void leaveFrame() {
		driver.switchTo().defaultContent();
	}
	
	public static void scrollToEnd() {
		JavascriptExecutor script=(JavascriptExecutor)driver;
		script.executeScript("window.scrollBy(0,document.body.scrollHeight");
	}
	public static void scrollingDown(int Xaxis,int yaxis) {
		JavascriptExecutor script=(JavascriptExecutor)driver;
		script.executeScript("window.scrollBy("+Xaxis+","+yaxis+")");
	}
	public static void scrollingUp(int xaxis,int yaxis)
	{
	JavascriptExecutor script=(JavascriptExecutor)driver;
	script.executeScript("window.scrollBy("+xaxis+",-"+yaxis+")");
	}
	
	
	public static void selectByIndex(By locator, int index) {
		WebElement element = driver.findElement(locator);
		select = new Select(element);
		select.selectByIndex(index);
	}

	public static void selectByValue(By locator, String value) {
		WebElement element = driver.findElement(locator);
		select = new Select(element);
		select.selectByValue(value);
	}

	public static void selectByVisibleText(By locator, String text) {
		WebElement element = driver.findElement(locator);
		select = new Select(element);
		select.selectByVisibleText(text);
	}
}
