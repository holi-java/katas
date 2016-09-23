import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-23.
 */
@RunWith(Parameterized.class)
public class RangeRoundingTest {

  private final Range range;

  public RangeRoundingTest(Range range) {
    this.range = range;
  }

  @Parameterized.Parameters(name = "{0}")
  public static Collection<Object[]> data() {
    return Arrays.asList(
     /**/ new Object[] {Range.between(0, 10)}
        , new Object[] {Range.between(1, 11)}
        , new Object[] {Range.between(-1, 9)}
        , new Object[] {Range.between(-11, -1)}
        , new Object[] {Range.between(10, 0)}
        , new Object[] {Range.between(11, 1)}
        , new Object[] {Range.between(9, -1)}
        , new Object[] {Range.between(-1, -11)}
    );
  }

  @Test public void startValue() throws Exception {
    assertThat(range.round(range.start()), equalTo(range.start()));
  }

  @Test public void lastValue() throws Exception {
    assertThat(range.round(range.last()), equalTo(range.last()));
  }

  @Test public void afterLastValueShouldBeRounded() throws Exception {
    assertThat(range.round(range.last() + range.direction()), equalTo(range.start()));
  }

  @Test public void beforeStartValueShouldBeRounded() throws Exception {
    assertThat(range.round(range.start() - range.direction()), equalTo(range.last()));
    assertThat(range.round(range.start() - range.direction() - range.direction() * range.size()), equalTo(range.last()));
  }
}
