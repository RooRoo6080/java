import java.awt.*;
import java.awt.event.InputEvent;

public class autoclicker {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Thread.sleep(5000);
        for (int i = 0; i < 5000; i++) {
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
        }
    }
}
