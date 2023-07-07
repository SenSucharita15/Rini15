package com.naveenautomationlabs.AutomationFramework.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class Utils extends TestBase {

	public static void takeScreenShot(String testName) {
		// time stamp

		String timeStamp = new SimpleDateFormat("dd.mm.YYYY.HH.mm.ss").format(new Date());
		// System.out.println(timeStamp);
		// take a screenshot
		File screenshotFile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);

		// save the screenshot
		try {
			// FileUtils.copyFile(screenshotFile, new File(
			// "C:\\Users\\santa\\git_test\\git_test_sucharita\\workspace\\AutomationFramework\\FailedTestScreenShots"));

			// relative path
			FileUtils.copyFile(screenshotFile,
					new File("./FailedTestScreenShots\\" + "_" + "testName" + "_" + timeStamp + ".jpg"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}

