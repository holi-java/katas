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
}
