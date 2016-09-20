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

  @Test public void four() throws Exception {
    assertThat(RomanConverter.convert(4), equalTo("IV"));
  }

  @Test public void five() throws Exception {
    assertThat(RomanConverter.convert(5), equalTo("V"));
  }

  @Test public void six() throws Exception {
    assertThat(RomanConverter.convert(6), equalTo("VI"));
  }

  @Test public void ten() throws Exception {
    assertThat(RomanConverter.convert(10), equalTo("X"));
  }

  @Test public void nine() throws Exception {
    assertThat(RomanConverter.convert(9), equalTo("IX"));
  }

  @Test public void fifty() throws Exception {
    assertThat(RomanConverter.convert(50), equalTo("L"));
  }

  @Test public void forty() throws Exception {
    assertThat(RomanConverter.convert(40), equalTo("XL"));
  }
}
