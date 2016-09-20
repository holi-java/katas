import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-20.
 */
public class FactorialTest {
  @Test public void one() throws Exception {
    assertThat(Factorial.of(1), equalTo(1));
  }

  @Test public void two() throws Exception {
    assertThat(Factorial.of(2), equalTo(2));
  }

  @Test public void three() throws Exception {
    assertThat(Factorial.of(3), equalTo(1 * 2 * 3));
  }

  @Test public void four() throws Exception {
    assertThat(Factorial.of(4), equalTo(1 * 2 * 3 * 4));
  }
}
