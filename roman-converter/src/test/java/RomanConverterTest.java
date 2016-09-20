import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-21.
 */
public class RomanConverterTest {
  @Test public void zero() throws Exception {
    assertThat(RomanConverter.convert(0), equalTo(""));
  }

  @Test public void one() throws Exception {
    assertThat(RomanConverter.convert(1), equalTo("I"));
  }

  @Test public void two() throws Exception {
    assertThat(RomanConverter.convert(2), equalTo("II"));
  }

  @Test public void three() throws Exception {
    assertThat(RomanConverter.convert(3), equalTo("III"));
  }
}
