package testClass.zoneAndLevel;

import org.testng.annotations.BeforeMethod;
import pageObjectModel.zoneAndLevel.DefaultLevelAndZones;
import pageObjectModel.zoneAndLevel.SecondLevelAndZones;
import pageObjectModel.zoneAndLevel.ThirdLevelAndZones;
import testClass.BaseTestClass;
import testClass.login.CommonLoginTest;
import utilities.Utility;

public class BaseLevelAndZoneTest extends BaseTestClass {
    public CommonLoginTest commonLoginTest;
    public Utility utility;
    public DefaultLevelAndZones defaultLevelAndZones;
    public SecondLevelAndZones secondLevelAndZones;
    public ThirdLevelAndZones thirdLevelAndZones;

    @BeforeMethod
    public void methodLevelSetup() {
        commonLoginTest = new CommonLoginTest();
        utility = new Utility();
        defaultLevelAndZones = new DefaultLevelAndZones(driver);
        secondLevelAndZones = new SecondLevelAndZones(driver);
        thirdLevelAndZones = new ThirdLevelAndZones(driver);
    }
}