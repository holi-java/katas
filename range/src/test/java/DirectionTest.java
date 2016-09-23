import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-23.
 */
public class DirectionTest {

  @Test public void shift() throws Exception {
    assertThat(Direction.UP.shift(2), equalTo(2));
    assertThat(Direction.DOWN.shift(2), equalTo(-2));
  }

  @Test public void down() throws Exception {
    assertThat(Direction.of(10, 0), equalTo(Direction.DOWN));
  }

  @Test public void up() throws Exception {
    assertThat(Direction.of(0, 10), equalTo(Direction.UP));
  }

  @Test public void undirected() throws Exception {
    assertThat(Direction.of(0, 0), equalTo(Direction.UP));
  }
}
