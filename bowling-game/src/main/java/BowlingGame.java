/**
 * Created by selonj on 16-9-22.
 */
public class BowlingGame {
  private static final int MAX_FRAMES = 10;
  private static final int ALL_FRAME_PINS = 10;
  private static final int MAX_ROLLS = (MAX_FRAMES + 1) << 2;
  private int[] rolls = new int[MAX_ROLLS];
  private int i;

  public void roll(int pins) {
    rolls[i] = pins;
    i += step();
  }

  private int step() {
    int frame = frame(i);
    if (pins(frame) > ALL_FRAME_PINS) {
      throw new IllegalArgumentException(String.format("Pins out of bounds in frame %d: %d", frame, pins(frame)));
    }
    return strike(frame) ? 2 : 1;
  }

  private int frame(int shots) {
    return shots >>> 1;
  }

  public int score() {
    int score = 0;
    for (int frame = 0; frame < MAX_FRAMES; frame++) {
      score += score(frame);
    }
    return score;
  }

  private int score(int frame) {
    return pins(frame) + bonus(frame);
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

  private int bonus(int frame) {
    if (strike(frame)) {
      return pins(frame + 1);
    }
    if (spare(frame)) {
      return first(frame + 1);
    }
    return 0;
  }

  private boolean strike(int frame) {
    return first(frame) == ALL_FRAME_PINS;
  }

  private boolean spare(int frame) {
    return pins(frame) == ALL_FRAME_PINS;
  }
}
