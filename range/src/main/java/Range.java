/**
 * Created by selonj on 16-9-23.
 */
public class Range {
  private final int start;
  private final int last;

  public Range(int start, int last) {
    this.start = start;
    this.last = last;
  }

  public static Range between(int start, int last) {
    return new Range(start, last);
  }

  public int round(int number) {
    return (size() + (number % size())) % size();
  }

  public int size() {
    return last - start + 1;
  }
}
