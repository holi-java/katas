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
    return secondsLight() + "\n" +
        /**/lights(hours / 5) + "\n" +
        /**/light(hours % 5 > 0) + "000\n" +
        /**/"00000000000\n" +
        /**/"0000";
  }

  private String lights(int lit) {
    String lights = "";
    lights += light(lit >= 1);
    lights += light(lit >= 2);
    lights += light(lit >= 3);
    lights += light(lit >= 4);
    return lights;
  }

  private String secondsLight() {
    return light(seconds % 2 == 0);
  }

  private String light(boolean lit) {
    return lit ? "1" : "0";
  }
}
