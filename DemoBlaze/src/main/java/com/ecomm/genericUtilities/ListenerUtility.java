package com.ecomm.genericUtilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerUtility extends BaseClass implements ITestListener {

	@Override
	public void onStart(ITestContext result) {
		extentTest = extentReports.createTest(result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getName();
		extentTest.log(Status.FAIL, methodName + "is failed");

		TakesScreenshot ts = (TakesScreenshot) sdriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		extentTest.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));
		File dest = new File("./screenshots/" + methodName + jutils.getLocalDateTime() + ".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
