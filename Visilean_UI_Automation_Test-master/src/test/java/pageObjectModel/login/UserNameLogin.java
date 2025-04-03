package pageObjectModel.login;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.BasePOMClass;

public class UserNameLogin extends BasePOMClass {
    Logger logger;
    @FindBy(id = "username")
    WebElement userNameField;
    @FindBy(xpath = "//*[@id=\"myemailform\"]/button")
    WebElement continueButton1;
    
    public UserNameLogin(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        logger = LogManager.getLogger(UserNameLogin.class);
    }
    
    public void setUserName(String userName) {
        logger.info("setUserName(String userName) +");
        sendKeys(userNameField, userName);
        logger.info("setUserName(String userName) -");
    }

    public void clickContinueButton1() {
        logger.info("clickContinueButton1() +");
        click(continueButton1);
        logger.info("clickContinueButton1() -");
    }
}