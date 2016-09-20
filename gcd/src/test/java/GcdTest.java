import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-20.
 */
public class GcdTest {
  @Test public void ones() throws Exception {
    assertThat(Gcd.of(1, 1), equalTo(1));
  }

  @Test public void zeros() throws Exception {
    assertThat(Gcd.of(0, 0), equalTo(0));
  }

  @Test public void oneOfTheCommonDivisor() throws Exception {
    assertThat(Gcd.of(4, 2), equalTo(2));
    assertThat(Gcd.of(2, 4), equalTo(2));
  }

  @Test public void ascendantInputs() throws Exception {
    assertThat(Gcd.of(6, 4), equalTo(2));
  }

  @Test public void descendantInputs() throws Exception {
    assertThat(Gcd.of(4, 6), equalTo(2));
  }

  @Test public void negative() throws Exception {
    //assertThat(Gcd.of(-1, 2), equalTo(-1));
    assertThat(Gcd.of(-2, 1), equalTo(-1));
  }

  @Test public void negative2() throws Exception {
    assertThat(Gcd.of(1, -2), equalTo(-1));
  }

  @Test public void negatives() throws Exception {
    assertThat(Gcd.of(-1, -1), equalTo(1));
  }
}
