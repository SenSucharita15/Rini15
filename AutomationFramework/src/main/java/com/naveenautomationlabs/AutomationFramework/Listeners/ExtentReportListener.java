package com.naveenautomationlabs.AutomationFramework.Listeners;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportListener extends TestListenerAdapter {

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	@Override
	// Generate a timestamp
	public void onStart(ITestContext testContext) {
		// m_testContexts.add(testContext);
		String timestamp = new SimpleDateFormat("dd.mm.yyyy.HH.mm.ss").format(new Date());
		// name of the report
		String repName = "report" + timestamp + ".html";
		// save the report
		htmlReporter = new ExtentHtmlReporter(
				"C:\\Users\\santa\\git_test\\git_test_sucharita\\workspace\\AutomationFramework\\Reports./Reports"
						+ repName);
		// loaded the config file
		htmlReporter.loadXMLConfig("./extent-config.html");

		// additional format

		htmlReporter.config().setDocumentTitle("Munni");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat(timestamp);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		// addition of information
		extent.setSystemInfo("Name of tester", "rini");
		extent.setSystemInfo("Env", "Production");
		extent.setSystemInfo("website", "https://naveenautomationlabs.com/opencart/index.php?route=common/home");

	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		test = extent.createTest(tr.getMethod().getMethodName());
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));

	}

	@Override
	public void onTestFailure(ITestResult tr) {

		test = extent.createTest(tr.getMethod().getMethodName());
		test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));

	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		test = extent.createTest(tr.getMethod().getMethodName());
		test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.YELLOW));

	}

	@Override
	public void onFinish(ITestContext testContext) {
//report generation
		extent.flush();
	}

}
