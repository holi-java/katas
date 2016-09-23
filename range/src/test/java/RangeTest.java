import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-23.
 */
public class RangeTest {

  @Test public void size() throws Exception {
    Range range = Range.between(0, 10);

    assertThat(range.size(), equalTo(11));
  }

  @Test public void start() throws Exception {
    assertThat(Range.between(0, 10).start(), equalTo(0));
  }

  @Test public void last() throws Exception {
    assertThat(Range.between(0, 10).last(), equalTo(10));
  }
}
