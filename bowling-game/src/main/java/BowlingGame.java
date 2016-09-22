/**
 * Created by selonj on 16-9-22.
 */
public class BowlingGame {
  private static final int MAX_ROLLS = 21;
  private static final int ALL_FRAME_PINS = 10;
  private int[] rolls = new int[MAX_ROLLS];
  private int i;

  public void roll(int pins) {
    rolls[i++] = pins;
  }

  public int score() {
    int score = 0;
    for (int frame = 0; frame < rolls.length / 2; frame++) {
      score += score(frame);
    }
    return score;
  }

  private int score(int frame) {
    if (spare(frame)) {
      return pins(frame) + first(frame + 1);
    }
    return pins(frame);
  }

  private boolean spare(int frame) {
    return pins(frame) == ALL_FRAME_PINS;
  }

  private int pins(int frame) {
    return first(frame) + last(frame);
  }

  private int first(int frame) {
    return rolls[frame << 1];
  }

  private int last(int frame) {
    return rolls[(frame << 1) + 1];
  }
}
