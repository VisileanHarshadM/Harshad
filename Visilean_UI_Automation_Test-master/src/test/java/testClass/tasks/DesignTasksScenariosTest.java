package testClass.tasks;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import java.lang.reflect.Method;
import static utilities.ExtentReports.ExtentReportTestManager.startTest;

public class DesignTasksScenariosTest extends BaseTaskScenariosTest {
    Logger logger;

    public DesignTasksScenariosTest() {
        logger = LogManager.getLogger(DesignTasksScenariosTest.class);
    }

    @Test(description = "Login")
    public void login(Method method) throws InterruptedException {
        logger.info("login(Method method) +");
        startTest(method.getName(), "Login process");
        commonLoginTest.visiLeanCommonLogin();
        logger.info("login(Method method) -");
    }

    @Test(priority = 1, description = "Create Design Task without basic details")
    public void designTaskCreationWithoutBasicDetails(Method method) throws InterruptedException {
        logger.info("designTaskCreationWithoutBasicDetails(Method method) +");
        startTest(method.getName(), "creating the Design task without Basic Details");
        Thread.sleep(200);
        utility.zoomOut(2);
        Thread.sleep(500);
        designTasksScenarios.createDesignTask("without basic details");
        Thread.sleep(500);
        logger.info("designTaskCreationWithoutBasicDetails(Method method) -");
    }

    @Test(priority = 2, description = "verify task details")
    public void designTask1DetailsVerification(Method method) throws InterruptedException {
        logger.info("designTask1DetailsVerification(Method method) +");
        startTest(method.getName(), "verifying task details");
        designTasksScenarios.designTask1DetailsVerify();
        logger.info("designTask1DetailsVerification(Method method) -");
    }

    @Test(priority = 3, description = "Create Design Task without basic details")
    public void designTaskCreationWithBasicDetails(Method method) throws InterruptedException {
        logger.info("designTaskCreationWithBasicDetails(Method method) +");
        startTest(method.getName(), "Creating Design Task without basic details");
        designTasksScenarios.createDesignTask("with basic details");
        logger.info("designTaskCreationWithBasicDetails(Method method) -");
    }

    @Test(priority = 4, description = "verify task details")
    public void designTask2DetailsVerification(Method method) throws InterruptedException {
        logger.info("designTask2DetailsVerification(Method method) +");
        startTest(method.getName(), "verifying task details");
        designTasksScenarios.designTask2DetailsVerify();
        logger.info("designTask2DetailsVerification(Method method) -");
    }

    @Test(priority = 5, description = "Update task name")
    public void updateTaskName(Method method) throws InterruptedException {
        logger.info("updateTaskName(Method method) +");
        startTest(method.getName(), "updating task name");
        designTasksScenarios.updateTaskName();
        logger.info("updateTaskName(Method method) -");
    }

    @Test(priority = 6, description = "Update task trade")
    public void updateTaskTrade(Method method) throws InterruptedException {
        logger.info("updateTaskTrade(Method method) +");
        startTest(method.getName(), "updating task trade");
        designTasksScenarios.updateTaskTrade();
        logger.info("updateTaskTrade(Method method) -");
    }

    @Test(priority = 7, description = "Update task duration")
    public void updateTaskDuration(Method method) throws InterruptedException {
        logger.info("updateTaskDuration(Method method) +");
        startTest(method.getName(), "updating task duration");
        designTasksScenarios.updateTaskDuration();
        logger.info("updateTaskDuration(Method method) -");
    }

    @Test(priority = 8, description = "Update task resources")
    public void updateTaskResources(Method method) throws InterruptedException {
        logger.info("updateTaskDuration(Method method) +");
        startTest(method.getName(), "updating task resources");
        designTasksScenarios.updateTaskResources();
        logger.info("updateTaskDuration(Method method) -");
    }

    @Test(priority = 9, description = "Update task description")
    public void updateTaskDescription(Method method) throws InterruptedException {
        logger.info("updateTaskDescription(Method method) +");
        startTest(method.getName(), "updating task description");
        designTasksScenarios.updateTaskDescription();
        logger.info("updateTaskDescription(Method method) -");
    }

    @Test(priority = 10, description = "select tasks from default Level first Zone")
    public void selectTasksDefaultLevel(Method method) throws InterruptedException {
        logger.info("selectTasksDefaultLevel(Method method) +");
        startTest(method.getName(), "selecting tasks from default Level first Zone");
        designTasksScenarios.selectTasksDefaultLevelZone();
        logger.info("selectTasksDefaultLevel(Method method) -");
    }

    @Test(priority = 11, description = "Zone duplicate with tasks from default level first zone")
    public void zoneDuplicateWithTasksDefaultLevel(Method method) throws InterruptedException {
        logger.info("zoneDuplicateWithTasksDefaultLevel(Method method) +");
        startTest(method.getName(), "zone duplication with Tasks from default level first zone");
        designTasksScenarios.zoneDuplicateWithTasksDefaultLevelZone();
        Thread.sleep(1000);
        logger.info("zoneDuplicateWithTasksDefaultLevel(Method method) -");
    }

    @Test(priority = 12, description = "Delete Zone with tasks from default level")
    public void zoneDeleteWithTasksDefaultLevel(Method method) throws InterruptedException {
        logger.info("zoneDeleteWithTasksDefaultLevel(Method method) +");
        startTest(method.getName(), "zone delete with Tasks from default level");
        designTasksScenarios.zoneDeleteWithTasksDefaultLevel();
        logger.info("zoneDeleteWithTasksDefaultLevel(Method method) -");
    }

    @Test(priority = 13, description = "move single task")
    public void moveSingleTask(Method method) throws InterruptedException {
        logger.info("moveSingleTask(Method method) +");
        startTest(method.getName(), "move single task");
        designTasksScenarios.moveSingleTask("Horizontally");
        designTasksScenarios.moveSingleTask("Vertically");
        logger.info("moveSingleTask(Method method) -");
    }

    @Test(priority = 14, description = "copy single task")
    public void copySingleTask(Method method) throws InterruptedException {
        logger.info("copySingleTask(Method method) +");
        startTest(method.getName(), "copy single task");
        designTasksScenarios.copySingleTask();
        logger.info("copySingleTask(Method method) -");
    }

    @Test(priority = 15, description = "change task priority")
    public void changeTaskPriority(Method method) throws InterruptedException {
        logger.info("changeTaskPriority(Method method) +");
        startTest(method.getName(), "changing task priority");
        designTasksScenarios.changeTaskPriority();
        logger.info("changeTaskPriority(Method method) -");
    }

    @Test(priority = 16, description = "change zone for single task")
    public void changeZoneSingleTask(Method method) throws InterruptedException {
        logger.info("changeZoneSingleTask(Method method) +");
        startTest(method.getName(), "changing zone for single task");
        designTasksScenarios.changeZoneSingleTask();
        logger.info("changeZoneSingleTask(Method method) -");
    }

    @Test(priority = 17, description = "Allocate owner for single task")
    public void allocateOwner(Method method) throws InterruptedException {
        logger.info("allocateOwner(Method method) +");
        startTest(method.getName(), "Allocating owner for single task");
        designTasksScenarios.allocateOwnerSingleTask();
        logger.info("allocateOwner(Method method) -");
    }

    @Test(priority = 18, description = "Verify task owner & status for single task")
    public void verifyTaskStatus(Method method) throws InterruptedException {
        logger.info("verifyTaskStatus(Method method) +");
        startTest(method.getName(), "Verifying task status after owner allocation");
        designTasksScenarios.verifyTaskStatus();
        logger.info("verifyTaskStatus(Method method) -");
    }

    @Test(priority = 19, description = "Change task status sequentially")
    public void changeTaskStatus(Method method) throws InterruptedException {
        logger.info("changeTaskStatus(Method method) +");
        startTest(method.getName(), "changing task status for Construction task sequentially");
        designTasksScenarios.changeTaskStatus();
        logger.info("changeTaskStatus(Method method) -");
    }
}