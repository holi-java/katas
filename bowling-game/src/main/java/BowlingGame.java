/**
 * Created by selonj on 16-9-22.
 */
public class BowlingGame {
  private static final int MAX_ROLLS = 20;
  private static final int ALL_FRAME_PINS = 10;
  private int[] rolls = new int[MAX_ROLLS];
  private int i;

  public void roll(int pins) {
    rolls[i++] = pins;
  }

  public int score() {
    int score = 0;
    for (int i = 0; i < rolls.length / 2; i++) {
      score += score(i);
    }
    return score;
  }

  private int score(int frame) {
    if (spare(frame)) {
      return pins(frame) + 1;
    }
    return pins(frame);
  }

  private boolean spare(int frame) {
    return pins(frame) == ALL_FRAME_PINS;
  }

  private int pins(int frame) {
    int first = frame << 1;
    return rolls[first] + rolls[first + 1];
  }
}
