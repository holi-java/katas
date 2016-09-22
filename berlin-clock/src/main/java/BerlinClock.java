/**
 * Created by selonj on 16-9-23.
 */
public class BerlinClock {
  private int seconds;

  public BerlinClock(int seconds) {
    this.seconds = seconds;
  }

  public String display() {
    return secondsLight() + "\n" +
        /**/"0000\n" +
        /**/"0000\n" +
        /**/"00000000000\n" +
        /**/"0000";
  }

  private String secondsLight() {
    return seconds % 2 == 0 ? "1" : "0";
  }
}
