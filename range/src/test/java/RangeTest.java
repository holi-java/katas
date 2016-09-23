import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-23.
 */
public class RangeTest extends AbstractRangeTest {
  public RangeTest(int start, int last) {
    super(start, last);
  }

  @Test public void size() throws Exception {
    int expectedSize = Math.abs(last - start + range.direction());
    assertThat(range.size(), equalTo(expectedSize));
  }

  @Test public void start() throws Exception {
    assertThat(range.start(), equalTo(start));
  }

  @Test public void last() throws Exception {
    assertThat(range.last(), equalTo(last));
  }
}
