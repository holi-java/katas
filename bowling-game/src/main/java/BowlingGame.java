/**
 * Created by selonj on 16-9-22.
 */
public class BowlingGame {
  private static final int MAX_FRAMES = 20;
  private int[] frames = new int[MAX_FRAMES];
  private int frame;

  public void roll(int pins) {
    frames[frame++] = pins;
  }

  public int score() {
    int total = 0;
    for (int pins : frames) {
      total += pins;
    }
    return total;
  }
}
