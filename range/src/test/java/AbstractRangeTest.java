import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Created by selonj on 16-9-23.
 */
@RunWith(Parameterized.class)
abstract public class AbstractRangeTest {
  protected final int start;
  protected final int last;
  protected final Range range;

  protected AbstractRangeTest(int start, int last) {
    this.start = start;
    this.last = last;
    this.range = Range.between(start, last);
  }

  @Parameterized.Parameters(name = "[{0},{1}]")
  public static Collection<Object[]> data() {
    return Arrays.asList(
     /**/ test(0, 10)
        , test(1, 11)
        , test(-1, 9)
        , test(-11, -1)
        , test(10, 0)
        , test(11, 1)
        , test(9, -1)
        , test(-1, -11)
    );
  }

  private static Object[] test(int start, int last) {
    return new Object[] {start, last};
  }
}
