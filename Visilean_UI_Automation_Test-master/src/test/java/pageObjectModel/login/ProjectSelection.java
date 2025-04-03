package pageObjectModel.login;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.BasePOMClass;
import java.util.List;

public class ProjectSelection extends BasePOMClass {
    Logger logger;
    WebElement eachProject;
    @FindBy(xpath = "//div[@class=\"col-sm-6 col-md-4 col-lg-3\"]")
    WebElement projectNamePath;
    @FindAll({@FindBy(xpath = "//div[@class=\"col-sm-6 col-md-4 col-lg-3\"]")})
    List<WebElement> allProjects;

	public ProjectSelection(WebDriver driver) {
		super(driver);
        PageFactory.initElements(this.driver, this);
        logger = LogManager.getLogger(ProjectSelection.class);
	}
	
	public void selectProject(String projectName) throws InterruptedException {
        logger.info("selectProject(String projectName) +");
        waitForElementToBeClickable(projectNamePath);
        for(int i = 1; i <= allProjects.size(); i++) {
            eachProject = driver.findElement(By.xpath("//div[@class=\"col-sm-6 col-md-4 col-lg-3\"][" + i + "]/div/div[2]/div/h4"));
            if(getText(eachProject).equalsIgnoreCase(projectName)) {
                click(eachProject);
                break;
            }
        }
        Thread.sleep(1000);
        logger.info("selectProject(String projectName) -");
	}
}