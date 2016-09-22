import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by selonj on 16-9-22.
 */
public class BowlingGameTest {

  private final BowlingGame game = new BowlingGame();

  @Test public void noPinsRollsDown() throws Exception {
    rolls(0, 20);

    assertThat(game.score(), equalTo(0));
  }

  @Test public void rollsOnePinDownAtATime() throws Exception {
    rolls(1, 20);

    assertThat(game.score(), equalTo(20));
  }

  @Test public void rollsAllPinsDownInAFrame() throws Exception {
    rollASpare();
    game.roll(3);
    game.roll(1);
    rolls(0, 16);

    assertThat(game.score(), equalTo(10 + 2 * 3 + 1));
  }

  @Test public void rollsAllPinsDownAtLastFrame() throws Exception {
    rolls(0, 18);
    rollASpare();
    game.roll(6);

    assertThat(game.score(), equalTo(10 + 6));
  }

  @Test public void rollsAllPinsDownOnTheFirstShotInAFrame() throws Exception {
    rollAStrike();
    game.roll(3);
    game.roll(4);
    rolls(0, 16);

    assertThat(game.score(), equalTo(10 + 2 * (3 + 4)));
  }

  @Test public void rollsAllPinsDownOnTheFirstShotAtLastFrame() throws Exception {
    rolls(0, 18);
    rollAStrike();
    game.roll(3);
    game.roll(4);

    assertThat(game.score(), equalTo(10 + 3 + 4));
  }

  @Test public void raisingIllegalArgumentExceptionIfRollPinsGreaterThanMaxPinsOnOneShotInAFrame() throws Exception {
    try {
      game.roll(11);
      fail("pins out of max pins in a frame");
    } catch (IllegalArgumentException expected) {
      assertTrue(true);
    }
  }

  @Test public void raisingIllegalArgumentExceptionIfRollPinsGreaterThanMaxPinsInAFrame() throws Exception {
    game.roll(3);
    try {
      game.roll(7 + 1);
      fail("pins out of max pins in a frame");
    } catch (IllegalArgumentException expected) {
      assertTrue(true);
    }
  }

  @Test public void skipRollsOutOfTheMaxRolls() throws Exception {
    rolls(0, 20);
    game.roll(3);
    game.roll(4);

    assertThat(game.score(), equalTo(0));
  }

  private void rollAStrike() {
    game.roll(10);
  }

  private void rollASpare() {
    game.roll(3);
    game.roll(7);
  }

  private void rolls(int pins, int shots) {
    for (int i = 0; i < shots; i++) {
      game.roll(pins);
    }
  }
}
