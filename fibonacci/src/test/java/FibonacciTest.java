import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-20.
 */
public class FibonacciTest {
  @Test public void one() throws Exception {
    assertThat(Fibonacci.of(1), equalTo(1));
  }
}
