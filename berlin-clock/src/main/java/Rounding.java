/**
 * Created by selonj on 16-9-23.
 */
public class Rounding {
  private final int start;
  private final int last;

  private Rounding(int start, int last) {
    this.start = start;
    this.last = last;
  }

  public static Rounding between(int start, int last) {
    return new Rounding(start, last);
  }

  public int round(int number) {
    int n = last - start + 1;
    return start + (n + number - start) % n;
  }
}
