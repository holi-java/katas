import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-24.
 */
public class StackTest {
  @Test public void popsTheTopElementOfTheStackAtATime() throws Exception {
    Stack stack = new Stack();
    stack.push("foo");
    stack.push("bar");

    assertThat(stack.pop(), equalTo("bar"));
    assertThat(stack.pop(), equalTo("foo"));
  }
}
