package testClass;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.Utility;
import java.awt.*;

public class BaseTestClass {
    public static WebDriver driver;
    Logger logger;
    public static Robot robot;
    public static Actions actions;
    public Utility utility;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void classLevelSetup() throws AWTException {
        logger = LogManager.getLogger(BaseTestClass.class);

        logger.info("setup() +");
        driver = new ChromeDriver();
        robot = new Robot();
        actions = new Actions(driver);
        utility = new Utility();
        driver.manage().window().maximize();
    	logger.info("setup() -");
    }

    @AfterClass
    public void tearDown() {    	
    	logger.info("tearDown() +");
        driver.quit();
        logger.info("tearDown() -");
    }
}