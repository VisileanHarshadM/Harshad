package pageObjectModel;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Utility;
import java.time.Duration;

public class BasePOMClass {
    public WebDriver driver;
    public Actions actions;
    public Utility utility;
    JavascriptExecutor js;
    WebDriverWait wait;
    Logger logger;

    public BasePOMClass(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        utility = new Utility();
        js = (JavascriptExecutor) driver;

        logger = LogManager.getLogger(BasePOMClass.class);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void click(WebElement element) {
        waitForElementToBeClickable(element).click();
        logger.info("click(WebElement element) ...");
    }

    public void doubleClick(WebElement element) {
        waitForElementToBeClickable(element);
        actions.moveToElement(element)
               .doubleClick()
               .build()
               .perform();
        logger.info("doubleClick(WebElement element) ...");
    }

    public void hover(WebElement element) {
        waitForVisibilityOfElement(element);
        actions.moveToElement(element)
               .build()
               .perform();
        logger.info("hover(WebElement element) ...");
    }

    public void contextClick(WebElement element) {
        waitForElementToBeClickable(element);
        actions.contextClick(element)
               .build()
               .perform();
        logger.info("contextClick(WebElement element) ...");
    }

    public void dragAndDrop(WebElement source, WebElement destination, int xOffset, int yOffset) {
        actions.clickAndHold(source)
               .moveToElement(destination, xOffset, yOffset)
               .release()
               .build()
               .perform();
        logger.info("dragAndDrop(WebElement source, WebElement destination, int xOffset, int yOffset) ...");
    }

    public void sendKeys(String text) {
        actions.sendKeys(text).build().perform();
        logger.info("sendKeys(String text) ...");
    }

    public void sendKeys(WebElement element, String text) {
        waitForElementToBeClickable(element).sendKeys(text);
        logger.info("sendKeys(WebElement element, String text) ...");
    }

    public String getText(WebElement element) {
        logger.info("getText(WebElement element) ...");
        return waitForVisibilityOfElement(element).getText();
    }

    public void selectAllText() {
        actions.keyDown(Keys.CONTROL)
               .sendKeys("a")
               .keyUp(Keys.CONTROL)
               .build()
               .perform();
        logger.info("selectAllText() ...");
    }

    public void clearAllText() {
        actions.keyDown(Keys.BACK_SPACE)
               .keyUp(Keys.BACK_SPACE)
               .build()
               .perform();
        logger.info("clearAllText()  ...");
    }

    public void pressEnter() {
        actions.keyDown(Keys.ENTER)
               .keyUp(Keys.ENTER)
               .build()
               .perform();
        logger.info("pressEnter() ...");
    }

    public void pressEscape() {
        actions.keyDown(Keys.ESCAPE)
               .keyUp(Keys.ESCAPE)
               .build()
               .perform();
        logger.info("pressEscape() ...");
    }

    public WebElement waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        logger.info("waitForElementToBeClickable(WebElement element) ...");
        return element;
    }

    private WebElement waitForVisibilityOfElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        js.executeScript("arguments[0].scrollIntoView();", element);
        logger.info("waitForVisibilityOfElement(WebElement element) ...");
        return element;
    }
}