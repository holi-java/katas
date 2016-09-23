import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by selonj on 16-9-23.
 */
public class Range implements Iterable<Integer> {
  private final int start;
  private final int last;
  private final int size;
  private final Direction direction;

  public Range(int start, int last) {
    this.start = start;
    this.last = last;
    direction = Direction.of(start, last);
    size = direction.shift(last - start + direction.shift(1));
  }

  public static Range between(int start, int last) {
    return new Range(start, last);
  }

  public int round(int number) {
    return start + direction.shift(offset(number));
  }

  public int offset(int number) {
    int signedOffset = direction.shift((number % size) - start);
    return (size + signedOffset) % size;
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

  public Direction direction() {
    return direction;
  }

  @Override public Iterator<Integer> iterator() {
    return new Iterator<Integer>() {
      private int current = start;

      @Override public boolean hasNext() {
        return direction.shift(current) <= direction.shift(last);
      }

      @Override public Integer next() {
        if (!hasNext()) {
          throw new NoSuchElementException();
        }
        int result = current;
        current += direction.shift(1);
        return result;
      }
    };
  }

  @Override public boolean equals(Object obj) {
    return true;
  }

  @Override public String toString() {
    return "[" + start + "," + last + "]";
  }
}
