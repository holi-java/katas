/**
 * Created by selonj on 16-9-23.
 */
public class BerlinClock {
  private static final String YELLOW = "Y";
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
    return light(YELLOW, seconds % 2 == 0) + "\n" +
        /**/lights(4, hours / 5) + "\n" +
        /**/lights(4, hours % 5) + "\n" +
        /**/lights(11, minutes / 5) + "\n" +
        /**/lights(4, minutes % 5);
  }

  private String lights(int count, int lit) {
    String lights = "";
    for (int i = 1; i <= count; i++) lights += light("1", lit >= i);
    return lights;
  }

  private String light(String color, boolean lit) {
    return lit ? color : "0";
  }
}
