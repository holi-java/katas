import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-23.
 */
public class RangeTest {

  @Test public void start() throws Exception {
    assertThat(Range.between(0, 10).start(), equalTo(0));
  }

  @Test public void last() throws Exception {
    assertThat(Range.between(0, 10).last(), equalTo(10));
  }

  @Test public void direction() throws Exception {
    assertThat(Range.between(0, 10).direction(), equalTo(1));
    assertThat(Range.between(10, 0).direction(), equalTo(-1));
  }
}
