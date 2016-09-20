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

  @Parameterized.Parameters(name = "{0} = {1}")
  public static Collection<Object[]> data() {
    return Arrays.asList(
        expect(0).to(""),
        expect(1).to("I"),
        expect(2).to("II"),
        expect(3).to("III"),
        expect(4).to("IV"),
        expect(5).to("V"),
        expect(6).to("VI"),
        expect(10).to("X"),
        expect(9).to("IX"),
        expect(50).to("L"),
        expect(40).to("XL"),
        expect(100).to("C"),
        expect(90).to("XC")
    );
  }

  private static ExpectationBuilder expect(int number) {
    return new ExpectationBuilder(number);
  }

  @Test public void convert() throws Exception {
    assertThat(RomanConverter.convert(number), equalTo(graph));
  }

  private static class ExpectationBuilder {
    private int number;

    public ExpectationBuilder(int number) {
      this.number = number;
    }

    public Object[] to(String graph) {
      return new Object[] {number, graph};
    }
  }
}
