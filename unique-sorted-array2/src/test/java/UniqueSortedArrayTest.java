import org.junit.Ignore;
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

  @Test public void uninitializedSingleton() throws Exception {
    assertThat(SortedArray.unique(new int[1]), equalTo(new int[1]));
  }

  @Test public void singleton() throws Exception {
    assertThat(SortedArray.unique(new int[] {1}), equalTo(new int[] {1}));
  }

  @Test public void different2() throws Exception {
    assertThat(SortedArray.unique(new int[] {1, 2}), equalTo(new int[] {1, 2}));
  }

  @Test public void different3() throws Exception {
    assertThat(SortedArray.unique(new int[] {1, 2, 3}), equalTo(new int[] {1, 2, 3}));
  }

  @Test public void same() throws Exception {
    assertThat(SortedArray.unique(new int[] {1, 1}), equalTo(new int[] {1}));
  }

  @Test public void duplicationAtLast() throws Exception {
    assertThat(SortedArray.unique(new int[] {1, 2, 2}), equalTo(new int[] {1, 2}));
  }

  @Test public void duplicationAtFirst() throws Exception {
    assertThat(SortedArray.unique(new int[] {1, 1, 2}), equalTo(new int[] {1, 2}));
  }

  @Test public void duplicationAtMiddle() throws Exception {
    assertThat(SortedArray.unique(new int[] {1, 2, 2, 3}), equalTo(new int[] {1, 2, 3}));
  }
}
