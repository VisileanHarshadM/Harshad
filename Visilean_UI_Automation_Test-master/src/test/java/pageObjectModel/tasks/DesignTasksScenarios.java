package pageObjectModel.tasks;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GlobalStrings;

public class DesignTasksScenarios extends BaseTaskScenarios {
    Logger logger;
    @FindBy(xpath = "//div[@id='DESIGN']")
    WebElement sourceDesignTaskIcon;
    @FindBy(xpath = "(//span[@class='fc-custom-day-number level-3 '])[1]")
    WebElement dropDestinationDesignTask;
    @FindBy(css = "[data-testid='default_level_zone_1']")
    WebElement zone1DefaultLevel;
    @FindBy(css = "[data-testid='default_level_zone_2']")
    WebElement zone2DefaultLevel;
    @FindBy(xpath = "(//span[@class='SchedulerTask_event-title-text__LilkG'])[1]")
    WebElement designTask1;
    @FindBy(xpath = "(//div[contains(@class,'SchedulerTask_event-container__Igl7B')])[2]")
    WebElement designTask2ToOperate;
    @FindBy(xpath = "(//span[@class='SchedulerTask_event-title-text__LilkG'])[2]")
    WebElement designTask2;
    @FindBy(xpath = "(//span[@class='SchedulerTask_event-title-text__LilkG'])[3]")
    WebElement designTask3;
    @FindBy(xpath = "(//span[@class='SchedulerTask_event-title-text__LilkG'])[4]")
    WebElement designTask4;

    public DesignTasksScenarios(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        logger = LogManager.getLogger(DesignTasksScenarios.class);
    }

    public void createDesignTask(String using) throws InterruptedException {
        logger.info("createDesignTask(String using) +");
        switch (using) {
            case "without basic details":
                createTaskWithOutBasicProperty(sourceDesignTaskIcon, dropDestinationDesignTask, 145, 60);
                logger.info("without basic details ...");
                break;

            case "with basic details":
                createTaskWithBasicProperty(sourceDesignTaskIcon, dropDestinationDesignTask, 145, 60,
                        GlobalStrings.designTaskName1, trade1InTradeDropDown, GlobalStrings.designTaskDuration1,
                        GlobalStrings.designTaskResources1, GlobalStrings.designTaskDescription1);
                logger.info("with basic details ...");
                break;
        }
        logger.info("createDesignTask(String using) -");
    }

    public void designTask1DetailsVerify() throws InterruptedException {
        logger.info("designTaskDetailsVerify() +");
        clickOnTaskCard(designTask1);
        verifyTaskZoneName(GlobalStrings.designTaskZoneName);
        verifyTaskName(GlobalStrings.designTask1Name);
        verifyTaskStatus(GlobalStrings.unassignedTaskStatus);
        verifyTaskType(GlobalStrings.designTaskType);
        verifyTaskOwner(GlobalStrings.noOwner);
        verifyTaskTrade(GlobalStrings.noTrade);
        closePropertyPanel();
        Thread.sleep(500);
        logger.info("designTaskDetailsVerify() -");
    }

    public void designTask2DetailsVerify() throws InterruptedException {
        logger.info("designTask2DetailsVerify() +");
        clickOnTaskCard(designTask1);
        verifyTaskZoneName(GlobalStrings.designTaskZoneName);
        verifyTaskName(GlobalStrings.designTaskName1);
        verifyTaskStatus(GlobalStrings.unassignedTaskStatus);
        verifyTaskType(GlobalStrings.designTaskType);
        verifyTaskOwner(GlobalStrings.noOwner);
        closePropertyPanel();
        Thread.sleep(500);
        logger.info("designTask2DetailsVerify() -");
    }

    public void updateTaskName() throws InterruptedException {
        logger.info("updateTaskName() +");
        taskNameUpdate("basic Property Panel", designTask2, GlobalStrings.designTask1NameBasicPropPanel);
        taskNameUpdate("top main property panel", designTask2, GlobalStrings.designTask1NameTopMainPropPanel);
        taskNameUpdate("bottom main Property Panel", designTask2, GlobalStrings.designTask1NameMainPropPanel);
        logger.info("updateTaskName() -");
    }

    public void updateTaskTrade() throws InterruptedException {
        logger.info("updateTaskTrade() +");
        taskTradeUpdate("basic Property Panel", designTask2, trade2InTradeDropDown);
        taskTradeUpdate("already present", designTask2, trade3InTradeDropDown);
        taskTradeUpdate("top main property panel", designTask2, trade1InTradeDropDown);
        taskTradeUpdate("bottom main Property Panel", designTask2, trade2DropDownOptionMainProPanel);
        logger.info("updateTaskTrade() -");
    }

    public void updateTaskDuration() throws InterruptedException {
        logger.info("updateTaskDuration() +");
        taskDurationUpdate("basic Property Panel", designTask2, GlobalStrings.designTask1DurationBasicPropPanel);
        taskDurationUpdate("advance Property Panel", designTask2, GlobalStrings.emptyString);
        logger.info("updateTaskDuration() -");
    }

    public void updateTaskResources() throws InterruptedException {
        logger.info("updateTaskResources() +");
        taskResourcesUpdate(designTask2, GlobalStrings.designTask1ResourcesBasicPropPanel);
        logger.info("updateTaskResources() -");
    }

    public void updateTaskDescription() throws InterruptedException {
        logger.info("updateTaskDescription() +");
        taskDescriptionUpdate("basic Property Panel", designTask2, GlobalStrings.designTaskDescriptionBasicPropPanel);
        taskDescriptionUpdate("main Property Panel", designTask2, GlobalStrings.designTaskDescriptionMainPropPanel);
        logger.info("updateTaskDescription() -");
    }

    public void selectTasksDefaultLevelZone() throws InterruptedException {
        logger.info("selectTasksDefaultLevelZone() +");
        selectTasks("02 Selected", zone1DefaultLevel);
        logger.info("selectTasksDefaultLevelZone() -");
    }

    public void zoneDuplicateWithTasksDefaultLevelZone() throws InterruptedException {
        logger.info("zoneDuplicateWithTasksDefaultLevelZone() +");
        zoneDuplicateWithTasks("default Level zone", zone1DefaultLevel);
        logger.info("zoneDuplicateWithTasksDefaultLevelZone() -");
    }

    public void zoneDeleteWithTasksDefaultLevel() throws InterruptedException {
        logger.info("zoneDeleteWithTasksDefaultLevel() +");
        zoneDeleteWithTasks("default Level", zone2DefaultLevel);
        logger.info("zoneDeleteWithTasksDefaultLevel() -");
    }

    public void moveSingleTask(String direction) throws InterruptedException {
        logger.info("moveSingleTask(String direction) +");
        moveTasks("Single", direction, designTask2ToOperate);
        logger.info("moveSingleTask(String direction) -");
    }

    public void copySingleTask() throws InterruptedException {
        logger.info("copySingleTask(String using) +");
        copyTasks("Single", "headerCopyButton", designTask2ToOperate);
        copyTasks("Single", "keyboard", designTask2ToOperate);
        logger.info("copySingleTask(String using) -");
    }

    public void changeTaskPriority() throws InterruptedException {
        logger.info("changeTaskPriority() +");
        changeTaskPriority(designTask2, "Quick Advance Property Panel", lowPriorityQuickAdvPropPanel);
        changeTaskPriority(designTask2, "Quick Advance Property Panel", mediumPriorityQuickAdvPropPanel);
        changeTaskPriority(designTask2, "Quick Advance Property Panel", highPriorityQuickAdvPropPanel);

        changeTaskPriority(designTask2, "Detailed Advance Property Panel", lowPriorityDetailedAdvPropPanel);
        changeTaskPriority(designTask2, "Detailed Advance Property Panel", mediumPriorityDetailedAdvPropPanel);
        changeTaskPriority(designTask2, "Detailed Advance Property Panel", highPriorityDetailedAdvPropPanel);
        logger.info("changeTaskPriority() -");
    }

    public void changeZoneSingleTask() throws InterruptedException {
        logger.info("changeZoneSingleTask() +");
        changeZone("Single", designTask2, "Quick Advance Property Panel", GlobalStrings.designTaskGroupToSearch, zoneCheckBox1DesignTask);
        changeZone("Single", designTask4, "Detailed Advance Property Panel", GlobalStrings.designTaskGroupToSearch, zoneCheckBox2DesignTask);
        logger.info("changeZoneSingleTask() -");
    }

    public void allocateOwnerSingleTask() throws InterruptedException {
        logger.info("allocateOwnerSingleTask() +");
        allocateOwner("Single", designTask2, "Assigned to quick Prop Panel", assignedToOwner1QuickProPanel);
        allocateOwner("Single", designTask3, "Assign Owner quick Prop Panel", assignOwner2QuickProPanel);
        allocateOwner("Single", designTask4, "Owner detailed prop panel", chooseOwner3DetailedPropPanel);
        logger.info("allocateOwnerSingleTask() -");
    }

    public void verifyTaskStatus() throws InterruptedException {
        logger.info("verifyTaskStatus() +");
        clickOnTaskCard(designTask2);
        verifyTaskStatus(GlobalStrings.readyTaskStatus);
        closePropertyPanel();
        Thread.sleep(500);
        logger.info("verifyTaskStatus() : Task 1 ...");
        clickOnTaskCard(designTask3);
        verifyTaskStatus(GlobalStrings.readyTaskStatus);
        closePropertyPanel();
        Thread.sleep(500);
        logger.info("verifyTaskOwnerAndStatus() : Task 2 ...");
        clickOnTaskCard(designTask4);
        verifyTaskStatus(GlobalStrings.readyTaskStatus);
        closePropertyPanel();
        logger.info("verifyTaskStatus() : Task 3 ...");
        logger.info("verifyTaskStatus() -");
    }

    public void changeTaskStatus() throws InterruptedException {
        logger.info("changeTaskStatus() +");
        changeTaskStatus(designTask1, GlobalStrings.unassignedTaskStatus, GlobalStrings.forceReadyTaskStatus);
        changeTaskStatus(designTask1, GlobalStrings.forceReadyTaskStatus, GlobalStrings.startTaskStatus);
        changeTaskStatus(designTask1, GlobalStrings.startedTaskStatus, GlobalStrings.alertTaskStatus);
        changeTaskStatus(designTask1, GlobalStrings.alertTaskStatus, GlobalStrings.stopTaskStatus);
        changeTaskStatus(designTask1, GlobalStrings.stoppedTaskStatus, GlobalStrings.startTaskStatus);
        changeTaskStatus(designTask1, GlobalStrings.startedTaskStatus, GlobalStrings.completeTaskStatus);
        logger.info("changeTaskStatus() -");
    }
}