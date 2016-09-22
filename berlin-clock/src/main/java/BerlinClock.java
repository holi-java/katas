/**
 * Created by selonj on 16-9-23.
 */
public class BerlinClock {
  private final int hours;
  private int seconds;

  public BerlinClock(int seconds) {
    this(0, seconds);
  }

  public BerlinClock(int hours, int seconds) {
    this.hours = hours;
    this.seconds = seconds;
  }

  public String display() {
    return secondsLight() + "\n" +
        /**/lights(hours / 5) + "\n" +
        /**/lights(hours % 5) + "\n" +
        /**/"00000000000\n" +
        /**/"0000";
  }

  private String lights(int lit) {
    String lights = "";
    for (int i = 1; i <= 4; i++) lights += light(lit >= i);
    return lights;
  }

  private String secondsLight() {
    return light(seconds % 2 == 0);
  }

  private String light(boolean lit) {
    return lit ? "1" : "0";
  }
}
