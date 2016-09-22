/**
 * Created by selonj on 16-9-23.
 */
public class BerlinClock {
  private static final String YELLOW = "Y";
  private static final String RED = "R";
  private static final String OFF = "0";
  private static final String[] BOTTOM_MINUTES_LIGHTS = {YELLOW, YELLOW, YELLOW, YELLOW};
  private static final String[] HOURS_LIGHTS = {RED, RED, RED, RED};
  private static final String[] TOP_MINUTES_LIGHTS = {YELLOW, YELLOW, RED, YELLOW, YELLOW, RED, YELLOW, YELLOW, RED, YELLOW, YELLOW};
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
        /**/lights(HOURS_LIGHTS, 4, hours / 5) + "\n" +
        /**/lights(HOURS_LIGHTS, 4, hours % 5) + "\n" +
        /**/lights(TOP_MINUTES_LIGHTS, 11, minutes / 5) + "\n" +
        /**/lights(BOTTOM_MINUTES_LIGHTS, 4, minutes % 5);
  }

  private String lights(String[] colors, int count, int lit) {
    String lights = "";
    for (int i = 1; i <= count; i++) lights += light(colors[i-1], lit >= i);
    return lights;
  }

  private String light(String color, boolean lit) {
    return lit ? color : OFF;
  }
}
