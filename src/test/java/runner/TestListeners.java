package runner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;


public class TestListeners implements ITestListener {
    WebDriver driver =null;

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test Started");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test Success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("***** Error "+result.getName()+" test has failed *****");
        String methodName=result.getName().toString().trim();
        ITestContext context = result.getTestContext();
        WebDriver driver = (WebDriver)context.getAttribute("driver");
        takeScreenShot(methodName, driver);
    }

    public void takeScreenShot(String methodName, WebDriver driver) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            FileUtils.copyFile(scrFile, new File("C:\\Users\\PRADYUMNA\\IdeaProjects\\FriendSurance\\Screen" + methodName + ".png"));
            System.out.println("***Placed screen shot in " + "C:\\Users\\PRADYUMNA\\IdeaProjects\\FriendSurance\\Screen" + " ***");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Test Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("Test finished");
    }
}
