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

  private static final int HOURS_IN_DAY = 24;
  private static final int MINUTES_IN_HOUR = 60;
  private static final int SECONDS_IN_MINUTE = 60;
  private static final int SECONDS_IN_HOUR = MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
  private static final int START_HOUR = 1;
  private static final int LAST_HOUR = HOURS_IN_DAY;

  private final int hours;
  private final int minutes;
  private final int seconds;

  public BerlinClock(int hours, int minutes, int seconds) {
    long totalSeconds = hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MINUTE + seconds;
    this.hours = hours(totalSeconds);
    this.minutes = minutes(totalSeconds);
    this.seconds = seconds(totalSeconds);
  }

  private int hours(long seconds) {
    long hours = seconds / SECONDS_IN_HOUR;
    return (int) (START_HOUR + (LAST_HOUR - START_HOUR + hours) % LAST_HOUR);
  }

  private int minutes(long seconds) {
    return (int) (seconds % SECONDS_IN_HOUR / SECONDS_IN_MINUTE);
  }

  private int seconds(long totalSeconds) {
    return (int) (totalSeconds % SECONDS_IN_MINUTE);
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
