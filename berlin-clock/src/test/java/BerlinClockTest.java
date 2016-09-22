import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-23.
 */
public class BerlinClockTest {

  @Test public void unlitLightForOddNumberedSeconds() throws Exception {
    BerlinClock clock = new BerlinClock(1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"0000\n" +
    /**/"0000\n" +
    /**/"00000000000\n" +
    /**/"0000"
    ));
  }

  @Test public void litLightForEvenNumberedSeconds() throws Exception {
    BerlinClock clock = new BerlinClock(0);

    assertThat(clock.display(), equalTo(
    /**/"1\n" +
    /**/"0000\n" +
    /**/"0000\n" +
    /**/"00000000000\n" +
    /**/"0000"
    ));
  }
}
