/**
 * Created by selonj on 16-9-22.
 */
public class BowlingGame {
  private static final int MAX_ROLLS = 20;
  private int[] rolls = new int[MAX_ROLLS];
  private int i;

  public void roll(int pins) {
    rolls[i++] = pins;
  }

  public int score() {
    int score = 0;
    for (int i = 0; i < rolls.length / 2; i++) {
      int first = rolls[i];
      int last = rolls[i + 1];
      score += first + last;
    }
    return score;
  }
}
