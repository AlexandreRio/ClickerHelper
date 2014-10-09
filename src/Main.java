import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.MouseInfo;
import java.awt.event.InputEvent;

public class Main {
  public static void main (String[] args) {
    try {
      Thread.sleep(3000);
      Point loc;
      Robot robot = new Robot();
      long start = System.currentTimeMillis();
      while (System.currentTimeMillis() - start < 10 * 60* 60*1000) {
        try {
          Thread.sleep(25);
          loc = MouseInfo.getPointerInfo().getLocation();
          System.out.println(loc);
          if (loc.getX() > 650 && loc.getY() > 220) {
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
          }
        } catch (InterruptedException ex) {}
      } 
    }catch (Exception e) {}
  }

}
