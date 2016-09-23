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

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
        new Object[] {Range.between(0, 10)}
    });
  }

  @Test public void startValue() throws Exception {
    assertThat(range.round(range.start()), equalTo(range.start()));
  }

  @Test public void lastValue() throws Exception {
    assertThat(range.round(range.last()), equalTo(range.last()));
  }

  @Test public void afterLastValueShouldBeRounded() throws Exception {
    assertThat(range.round(range.last() + 1), equalTo(range.start()));
  }

  @Test public void beforeStartValueShouldBeRounded() throws Exception {
    assertThat(range.round(range.start() - 1), equalTo(range.last()));
    assertThat(range.round(-1 - range.size()), equalTo(range.last()));
  }
}
