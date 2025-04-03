package testClass.login;

import org.testng.annotations.BeforeMethod;
import pageObjectModel.login.PasswordLogin;
import pageObjectModel.login.ProjectSelection;
import pageObjectModel.login.UserNameLogin;
import pageObjectModel.login.WorkSpaceSelection;
import testClass.BaseTestClass;

public class BaseLoginTest extends BaseTestClass {
    public UserNameLogin userNameLogin;
    public PasswordLogin passwordLogin;
    public WorkSpaceSelection workSpaceSelection;
    public ProjectSelection projectSelection;

    @BeforeMethod
    public void methodLevelSetup() {
        userNameLogin = new UserNameLogin(driver);
        passwordLogin = new PasswordLogin(driver);
        workSpaceSelection = new WorkSpaceSelection(driver);
        projectSelection = new ProjectSelection(driver);
    }
}