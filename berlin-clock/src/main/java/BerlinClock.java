/**
 * Created by selonj on 16-9-23.
 */
public class BerlinClock {
  private static final String YELLOW = "Y";
  private static final String RED = "R";
  private static final String OFF = "0";
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
        /**/lights(RED, 4, hours / 5) + "\n" +
        /**/lights(RED, 4, hours % 5) + "\n" +
        /**/lights("1", 11, minutes / 5) + "\n" +
        /**/lights(YELLOW, 4, minutes % 5);
  }

  private String lights(String color, int count, int lit) {
    String[] colors = new String[] {"Y", "Y", "R", "Y", "Y", "R", "Y", "Y", "R", "Y", "Y"};
    String lights = "";
    for (int i = 1; i <= count; i++) lights += light(count == 11 ? colors[i - 1] : color, lit >= i);
    return lights;
  }

  private String light(String color, boolean lit) {
    return lit ? color : OFF;
  }
}
