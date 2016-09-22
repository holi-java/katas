import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-22.
 */
public class BowlingGameTest {

  private final BowlingGame game = new BowlingGame();

  @Test public void noPinsRollsDown() throws Exception {
    rolls(0);

    assertThat(game.score(), equalTo(0));
  }

  @Test public void rollsOnePinDownAtATime() throws Exception {
    rolls(1);

    assertThat(game.score(), equalTo(20));
  }

  @Test public void rollsAllPinsInAFrame() throws Exception {
    game.roll(3);
    game.roll(7);
    rolls(1, 18);

    assertThat(game.score(), equalTo(29));
  }

  @Test public void rollsAllPinsAtLastFrame() throws Exception {
    rolls(1, 18);
    game.roll(3);
    game.roll(7);
    game.roll(6);

    assertThat(game.score(), equalTo(34));
  }

  private void rolls(int pins) {
    rolls(pins, 20);
  }

  private void rolls(int pins, int shots) {
    for (int i = 0; i < shots; i++) {
      game.roll(pins);
    }
  }
}
