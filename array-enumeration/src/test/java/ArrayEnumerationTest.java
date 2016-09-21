import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Created by selonj on 16-9-22.
 */
public class ArrayEnumerationTest {
  @Test public void hasNoMoreElementsOfAnyEmptyArrayEnumeration() throws Exception {
    ArrayEnumeration it = new ArrayEnumeration();

    assertFalse(it.hasMoreElements());
  }
}
