package com.pluginlive;

import com.pluginlive.base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

import static com.pluginlive.base.BaseClass.driver;

public class ListenersExample extends BaseClass implements ITestListener {

    public ListenersExample() throws IOException {
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Execution commens");
        String testName = result.getMethod().getMethodName();
        System.out.println("Launching test sequence for: " + testName);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        String testName = result.getMethod().getMethodName();
        System.out.println("Test '" + testName + "' executed successfully.");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result.getMethod().getMethodName();
        System.out.println("Test '" + testName + "' failed:");
        try {
            screenshot(result.getMethod().getMethodName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Take screenshot
        if (driver instanceof TakesScreenshot) {
            TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
            File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshotFile, new File("screenshots/" + testName + "_failure.png"));
                System.out.println("Screenshot captured: screenshots/" + testName + "_failure.png");
            } catch (IOException e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
        }

        // Print stack trace
        Throwable exception = result.getThrowable();
        System.out.println("Error message: " + exception.getMessage());
        System.out.println("Stack trace:");
        exception.printStackTrace(System.out);
    }



    @Override
    public void onTestSkipped(ITestResult result) {
        String testName = result.getMethod().getMethodName();
        System.out.println("Test '" + testName + "' skipped:");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        String testName = result.getMethod().getMethodName();
        System.out.println("Test '" + testName + "' failed within success percentage:");
    }

    @Override
    public void onStart(ITestContext context) {
System.out.println("Initialization of test suite");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test suite conclusion");

    }
}
