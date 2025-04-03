package testClass.landingPage;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectModel.landingPage.LandingPage;
import testClass.BaseTestClass;
import testClass.login.CommonLoginTest;
import java.lang.reflect.Method;
import static utilities.ExtentReports.ExtentReportTestManager.startTest;

public class LandingPageTest extends BaseTestClass {
    CommonLoginTest commonLoginTest;
    LandingPage landingPage;
    Logger logger;

    public LandingPageTest() {
        logger = LogManager.getLogger(LandingPageTest.class);
    }

    @BeforeMethod
    public void methodLevelSetup() {
        commonLoginTest = new CommonLoginTest();
        landingPage = new LandingPage(driver);
    }

    @Test(description = "Login")
    public void login(Method method) throws InterruptedException {
        logger.info("login(Method method) +");
        startTest(method.getName(), "Login process");
        commonLoginTest.visiLeanCommonLogin();
        logger.info("login(Method method) -");
    }
    @Test(priority = 1, description = "Scratch button")
    public void scratchButton(Method method) throws InterruptedException {
        logger.info("scratchButton(Method method) +");
        startTest(method.getName(), "Scratch button click");
        landingPage.clickScratchButton();
        Thread.sleep(1000);
        logger.info("scratchButton(Method method) -");
    }
}
