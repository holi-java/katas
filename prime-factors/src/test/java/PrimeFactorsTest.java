import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-20.
 */
public class PrimeFactorsTest {
  @Test public void noFactors() throws Exception {
    assertThat(PrimeFactors.of(1), is(emptyList()));
  }

  @Test public void primeNumber() throws Exception {
    assertThat(PrimeFactors.of(2), is(singletonList(2)));
  }
}
