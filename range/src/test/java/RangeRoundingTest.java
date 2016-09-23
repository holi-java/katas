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

public class RangeRoundingTest extends AbstractRangeTest {

  public RangeRoundingTest(Range range) {
    super(range);
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
