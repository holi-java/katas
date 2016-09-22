/**
 * Created by selonj on 16-9-23.
 */
public class BerlinClock {
  private final int hours;
  private final int minutes;
  private int seconds;

  public BerlinClock(int seconds) {
    this(0, 0, seconds);
  }

  public BerlinClock(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  public String display() {
    return secondsLight() + "\n" +
        /**/lights(4, hours / 5) + "\n" +
        /**/lights(4, hours % 5) + "\n" +
        /**/light(minutes >= 5) + light(minutes >= 10) + light(minutes >= 15) + "00000000\n" +
        /**/lights(4, minutes % 5);
  }

  private String lights(int count, int lit) {
    String lights = "";
    for (int i = 1; i <= count; i++) lights += light(lit >= i);
    return lights;
  }

  private String secondsLight() {
    return light(seconds % 2 == 0);
  }

  private String light(boolean lit) {
    return lit ? "1" : "0";
  }
}
