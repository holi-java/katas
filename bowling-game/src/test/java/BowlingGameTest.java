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
    rollMany(20, 0);

    assertThat(game.score(), equalTo(0));
  }

  @Test public void rollsOnePinDownAtATime() throws Exception {
    rollMany(20, 1);

    assertThat(game.score(), equalTo(20));
  }

  @Test public void rollsAllPinsDownInAFrame() throws Exception {
    rollASpare();
    game.roll(3);
    game.roll(1);
    rollMany(16, 0);

    assertThat(game.score(), equalTo(10 + 2 * 3 + 1));
  }

  @Test public void rollsAllPinsDownAtLastFrame() throws Exception {
    rollMany(18, 0);
    rollASpare();
    game.roll(6);

    assertThat(game.score(), equalTo(10 + 6));
  }

  @Test public void rollsAllPinsDownOnTheFirstShotInAFrame() throws Exception {
    rollAStrike();
    game.roll(3);
    game.roll(4);
    rollMany(16, 0);

    assertThat(game.score(), equalTo(10 + 2 * (3 + 4)));
  }

  @Test public void rollsAllPinsDownOnTheFirstShotAtLastFrame() throws Exception {
    rollMany(18, 0);
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

  @Test public void rollsAllPinsDownOnTheFirstShotInEachFrame() throws Exception {
    rollMany(12, 10);

    assertThat(game.score(), equalTo(300));
  }

  @Test public void throwsGameOverExceptionIfOutOfMaxRolls() throws Exception {
    rollMany(20, 0);
    try {
      game.roll(3);
      fail("game over");
    } catch (GameOverException expected) {
      assertTrue(true);
    }
  }

  @Test public void throwsGameOverExceptionIfRollMoreThanOnceAtLastSpareFrame() throws Exception {
    rollMany(18, 0);
    rollASpare();
    game.roll(3);

    try {
      game.roll(4);
      fail("game over");
    } catch (GameOverException expected) {
      assertTrue(true);
    }
  }

  @Test public void throwsGameOverExceptionIfRollMoreThanTwiceAtLastStrikeFrame() throws Exception {
    rollMany(18, 0);
    rollAStrike();
    rollASpare();

    try {
      game.roll(4);
      fail("game over");
    } catch (GameOverException expected) {
      assertTrue(true);
    }
  }

  private void rollAStrike() {
    game.roll(10);
  }

  private void rollASpare() {
    game.roll(3);
    game.roll(7);
  }

  private void rollMany(int shots, int pins) {
    for (int i = 0; i < shots; i++) {
      game.roll(pins);
    }
  }
}
