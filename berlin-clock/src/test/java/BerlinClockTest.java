import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-23.
 */
public class BerlinClockTest {

  @Test public void unlitLightForOddNumberedSeconds() throws Exception {
    BerlinClock clock = new BerlinClock(0, 0, 1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"RRRR\n" +
    /**/"RRRR\n" +
    /**/"00000000000\n" +
    /**/"0000"
    ));
  }

  @Test public void litLightForEvenNumberedSeconds() throws Exception {
    BerlinClock clock = new BerlinClock(0, 0, 0);

    assertThat(clock.display(), equalTo(
    /**/"Y\n" +
    /**/"RRRR\n" +
    /**/"RRRR\n" +
    /**/"00000000000\n" +
    /**/"0000"
    ));
  }

  @Test public void hours5() throws Exception {
    BerlinClock clock = new BerlinClock(5, 0, 1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"R000\n" +
    /**/"0000\n" +
    /**/"00000000000\n" +
    /**/"0000"
    ));
  }

  @Test public void hours20() throws Exception {
    BerlinClock clock = new BerlinClock(20, 0, 1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"RRRR\n" +
    /**/"0000\n" +
    /**/"00000000000\n" +
    /**/"0000"
    ));
  }

  @Test public void hour1() throws Exception {
    BerlinClock clock = new BerlinClock(1, 0, 1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"0000\n" +
    /**/"R000\n" +
    /**/"00000000000\n" +
    /**/"0000"
    ));
  }

  @Test public void hours6() throws Exception {
    BerlinClock clock = new BerlinClock(6, 0, 1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"R000\n" +
    /**/"R000\n" +
    /**/"00000000000\n" +
    /**/"0000"
    ));
  }

  @Test public void hours4() throws Exception {
    BerlinClock clock = new BerlinClock(4, 0, 1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"0000\n" +
    /**/"RRRR\n" +
    /**/"00000000000\n" +
    /**/"0000"
    ));
  }

  @Test public void minute1() throws Exception {
    BerlinClock clock = new BerlinClock(0, 1, 1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"RRRR\n" +
    /**/"RRRR\n" +
    /**/"00000000000\n" +
    /**/"Y000"
    ));
  }

  @Test public void minute4() throws Exception {
    BerlinClock clock = new BerlinClock(0, 4, 1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"RRRR\n" +
    /**/"RRRR\n" +
    /**/"00000000000\n" +
    /**/"YYYY"
    ));
  }

  @Test public void minutes5() throws Exception {
    BerlinClock clock = new BerlinClock(0, 5, 1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"RRRR\n" +
    /**/"RRRR\n" +
    /**/"Y0000000000\n" +
    /**/"0000"
    ));
  }

  @Test public void minutes15() throws Exception {
    BerlinClock clock = new BerlinClock(0, 15, 1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"RRRR\n" +
    /**/"RRRR\n" +
    /**/"YYR00000000\n" +
    /**/"0000"
    ));
  }

  @Test public void minutes55() throws Exception {
    BerlinClock clock = new BerlinClock(0, 55, 1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"RRRR\n" +
    /**/"RRRR\n" +
    /**/"YYRYYRYYRYY\n" +
    /**/"0000"
    ));
  }

  @Test public void hours24() throws Exception {
    BerlinClock clock = new BerlinClock(24, 0, 1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"RRRR\n" +
    /**/"RRRR\n" +
    /**/"00000000000\n" +
    /**/"0000"
    ));
  }

  @Test public void hours0() throws Exception {
    BerlinClock clock = new BerlinClock(0, 0, 1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"RRRR\n" +
    /**/"RRRR\n" +
    /**/"00000000000\n" +
    /**/"0000"
    ));
  }

  @Test public void hours25() throws Exception {
    BerlinClock clock = new BerlinClock(25, 0, 1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"0000\n" +
    /**/"R000\n" +
    /**/"00000000000\n" +
    /**/"0000"
    ));
  }

  @Test public void roundsMinutesAndAddsUpToHours() throws Exception {
    BerlinClock clock = new BerlinClock(23, 60, 1);

    assertThat(clock.display(), equalTo(
    /**/"0\n" +
    /**/"RRRR\n" +
    /**/"RRRR\n" +
    /**/"00000000000\n" +
    /**/"0000"
    ));
  }

  @Test public void roundsSecondsAndAddsUpToMinutes() throws Exception {
    BerlinClock clock = new BerlinClock(0, 0, 60);

    assertThat(clock.display(), equalTo(
    /**/"Y\n" +
    /**/"RRRR\n" +
    /**/"RRRR\n" +
    /**/"00000000000\n" +
    /**/"Y000"
    ));
  }

  @Test public void roundingPropagation() throws Exception {
    BerlinClock clock = new BerlinClock(1, 59, 60);

    assertThat(clock.display(), equalTo(
    /**/"Y\n" +
    /**/"0000\n" +
    /**/"RR00\n" +
    /**/"00000000000\n" +
    /**/"0000"
    ));
  }
}
