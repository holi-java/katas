/**
 * Created by selonj on 16-9-23.
 */
public class BerlinClock {
  private final int hours;
  private int seconds;

  public BerlinClock(int seconds) {
    this.hours = 0;
    this.seconds = seconds;
  }

  public BerlinClock(int hours, int seconds) {
    this.hours = hours;
    this.seconds = seconds;
  }

  public String display() {
    int lit = hours / 5;
    return secondsLight() + "\n" +
        /**/light(lit >= 1) + light(lit >= 2) + light(lit >= 3) + light(lit >= 4) + "\n" +
        /**/light(hours % 5 > 0) + "000\n" +
        /**/"00000000000\n" +
        /**/"0000";
  }

  private String secondsLight() {
    return light(seconds % 2 == 0);
  }

  private String light(boolean lit) {
    return lit ? "1" : "0";
  }
}
