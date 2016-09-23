import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-23.
 */

public class RangeOffsetTest extends AbstractRangeTest {

  public RangeOffsetTest(int start, int last) {
    super(start, last);
  }

  @Test public void start() throws Exception {
    assertThat(range.offset(range.start()), equalTo(0));
  }

  @Test public void next() throws Exception {
    assertThat(range.offset(range.start() + range.direction()), equalTo(1));
  }

  @Test public void last() throws Exception {
    assertThat(range.offset(range.last()), equalTo(range.size() - 1));
  }

  @Test public void afterLast() throws Exception {
    assertThat(range.offset(range.last() + range.direction()), equalTo(0));
  }

  @Test public void beforeStart() throws Exception {
    assertThat(range.offset(range.start() - range.direction()), equalTo(range.size() - 1));
  }
}
