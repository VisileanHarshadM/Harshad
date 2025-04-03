package utilities;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import testClass.BaseTestClass;
import java.awt.event.KeyEvent;

public class Utility extends BaseTestClass {
    Logger logger;

    public Utility() {
        logger = LogManager.getLogger(Utility.class);
    }

	public void zoomOut(int count) {
        logger.info("zoomOut(int count) +");
        for (int i = 0; i < count; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
        logger.info("zoomOut(int count) -");
    }
}
