package pageObjectModel.login;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.BasePOMClass;
import utilities.GlobalStrings;
import java.util.List;

public class WorkSpaceSelection extends BasePOMClass {
    Logger logger;
    @FindBy(id = "linkTable")
    WebElement workSpaceTable;
    @FindBy(id = "visileanBrand")
    WebElement workspaceSwitcher;
    @FindBy(id = "customerNameTooltip")
    WebElement workSpaceLabel;
    List<WebElement> wsRow;
	
	public WorkSpaceSelection(WebDriver driver) {
		super(driver);
        PageFactory.initElements(this.driver, this);
        logger = LogManager.getLogger(WorkSpaceSelection.class);
	}
	
	public void selectWorkSpace() throws InterruptedException {
        logger.info("selectWorkSpace() +");
        hover(workspaceSwitcher);
        Thread.sleep(1000);
        logger.info("workspace Name: "+workSpaceLabel.getText());
        if(!workSpaceLabel.getText().equalsIgnoreCase(GlobalStrings.workSpace)) {
            logger.info("not in selenium automation workspace ...");
            click(workspaceSwitcher);

            logger.info("workspace listing ...");
            wsRow = waitForElementToBeClickable(workSpaceTable).findElements(By.tagName("tr"));

            for(int i =0; i < wsRow.size(); i++) {
                List<WebElement> wsCol = wsRow.get(0).findElements(By.tagName("td"));
                for (int j=0,k=1; j < wsCol.size(); j++,k++) {
                    actions.moveToElement(wsCol.get(j)).perform();
                    Thread.sleep(500);
                    WebElement workSpaceName = driver.findElement(By.xpath("//*[@id" +
                            "=\"list\"]/td["+k+"]/a[2]"));
                    if (workSpaceName.getText().equalsIgnoreCase(GlobalStrings.workSpace)) {
                        wsCol.get(j).click();
                        break;
                    }
                }
            }

            logger.info("Login into Selenium Automation workspace ...");
            PasswordLogin passwordLogin = new PasswordLogin(driver);
            passwordLogin.setPasswordField(GlobalStrings.password);
            passwordLogin.clickContinueButton2();
        }
        logger.info("selectWorkSpace() -");
	}
}