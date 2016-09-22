/**
 * Created by selonj on 16-9-22.
 */
public class BowlingGame {
  private static final int MAX_FRAMES = 10;
  private static final int MAX_FRAME_ROLLS = 2;
  private static final int MAX_EXTRA_ROLLS = 2 * MAX_FRAME_ROLLS;
  private static final int MAX_ROLLS = MAX_FRAMES * MAX_FRAME_ROLLS;
  private static final int ALL_FRAME_PINS = 10;
  private int[] rolls = new int[MAX_ROLLS + MAX_EXTRA_ROLLS];
  private int pos;

  public void roll(int pins) {
    if (isGameOver()) throw new GameOverException();
    checkingFramePinsBounds(pins);
    record(pins);
  }

  private boolean isGameOver() {
    if (pos < MAX_ROLLS) {
      return false;
    }
    if (pos >= rolls.length) {
      return true;
    }
    int last = frame(pos - MAX_FRAME_ROLLS);
    if (isSpare(last)) {
      return pos > MAX_ROLLS;
    }
    return !isStrike(last);
  }

  private boolean isStrike(int frame) {
    return first(frame) == ALL_FRAME_PINS;
  }

  private boolean isSpare(int frame) {
    return !isStrike(frame) && total(frame) == ALL_FRAME_PINS;
  }

  private void record(int pins) {
    int frame = frame(pos);
    rolls[pos] = pins;
    pos = isStrike(frame) ? position(frame + 1) : pos + 1;
  }

  private void checkingFramePinsBounds(int pins) {
    int frame = frame(pos);
    int total = first(frame) + pins;
    if (total > ALL_FRAME_PINS) {
      throw new IllegalArgumentException(String.format("Pins out of bounds in frame %d: %d", frame, total));
    }
  }

  private int position(int frame) {
    return frame << 1;
  }

  private int frame(int position) {
    return position >>> 1;
  }

  public int score() {
    int score = 0;
    for (int frame = 0; frame < MAX_FRAMES; frame++) {
      score += score(frame);
    }
    return score;
  }

  private int score(int frame) {
    return total(frame) + bonus(frame);
  }

  private int total(int frame) {
    return first(frame) + last(frame);
  }

  private int bonus(int frame) {
    if (isStrike(frame)) {
      if (isStrike(frame + 1)) {
        return total(frame + 1) + total(frame + 2);
      }
      return total(frame + 1);
    }
    if (isSpare(frame)) {
      return first(frame + 1);
    }
    return 0;
  }

  private int first(int frame) {
    return rolls[position(frame)];
  }

  private int last(int frame) {
    return rolls[position(frame) + 1];
  }
}
