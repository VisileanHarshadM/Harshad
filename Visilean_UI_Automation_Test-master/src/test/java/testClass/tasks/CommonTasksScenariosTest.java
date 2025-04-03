package testClass.tasks;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import java.lang.reflect.Method;
import static utilities.ExtentReports.ExtentReportTestManager.startTest;

public class CommonTasksScenariosTest extends BaseTaskScenariosTest {
    Logger logger;

    public CommonTasksScenariosTest() {
        logger = LogManager.getLogger(CommonTasksScenariosTest.class);
    }

    @Test(description = "Login")
    public void login(Method method) throws InterruptedException {
        logger.info("login(Method method) +");
        startTest(method.getName(), "Login process");
        commonLoginTest.visiLeanCommonLogin();
        logger.info("login(Method method) -");
    }

    @Test(priority = 1, description = "Select tasks from 2nd & 3rd Level")
    public void selectTasksFromSecondThirdLevel(Method method) throws InterruptedException {
        logger.info("selectTasks(Method method) +");
        startTest(method.getName(), "Select tasks from 2nd & 3rd Level");
        Thread.sleep(200);
        utility.zoomOut(3);
        Thread.sleep(500);
        commonTasksScenarios.selectTasksSecondLevelZone();
        commonTasksScenarios.selectTasksThirdLevelZone();
        logger.info("selectTasks(Method method) -");
    }

    @Test(priority = 2, description = "Move Multiple tasks")
    public void moveMultipleTasks(Method method) throws InterruptedException {
        logger.info("moveMultipleTasks(Method method) +");
        startTest(method.getName(), "Move Multiple tasks");
        commonTasksScenarios.moveMultipleTasks("Horizontally");
        commonTasksScenarios.moveMultipleTasks("Vertically");
        logger.info("moveMultipleTasks(Method method) -");
    }

    @Test(priority = 3, description = "change task type")
    public void changeTaskType(Method method) throws InterruptedException {
        logger.info("changeTaskType(Method method) +");
        startTest(method.getName(), "changing task type");
        commonTasksScenarios.taskTypeToConstructionQuickAdvPropPanel();
        Thread.sleep(500);
        commonTasksScenarios.taskTypeToDesignQuickAdvPropPanel();
        Thread.sleep(500);
        commonTasksScenarios.taskTypeToConstructionDetailedAdvPropPanel();
        Thread.sleep(500);
        commonTasksScenarios.taskTypeToDesignDetailedAdvPropPanel();
        Thread.sleep(1000);
        logger.info("changeTaskType(Method method) -");
    }
}