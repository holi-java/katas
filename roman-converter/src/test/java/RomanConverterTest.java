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
}
