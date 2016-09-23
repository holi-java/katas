/**
 * Created by selonj on 16-9-23.
 */
public enum Direction {
  UP(1), DOWN(-1);
  public final int direction;

  Direction(int direction) {
    this.direction = direction;
  }

  public static Direction of(int start, int last) {
    return start <= last ? UP : DOWN;
  }
}
