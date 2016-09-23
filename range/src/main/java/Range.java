/**
 * Created by selonj on 16-9-23.
 */
public class Range {
  private static final int UP = 1;
  private static final int DOWN = -1;
  private final int start;
  private final int last;
  private final int size;
  private int direction;

  public Range(int start, int last) {
    this.start = start;
    this.last = last;
    direction = start < last ? UP : DOWN;
    size = Math.abs(last - start + direction);
  }

  public static Range between(int start, int last) {
    return new Range(start, last);
  }

  public int round(int number) {
    return start0() + direction * offset(number);
  }

  private int start0() {
    return direction == UP ? start : last;
  }

  public int offset(int number) {
    return direction * (size + (number % size) - start0()) % size;
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

  public int direction() {
    return direction;
  }

  @Override public String toString() {
    return "[" + start + "," + last + "]";
  }
}
