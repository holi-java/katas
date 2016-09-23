import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Created by selonj on 16-9-23.
 */
@RunWith(Parameterized.class)
abstract public class AbstractRangeTest {

  protected final Range range;

  protected AbstractRangeTest(Range range) {
    this.range = range;
  }

  @Parameterized.Parameters(name = "{0}")
  public static Collection<Object[]> data() {
    return Arrays.asList(
     /**/ new Object[] {Range.between(0, 10)}
        , new Object[] {Range.between(1, 11)}
        , new Object[] {Range.between(-1, 9)}
        , new Object[] {Range.between(-11, -1)}
        , new Object[] {Range.between(10, 0)}
        , new Object[] {Range.between(11, 1)}
        , new Object[] {Range.between(9, -1)}
        , new Object[] {Range.between(-1, -11)}
    );
  }
}
