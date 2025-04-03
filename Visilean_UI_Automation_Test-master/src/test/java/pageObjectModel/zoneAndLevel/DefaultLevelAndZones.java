package pageObjectModel.zoneAndLevel;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DefaultLevelAndZones extends BaseLevelAndZones {
    Logger logger;
    @FindBy(css = "[data-testid='default_level']")
    WebElement defaultLevel;
    @FindBy(css = "[data-testid='second_level']")
    WebElement secondLevel;
    @FindBy(css = "[data-testid='default_level_zone_1']")
    WebElement zone1DefaultLevel;
    @FindBy(css = "[data-testid='default_level_zone_4']")
    WebElement zoneToBeDeleted;
    @FindBy(css = "[data-testid='add_new_leaf_zone_button']")
    WebElement addLeafZoneNewButton;

    public DefaultLevelAndZones(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        logger = LogManager.getLogger(DefaultLevelAndZones.class);
    }

    public void renameDefaultLevel(String newLevelName, String using) throws InterruptedException {
        logger.info("renameDefaultLevel(String newLevelName, String using) +");
        renameLevel(using, defaultLevel, newLevelName);
        logger.info("renameDefaultLevel(String newLevelName, String using) -");
    }

    public void renameDefaultZone(String newZoneName, String using) {
        logger.info("renameDefaultZone(String newZoneName, String using) +");
        renameZoneGroup(using, zone1DefaultLevel, newZoneName);
        logger.info("renameDefaultZone(String newZoneName, String using) -");
    }

    public void addNewLeafZone() {
        logger.info("addNewLeafZone() +");
        addNewLeafZoneGroup(zone1DefaultLevel, addLeafZoneNewButton);
        logger.info("addNewLeafZone() -");
    }

    public void duplicateZone() {
        logger.info("duplicateZone() +");
        duplicateZoneGroup(zone1DefaultLevel, "default");
        logger.info("duplicateZone() -");
    }

    public void addZoneInBetween() {
        logger.info("addZoneInBetween() +");
        addZoneGroupInBetween(zone1DefaultLevel);
        logger.info("addZoneInBetween() -");
    }

    public void deleteZone() {
        logger.info("deleteZone() +");
        deleteZoneGroup(zoneToBeDeleted, "default");
        logger.info("deleteZone() -");
    }

    public void addSecondLevel() {
        logger.info("addSecondLevel() +");
        addLevel(defaultLevel);
        logger.info("addSecondLevel() -");
    }

    public void deleteSecondLevel() {
        logger.info("deleteSecondLevel() +");
        deleteLevel(secondLevel);
        logger.info("deleteSecondLevel() -");
    }
}