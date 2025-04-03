package pageObjectModel.tasks;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.BasePOMClass;
import utilities.GlobalStrings;
import java.util.List;
import static org.testng.Assert.assertEquals;

public class BaseTaskScenarios extends BasePOMClass {
    Logger logger;
    @FindBy(xpath = "(//span[@class='fc-custom-day-number level-3 '])[2]")
    WebElement currentWeek;
    @FindBy(css = "[data-testid='task_name_basic_prop_panel']")
    WebElement taskNameBasicPropPanel;
    @FindBy(css = "[data-testid='trade_question_mark_icon_basic_prop_panel']")
    WebElement tradeQueMarkIconBasicPropPanel;
    @FindBy(css = "[data-testid='trade_allocated_basic_prop_panel']")
    WebElement tradeAlreadyPresent;
    @FindBy(css = "[data-testid='trade-1']")
    WebElement trade1InTradeDropDown;
    @FindBy(css = "[data-testid='trade-2']")
    WebElement trade2InTradeDropDown;
    @FindBy(css = "[data-testid='trade-3']")
    WebElement trade3InTradeDropDown;
    @FindBy(css = "[data-testid='duration_basic_prop_panel']")
    WebElement taskDurationBasicPropPanel;
    @FindBy(css = "[data-testid='resources_basic_prop_panel']")
    WebElement resourcesBasicPropPanel;
    @FindBy(css = "[data-testid='resources_minus_button_basic_prop_panel']")
    WebElement resourcesMinusButton;
    @FindBy(css = "[data-testid='resources_plus_button_basic_prop_panel']")
    WebElement resourcesPlusButton;
    @FindBy(css = "[data-testid='description_basic_prop_panel']")
    WebElement descriptionBasicPropPanel;
    @FindBy(xpath = "//div[contains(@class,'ContentEditable_text__pR6c4 p-lg-600 PropertyPanelSection_collapsed-task-detail-name__qKmVh')]")
    WebElement taskNameTopMainProPanel;
    @FindBy(xpath = "//input[@class='Input_input__eXwaT']")
    WebElement taskNameMainPropPanel;
    @FindBy(xpath = "//button[contains(@class,'StatusButton_md__KhXnO p-sm-600')]")
    WebElement taskStatusButtonQuickProPanel;
    @FindBy(xpath = "(//p[@class='PropertyTaskInfo_user__nuUJf'])[2]")
    WebElement tradeNameQuickProPanel;
    @FindBy(xpath = "//p[@class='EditableChip_chip-text__5DSGN']")
    WebElement taskTypeTextQuickPropPanel;
    @FindBy(xpath = "//div[@class='PropertyTaskInfo_trade-img__a8P3h']")
    WebElement tradeIconTopMainPropPanel;
    @FindBy(xpath = "(//div[@class='SelectBox_select__O6eEX css-13cymwt-control'])[3]")
    WebElement tradeDropdownIconMainPropPanel;
    @FindBy(xpath = "(//div[@class='StatefulMenu_item__sekdg p-md-500'])[4]")
    WebElement trade2DropDownOptionMainProPanel;
    @FindBy(xpath = "//textarea[@class='p-md-500 TextArea_textarea__BzDhT']")
    WebElement descriptionMainPropPanel;
    @FindBy(xpath = "//div[@aria-label='Collapse']")
    WebElement collapseButtonMainPropPanel;
    @FindBy(css = "[data-testid='select_tasks_in_zone_group']")
    WebElement selectTasksUsingRightClick;
    @FindBy(xpath = "//p[@class='p-sm-500']")
    WebElement selectTasksToast;
    @FindBy(xpath = "//span[@class='SchedulerFooter_icon__LWeZ+']")
    WebElement selectTasksToastCloseIcon;
    @FindBy(css = "[data-testid='duplicate_zone_group_with_tasks']")
    WebElement duplicateZoneWithTasksRightClick;
    @FindBy(css = "[data-testid='delete_zone_group']")
    WebElement deleteZoneWithTasksRightClick;
    @FindBy(css = "[data-testid='delete_zone_button_in_delete_popup']")
    WebElement deleteButtonInZoneDeletePopup;
    @FindBy(css = "[data-testid='toast_message_zone_task']")
    WebElement toastMessage;
    @FindBy(xpath = "//div[@class='Toast_title__CgMzv']")
    WebElement toastMessageStatusUpdate;
    @FindBy(xpath = "//button[@class='Toastify__close-button Toastify__close-button--light']")
    WebElement toastCloseButton;
    @FindBy(css = "[data-testid='week_day_count']")
    WebElement horizontalMoveCount;
    @FindBy(css = "[data-testid='horizontal_right_icon']")
    WebElement moveTaskHorizontalRight;
    @FindBy(css = "[data-testid='horizontal_left_icon']")
    WebElement moveTaskHorizontalLeft;
    @FindBy(css = "[data-testid='move_vertical_icon']")
    WebElement moveTasksVerticalIcon;
    @FindBy(css = "[data-testid='vertical_up_icon']")
    WebElement moveTaskVerticalUp;
    @FindBy(css = "[data-testid='vertical_down_icon']")
    WebElement moveTaskVerticalDown;
    @FindBy(css = "[data-testid='copy_tasks_icon']")
    WebElement copyButtonHeader;
    @FindBy(xpath = "(//div[@class='EditableChip_action-button__C-zan EditableChip_chip-text-parent__oody2'])[1]")
    WebElement taskTypeButtonQuickPropPanel;
    @FindBy(xpath = "(//div[@class='SelectBox_container__uPE7U css-hlgwow'])[2]")
    WebElement taskTypeButtonDetailedPropPanel;
    @FindBy(xpath = "(//div[@class='EditPropertiesTab_calendar-picker-input__NCAtP'])[1]")
    WebElement taskPlannedStartDateAdvPropPanel;
    @FindBy(xpath = "(//div[contains(@class,'react-datepicker__day--selected')])")
    WebElement currentSelectedDate;
    @FindBy(xpath = "((//div[contains(@class,'react-datepicker__day--selected')]))//following-sibling::div[2]")
    WebElement following2ndDate;
    @FindBy(xpath = "(//div[@class='EditPropertiesTab_calendar-picker-input__NCAtP'])[2]")
    WebElement taskPlannedEndDateAdvPropPanel;
    @FindBy(xpath = "(//div[@class='EditableChip_action-button__C-zan EditableChip_chip-text-parent__oody2'])[2]")
    WebElement priorityButtonQuickPropPanel;
    @FindBy(xpath = "//p[text()='High']")
    WebElement highPriorityQuickAdvPropPanel;
    @FindBy(xpath = "//p[text()='Medium']")
    WebElement mediumPriorityQuickAdvPropPanel;
    @FindBy(xpath = "//p[text()='Low']")
    WebElement lowPriorityQuickAdvPropPanel;
    @FindBy(xpath = "//label[text()='Priority']")
    WebElement priorityLabelDetailedProPanel;
    @FindBy(xpath = "//div[text()='High']")
    WebElement highPriorityDetailedAdvPropPanel;
    @FindBy(xpath = "//div[text()='Medium']")
    WebElement mediumPriorityDetailedAdvPropPanel;
    @FindBy(xpath = "//div[text()='Low']")
    WebElement lowPriorityDetailedAdvPropPanel;
    @FindBy(xpath = "//div[@class='PropertyPanelSection_location-container__mUMDQ ']")
    WebElement zoneChangeQuickPropPanel;
    @FindBy(xpath = "//div[@class='PropertyPanelSection_inner-zone-name__ummpY']")
    WebElement zoneNameTextQuickProPanel;
    @FindBy(xpath = "//div[@class='MultiselectPopup_popover-trigger__DC75y']")
    WebElement zoneChangeDetailedPropPanel;
    @FindBy(xpath = "//input[@placeholder='Search here']")
    WebElement searchBoxZoneUpdateProPanel;
    @FindBy(xpath = "(//input[@class='Checkbox_input-checkbox__ATu5L'])[3]")
    WebElement zoneCheckBox1ConstructionTask;
    @FindBy(xpath = "(//input[@class='Checkbox_input-checkbox__ATu5L'])[1]")
    WebElement zoneCheckBox2ConstructionTask;
    @FindBy(xpath = "(//input[@class='Checkbox_input-checkbox__ATu5L'])[2]")
    WebElement zoneCheckBox1DesignTask;
    @FindBy(xpath = "(//input[@class='Checkbox_input-checkbox__ATu5L'])[1]")
    WebElement zoneCheckBox2DesignTask;
    @FindBy(xpath = "//img[contains(@class,'PropertyTaskInfo_avatar__3VIgm')]")
    WebElement assignedToImageQuickProPanel;
    @FindBy(xpath = "(//p[@class='PropertyTaskInfo_user__nuUJf'])[1]")
    WebElement ownerNameQuickPropPanel;
    @FindBy(xpath = "(//div[@class='OwnerPicker_label-owner-type__F-hSv'])[2]")
    WebElement assignedToOwner1QuickProPanel;
    @FindBy(xpath = "//input[@placeholder='Ex. Naren Kumar']")
    WebElement assignOwnerSearchBoxQuickPropPanel;
    @FindBy(xpath = "(//div[@class='ActionCard_user-chip__sdIIX ActionCard_user-not-selected__sSHsi'])[3]")
    WebElement assignOwner2QuickProPanel;
    @FindBy(xpath = "//button[text()='Assign']")
    WebElement assignButton;
    @FindBy(xpath = "(//div[@class=\"SelectBox_container__uPE7U css-hlgwow\"])[1]")
    WebElement ownerFieldDetailedProPanel;
    @FindBy(xpath = "(//div[@class='StatefulMenu_item__sekdg p-md-500'])[4]")
    WebElement chooseOwner3DetailedPropPanel;

    @FindBy(xpath = "//button[contains(@class,'StatusButton_md__KhXnO')]")
    WebElement currentStatusButtonQuickPropPanel;
    @FindBy(xpath = "//p[contains(@class,'Dropdown')]")
    List<WebElement> statusOptionsQuickProPanel;
    @FindBy(xpath = "//button[@class='Button_btn-primary__lSvIf Button_md__XQtoY p-sm-600 Button_full-width__ts3Bx']")
    WebElement newStatusButtonAdvProPanel;

    @FindBy(xpath = "(//div[contains(@class,'ChangeStatusCard_user-chip__sizDQ')])[1]")
    WebElement ownerToSelectUnassign2NotReady;
    @FindBy(xpath = "//div[@class='SelectBox_select__O6eEX css-13cymwt-control']")
    WebElement reasonFieldAdvPropPanel;
    @FindBy(xpath = "//div[text()='Material']")
    WebElement materialReasonForLate;
    @FindBy(xpath = "//div[text()='Manpower']")
    WebElement manpowerReasonForLate;
    @FindBy(xpath = "//div[text()='Space']")
    WebElement spaceReasonForLate;

    public BaseTaskScenarios(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        logger = LogManager.getLogger(BaseTaskScenarios.class);
    }

    public void createTaskWithOutBasicProperty(WebElement source, WebElement destination, int xOffset, int yOffset) throws InterruptedException {
        logger.info("createTaskWithOutBasicProperty(WebElement source, WebElement destination, int xOffset, int yOffset) +");
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(500);
        dragAndDrop(source, destination, xOffset, yOffset);
        click(currentWeek);
        Thread.sleep(500);
        pressEscape();
        logger.info("createTaskWithOutBasicProperty(WebElement source, WebElement destination, int xOffset, int yOffset) -");
    }

    public void createTaskWithBasicProperty(WebElement source, WebElement destination, int xOffset, int yOffset,
                                            String taskName, WebElement tradeName, String taskDuration, String taskResources,
                                            String taskDescription) throws InterruptedException {
        logger.info("createTaskWithBasicProperty() +");
        dragAndDrop(source, destination, xOffset, yOffset);

        sendKeys(taskNameBasicPropPanel, taskName);

        click(tradeQueMarkIconBasicPropPanel);
        click(tradeName);

        click(taskDurationBasicPropPanel);
        selectAllText();
        sendKeys(taskDurationBasicPropPanel, taskDuration);

        click(resourcesBasicPropPanel);
        selectAllText();
        sendKeys(resourcesBasicPropPanel, taskResources);
        Thread.sleep(1000);
        click(resourcesPlusButton);
        click(resourcesPlusButton);
        click(resourcesMinusButton);
        Thread.sleep(1000);

        click(descriptionBasicPropPanel);
        sendKeys(descriptionBasicPropPanel, taskDescription);

        click(currentWeek);
        Thread.sleep(500);
        pressEscape();
        logger.info("createTaskWithBasicProperty() -");
    }

    public void clickOnTaskCard(WebElement taskToVerify) throws InterruptedException {
        logger.info("clickOnTaskCard(WebElement taskToVerify) +");
        click(taskToVerify);
        Thread.sleep(500);
        logger.info("clickOnTaskCard(WebElement taskToVerify) -");
    }

    public void verifyTaskStatus(String taskStatus) throws InterruptedException {
        logger.info("verifyTaskStatus(String taskStatus) +");
        hover(taskStatusButtonQuickProPanel);
        assertEquals(getText(taskStatusButtonQuickProPanel), taskStatus);
        Thread.sleep(500);
        logger.info("verifyTaskStatus(String taskStatus) -");
    }

    public void taskNameUpdate(String using, WebElement taskToUpdate, String taskName) throws InterruptedException {
        logger.info("taskNameUpdate(String using) +");
        switch (using) {
            case "basic Property Panel":
                contextClick(taskToUpdate);
                sendKeys(taskNameBasicPropPanel, taskName);
                click(currentWeek);
                logger.info("basic Property Panel ...");
                break;

            case "top main property panel":
                click(taskToUpdate);
                doubleClick(taskNameTopMainProPanel);
                selectAllText();
                clearAllText();
                sendKeys(taskName);
                click(collapseButtonMainPropPanel);
                logger.info("top main property panel ...");
                break;

            case "bottom main Property Panel":
                click(taskToUpdate);
                hover(taskNameMainPropPanel);
                click(taskNameMainPropPanel);
                Thread.sleep(500);
                selectAllText();
                clearAllText();
                sendKeys(taskNameMainPropPanel, taskName);
                click(collapseButtonMainPropPanel);
                logger.info("bottom main Property Panel ...");
                break;
        }
        Thread.sleep(500);
        pressEscape();
        logger.info("taskNameUpdate(String using) -");
    }

    public void verifyTaskName(String taskName) throws InterruptedException {
        logger.info("verifyTaskName(String taskName) +");
        hover(taskNameTopMainProPanel);
        assertEquals(getText(taskNameTopMainProPanel), taskName);
        Thread.sleep(500);
        logger.info("verifyTaskName(String taskName) -");
    }

    public void taskTradeUpdate(String using, WebElement taskToUpdate, WebElement tradeName) throws InterruptedException {
        logger.info("taskTradeUpdate(String using) +");
        switch (using) {
            case "basic Property Panel":
                contextClick(taskToUpdate);
                click(tradeQueMarkIconBasicPropPanel);
                click(tradeName);
                click(currentWeek);
                logger.info("basic Property Panel ...");
                break;

            case "already present":
                contextClick(taskToUpdate);
                click(tradeAlreadyPresent);
                click(tradeName);
                click(currentWeek);
                logger.info("already present ...");
                break;

            case "top main property panel":
                click(taskToUpdate);
                click(tradeIconTopMainPropPanel);
                click(tradeName);
                click(collapseButtonMainPropPanel);
                logger.info("top main Property Panel ...");
                break;

            case "bottom main Property Panel":
                click(taskToUpdate);
                hover(tradeDropdownIconMainPropPanel);
                click(tradeDropdownIconMainPropPanel);
                Thread.sleep(1000);
                click(tradeName);
                click(collapseButtonMainPropPanel);
                logger.info("drop down main Property Panel ...");
                break;
        }
        Thread.sleep(500);
        pressEscape();
        Thread.sleep(500);
        logger.info("taskTradeUpdate(String using) -");
    }

    public void verifyTaskTrade(String taskTrade) throws InterruptedException {
        logger.info("verifyTaskTrade(String taskTrade) +");
        hover(tradeNameQuickProPanel);
        assertEquals(getText(tradeNameQuickProPanel), taskTrade);
        Thread.sleep(500);
        logger.info("verifyTaskTrade(String taskTrade) -");
    }

    public void taskDurationUpdate(String using, WebElement taskToUpdate, String duration) throws InterruptedException {
        logger.info("taskDurationUpdate() +");
        switch (using) {
            case "basic Property Panel":
                contextClick(taskToUpdate);
                click(taskDurationBasicPropPanel);
                selectAllText();
                sendKeys(taskDurationBasicPropPanel, duration);
                click(taskToUpdate);
                click(collapseButtonMainPropPanel);
                logger.info("basic Property Panel ...");
                break;

            case "advance Property Panel":
                click(taskToUpdate);
                hover(taskPlannedStartDateAdvPropPanel);
                click(taskPlannedStartDateAdvPropPanel);
                String[] startDate = (currentSelectedDate.getAttribute("class").split(" "))[1].split("--");
                logger.info("current startDate: " +startDate[1]);
//                updateDateAdvancePropPanel(startDate[1]);
                click(following2ndDate);

                hover(taskPlannedEndDateAdvPropPanel);
                click(taskPlannedEndDateAdvPropPanel);
                String[] endDate = (currentSelectedDate.getAttribute("class").split(" "))[1].split("--");
                logger.info("current endDate: " +endDate[1]);
//                updateDateAdvancePropPanel(endDate[1]);
                click(following2ndDate);
                logger.info("advance Property Panel ...");
                break;
        }
        Thread.sleep(500);
        pressEscape();
        logger.info("taskDurationUpdate() -");
    }

//    TODO: Update the logic
    private void updateDateAdvancePropPanel(String date) throws InterruptedException {
        logger.info("updateDateAdvancePropPanel(String date) +");
        Thread.sleep(500);
        if(Integer.parseInt(date) >= 1 && Integer.parseInt(date) <= 20)
            click(following2ndDate);
        else if (Integer.parseInt(date) >= 21 && Integer.parseInt(date) <=31) {
            click(following2ndDate);
        }
        Thread.sleep(500);
        logger.info("updateDateAdvancePropPanel(String date) -");
    }

    public void taskResourcesUpdate(WebElement taskToUpdate, String resources) throws InterruptedException {
        logger.info("taskResourcesUpdate() +");
        contextClick(taskToUpdate);
        click(resourcesBasicPropPanel);
        selectAllText();
        sendKeys(resourcesBasicPropPanel, resources);
        Thread.sleep(500);
        click(resourcesPlusButton);
        click(resourcesMinusButton);
        Thread.sleep(500);
        click(taskToUpdate);
        click(collapseButtonMainPropPanel);
        Thread.sleep(500);
        pressEscape();
        logger.info("taskResourcesUpdate() -");
    }

    public void taskDescriptionUpdate(String using, WebElement taskToUpdate, String taskDescription) throws InterruptedException {
        logger.info("taskTradeDescription(String using) +");
        switch (using) {
            case "basic Property Panel":
                contextClick(taskToUpdate);
                click(descriptionBasicPropPanel);
                sendKeys(descriptionBasicPropPanel, taskDescription);
                click(taskToUpdate);
                click(collapseButtonMainPropPanel);
                logger.info("basic Property Panel ...");
                break;

            case "main Property Panel":
                click(taskToUpdate);
                hover(descriptionMainPropPanel);
                click(descriptionMainPropPanel);
                selectAllText();
                clearAllText();
                sendKeys(taskDescription);
                click(collapseButtonMainPropPanel);
                logger.info("main Property Panel ...");
                break;
        }
        Thread.sleep(500);
        pressEscape();
        logger.info("taskTradeDescription(String using) -");
    }

    public void selectTasks(String tasksCount, WebElement zoneOrGroup) throws InterruptedException {
        logger.info("selectTasks(String from) +");
        contextClick(zoneOrGroup);
        click(selectTasksUsingRightClick);
        if(getText(selectTasksToast).equalsIgnoreCase(tasksCount))
                    click(selectTasksToastCloseIcon);
        Thread.sleep(500);
        pressEscape();
        logger.info("selectTasks(String from) -");
    }

    public void zoneDuplicateWithTasks(String from, WebElement zone) throws InterruptedException {
        logger.info("zoneDuplicateWithTasks(String from) +");
        switch (from) {
            case "default Level zone":
                contextClick(zone);
                click(duplicateZoneWithTasksRightClick);
                logger.info("default Level first zone ...");
                break;

            case "second Level first group":
                logger.info("second Level first group ...");
                break;
        }
        if(getText(toastMessage).contains("duplicated with tasks successfully"))
            click(toastCloseButton);
        Thread.sleep(500);
        pressEscape();
        logger.info("zoneDuplicateWithTasks(String from) -");
    }

    public void zoneDeleteWithTasks(String from, WebElement zone) throws InterruptedException {
        logger.info("zoneDeleteWithTasks(String from) +");
        switch (from) {
            case "default Level":
                contextClick(zone);
                click(deleteZoneWithTasksRightClick);
                click(deleteButtonInZoneDeletePopup);
                Thread.sleep(500);
                if(getText(toastMessage).contains("Deleted"))
                    click(toastCloseButton);
                logger.info("default Level ...");
                break;

            case "second Level":
                logger.info("second Level ...");
                break;
        }
        pressEscape();
        Thread.sleep(500);
        logger.info("zoneDeleteWithTasks(String from) -");
    }

    public void moveTasks(String tasks, String direction, WebElement zoneOrTaskToOperate) throws InterruptedException {
        logger.info("moveTasks(String direction) +");
        switch (tasks) {
            case "Single":
                click(zoneOrTaskToOperate);
                logger.info("Single ...");
                break;

            case "Multiple":
                contextClick(zoneOrTaskToOperate);
                click(selectTasksUsingRightClick);
                logger.info("Multiple ...");
                break;
        }
// TODO: Update the logic
        switch (direction) {
            case "Horizontally":
                click(horizontalMoveCount);
                selectAllText();
                clearAllText();
                sendKeys(GlobalStrings.moveCount);
                click(currentWeek);
                click(moveTaskHorizontalRight);
                Thread.sleep(2000);
                click(moveTaskHorizontalRight);
                Thread.sleep(2000);
                click(moveTaskHorizontalLeft);
                Thread.sleep(2000);
                logger.info("Horizontal ...");
                break;

            case "Vertically":
                click(moveTasksVerticalIcon);
                Thread.sleep(500);
                click(moveTaskVerticalDown);
                Thread.sleep(2000);
                click(moveTaskVerticalDown);
                Thread.sleep(2000);
                click(moveTaskVerticalUp);
                Thread.sleep(2000);
                logger.info("Vertical ...");
                break;
        }
        pressEscape();
        Thread.sleep(1000);
        logger.info("moveTasks(String direction) -");
    }

    public void copyTasks(String tasks, String using, WebElement zoneOrTaskToOperate) throws InterruptedException {
        logger.info("copyTasks(String tasks, WebElement zoneOrTaskToOperate) +");
        switch (tasks) {
            case "Single":
                click(zoneOrTaskToOperate);
                logger.info("Single ...");
                break;

            case "Multiple":
                logger.info("Multiple ...");
                break;
        }

        switch (using) {
            case "headerCopyButton":
                click(copyButtonHeader);
                logger.info("headerCopyButton ...");
                break;

            case "keyboard":
                actions.keyDown(Keys.CONTROL)
                       .sendKeys("d")
                       .keyUp(Keys.CONTROL)
                       .build()
                       .perform();
                logger.info("keyboard ...");
                break;
        }
        Thread.sleep(1000);
        logger.info("copyTasks(String tasks, WebElement zoneOrTaskToOperate) -");
    }

    public void changeTaskType(WebElement taskToUpdate, String from, WebElement taskTypeToDesignOrConstruction) throws InterruptedException {
        logger.info("changeTaskType(WebElement taskToUpdate, String taskType) +");
        click(taskToUpdate);
        Thread.sleep(500);
        switch (from) {
            case "Quick Advance Property Panel":
                hover(taskTypeButtonQuickPropPanel);
                click(taskTypeButtonQuickPropPanel);
                logger.info("Quick Advance Property Panel ...");
                break;
            case "Detailed Advance Property Panel":
                hover(taskTypeButtonDetailedPropPanel);
                click(taskTypeButtonDetailedPropPanel);
                logger.info("Detailed Advance Property Panel ...");
                break;
        }
        click(taskTypeToDesignOrConstruction);
        Thread.sleep(500);
        click(currentWeek);
        Thread.sleep(500);
        click(collapseButtonMainPropPanel);
        Thread.sleep(500);
        pressEscape();
        logger.info("changeTaskType(WebElement taskToUpdate, String taskType) -");
    }

    public void verifyTaskType(String taskType) throws InterruptedException {
        logger.info("verifyTaskType(String taskType) +");
        hover(taskTypeTextQuickPropPanel);
        assertEquals(getText(taskTypeTextQuickPropPanel), taskType);
        Thread.sleep(500);
        logger.info("verifyTaskType(String taskType) -");
    }

    public void changeTaskPriority(WebElement taskToUpdate, String from, WebElement priority) throws InterruptedException {
        logger.info("changeTaskPriority(WebElement taskToUpdate, String from, WebElement priority) +");
        click(taskToUpdate);
        switch (from) {
            case "Quick Advance Property Panel":
                click(priorityButtonQuickPropPanel);
                click(priority);
                logger.info("Quick Advance Property Panel ...");
                break;

            case "Detailed Advance Property Panel":
                hover(priorityLabelDetailedProPanel);
                click(priority);
                logger.info("Detailed Advance Property Panel ...");
                break;
        }
        Thread.sleep(500);
        click(collapseButtonMainPropPanel);
        Thread.sleep(500);
        pressEscape();
        Thread.sleep(500);
        logger.info("changeTaskPriority(WebElement taskToUpdate, String from, WebElement priority) -");
    }

    public void changeZone(String tasks, WebElement taskOrZone, String using, String groupNameToSearch, WebElement destinationZoneCheckbox) throws InterruptedException {
        logger.info("changeZone(String tasks, WebElement taskOrZone, String using) +");
        switch (tasks) {
            case "Single":
                click(taskOrZone);
                logger.info("Single ...");
                break;

            case "Multiple":
                logger.info("Multiple ...");
                break;
        }

        Thread.sleep(500);
        switch (using) {
            case "Quick Advance Property Panel":
                click(zoneChangeQuickPropPanel);
                sendKeys(searchBoxZoneUpdateProPanel, groupNameToSearch);
                logger.info("Quick Advance Property Panel ...");
                break;

            case "Detailed Advance Property Panel":
                hover(zoneChangeDetailedPropPanel);
                click(zoneChangeDetailedPropPanel);
                sendKeys(searchBoxZoneUpdateProPanel, groupNameToSearch);
                logger.info("Detailed Advance Property Panel ...");
                break;
        }
        Thread.sleep(500);
        destinationZoneCheckbox.click();
        Thread.sleep(500);
        click(currentWeek);
        click(collapseButtonMainPropPanel);
        Thread.sleep(500);
        pressEscape();
        Thread.sleep(1000);
        logger.info("changeZone(String tasks, WebElement taskOrZone, String using) -");
    }

    public void verifyTaskZoneName(String zoneName) throws InterruptedException {
        logger.info("verifyTaskZoneName(String zoneName) +");
        hover(zoneNameTextQuickProPanel);
        assertEquals(getText(zoneNameTextQuickProPanel), zoneName);
        Thread.sleep(500);
        logger.info("verifyTaskZoneName(String zoneName) -");
    }

    public void allocateOwner(String tasks, WebElement taskOrZone, String using, WebElement owner) throws InterruptedException {
        logger.info("allocateOwner(String tasks, WebElement taskOrZone, String using, WebElement owner) +");
        switch (tasks) {
            case "Single":
                click(taskOrZone);
                logger.info("Single ...");
                break;

            case "Multiple":
                logger.info("Multiple ...");
                break;
        }

        switch (using) {
            case "Assigned to quick Prop Panel":
                Thread.sleep(500);
                click(assignedToImageQuickProPanel);
                Thread.sleep(500);
                click(owner);
                logger.info("Assigned to quick Prop Panel ...");
                break;

            case "Assign Owner quick Prop Panel":
                hover(assignOwnerSearchBoxQuickPropPanel);
                Thread.sleep(500);
                click(owner);
                Thread.sleep(500);
                click(assignButton);
                logger.info("Assign Owner quick Prop Panel ...");
                break;

            case "Owner detailed prop panel":
                hover(ownerFieldDetailedProPanel);
                click(ownerFieldDetailedProPanel);
                Thread.sleep(500);
                click(owner);
                logger.info("Owner detailed prop panel ...");
                break;
        }
        Thread.sleep(500);
        click(currentWeek);
        Thread.sleep(500);
        click(collapseButtonMainPropPanel);
        pressEscape();
        Thread.sleep(1000);
        logger.info("allocateOwner(String tasks, WebElement taskOrZone, String using, WebElement owner) -");
    }

    public void verifyTaskOwner(String taskOwner) throws InterruptedException {
        logger.info("verifyTaskOwner(String taskOwner) +");
        hover(ownerNameQuickPropPanel);
        assertEquals(getText(ownerNameQuickPropPanel), taskOwner);
        Thread.sleep(500);
        logger.info("verifyTaskOwner(String taskOwner) -");
    }

    public void closePropertyPanel() throws InterruptedException {
        logger.info("closePropertyPanel() +");
        Thread.sleep(500);
        click(currentWeek);
        Thread.sleep(500);
        click(collapseButtonMainPropPanel);
        Thread.sleep(500);
        logger.info("closePropertyPanel() -");
    }

    public void changeTaskStatus(WebElement taskToUpdate, String currentStatus, String statusToUpdate) throws InterruptedException {
        logger.info("changeTaskStatus(String statusToUpdate) +");
        clickOnTaskCard(taskToUpdate);
        Thread.sleep(500);
        if(getText(currentStatusButtonQuickPropPanel).contains(currentStatus)) {
            assertEquals(currentStatus, getText(currentStatusButtonQuickPropPanel));
            logger.info("currentStatus: "+getText(currentStatusButtonQuickPropPanel));
            click(currentStatusButtonQuickPropPanel);
        }

        Thread.sleep(1500);
        for (WebElement statusOption : statusOptionsQuickProPanel) {
            if(getText(statusOption).equals(statusToUpdate)) {
                assertEquals(getText(statusOption), statusToUpdate);
                logger.info("statusOption: "+getText(statusOption));
                click(statusOption);
                break;
            }
        }

        String statusToBeUpdated = getText(newStatusButtonAdvProPanel);
        logger.info("statusToBeUpdated button: " +statusToBeUpdated);
        switch (statusToBeUpdated) {
            case "Not Ready":
                assertEquals(statusToBeUpdated, GlobalStrings.notReadyTaskStatus);
                if(newStatusButtonAdvProPanel.isEnabled())
                    logger.info("You need to assign owner ...");
                click(ownerToSelectUnassign2NotReady);
                click(newStatusButtonAdvProPanel);
                if(getText(toastMessageStatusUpdate).contains("changed to Not Ready")) {
                    click(toastCloseButton);
                    Thread.sleep(500);
                    logger.info("toast message is closed ...");
                }
                logger.info("Not Ready ...");
                break;

            case "Force Ready":
                assertEquals(statusToBeUpdated, GlobalStrings.forceReadyTaskStatus);
                click(newStatusButtonAdvProPanel);
                Thread.sleep(500);
                if(getText(toastMessageStatusUpdate).contains("is forced to Ready")) {
                    click(toastCloseButton);
                    Thread.sleep(500);
                    logger.info("toast message is closed ...");
                }
                logger.info("Force Ready ...");
                break;

            case "Start task":
                assertEquals(statusToBeUpdated, GlobalStrings.startTaskStatusButton);
                click(newStatusButtonAdvProPanel);
                logger.info("test: on start toast message: "+getText(toastMessageStatusUpdate));
                if (getText(toastMessageStatusUpdate).contains("Custom Reason(s) not available")
                        || getText(toastMessageStatusUpdate).contains("must provide the reasons for variance")) {
                    click(toastCloseButton);
                    click(reasonFieldAdvPropPanel);
                    click(materialReasonForLate);
                    click(newStatusButtonAdvProPanel);
                    logger.info("choose reason for late start ...");
                }
                if (getText(toastMessageStatusUpdate).contains("started")) {
                    click(toastCloseButton);
                    Thread.sleep(500);
                    logger.info("toast message is closed ...");
                }
                logger.info("Start ...");
                break;

            case "Raise Alert":
                assertEquals(statusToBeUpdated, GlobalStrings.raiseAlertTaskStatus);
                Thread.sleep(500);
                click(newStatusButtonAdvProPanel);
                if(getText(toastMessageStatusUpdate).contains("Custom Reason(s) not available")) {
                    click(toastCloseButton);
                    click(reasonFieldAdvPropPanel);
                    click(manpowerReasonForLate);
                    click(newStatusButtonAdvProPanel);
                    logger.info("choose reason for alert ...");
                }
                if(getText(toastMessageStatusUpdate).contains("Alert raised in")) {
                    click(toastCloseButton);
                    Thread.sleep(500);
                    logger.info("toast message is closed ...");
                }
                logger.info("Alert ...");
                break;

            case "Stop Task":
                assertEquals(statusToBeUpdated, GlobalStrings.stoppedTaskStatusButton);
                click(newStatusButtonAdvProPanel);
                if(getText(toastMessageStatusUpdate).contains("Custom Reason(s) not available")) {
                    click(toastCloseButton);
                    click(reasonFieldAdvPropPanel);
                    click(spaceReasonForLate);
                    click(newStatusButtonAdvProPanel);
                    logger.info("choose reason for stop ...");
                }
                if(getText(toastMessageStatusUpdate).contains("Stopped")) {
                    click(toastCloseButton);
                    Thread.sleep(500);
                    logger.info("toast message is closed ...");
                }
                logger.info("Stop ...");
                break;

            case "Restart":
                assertEquals(statusToBeUpdated, GlobalStrings.restartTaskButton);
                click(newStatusButtonAdvProPanel);
                if(getText(toastMessageStatusUpdate).contains("started again")) {
                    click(toastCloseButton);
                    Thread.sleep(500);
                    logger.info("toast message is closed ...");
                }
                logger.info("Restart ...");
                break;

            case "Complete":
                assertEquals(statusToBeUpdated, GlobalStrings.completeTaskStatus);
                click(newStatusButtonAdvProPanel);
                if(getText(toastMessageStatusUpdate).contains("completed")) {
                    click(toastCloseButton);
                    Thread.sleep(500);
                    logger.info("toast message is closed ...");
                }
                logger.info("Complete ...");
                break;
        }
        Thread.sleep(1000);
        click(collapseButtonMainPropPanel);
        pressEscape();
        Thread.sleep(500);
        logger.info("changeTaskStatus(String statusToUpdate) -");
    }
}