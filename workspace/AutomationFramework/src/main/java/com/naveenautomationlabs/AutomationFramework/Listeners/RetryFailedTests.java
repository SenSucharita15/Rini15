package com.naveenautomationlabs.AutomationFramework.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class RetryFailedTests extends TestBase implements IRetryAnalyzer {
	int maxcounter = 2;
	int cnt = 0;

	@Override
	public boolean retry(ITestResult result) {

		logger.info("Retrying failed test ############" + result.getMethod().getMethodName() + "for" + cnt + "times");
		if (cnt < maxcounter) {
			cnt++;
			return true;
		}

		return false;
	}

}
