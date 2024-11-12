package com.pom.TestUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenersHelper implements ITestListener {

	ExtentReports reports;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getName();
		test = reports.createTest(name);
		test.log(Status.INFO, "Test got Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Got Passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Got Failed");
		DriverHelper.getScreenShot("Fail");
		System.err.println("<<<<<<<<<<<<<<<<<<<<<<< This method got Failed !!! >>>>>>>>>>>>>>>>>>>>>");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Got Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		reports = ReportsHelper.generateReports();
	}

	@Override
	public void onFinish(ITestContext context) {

		reports.flush();
	}

}
