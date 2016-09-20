import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-21.
 */
public class RadixTest {

  @Test public void compute() throws Exception {
    assertThat(Radix.I.compute(1), equalTo("I"));
  }
}
