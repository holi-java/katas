import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;

import static java.util.Collections.singletonList;
import static java.util.stream.StreamSupport.stream;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-23.
 */
public class RangeIterationTest {
  @Test public void singleton() throws Exception {
    assertThat(toList(Range.between(0, 0)), equalTo(singletonList(0)));
  }

  private List<Integer> toList(Range range) {
    return stream(range.spliterator(), false).collect(Collectors.toList());
  }
}
