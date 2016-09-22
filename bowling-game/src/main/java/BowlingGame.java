/**
 * Created by selonj on 16-9-22.
 */
public class BowlingGame {
  private static final int MAX_FRAMES = 20;
  private int[] scores = new int[MAX_FRAMES];
  private int frame;

  public void roll(int balls) {
    scores[frame++] = balls;
  }

  public int score() {
    int total = 0;
    for (int score : scores) {
      total += score;
    }
    return total;
  }
}
