package com.naveenautomationlabs.AutomationFramework.Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.naveenautomationlabs.AutomationFramework.Utils.Utils;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class CustomListener extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// not implemented
		logger.info(
				"Test execution started for" + result.getMethod().getMethodName() + "..............................");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// not implemented

		logger.info("Test " + result.getMethod().getMethodName() + "success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// not implemented
		logger.info("Test " + result.getMethod().getMethodName() + "Failed" + "#########################");
		Utils.takeScreenShot(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// not implemented
		logger.info("Test " + result.getMethod().getMethodName() + "skiped" + "*************");
	}

}
