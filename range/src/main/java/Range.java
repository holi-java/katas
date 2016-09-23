/**
 * Created by selonj on 16-9-23.
 */
public class Range {
  private final int start;
  private final int last;
  private final int size;

  public Range(int start, int last) {
    this.start = start;
    this.last = last;
    size = last - start + 1;
  }

  public static Range between(int start, int last) {
    return new Range(start, last);
  }

  public int round(int number) {
    if (number < 0) {
      return round(size + number % size);
    }
    return number % size;
  }

  public int start() {
    return start;
  }

  public int last() {
    return last;
  }

  public int size() {
    return size;
  }
}
