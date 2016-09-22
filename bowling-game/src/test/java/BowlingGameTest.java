import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-22.
 */
public class BowlingGameTest {

  @Test public void noBallRollsDown() throws Exception {
    BowlingGame game = new BowlingGame();

    for (int i = 0; i < 20; i++) {
      game.roll(0);
    }

    assertThat(game.score(), equalTo(0));
  }
}
