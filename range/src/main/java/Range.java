/**
 * Created by selonj on 16-9-23.
 */
public class Range {
  //todo introduce a Direction enum instead?
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
    size = direction * (last - start + direction);
  }

  public static Range between(int start, int last) {
    return new Range(start, last);
  }

  public int round(int number) {
    return start + direction * offset(number);
  }

  public int offset(int number) {
    if (direction == DOWN) {
      if (start == number) {
        return 0;
      }
      return start - number;
    }
    return direction * (size + (number % size) - start) % size;
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
