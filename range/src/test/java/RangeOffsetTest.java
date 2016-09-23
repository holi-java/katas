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
}
