package pageObjectModel.tasks;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonTasksScenarios extends BaseTaskScenarios {
    Logger logger;
    @FindBy(css = "[data-testid='second_level_group_1']")
    WebElement group1SecondLevel;
    @FindBy(css = "[data-testid='third_level_group_1']")
    WebElement group1ThirdLevel;
    @FindBy(xpath = "(//span[@class='SchedulerTask_event-title-text__LilkG'])[2]")
    WebElement designTask2ToOperate;
    @FindBy(xpath = "//p[text()='Design']")
    WebElement taskTypeDesignQuickProPanel;
    @FindBy(xpath = "//div[text()='Design']")
    WebElement taskTypeDesignDetailPropPanel;
    @FindBy(xpath = "(//span[@class='SchedulerTask_event-title-text__LilkG'])[6]")
    WebElement constructionTask2ToOperate;
    @FindBy(xpath = "//p[text()='Construction']")
    WebElement taskTypeConstructionQuickProPanel;
    @FindBy(xpath = "//div[text()='Construction']")
    WebElement taskTypeConstructionDetailPropPanel;

    public CommonTasksScenarios(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        logger = LogManager.getLogger(CommonTasksScenarios.class);
    }

    public void selectTasksSecondLevelZone() throws InterruptedException {
        logger.info("selectTasksSecondLevelZone() +");
        driver.navigate().refresh();
        Thread.sleep(500);
        selectTasks("04 Selected", group1SecondLevel);
        logger.info("selectTasksSecondLevelZone() -");
    }

    public void selectTasksThirdLevelZone() throws InterruptedException {
        logger.info("selectTasksThirdLevelZone() +");
        selectTasks("08 Selected", group1ThirdLevel);
        logger.info("selectTasksThirdLevelZone() -");
    }

    public void moveMultipleTasks(String direction) throws InterruptedException {
        logger.info("moveMultipleTasks(String direction) +");
        moveTasks("Multiple", direction, group1ThirdLevel);
        logger.info("moveMultipleTasks(String direction) -");
    }

    public void taskTypeToConstructionQuickAdvPropPanel() throws InterruptedException {
        logger.info("changeTaskTypeToConstruction() +");
        changeTaskType(designTask2ToOperate, "Quick Advance Property Panel", taskTypeConstructionQuickProPanel);
        logger.info("changeTaskTypeToConstruction() -");
    }

    public void taskTypeToDesignQuickAdvPropPanel() throws InterruptedException {
        logger.info("changeTaskTypeToDesign() +");
        changeTaskType(constructionTask2ToOperate, "Quick Advance Property Panel", taskTypeDesignQuickProPanel);
        logger.info("changeTaskTypeToDesign() -");
    }

    public void taskTypeToConstructionDetailedAdvPropPanel() throws InterruptedException {
        logger.info("changeTaskTypeToConstruction() +");
        changeTaskType(constructionTask2ToOperate, "Detailed Advance Property Panel", taskTypeConstructionDetailPropPanel);
        logger.info("changeTaskTypeToConstruction() -");
    }

    public void taskTypeToDesignDetailedAdvPropPanel() throws InterruptedException {
        logger.info("changeTaskTypeToDesign() +");
        changeTaskType(designTask2ToOperate, "Detailed Advance Property Panel", taskTypeDesignDetailPropPanel);
        logger.info("changeTaskTypeToDesign() -");
    }
}