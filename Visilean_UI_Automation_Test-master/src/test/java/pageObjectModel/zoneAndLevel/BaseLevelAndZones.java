package pageObjectModel.zoneAndLevel;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.BasePOMClass;

public class BaseLevelAndZones extends BasePOMClass {
    Logger logger;
    @FindBy(xpath = "(//span[@class='fc-custom-day-number level-3 '])[2]")
    WebElement currentWeek;
    @FindBy(css = "[data-testid='rename_level']")
    WebElement renameLevelUsingRightClick;
    @FindBy(css = "[data-testid='rename_zone_group']")
    WebElement renameZoneGroupUsingRightClick;
    @FindBy(css = "[data-testid='zone_name_prop_panel']")
    WebElement renameZoneUsingPropPanel;
    @FindBy(css = "[data-testid='hide_show_level']")
    WebElement showOption;
    @FindBy(css = "[data-testid='add_new_zone_group_button']")
    WebElement addZoneGroupPlusButton;
    @FindBy(css = "[data-testid='duplicate_zone_group']")
    WebElement duplicateZoneUsingRightClick;
    @FindBy(css = "[data-testid='delete_zone_group']")
    WebElement deleteZoneUsingRightClick;
    @FindBy(css = "[data-testid='delete_zone_button_in_delete_popup']")
    WebElement deleteButtonInZoneDeletePopup;
    @FindBy(css = "[data-testid='toast_message_zone_task']")
    WebElement toastMessage;
    @FindBy(xpath = "//button[@class='Toastify__close-button Toastify__close-button--light']")
    WebElement toastCloseButton;
    @FindBy(css = "[data-testid='add_level']")
    WebElement addLevel;
    @FindBy(css = "[data-testid='delete_level']")
    WebElement deleteLevelUsingRightClick;
    @FindBy(css = "[data-testid='delete_level_button_in_delete_popup']")
    WebElement deleteButtonInLevelDeletePopup;

    public BaseLevelAndZones(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        logger = LogManager.getLogger(BaseLevelAndZones.class);
    }

    public void renameLevel(String using, WebElement level, String newLevelName) throws InterruptedException {
        logger.info("renameLevel(WebElement level, String newLevelName, String using) +");
        click(currentWeek);
        switch (using) {
            case "RightClick":
                logger.info("RightClick +");
                Thread.sleep(500);
                contextClick(level);
                click(renameLevelUsingRightClick);
                logger.info("RightClick -");
                break;

            case "DoubleClick":
                logger.info("DoubleClick +");
                doubleClick(level);
                logger.info("DoubleClick -");
                break;
        }
        selectAllText();
        clearAllText();
        sendKeys(newLevelName);
        pressEnter();
        logger.info("renameLevel(WebElement level, String newLevelName, String using) -");
    }

    public void renameZoneGroup(String using, WebElement zoneOrGroup, String newZoneName) {
        logger.info("renameZone(String using, WebElement zoneOrGroup, String newZoneName) +");
        click(currentWeek);
        switch (using) {
            case "RightClick":
                contextClick(zoneOrGroup);
                click(renameZoneGroupUsingRightClick);
                logger.info("RightClick ...");
                break;

            case "DoubleClick":
                doubleClick(zoneOrGroup);
                logger.info("DoubleClick ...");
                break;

            case "zone property panel":
                click(zoneOrGroup);
                doubleClick(renameZoneUsingPropPanel);
                logger.info("zone property panel ...");
                break;
        }
        selectAllText();
        clearAllText();
        sendKeys(newZoneName);
        pressEnter();
        click(currentWeek);
        logger.info("renameZone(String using, WebElement zoneOrGroup, String newZoneName) -");
    }

    public void hideAndShowLevel(WebElement levelToHideOrShow, WebElement fromWhichLevel) {
        logger.info("hideAndShowLevel(WebElement levelToHideOrShow, WebElement fromWhichLevel) +");
        contextClick(fromWhichLevel);
        hover(showOption);
        click(levelToHideOrShow);
        logger.info("hideAndShowLevel(WebElement levelToHideOrShow, WebElement fromWhichLevel) -");
    }

    public void addNewLeafZoneGroup (WebElement zoneGroup, WebElement newButton) {
        logger.info("addNewLeafZoneGroup (WebElement zoneGroup, WebElement newButton) +");
        click(currentWeek);
        hover(zoneGroup);
        click(newButton);
        logger.info("addNewLeafZoneGroup (WebElement zoneGroup, WebElement newButton) -");
    }

    public void duplicateZoneGroup(WebElement zoneGroup, String header) {
        logger.info("duplicateZoneGroup(WebElement zoneGroup, String header) +");
        click(currentWeek);
        contextClick(zoneGroup);
        click(duplicateZoneUsingRightClick);
        if(header.equalsIgnoreCase("default") && getText(toastMessage).contains("duplicated"))
            click(toastCloseButton);
        logger.info("duplicateZoneGroup(WebElement zoneGroup, String header) -");
    }

    public void addZoneGroupInBetween(WebElement zoneGroup) {
        logger.info("addZoneGroupInBetween(WebElement zoneGroup) +");
        click(currentWeek);
        hover(zoneGroup);
        click(addZoneGroupPlusButton);
        logger.info("addZoneGroupInBetween(WebElement zoneGroup) -");
    }

    public void deleteZoneGroup(WebElement zoneGroup, String header) {
        logger.info("deleteZoneGroup(String header) +");
        click(currentWeek);
        hover(zoneGroup);
        contextClick(zoneGroup);
        click(deleteZoneUsingRightClick);
        click(deleteButtonInZoneDeletePopup);
        if(header.equalsIgnoreCase("default") && getText(toastMessage).contains("Deleted"))
            click(toastCloseButton);
        logger.info("deleteZoneGroup(String header) -");
    }

    public void addLevel(WebElement level) {
        logger.info("addLevel(String header) +");
        click(currentWeek);
        contextClick(level);
        click(addLevel);
        logger.info("addLevel(String header) -");
    }

    public void deleteLevel(WebElement level) {
        logger.info("deleteLevel(String header) +");
        click(currentWeek);
        if(getText(level).contains("New Level"))
            contextClick(level);
        click(deleteLevelUsingRightClick);
        click(deleteButtonInLevelDeletePopup);
        logger.info("deleteLevel(String header) -");
    }
}