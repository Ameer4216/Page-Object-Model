package com.pom.TestUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.pom.TestBase.Constants;

public class ReportsHelper {
	static ExtentReports extentReports;
	static ExtentSparkReporter sparkReporter;
	
	
	public static ExtentReports generateReports() {
		 sparkReporter = new ExtentSparkReporter(Constants.reportsPath+"//extent"+System.currentTimeMillis()+".html");
		 sparkReporter.config().setDocumentTitle("Facebook Report");
		 sparkReporter.config().setReportName("Facebook - Automation Results");
		 sparkReporter.config().setTheme(Theme.DARK);
		 sparkReporter.config().setTimeStampFormat("dd:MM:yy - hh:mm:ss, EEE");
		 
		 extentReports = new ExtentReports();
		 extentReports.attachReporter(sparkReporter);
		 return extentReports;
	}

}
