package testClass.login;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import utilities.GlobalStrings;
import java.lang.reflect.Method;
import static utilities.ExtentReports.ExtentReportTestManager.startTest;

public class LoginTest extends BaseLoginTest {
	Logger logger;

	public LoginTest() {
		logger = LogManager.getLogger(LoginTest.class);
	}

	@Test(description = "Opening URL")
	public void navigateToURL(Method method) {
		logger.info("navigateToURL(Method method) +");
		startTest(method.getName(), "URL opened");
		driver.get(GlobalStrings.serverURL);
		logger.info("navigateToURL(Method method) -");
	}

	@Test(priority = 1, description = "Set UserName")
	public void setUserName(Method method) {
		logger.info("setUserName(Method method) +");
		startTest(method.getName(), "Username entered");
		userNameLogin.setUserName(GlobalStrings.userName);
		userNameLogin.clickContinueButton1();
		logger.info("setUserName(Method method) -");
	}

	@Test(priority = 2, description = "Set Password")
	public void setPassword(Method method) {
		logger.info("setPassword(Method method) +");
		startTest(method.getName(), "Password entered");
		passwordLogin.setPasswordField(GlobalStrings.password);
		passwordLogin.clickContinueButton2();
		logger.info("setPassword(Method method) -");
	}

	@Test(priority = 3, description = "Select WorkSpace ")
	public void workSpaceSelection(Method method) throws InterruptedException {
		logger.info("workSpaceSelection(Method method) +");
		startTest(method.getName(),"Workspace selection");
		utility.zoomOut(2);
		workSpaceSelection.selectWorkSpace();
		logger.info("workSpaceSelection(Method method) -");
	}

	@Test(priority = 4, description = "Project selection from Mini Dashboard")
	public void projectSelection(Method method) throws InterruptedException {
		logger.info("projectSelection(Method method) +");
		startTest(method.getName(), "Project selection");
		Thread.sleep(200);
		utility.zoomOut(2);
		projectSelection.selectProject(GlobalStrings.projectName);
		logger.info("projectSelection(Method method) -");
	}
}