package testClass.zoneAndLevel;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import utilities.GlobalStrings;
import java.lang.reflect.Method;
import static utilities.ExtentReports.ExtentReportTestManager.startTest;

public class SecondLevelAndZonesTest extends BaseLevelAndZoneTest {
    Logger logger;

    public SecondLevelAndZonesTest() {
        logger = LogManager.getLogger(SecondLevelAndZonesTest.class);
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
        secondLevelAndZones.renameLevel("default", GlobalStrings.defaultLevelName, "RightClick");
        secondLevelAndZones.renameLevel("default", GlobalStrings.defaultLevelName1, "DoubleClick");
        logger.info("renameDefaultLevel(Method method) -");
    }

    @Test(priority = 2, description = "Rename Default Zone")
    public void renameDefaultZone(Method method) throws InterruptedException {
        logger.info("renameDefaultZone(Method method) +");
        startTest(method.getName(), "Renaming default zone");
        secondLevelAndZones.renameZoneGroup("default", GlobalStrings.defaultZoneName, "RightClick");
        Thread.sleep(4000);
        secondLevelAndZones.renameZoneGroup("default", GlobalStrings.defaultZoneName1, "DoubleClick");
        Thread.sleep(2000);
        secondLevelAndZones.renameZoneGroup("default", GlobalStrings.defaultZoneName2,"zone property panel");
        logger.info("renameDefaultZone(Method method) -");
    }

    @Test(priority = 3, description = "Hide and Show Level")
    public void hideAndShowLevel(Method method) {
        logger.info("hideAndShowLevel(Method method) +");
        startTest(method.getName(), "Hiding and Showing Level");
        secondLevelAndZones.hideAndShowSecondLevel("Hide","defaultLevel");
        secondLevelAndZones.hideAndShowSecondLevel("Show","defaultLevel");
        secondLevelAndZones.hideAndShowSecondLevel("Hide","secondLevel");
        secondLevelAndZones.hideAndShowSecondLevel("Show","defaultLevel");
        logger.info("hideAndShowLevel(Method method) -");
    }

    @Test(priority = 4, description = "Add new leaf zone")
    public void addNewLeafZone(Method method) throws InterruptedException {
        logger.info("addNewLeafZone(Method method) +");
        startTest(method.getName(), "Adding new leaf zone");
        Thread.sleep(200);
        utility.zoomOut(2);
        secondLevelAndZones.addNewLeafZoneGroup("default");
        logger.info("addNewLeafZone(Method method) -");
    }

    @Test(priority = 5, description = "Duplicate Zone")
    public void duplicateZone(Method method) {
        logger.info("duplicateZone(Method method) +");
        startTest(method.getName(), "Duplicating the zone");
        secondLevelAndZones.duplicateZoneGroup("default");
        logger.info("duplicateZone(Method method) -");
    }

    @Test(priority = 6, description = "Add zone in between")
    public void addZoneInBetween(Method method) throws InterruptedException {
        logger.info("addZoneInBetween(Method method) +");
        startTest(method.getName(), "Addition of zone in between");
        secondLevelAndZones.addZoneGroupInBetween("default");
        Thread.sleep(2000);
        logger.info("addZoneInBetween(Method method) -");
    }

    @Test(priority = 7, description = "Delete last zone")
    public void deleteZone(Method method) {
        logger.info("deleteZone(Method method) +");
        startTest(method.getName(), "deletion of last zone");
        secondLevelAndZones.deleteZoneGroup("default");
        logger.info("deleteZone(Method method) -");
    }

    @Test(priority = 8, description = "Rename Second Level")
    public void renameSecondLevel(Method method) throws InterruptedException {
        logger.info("renameSecondLevel(Method method) +");
        startTest(method.getName(), "Renaming 2nd level");
        secondLevelAndZones.renameLevel("2nd", GlobalStrings.secondLevelName, "RightClick");
        secondLevelAndZones.renameLevel("2nd", GlobalStrings.secondLevelName1, "DoubleClick");
        Thread.sleep(200);
        utility.zoomOut(2);
        logger.info("renameSecondLevel(Method method) -");
    }

    @Test(priority = 9, description = "Rename Second Group")
    public void renameSecondGroup(Method method) throws InterruptedException {
        logger.info("renameSecondGroup(Method method) +");
        startTest(method.getName(), "Renaming group under 2nd level");
        secondLevelAndZones.renameZoneGroup("2nd", GlobalStrings.secondZoneName, "RightClick");
        Thread.sleep(4000);
        secondLevelAndZones.renameZoneGroup("2nd", GlobalStrings.secondZoneName1, "DoubleClick");
        Thread.sleep(4000);
        logger.info("renameSecondGroup(Method method) -");
    }

    @Test(priority = 10, description = "Add new leaf group")
    public void addNewLeafGroup(Method method) throws InterruptedException {
        logger.info("addNewLeafGroup(Method method) +");
        startTest(method.getName(), "Adding new leaf group");
        secondLevelAndZones.addNewLeafZoneGroup("2nd");
        Thread.sleep(2000);
        logger.info("addNewLeafGroup(Method method) -");
    }

    @Test(priority = 11, description = "Duplicate group")
    public void duplicateGroup(Method method) throws InterruptedException {
        logger.info("duplicateGroup(Method method) +");
        startTest(method.getName(), "Duplicating the group under 2nd level");
        secondLevelAndZones.duplicateZoneGroup("2nd");
        Thread.sleep(2000);
        logger.info("duplicateGroup(Method method) -");
    }

    @Test(priority = 12, description = "Add group in between")
    public void addGroupInBetween(Method method) throws InterruptedException {
        logger.info("addGroupInBetween(Method method) +");
        startTest(method.getName(), "Addition of group in between under 2nd level");
        secondLevelAndZones.addZoneGroupInBetween("2nd");
        Thread.sleep(2500);
        logger.info("addGroupInBetween(Method method) -");
    }

    @Test(priority = 13, description = "Delete last group")
    public void deleteGroup(Method method) throws InterruptedException {
        logger.info("deleteGroup(Method method) +");
        startTest(method.getName(), "deletion of last group in 2nd level");
        secondLevelAndZones.deleteZoneGroup("2nd");
        Thread.sleep(2000);
        logger.info("deleteGroup(Method method) -");
    }

    @Test(priority = 14, description = "add 3rd level")
    public void addThirdLevel(Method method) {
        logger.info("addThirdLevel(Method method) +");
        startTest(method.getName(), "addition of 3rd level");
        secondLevelAndZones.addThirdLevel();
        logger.info("addThirdLevel(Method method) -");
    }

    @Test(priority = 15, description = "delete 3rd level")
    public void deleteThirdLevel(Method method) throws InterruptedException {
        logger.info("deleteThirdLevel(Method method) +");
        Thread.sleep(1000);
        startTest(method.getName(), "deletion of 3rd level");
        secondLevelAndZones.deleteThirdLevel();
        Thread.sleep(1000);
        logger.info("deleteThirdLevel(Method method) -");
    }

    @Test(priority = 16, description = "add 3rd level again")
    public void addThirdLevelAgain(Method method) throws InterruptedException {
        logger.info("addThirdLevelAgain(Method method) +");
        startTest(method.getName(), "addition of 3rd level again");
        secondLevelAndZones.addThirdLevel();
        Thread.sleep(1000);
        logger.info("addThirdLevelAgain(Method method) -");
    }
}