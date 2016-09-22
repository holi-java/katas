/**
 * Created by selonj on 16-9-23.
 */
public class BerlinClock {
  private static final String YELLOW = "Y";
  private static final String RED = "R";
  private static final String OFF = "0";
  private static final String[] HOURS_LIGHTS = {RED, RED, RED, RED};
  private static final String[] BOTTOM_MINUTES_LIGHTS = {YELLOW, YELLOW, YELLOW, YELLOW};
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
        /**/lights(HOURS_LIGHTS, hours / 5) + "\n" +
        /**/lights(HOURS_LIGHTS, hours % 5) + "\n" +
        /**/lights(TOP_MINUTES_LIGHTS, minutes / 5) + "\n" +
        /**/lights(BOTTOM_MINUTES_LIGHTS, minutes % 5);
  }

  private String lights(String[] colors, int litLights) {
    String lights = "";
    int nth = 1;
    for (String color : colors) lights += light(color, nth++ <= litLights);
    return lights;
  }

  private String light(String color, boolean lit) {
    return color(lit ? color : OFF).code;
  }

  private Color color(String code) {
    switch (code) {
      case YELLOW: return Color.YELLOW;
      case RED: return Color.RED;
      case OFF: return Color.OFF;
      default: throw new IllegalArgumentException(code);
    }
  }

  private enum Color {
    YELLOW("Y"), RED("R"), OFF("0");

    private String code;

    Color(String code) {
      this.code = code;
    }
  }
}
