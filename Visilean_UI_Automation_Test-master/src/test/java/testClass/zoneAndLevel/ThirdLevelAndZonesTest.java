package testClass.zoneAndLevel;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import utilities.GlobalStrings;
import java.lang.reflect.Method;
import static utilities.ExtentReports.ExtentReportTestManager.startTest;

public class ThirdLevelAndZonesTest extends BaseLevelAndZoneTest {
    Logger logger;

    public ThirdLevelAndZonesTest() {
        logger = LogManager.getLogger(ThirdLevelAndZonesTest.class);
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
        thirdLevelAndZones.renameLevel("default", GlobalStrings.defaultLevelName, "RightClick");
        thirdLevelAndZones.renameLevel("default", GlobalStrings.defaultLevelName1, "DoubleClick");
        Thread.sleep(200);
        utility.zoomOut(2);
        logger.info("renameDefaultLevel(Method method) -");
    }

    @Test(priority = 2, description = "Rename Default Zone")
    public void renameDefaultZone(Method method) throws InterruptedException {
        logger.info("renameDefaultZone(Method method) +");
        startTest(method.getName(), "Renaming default zone");
        thirdLevelAndZones.renameZoneGroup("default", GlobalStrings.defaultZoneName, "RightClick");
        Thread.sleep(4000);
        thirdLevelAndZones.renameZoneGroup("default", GlobalStrings.defaultZoneName1, "DoubleClick");
        Thread.sleep(2000);
        thirdLevelAndZones.renameZoneGroup("default", GlobalStrings.defaultZoneName2,"zone property panel");
        Thread.sleep(200);
        utility.zoomOut(2);
        logger.info("renameDefaultZone(Method method) -");
    }

    @Test(priority = 3, description = "Hide and Show Level")
    public void hideAndShowLevel(Method method) {
        logger.info("hideAndShowLevel(Method method) +");
        startTest(method.getName(), "Hiding and Showing Level");
        thirdLevelAndZones.hideAndShowLevel("Hide","thirdLevel", "defaultLevel");
        thirdLevelAndZones.hideAndShowLevel("Hide","secondLevel", "defaultLevel");
        thirdLevelAndZones.hideAndShowLevel("Show","secondLevel","defaultLevel");
        thirdLevelAndZones.hideAndShowLevel("Show","thirdLevel","defaultLevel");
        logger.info("hideAndShowLevel(Method method) from default Level ...");

        thirdLevelAndZones.hideAndShowLevel("Hide","thirdLevel", "secondLevel");
        thirdLevelAndZones.hideAndShowLevel("Hide","secondLevel", "secondLevel");
        thirdLevelAndZones.hideAndShowLevel("Show","secondLevel","defaultLevel");
        thirdLevelAndZones.hideAndShowLevel("Show","thirdLevel","secondLevel");
        logger.info("hideAndShowLevel(Method method) from second Level ...");

        thirdLevelAndZones.hideAndShowLevel("Hide","thirdLevel", "thirdLevel");
        thirdLevelAndZones.hideAndShowLevel("Hide","secondLevel", "secondLevel");
        thirdLevelAndZones.hideAndShowLevel("Show","secondLevel","defaultLevel");
        thirdLevelAndZones.hideAndShowLevel("Show","thirdLevel","secondLevel");
        logger.info("hideAndShowLevel(Method method) from third Level ...");
        logger.info("hideAndShowLevel(Method method) -");
    }

    @Test(priority = 4, description = "Add new leaf zone")
    public void addNewLeafZone(Method method) {
        logger.info("addNewLeafZone(Method method) +");
        startTest(method.getName(), "Adding new leaf zone");
        thirdLevelAndZones.addNewLeafZoneGroup("default");
        logger.info("addNewLeafZone(Method method) -");
    }

    @Test(priority = 5, description = "Duplicate Zone")
    public void duplicateZone(Method method) {
        logger.info("duplicateZone(Method method) +");
        startTest(method.getName(), "Duplicating the zone");
        thirdLevelAndZones.duplicateZoneGroup("default");
        logger.info("duplicateZone(Method method) -");
    }

    @Test(priority = 6, description = "Add zone in between")
    public void addZoneInBetween(Method method) throws InterruptedException {
        logger.info("addZoneInBetween(Method method) +");
        startTest(method.getName(), "Addition of zone in between");
        thirdLevelAndZones.addZoneGroupInBetween("default");
        Thread.sleep(2000);
        logger.info("addZoneInBetween(Method method) -");
    }

    @Test(priority = 7, description = "Delete last zone")
    public void deleteZone(Method method) {
        logger.info("deleteZone(Method method) +");
        startTest(method.getName(), "deletion of last zone");
        thirdLevelAndZones.deleteZoneGroup("default");
        logger.info("deleteZone(Method method) -");
    }

    @Test(priority = 8, description = "Rename Second Level")
    public void renameSecondLevel(Method method) throws InterruptedException {
        logger.info("renameSecondLevel(Method method) +");
        startTest(method.getName(), "Renaming 2nd level");
        thirdLevelAndZones.renameLevel("2nd", GlobalStrings.secondLevelName, "RightClick");
        thirdLevelAndZones.renameLevel("2nd", GlobalStrings.secondLevelName1, "DoubleClick");
        Thread.sleep(200);
        utility.zoomOut(2);
        logger.info("renameSecondLevel(Method method) -");
    }

    @Test(priority = 9, description = "Rename Second Group")
    public void renameFirstGroupSecondLevel(Method method) throws InterruptedException {
        logger.info("renameSecondGroup(Method method) +");
        startTest(method.getName(), "Renaming group under 2nd level");
        thirdLevelAndZones.renameZoneGroup("2nd", GlobalStrings.secondZoneName, "RightClick");
        Thread.sleep(4000);
        thirdLevelAndZones.renameZoneGroup("2nd", GlobalStrings.secondZoneName1, "DoubleClick");
        Thread.sleep(4000);
        logger.info("renameSecondGroup(Method method) -");
    }

    @Test(priority = 10, description = "Add new leaf group")
    public void addNewLeafGroupSecondLevel(Method method) throws InterruptedException {
        logger.info("addNewLeafGroupSecondLevel(Method method) +");
        startTest(method.getName(), "Adding new leaf group in 2nd Level");
        thirdLevelAndZones.addNewLeafZoneGroup("2nd");
        Thread.sleep(2000);
        logger.info("addNewLeafGroupSecondLevel(Method method) -");
    }

    @Test(priority = 11, description = "Duplicate group")
    public void duplicateGroupSecondLevel(Method method) throws InterruptedException {
        logger.info("duplicateGroupSecondLevel(Method method) +");
        startTest(method.getName(), "Duplicating the group under 2nd level");
        thirdLevelAndZones.duplicateZoneGroup("2nd");
        Thread.sleep(2000);
        logger.info("duplicateGroupSecondLevel(Method method) -");
    }

    @Test(priority = 12, description = "Add group in between")
    public void addGroupInBetweenSecondLevel(Method method) throws InterruptedException {
        logger.info("addGroupInBetweenSecondLevel(Method method) +");
        startTest(method.getName(), "Addition of group in between under 2nd level");
        thirdLevelAndZones.addZoneGroupInBetween("2nd");
        Thread.sleep(2500);
        logger.info("addGroupInBetweenSecondLevel(Method method) -");
    }

    @Test(priority = 13, description = "Delete last group")
    public void deleteGroupSecondLevel(Method method) throws InterruptedException {
        logger.info("deleteGroupSecondLevel(Method method) +");
        startTest(method.getName(), "deletion of last group in 2nd level");
        thirdLevelAndZones.deleteZoneGroup("2nd");
        Thread.sleep(2000);
        logger.info("deleteGroupSecondLevel(Method method) -");
    }

    @Test(priority = 14, description = "Rename Third Level")
    public void renameThirdLevel(Method method) throws InterruptedException {
        logger.info("renameThirdLevel(Method method) +");
        startTest(method.getName(), "Renaming 3rd level");
        thirdLevelAndZones.renameLevel("3rd", GlobalStrings.thirdLevelName, "RightClick");
        thirdLevelAndZones.renameLevel("3rd", GlobalStrings.thirdLevelName1, "DoubleClick");
        logger.info("renameThirdLevel(Method method) -");
    }

    @Test(priority = 15, description = "Rename Third Group")
    public void renameGroupThirdLevel(Method method) throws InterruptedException {
        logger.info("renameThirdGroup(Method method) +");
        startTest(method.getName(), "Renaming group under 3rd level");
        thirdLevelAndZones.renameZoneGroup("3rd", GlobalStrings.thirdZoneName, "RightClick");
        Thread.sleep(4000);
        thirdLevelAndZones.renameZoneGroup("3rd", GlobalStrings.thirdZoneName1, "DoubleClick");
        Thread.sleep(4000);
        logger.info("renameThirdGroup(Method method) -");
    }

    @Test(priority = 16, description = "Add new leaf group")
    public void addNewLeafGroupThirdLevel(Method method) throws InterruptedException {
        logger.info("addNewLeafGroup(Method method) +");
        startTest(method.getName(), "Adding new leaf group under 3rd level");
        thirdLevelAndZones.addNewLeafZoneGroup("3rd");
        Thread.sleep(2000);
        logger.info("addNewLeafGroup(Method method) -");
    }

    @Test(priority = 17, description = "Duplicate group")
    public void duplicateGroupThirdLevel(Method method) throws InterruptedException {
        logger.info("duplicateGroupThirdLevel(Method method) +");
        startTest(method.getName(), "Duplicating the group under 3rd level");
        thirdLevelAndZones.duplicateZoneGroup("3rd");
        Thread.sleep(2000);
        logger.info("duplicateGroupThirdLevel(Method method) -");
    }

    @Test(priority = 18, description = "Add group in between")
    public void addGroupInBetweenThirdLevel(Method method) throws InterruptedException {
        logger.info("addGroupInBetweenThirdLevel(Method method) +");
        startTest(method.getName(), "Addition of group in between under 3rd level");
        thirdLevelAndZones.addZoneGroupInBetween("3rd");
        Thread.sleep(2500);
        logger.info("addGroupInBetweenThirdLevel(Method method) -");
    }

    @Test(priority = 19, description = "Delete last group")
    public void deleteGroupThirdLevel(Method method) throws InterruptedException {
        logger.info("deleteGroupThirdLevel(Method method) +");
        startTest(method.getName(), "deletion of last group in 3rd level");
        thirdLevelAndZones.deleteZoneGroup("3rd");
        Thread.sleep(1000);
        logger.info("deleteGroupThirdLevel(Method method) -");
    }
}