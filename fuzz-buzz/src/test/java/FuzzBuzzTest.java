import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-20.
 */
public class FuzzBuzzTest {
  @Test public void number() throws Exception {
    assertThat(FuzzBuzz.of(1), equalTo("1"));
    assertThat(FuzzBuzz.of(2), equalTo("2"));
  }

  @Test public void fuzz() throws Exception {
    assertThat(FuzzBuzz.of(3), equalTo("Fuzz"));
  }
}
