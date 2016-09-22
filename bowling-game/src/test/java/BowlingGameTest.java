import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-22.
 */
public class BowlingGameTest {

  private final BowlingGame game = new BowlingGame();

  @Test public void noPinsRollsDown() throws Exception {
    rollAll(0);

    assertThat(game.score(), equalTo(0));
  }

  @Test public void rollsOnePinDownAtATime() throws Exception {
    rollAll(1);

    assertThat(game.score(), equalTo(20));
  }

  private void rollAll(int pins) {
    for (int i = 0; i < 20; i++) {
      game.roll(pins);
    }
  }
}
