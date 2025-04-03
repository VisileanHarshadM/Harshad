package testClass.zoneAndLevel;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import utilities.GlobalStrings;
import java.lang.reflect.Method;
import static utilities.ExtentReports.ExtentReportTestManager.startTest;

public class DefaultLevelAndZonesTest extends BaseLevelAndZoneTest {
    Logger logger;

    public DefaultLevelAndZonesTest() {
        logger = LogManager.getLogger(DefaultLevelAndZonesTest.class);
    }

    @Test(description = "Login")
    public void login(Method method) throws InterruptedException {
        logger.info("login(Method method) +");
        startTest(method.getName(), "Login process");
        commonLoginTest.visiLeanCommonLogin();
        logger.info("login(Method method) -");
    }

    @Test(priority = 1, description = "Rename Default Level")
    public void renameDefaultLevel(Method method) throws InterruptedException {
        logger.info("renameDefaultLevel(Method method) +");
        startTest(method.getName(), "Renaming default level");
        defaultLevelAndZones.renameDefaultLevel(GlobalStrings.defaultLevelName,"RightClick");
        defaultLevelAndZones.renameDefaultLevel(GlobalStrings.defaultLevelName1, "DoubleClick");
        logger.info("renameDefaultLevel(Method method) -");
    }

    @Test(priority = 2, description = "Rename Default Zone")
    public void renameDefaultZone(Method method) {
        logger.info("renameDefaultZone(Method method) +");
        startTest(method.getName(), "Renaming default zone");
        defaultLevelAndZones.renameDefaultZone(GlobalStrings.defaultZoneName, "RightClick");
        defaultLevelAndZones.renameDefaultZone(GlobalStrings.defaultZoneName1, "DoubleClick");
        defaultLevelAndZones.renameDefaultZone(GlobalStrings.defaultZoneName2,"zone property panel");
        logger.info("renameDefaultZone(Method method) -");
    }

    @Test(priority = 3, description = "Add new leaf zone")
    public void addNewLeafZone(Method method) {
        logger.info("addNewLeafZone(Method method) +");
        startTest(method.getName(), "Adding new leaf zone");
        defaultLevelAndZones.addNewLeafZone();
        logger.info("addNewLeafZone(Method method) -");
    }

    @Test(priority = 4, description = "Duplicate Zone")
    public void duplicateZone(Method method) {
        logger.info("duplicateZone(Method method) +");
        startTest(method.getName(), "Duplicating the zone");
        defaultLevelAndZones.duplicateZone();
        logger.info("duplicateZone(Method method) -");
    }

    @Test(priority = 5, description = "Add zone in between")
    public void addZoneInBetween(Method method) {
        logger.info("addZoneInBetween(Method method) +");
        startTest(method.getName(), "Addition of zone in between");
        defaultLevelAndZones.addZoneInBetween();
        logger.info("addZoneInBetween(Method method) -");
    }

    @Test(priority = 6, description = "Delete last zone")
    public void deleteZone(Method method) {
        logger.info("deleteZone(Method method) +");
        startTest(method.getName(), "deletion of last zone");
        defaultLevelAndZones.deleteZone();
        logger.info("deleteZone(Method method) -");
    }

    @Test(priority = 7, description = "add 2nd Level")
    public void addSecondLevel(Method method) {
        logger.info("addSecondLevel(Method method) +");
        startTest(method.getName(), "addition of 2nd level");
        defaultLevelAndZones.addSecondLevel();
        logger.info("addSecondLevel(Method method) -");
    }

    @Test(priority = 8, description = "delete 2nd level")
    public void deleteSecondLevel(Method method) throws InterruptedException {
        logger.info("deleteSecondLevel(Method method) +");
        startTest(method.getName(), "deletion of 2nd level");
        defaultLevelAndZones.deleteSecondLevel();
        Thread.sleep(1000);
        logger.info("deleteSecondLevel(Method method) -");
    }

    @Test(priority = 9, description = "add 2nd level again")
    public void addSecondLevelAgain(Method method) throws InterruptedException {
        logger.info("addSecondLevelAgain(Method method) +");
        startTest(method.getName(), "addition of 2nd level again");
        defaultLevelAndZones.addSecondLevel();
        Thread.sleep(1000);
        logger.info("addSecondLevelAgain(Method method) -");
    }
}