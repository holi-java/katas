import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-23.
 */
public class RangeEqualityTest {

  @Test public void equalsWhichStartAndLastAreTheSame() throws Exception {
    assertThat(Range.between(1, 10), equalTo(Range.between(1, 10)));
  }

  @Test public void doesNotEqualsIfEachRangeHavingDifferentStarts() throws Exception {
    assertThat(Range.between(1, 10), not(equalTo(Range.between(2, 10))));
  }

  @Test public void doesNotEqualsIfEachRangeHavingDifferentLasts() throws Exception {
    assertThat(Range.between(1, 10), not(equalTo(Range.between(1, 11))));
  }
}
