/**
 * Created by selonj on 16-9-23.
 */
public class BerlinClock {
  private static final Color RED = Color.RED;
  private static final Color YELLOW = Color.YELLOW;
  private static final Color OFF = Color.BLACK;

  private static final Color SECOND_LIGHT = YELLOW;
  private static final Color[] HOURS_LIGHTS = {RED, RED, RED, RED};
  private static final Color[] TOP_MINUTES_LIGHTS = {YELLOW, YELLOW, RED, YELLOW, YELLOW, RED, YELLOW, YELLOW, RED, YELLOW, YELLOW};
  private static final Color[] BOTTOM_MINUTES_LIGHTS = {YELLOW, YELLOW, YELLOW, YELLOW};
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
    return light(SECOND_LIGHT, seconds % 2 == 0) + "\n" +
        /**/lights(HOURS_LIGHTS, hours / 5) + "\n" +
        /**/lights(HOURS_LIGHTS, hours % 5) + "\n" +
        /**/lights(TOP_MINUTES_LIGHTS, minutes / 5) + "\n" +
        /**/lights(BOTTOM_MINUTES_LIGHTS, minutes % 5);
  }

  private String lights(Color[] colors, int litLights) {
    String lights = "";
    int nth = 1;
    for (Color color : colors) lights += light(color, nth++ <= litLights);
    return lights;
  }

  private String light(Color color, boolean lit) {
    return (lit ? color : OFF).code;
  }
}
