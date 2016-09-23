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
}
