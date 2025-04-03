package pageObjectModel.zoneAndLevel;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdLevelAndZones extends BaseLevelAndZones {
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
    @FindBy(css = "[data-testid='third_level_group_1']")
    WebElement group1ThirdLevel;
    @FindBy(xpath = "//p[text()='Level 2']")
    WebElement secondLevelToHideOrShow;
    @FindBy(xpath = "//p[text()='New Level']")
    WebElement thirdLevelToHideOrShow;
    @FindBy(css = "[data-testid='default_level_zone_7']")
    WebElement leafZone;
    @FindBy(css = "[data-testid='second_level_group_3']")
    WebElement leafGroup2ndLevel;
    @FindBy(css = "[data-testid='third_level_group_1']")
    WebElement leafGroup3rdLevel;
    @FindBy(css = "[data-testid='add_new_leaf_zone_button']")
    WebElement addLeafZoneNewButton;
    @FindBy(css = "[data-testid='add_new_zone_group_button']")
    WebElement addNewZoneGroupPlusButton;
    @FindBy(css = "[data-testid='default_level_zone_10']")
    WebElement zoneToBeDeleted;
    @FindBy(css = "[data-testid='second_level_group_3']")
    WebElement groupFor2ndLevelToBeDeleted;
    @FindBy(css = "[data-testid='third_level_group_3']")
    WebElement groupFor3rdLevelToBeDeleted;

    public ThirdLevelAndZones(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        logger = LogManager.getLogger(ThirdLevelAndZones.class);
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

            case "3rd":
                renameLevel(using, thirdLevel, newLevelName);
                logger.info("3rd ...");
                break;
        }
        logger.info("renameLevel(String header, String newLevelName, String using) -");
    }

    public void renameZoneGroup(String header, String newZoneName, String using) {
        logger.info("renameZone(String newZoneName, String using) +");
        switch (header) {
            case "default":
                renameZoneGroup(using, zone1DefaultLevel, newZoneName);
                logger.info("default ...");
                break;

            case "2nd":
                renameZoneGroup(using, group1SecondLevel, newZoneName);
                logger.info("2nd ...");
                break;

            case "3rd":
                renameZoneGroup(using, group1ThirdLevel, newZoneName);
                logger.info("3rd ...");
                break;
        }
        logger.info("renameZone(String newZoneName, String using) -");
    }

    public void hideAndShowLevel(String hideOrShow, String level, String fromWhichLevel) {
        logger.info("hideAndShowLevel(" +hideOrShow+ ", String level, String fromWhichLevel) +");
        click(currentWeek);
        switch (level) {
            case "thirdLevel":
                hideAndShowLevel(fromWhichLevel, thirdLevelToHideOrShow);
                logger.info("thirdLevel ...");
                break;
            case "secondLevel":
                hideAndShowLevel(fromWhichLevel, secondLevelToHideOrShow);
                logger.info("secondLevel ...");
                break;
        }
        logger.info("hideAndShowLevel(String hideOrShow, String level, String fromWhichLevel) -");
    }

    public void hideAndShowLevel(String fromWhichLevel, WebElement levelToHideOrShow) {
        logger.info("hideAndShowLevel(String fromWhichLevel, WebElement levelToHideOrShow) +");
        switch (fromWhichLevel) {
            case "defaultLevel":
                hideAndShowLevel(levelToHideOrShow, defaultLevel);
                logger.info("defaultLevel ...");
                break;
            case "secondLevel":
                hideAndShowLevel(levelToHideOrShow, secondLevel);
                logger.info("secondLevel ...");
                break;
            case "thirdLevel":
                hideAndShowLevel(levelToHideOrShow, thirdLevel);
                logger.info("thirdLevel ...");
                break;
        }
        logger.info("hideAndShowLevel(String fromWhichLevel, WebElement levelToHideOrShow) -");
    }

    public void addNewLeafZoneGroup(String header) {
        logger.info("addNewLeafZone(String header) +");
        switch (header) {
            case "default":
                addNewLeafZoneGroup(leafZone, addLeafZoneNewButton);
                logger.info("default ...");
                break;
            case "2nd":
                addNewLeafZoneGroup(leafGroup2ndLevel, addNewZoneGroupPlusButton);
                logger.info("2nd ...");
                break;
            case "3rd":
                addNewLeafZoneGroup(leafGroup3rdLevel, addNewZoneGroupPlusButton);
                logger.info("3rd ...");
        }
        logger.info("addNewLeafZone(String header) -");
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

            case "3rd":
                duplicateZoneGroup(group1ThirdLevel, header);
                logger.info("3rd ...");
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

            case "3rd":
                addZoneGroupInBetween(group1ThirdLevel);
                logger.info("3rd ...");
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
                deleteZoneGroup(groupFor2ndLevelToBeDeleted, header);
                logger.info("2nd ...");
                break;

            case "3rd":
                deleteZoneGroup(groupFor3rdLevelToBeDeleted, header);
                logger.info("3rd ...");
                break;
        }
        logger.info("deleteZoneGroup(String header) -");
    }
}