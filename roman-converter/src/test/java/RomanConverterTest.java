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
    return Arrays.asList(new Object[][] {
        new Object[] {0, ""},
        new Object[] {1, "I"},
        new Object[] {2, "II"},
        new Object[] {3, "III"},
        new Object[] {4, "IV"},
        new Object[] {5, "V"},
        new Object[] {6, "VI"},
        new Object[] {10, "X"},
        new Object[] {9, "IX"},
        new Object[] {50, "L"},
        new Object[] {40, "XL"},
    });
  }

  @Test public void convert() throws Exception {
    assertThat(RomanConverter.convert(number), equalTo(graph));
  }
}
