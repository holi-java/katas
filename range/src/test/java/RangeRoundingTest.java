import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-23.
 */
public class RangeRoundingTest extends AbstractRangeTest {

  public RangeRoundingTest(int start, int last) {
    super(start, last);
  }

  @Test public void beforeStart2() throws Exception {
    assertThat(range.round(range.start() - range.direction().shift(range.size() + 1)), equalTo(range.last()));
  }

  @Test public void beforeStart() throws Exception {
    assertThat(range.round(range.start() - range.direction().shift(1)), equalTo(range.last()));
  }

  @Test public void start() throws Exception {
    assertThat(range.round(range.start()), equalTo(range.start()));
  }

  @Test public void next() throws Exception {
    assertThat(range.round(range.start() + range.direction().shift(1)), equalTo(range.start() + range.direction().shift(1)));
  }

  @Test public void beforeLast() throws Exception {
    assertThat(range.round(range.last() - range.direction().shift(1)), equalTo(range.last() - range.direction().shift(1)));
  }

  @Test public void last() throws Exception {
    assertThat(range.round(range.last()), equalTo(range.last()));
  }

  @Test public void afterLast() throws Exception {
    assertThat(range.round(range.last() + range.direction().shift(1)), equalTo(range.start()));
  }

  @Test public void afterLast2() throws Exception {
    assertThat(range.round(range.last() + range.direction().shift(range.size() + 1)), equalTo(range.start()));
  }
}
