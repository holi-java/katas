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
}
