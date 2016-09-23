import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static java.util.stream.StreamSupport.stream;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by selonj on 16-9-23.
 */
public class RangeIterationTest {
  @Test public void singleton() throws Exception {
    assertThat(toList(Range.between(0, 0)), equalTo(singletonList(0)));
  }

  @Test public void upToLast() throws Exception {
    assertThat(toList(Range.between(1, 3)), equalTo(asList(1, 2, 3)));
  }

  @Test public void downToLast() throws Exception {
    assertThat(toList(Range.between(3, 1)), equalTo(asList(3, 2, 1)));
  }

  @Test public void throwsNoSuchElementExceptionIfNoMoreElementsToSuccessive() throws Exception {
    Iterator<Integer> it = Range.between(0, 0).iterator();
    it.next();
    assertFalse("no elements", it.hasNext());

    try {
      it.next();
      fail("iterate range after last");
    } catch (NoSuchElementException expected) {
      assertTrue(true);
    }
  }

  private List<Integer> toList(Range range) {
    return stream(range.spliterator(), false).collect(Collectors.toList());
  }
}
