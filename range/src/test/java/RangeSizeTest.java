import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-23.
 */
public class RangeSizeTest extends AbstractRangeTest {
  public RangeSizeTest(int start, int last) {
    super(start, last);
  }

  @Test public void size() throws Exception {
    int expectedSize = range.direction() * (range.last() - range.start() + range.direction());
    assertThat(range.size(), equalTo(expectedSize));
  }
}
