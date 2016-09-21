import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-21.
 */
public class UniqueSortedArrayTest {
  @Test public void empty() throws Exception {
    assertThat(SortedArray.unique(new int[0]), equalTo(new int[0]));
  }
}
