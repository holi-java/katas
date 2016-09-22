/**
 * Created by selonj on 16-9-23.
 */
public class BerlinClock {
  private static final Color[] HOURS_LIGHTS = {Color.RED, Color.RED, Color.RED, Color.RED};
  private static final Color[] TOP_MINUTES_LIGHTS = {Color.YELLOW, Color.YELLOW, Color.RED, Color.YELLOW, Color.YELLOW, Color.RED, Color.YELLOW, Color.YELLOW, Color.RED, Color.YELLOW, Color.YELLOW};
  private static final Color[] BOTTOM_MINUTES_LIGHTS = {Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.YELLOW};
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
    return light(Color.YELLOW, seconds % 2 == 0) + "\n" +
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
    return (lit ? color : Color.OFF).code;
  }
}
