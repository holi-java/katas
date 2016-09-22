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
        /**/(hours > 0 ? "1" : "0") + "000\n" +
        /**/"0000\n" +
        /**/"00000000000\n" +
        /**/"0000";
  }

  private String secondsLight() {
    return seconds % 2 == 0 ? "1" : "0";
  }
}
