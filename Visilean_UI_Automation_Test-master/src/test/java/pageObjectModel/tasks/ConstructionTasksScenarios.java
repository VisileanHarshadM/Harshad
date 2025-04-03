package pageObjectModel.tasks;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GlobalStrings;

public class ConstructionTasksScenarios extends BaseTaskScenarios {
    Logger logger;
    @FindBy(xpath = "//div[@id='CONSTRUCTION']")
    WebElement sourceConstructionTaskIcon;
    @FindBy(css = "[data-testid='default_level_zone_7']")
    WebElement zone7DefaultLevel;
    @FindBy(css = "[data-testid='default_level_zone_8']")
    WebElement zone8DefaultLevel;
    @FindBy(xpath = "(//span[@class='SchedulerTask_event-title-text__LilkG'])[5]")
    WebElement constructionTask1;
    @FindBy(xpath = "(//div[contains(@class,'SchedulerTask_event-container__Igl7B')])[6]")
    WebElement constructionTask2ToOperate;
    @FindBy(xpath = "(//span[@class='SchedulerTask_event-title-text__LilkG'])[6]")
    WebElement constructionTask2;
    @FindBy(xpath = "(//span[@class='SchedulerTask_event-title-text__LilkG'])[7]")
    WebElement constructionTask3;
    @FindBy(xpath = "(//span[@class='SchedulerTask_event-title-text__LilkG'])[8]")
    WebElement constructionTask4;

    public ConstructionTasksScenarios(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        logger = LogManager.getLogger(ConstructionTasksScenarios.class);
    }

    public void createConstructionTask(String using) throws InterruptedException {
        logger.info("createConstructionTask(String using) +");
        switch (using) {
            case "without basic details":
                createTaskWithOutBasicProperty(sourceConstructionTaskIcon, zone7DefaultLevel, 360, 20);
                logger.info("without basic details ...");
                break;

            case "with basic details":
                createTaskWithBasicProperty(sourceConstructionTaskIcon, zone7DefaultLevel, 360, 20,
                        GlobalStrings.constructionTaskName1, trade1InTradeDropDown, GlobalStrings.constructionTaskDuration1,
                        GlobalStrings.constructionTaskResources1, GlobalStrings.constructionTaskDescription1);
                logger.info("with basic details -");
                break;
        }
        logger.info("createConstructionTask(String using) -");
    }

    public void constructionTask1DetailsVerify() throws InterruptedException {
        logger.info("designTaskDetailsVerify() +");
        clickOnTaskCard(constructionTask1);
        verifyTaskZoneName(GlobalStrings.constructionTaskZoneName);
        verifyTaskName(GlobalStrings.constructionTask1Name);
        verifyTaskStatus(GlobalStrings.unassignedTaskStatus);
        verifyTaskType(GlobalStrings.constructionTaskType);
        verifyTaskOwner(GlobalStrings.noOwner);
        verifyTaskTrade(GlobalStrings.noTrade);
        closePropertyPanel();
        pressEscape();
        Thread.sleep(500);
        logger.info("designTaskDetailsVerify() -");
    }

    public void constructionTask2DetailsVerify() throws InterruptedException {
        logger.info("designTask2DetailsVerify() +");
        clickOnTaskCard(constructionTask1);
        verifyTaskZoneName(GlobalStrings.constructionTaskZoneName);
        verifyTaskName(GlobalStrings.constructionTaskName1);
        verifyTaskStatus(GlobalStrings.unassignedTaskStatus);
        verifyTaskType(GlobalStrings.constructionTaskType);
        verifyTaskOwner(GlobalStrings.noOwner);
        closePropertyPanel();
        pressEscape();
        Thread.sleep(500);
        logger.info("designTask2DetailsVerify() -");
    }

    public void updateTaskName() throws InterruptedException {
        logger.info("updateTaskName() +");
        taskNameUpdate("basic Property Panel", constructionTask2, GlobalStrings.constructionTask1NameBasicPropPanel);
        taskNameUpdate("top main property panel", constructionTask2, GlobalStrings.constructionTask1NameTopMainPropPanel);
        taskNameUpdate("bottom main Property Panel", constructionTask2, GlobalStrings.constructionTask1NameMainPropPanel);
        logger.info("updateTaskName() -");
    }

    public void updateTaskTrade() throws InterruptedException {
        logger.info("updateTaskTrade() +");
        taskTradeUpdate("basic Property Panel", constructionTask2, trade2InTradeDropDown);
        taskTradeUpdate("already present", constructionTask2, trade3InTradeDropDown);
        taskTradeUpdate("top main property panel", constructionTask2, trade1InTradeDropDown);
        taskTradeUpdate("bottom main Property Panel", constructionTask2, trade2DropDownOptionMainProPanel);
        logger.info("updateTaskTrade() -");
    }

    public void updateTaskDuration() throws InterruptedException {
        logger.info("updateTaskDuration() +");
        taskDurationUpdate("basic Property Panel", constructionTask2, GlobalStrings.constructionTask1DurationBasicPropPanel);
        taskDurationUpdate("advance Property Panel", constructionTask2, GlobalStrings.emptyString);
        logger.info("updateTaskDuration() -");
    }

    public void updateTaskResources() throws InterruptedException {
        logger.info("updateTaskResources() +");
        taskResourcesUpdate(constructionTask2, GlobalStrings.constructionTask1ResourcesBasicPropPanel);
        logger.info("updateTaskResources() -");
    }

    public void updateTaskDescription() throws InterruptedException {
        logger.info("updateTaskDescription() +");
        taskDescriptionUpdate("basic Property Panel", constructionTask2, GlobalStrings.constructionTaskDescriptionBasicPropPanel);
        taskDescriptionUpdate("main Property Panel", constructionTask2, GlobalStrings.constructionTaskDescriptionMainPropPanel);
        logger.info("updateTaskDescription() -");
    }

    public void selectTasksDefaultLevelZone() throws InterruptedException {
        logger.info("selectTasksDefaultLevelZone() +");
        selectTasks("02 Selected", zone7DefaultLevel);
        logger.info("selectTasksDefaultLevelZone() -");
    }

    public void zoneDuplicateWithTasksDefaultLevelZone() throws InterruptedException {
        logger.info("zoneDuplicateWithTasksDefaultLevelZone() +");
        zoneDuplicateWithTasks("default Level zone", zone7DefaultLevel);
        logger.info("zoneDuplicateWithTasksDefaultLevelZone() -");
    }

    public void zoneDeleteWithTasksDefaultLevel() throws InterruptedException {
        logger.info("zoneDeleteWithTasksDefaultLevel() +");
        zoneDeleteWithTasks("default Level", zone8DefaultLevel);
        logger.info("zoneDeleteWithTasksDefaultLevel() -");
    }

    public void moveSingleTask(String direction) throws InterruptedException {
        logger.info("moveSingleTask(String direction) +");
        moveTasks("Single", direction, constructionTask2ToOperate);
        logger.info("moveSingleTask(String direction) -");
    }

    public void copySingleTask() throws InterruptedException {
        logger.info("copySingleTask(String using) +");
        copyTasks("Single", "headerCopyButton", constructionTask2ToOperate);
        copyTasks("Single","keyboard", constructionTask2ToOperate);
        logger.info("copySingleTask(String using) -");
    }

    public void changeTaskPriority() throws InterruptedException {
        logger.info("changeTaskPriority() +");
        changeTaskPriority(constructionTask2, "Quick Advance Property Panel", lowPriorityQuickAdvPropPanel);
        changeTaskPriority(constructionTask2, "Quick Advance Property Panel", mediumPriorityQuickAdvPropPanel);
        changeTaskPriority(constructionTask2, "Quick Advance Property Panel", highPriorityQuickAdvPropPanel);

        changeTaskPriority(constructionTask2, "Detailed Advance Property Panel", lowPriorityDetailedAdvPropPanel);
        changeTaskPriority(constructionTask2, "Detailed Advance Property Panel", mediumPriorityDetailedAdvPropPanel);
        changeTaskPriority(constructionTask2, "Detailed Advance Property Panel", highPriorityDetailedAdvPropPanel);
        logger.info("changeTaskPriority() -");
    }

    public void changeZoneSingleTask() throws InterruptedException {
        logger.info("changeZoneSingleTask() +");
        changeZone("Single", constructionTask2, "Quick Advance Property Panel", GlobalStrings.constructionTaskGroupToSearch, zoneCheckBox1ConstructionTask);
        changeZone("Single", constructionTask4, "Detailed Advance Property Panel", GlobalStrings.constructionTaskGroupToSearch, zoneCheckBox2ConstructionTask);
        logger.info("changeZoneSingleTask() -");
    }

    public void allocateOwnerSingleTask() throws InterruptedException {
        logger.info("allocateOwnerSingleTask() +");
        allocateOwner("Single", constructionTask2, "Assigned to quick Prop Panel", assignedToOwner1QuickProPanel);
        allocateOwner("Single", constructionTask3, "Assign Owner quick Prop Panel", assignOwner2QuickProPanel);
        allocateOwner("Single", constructionTask4, "Owner detailed prop panel", chooseOwner3DetailedPropPanel);
        logger.info("allocateOwnerSingleTask() -");
    }

    public void verifyTaskStatus() throws InterruptedException {
        logger.info("verifyTaskStatus() +");
        clickOnTaskCard(constructionTask2);
        verifyTaskStatus(GlobalStrings.notReadyTaskStatus);
        closePropertyPanel();
        Thread.sleep(500);
        logger.info("verifyTaskStatus() : Task 1 ...");
        clickOnTaskCard(constructionTask3);
        verifyTaskStatus(GlobalStrings.notReadyTaskStatus);
        closePropertyPanel();
        Thread.sleep(500);
        logger.info("verifyTaskStatus() : Task 2 ...");
        clickOnTaskCard(constructionTask4);
        verifyTaskStatus(GlobalStrings.notReadyTaskStatus);
        closePropertyPanel();
        logger.info("verifyTaskStatus() : Task 3 ...");
        logger.info("verifyTaskStatus() -");
    }

    public void changeTaskStatus() throws InterruptedException {
        logger.info("changeTaskStatus() +");
        changeTaskStatus(constructionTask1, GlobalStrings.unassignedTaskStatus, GlobalStrings.notReadyTaskStatus);
        changeTaskStatus(constructionTask1, GlobalStrings.notReadyTaskStatus, GlobalStrings.forceReadyTaskStatus);
        changeTaskStatus(constructionTask1, GlobalStrings.forceReadyTaskStatus, GlobalStrings.startTaskStatus);
        changeTaskStatus(constructionTask1, GlobalStrings.startedTaskStatus, GlobalStrings.alertTaskStatus);
        changeTaskStatus(constructionTask1, GlobalStrings.alertTaskStatus, GlobalStrings.stopTaskStatus);
        changeTaskStatus(constructionTask1, GlobalStrings.stoppedTaskStatus, GlobalStrings.startTaskStatus);
        changeTaskStatus(constructionTask1, GlobalStrings.startedTaskStatus, GlobalStrings.completeTaskStatus);
        logger.info("changeTaskStatus() -");
    }
}