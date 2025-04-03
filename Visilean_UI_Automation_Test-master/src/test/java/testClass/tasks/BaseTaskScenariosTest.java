package testClass.tasks;

import org.testng.annotations.BeforeMethod;
import pageObjectModel.tasks.BaseTaskScenarios;
import pageObjectModel.tasks.CommonTasksScenarios;
import pageObjectModel.tasks.ConstructionTasksScenarios;
import pageObjectModel.tasks.DesignTasksScenarios;
import testClass.BaseTestClass;
import testClass.login.CommonLoginTest;

public class BaseTaskScenariosTest extends BaseTestClass {
    CommonLoginTest commonLoginTest;
    BaseTaskScenarios baseTaskScenarios;
    DesignTasksScenarios designTasksScenarios;
    ConstructionTasksScenarios constructionTasksScenarios;
    CommonTasksScenarios commonTasksScenarios;
    @BeforeMethod
    public void methodLevelSetup() {
        commonLoginTest = new CommonLoginTest();
        baseTaskScenarios = new BaseTaskScenarios(driver);
        designTasksScenarios = new DesignTasksScenarios(driver);
        constructionTasksScenarios = new ConstructionTasksScenarios(driver);
        commonTasksScenarios = new CommonTasksScenarios(driver);
    }
}
