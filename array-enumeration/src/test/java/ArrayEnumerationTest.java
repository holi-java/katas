import java.util.NoSuchElementException;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by selonj on 16-9-22.
 */
public class ArrayEnumerationTest {
  @Test public void hasNoMoreElementsOfAnyEmptyArrayEnumeration() throws Exception {
    ArrayEnumeration<?> it = new ArrayEnumeration<>();

    assertFalse(it.hasMoreElements());
  }

  @Test public void singleton() throws Exception {
    ArrayEnumeration<Integer> it = new ArrayEnumeration<>(1);

    assertTrue("has elements", it.hasMoreElements());
    assertThat(it.nextElement(), equalTo(1));

    assertFalse("no elements", it.hasMoreElements());
  }

  @Test public void testsEnumerationContainsMoreElementsHasNoSideEffects() throws Exception {
    ArrayEnumeration<Integer> it = new ArrayEnumeration<>(1);

    assertTrue("has elements", it.hasMoreElements());
    assertTrue("has elements", it.hasMoreElements());
  }

  @Test public void successiveElementsOneAtATime() throws Exception {
    ArrayEnumeration<Integer> it = new ArrayEnumeration<>(1, 2);

    assertThat(it.nextElement(), equalTo(1));
    assertThat(it.nextElement(), equalTo(2));
  }

  @Test public void raisingNoSuchElementIfNoMoreSuccessiveElements() throws Exception {
    ArrayEnumeration<?> it = new ArrayEnumeration<>();

    try {
      it.nextElement();
      fail("there is no successive elements");
    } catch (NoSuchElementException expected) {
      assertTrue(true);
    }
  }

  @Test public void hasNoMoreElementsWithNullArray() throws Exception {
    ArrayEnumeration<?> it = new ArrayEnumeration<>(null);

    assertFalse("no elements", it.hasMoreElements());
  }
}
