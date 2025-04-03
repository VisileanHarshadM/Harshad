package pageObjectModel.login;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.BasePOMClass;

public class PasswordLogin extends BasePOMClass {
    Logger logger;
    @FindBy(xpath = "//*[@id =\"password\"]")
    WebElement passwordField;
    @FindBy(css = ".blue.button")
    WebElement continueButton2;

    public PasswordLogin(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        logger = LogManager.getLogger(PasswordLogin.class);
    }

    public void setPasswordField(String password) {
        logger.info("setPasswordField() +");
        click(passwordField);
        sendKeys(passwordField, password);
        logger.info("setPasswordField() -");
    }

    public void clickContinueButton2() {
        logger.info("clickContinueButton2() +");
        click(continueButton2);
        logger.info("clickContinueButton2() -");
    }
}