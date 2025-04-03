package pageObjectModel.landingPage;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.BasePOMClass;

public class LandingPage extends BasePOMClass {
    Logger logger;
    @FindBy(css = "[data-testid='scratch_button']")
    WebElement scratchButton;

    public LandingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        logger = LogManager.getLogger(LandingPage.class);
    }

    public void clickScratchButton() {
        logger.info("clickScratchButton() +");
        click(scratchButton);
        logger.info("clickScratchButton() -");
    }
}