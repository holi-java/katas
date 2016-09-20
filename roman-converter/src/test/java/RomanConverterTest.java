import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by selonj on 16-9-21.
 */
@RunWith(Parameterized.class)
public class RomanConverterTest {
  private final int number;
  private final String graph;

  public RomanConverterTest(int number, String graph) {
    this.number = number;
    this.graph = graph;
  }

  @Parameterized.Parameters public static Collection<Object[]> data() {
    return Arrays.asList(
        test(0, ""),
        test(1, "I"),
        test(2, "II"),
        test(3, "III"),
        test(4, "IV"),
        test(5, "V"),
        test(6, "VI"),
        test(10, "X"),
        test(9, "IX"),
        test(50, "L"),
        test(40, "XL")
    );
  }

  private static Object[] test(int number, String graph) {
    return new Object[] {number, graph};
  }

  @Test public void convert() throws Exception {
    assertThat(RomanConverter.convert(number), equalTo(graph));
  }
}
