package pageObjectModel.zoneAndLevel;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondLevelAndZones extends BaseLevelAndZones {
    Logger logger;
    @FindBy(css = "[data-testid='default_level']")
    WebElement defaultLevel;
    @FindBy(css = "[data-testid='second_level']")
    WebElement secondLevel;
    @FindBy(css = "[data-testid='third_level']")
    WebElement thirdLevel;
    @FindBy(css = "[data-testid='default_level_zone_1']")
    WebElement zone1DefaultLevel;
    @FindBy(css = "[data-testid='second_level_group_1']")
    WebElement group1SecondLevel;
    @FindBy(xpath = "//p[contains(@class,'Dropdown_specialOption__Tbgg')]")
    WebElement hideShowLevel;
    @FindBy(css = "[data-testid='default_level_zone_3']")
    WebElement leafZone;
    @FindBy(css = "[data-testid='add_new_leaf_zone_button']")
    WebElement addLeafZoneNewButton;
    @FindBy(css = "[data-testid='add_new_zone_group_button']")
    WebElement addNewZoneGroupPlusButton;
    @FindBy(css = "[data-testid='default_level_zone_6']")
    WebElement zoneToBeDeleted;
    @FindBy(css = "[data-testid='second_level_group_3']")
    WebElement groupToBeDeleted;

    public SecondLevelAndZones(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        logger = LogManager.getLogger(SecondLevelAndZones.class);
    }

    public void renameLevel(String header, String newLevelName, String using) throws InterruptedException {
        logger.info("renameLevel(String header, String newLevelName, String using) +");
        switch (header) {
            case "default":
                renameLevel(using, defaultLevel, newLevelName);
                logger.info("default ...");
                break;

            case "2nd":
                renameLevel(using, secondLevel, newLevelName);
                logger.info("2nd ...");
                break;
        }
        logger.info("renameLevel(String header, String newLevelName, String using) -");
    }

    public void renameZoneGroup(String header, String newZoneName, String using) {
        logger.info("renameZoneGroup(String header, String newZoneName, String using) +");
        switch (header) {
            case "default":
                renameZoneGroup(using, zone1DefaultLevel, newZoneName);
                logger.info("default ...");
                break;

            case "2nd":
                renameZoneGroup(using, group1SecondLevel, newZoneName);
                logger.info("2nd ...");
                break;
        }
        logger.info("renameZoneGroup(String header, String newZoneName, String using) -");
    }

    public void hideAndShowSecondLevel(String hideOrShow, String fromWhichLevel) {
        logger.info("hideAndShowSecondLevel(" +hideOrShow+ ", String fromWhichLevel) +");
        switch (fromWhichLevel) {
            case "defaultLevel":
                hideAndShowLevel(hideShowLevel, defaultLevel);
                logger.info("defaultLevel ...");
                break;

            case "secondLevel":
                hideAndShowLevel(hideShowLevel, secondLevel);
                logger.info("secondLevel ...");
                break;
        }
        logger.info("hideAndShowSecondLevel(String hideOrShow, String fromWhichLevel) -");
    }

    public void addNewLeafZoneGroup(String header) {
        logger.info("addNewLeafZoneGroup(String header) +");
        switch (header) {
            case "default":
                addNewLeafZoneGroup(leafZone, addLeafZoneNewButton);
                logger.info("default ...");
                break;
            case "2nd":
                addNewLeafZoneGroup(group1SecondLevel, addNewZoneGroupPlusButton);
                logger.info("2nd ...");
        }
        logger.info("addNewLeafZoneGroup(String header) -");
    }

    public void duplicateZoneGroup(String header) {
        logger.info("duplicateZone(String header) +");
        switch (header) {
            case "default":
                duplicateZoneGroup(zone1DefaultLevel, header);
                logger.info("default ...");
                break;

            case "2nd":
                duplicateZoneGroup(group1SecondLevel, header);
                logger.info("2nd ...");
                break;
        }
        logger.info("duplicateZone(String header) -");
    }

    public void addZoneGroupInBetween(String header) {
        logger.info("addZoneInBetween(String header) +");
        switch (header) {
            case "default":
                addZoneGroupInBetween(zone1DefaultLevel);
                logger.info("default ...");
                break;

            case "2nd":
                addZoneGroupInBetween(group1SecondLevel);
                logger.info("2nd ...");
                break;
        }
        logger.info("addZoneInBetween(String header) -");
    }

    public void deleteZoneGroup(String header) {
        logger.info("deleteZoneGroup(String header) +");
        switch (header) {
            case "default":
                deleteZoneGroup(zoneToBeDeleted, header);
                logger.info("default ...");
                break;

            case "2nd":
                deleteZoneGroup(groupToBeDeleted, header);
                logger.info("2nd ...");
                break;
        }
        logger.info("deleteZoneGroup(String header) -");
    }

    public void addThirdLevel() {
        logger.info("addThirdLevel() +");
        addLevel(secondLevel);
        logger.info("addThirdLevel() -");
    }

    public void deleteThirdLevel() {
        logger.info("delete3rdLevel() +");
        deleteLevel(thirdLevel);
        logger.info("delete3rdLevel() -");
    }
}