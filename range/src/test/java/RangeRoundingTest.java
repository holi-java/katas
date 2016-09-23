import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-23.
 */
public class RangeRoundingTest {
  @Test public void startValue() throws Exception {
    assertThat(Range.between(0, 10).round(0), equalTo(0));
  }

  @Test public void lastValue() throws Exception {
    assertThat(Range.between(0, 10).round(10), equalTo(10));
  }

  @Test public void afterLastValueShouldBeRounded() throws Exception {
    assertThat(Range.between(0, 10).round(11), equalTo(0));
  }
}
