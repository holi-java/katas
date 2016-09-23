/**
 * Created by selonj on 16-9-23.
 */
public class Range {
  private final int start;
  private final int end;

  public Range(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public static Range between(int start, int last) {
    return new Range(start, last + 1);
  }

  public int round(int number) {
    return number % size();
  }

  public int size() {
    return end - start;
  }
}
