package utilities.Listeners;

import com.aventstack.extentreports.Status;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import testClass.BaseTestClass;
import utilities.ExtentReports.ExtentReportManager;
import java.util.Objects;
import static utilities.ExtentReports.ExtentReportTestManager.getTest;

public class TestListener extends BaseTestClass implements ITestListener {
    Logger logger;

    public TestListener() {
        logger = LogManager.getLogger(TestListener.class);
    }
    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        logger.info("================================================");
        logger.info("onStart(ITestContext iTestContext) +");
        iTestContext.setAttribute("WebDriver", driver);
        logger.info("onStart(ITestContext iTestContext) -");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        logger.info("onFinish(ITestContext iTestContext) +");
        //Do tier down operations for ExtentReports reporting!
        ExtentReportManager.extentReports.flush();
        logger.info("onFinish(ITestContext iTestContext) -");
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        logger.info(getTestMethodName(iTestResult) + " onTestStart(ITestResult iTestResult) ......");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        logger.info(getTestMethodName(iTestResult) + " Test is succeed.");
        //ExtentReports log operation for passed tests.
        getTest().log(Status.PASS, "Test passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        logger.info(getTestMethodName(iTestResult) + " Test is failed.");

        Object testClass = iTestResult.getInstance();
        WebDriver driver = ((BaseTestClass) testClass).getDriver();
        //Take base64Screenshot screenshot for extent reports
        String base64Screenshot =
                "data:image/png;base64," + ((TakesScreenshot) Objects.requireNonNull(driver)).getScreenshotAs(OutputType.BASE64);

        //ExtentReports log and screenshot operations for failed tests.
        getTest().log(Status.FAIL, "Test Failed",
                getTest().addScreenCaptureFromBase64String(base64Screenshot).getModel().getMedia().get(0));
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        logger.info(getTestMethodName(iTestResult) + " Test is skipped.");
        //ExtentReports log operation for skipped tests.
        getTest().log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        logger.info("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
    }
}