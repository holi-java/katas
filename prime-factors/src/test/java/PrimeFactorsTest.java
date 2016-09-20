import org.junit.Ignore;
import org.junit.Test;

import static java.util.Arrays.asList;
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
    assertThat(PrimeFactors.of(3), is(singletonList(3)));
  }

  @Test public void sameFactors2() throws Exception {
    assertThat(PrimeFactors.of(4), is(asList(2, 2)));
  }

  @Test public void diffFactors() throws Exception {
    assertThat(PrimeFactors.of(6), is(asList(2, 3)));
  }

  @Test public void same3Factors() throws Exception {
    assertThat(PrimeFactors.of(8), is(asList(2, 2, 2)));
  }

  @Test public void sameFactors3() throws Exception {
    assertThat(PrimeFactors.of(9), is(asList(3, 3)));
  }
}
