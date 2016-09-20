import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-21.
 */
public class SymbolTest {

  @Test public void compute() throws Exception {
    assertThat(Symbol.I.compute(1), equalTo("I"));
    assertThat(Symbol.I.compute(0), equalTo(""));
    assertThat(Symbol.I.compute(2), equalTo("II"));
    assertThat(Symbol.V.compute(5), equalTo("V"));
  }

  @Test public void remaining() throws Exception {
    assertThat(Symbol.I.remaining(1), equalTo(0));
    assertThat(Symbol.V.remaining(6), equalTo(1));
    assertThat(Symbol.V.remaining(11), equalTo(1));
  }
}
