import org.junit.Ignore;
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

  @Test public void two() throws Exception {
    assertThat(Fibonacci.of(2), equalTo(1));
  }

  @Test public void three() throws Exception {
    assertThat(Fibonacci.of(3), equalTo(Fibonacci.of(1) + Fibonacci.of(2)));
  }

  @Test public void four() throws Exception {
    assertThat(Fibonacci.of(4), equalTo(Fibonacci.of(2) + Fibonacci.of(3)));
  }
}
