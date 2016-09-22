import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-23.
 */
public class RoundingTest {

  @Test public void theFirstValueStart0() throws Exception {
    assertThat(start0().round(0), equalTo(0));
  }

  @Test public void valueBetweenStart0AndEnd() throws Exception {
    assertThat(start0().round(59), equalTo(59));
  }

  @Test public void valueStart0AndAfterEnd() throws Exception {
    assertThat(start0().round(60), equalTo(0));
  }

  @Test public void theFirstValueStart1() throws Exception {
    assertThat(start1().round(0), equalTo(59));
  }

  @Test public void valueBetweenStart1AndEnd() throws Exception {
    assertThat(start1().round(1), equalTo(1));
  }

  @Test public void valueStart1AndAfterEnd() throws Exception {
    assertThat(start1().round(60), equalTo(1));
  }

  private Rounding start0() {
    return Rounding.between(0, 59);
  }

  private Rounding start1() {
    return Rounding.between(1, 59);
  }
}
