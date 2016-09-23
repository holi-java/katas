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
}
