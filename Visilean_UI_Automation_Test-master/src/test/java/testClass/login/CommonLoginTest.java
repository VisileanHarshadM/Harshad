package testClass.login;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import pageObjectModel.login.PasswordLogin;
import pageObjectModel.login.ProjectSelection;
import pageObjectModel.login.UserNameLogin;
import testClass.BaseTestClass;
import utilities.GlobalStrings;

public class CommonLoginTest extends BaseTestClass {
	Logger logger;

	public CommonLoginTest() {
		logger = LogManager.getLogger(CommonLoginTest.class);
	}

	public void visiLeanCommonLogin() throws InterruptedException {
		logger.info("visiLeanCommonLogin() +");
		driver.get(GlobalStrings.serverURL);

		UserNameLogin userNameLogin = new UserNameLogin(driver);
		userNameLogin.setUserName(GlobalStrings.userName);
		userNameLogin.clickContinueButton1();

		PasswordLogin passwordLogin = new PasswordLogin(driver);
		passwordLogin.setPasswordField(GlobalStrings.password);
		passwordLogin.clickContinueButton2();

		ProjectSelection projectSelection = new ProjectSelection(driver);
		projectSelection.selectProject(GlobalStrings.projectName);
		logger.info("visiLeanCommonLogin() -");
	}
}