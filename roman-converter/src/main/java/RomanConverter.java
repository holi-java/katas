/**
 * Created by selonj on 16-9-21.
 */
public class RomanConverter {
  public static String convert(int number) {
    for (Radix radix : Radix.values()) {
      if (radix.closest(number)) {
        return radix.name() + convert(radix.reduce(number));
      }
    }
    return "";
  }

  private enum Radix {
    V(5),
    IV(4),
    I(1);

    private final int radix;

    Radix(int radix) {
      this.radix = radix;
    }

    private int reduce(int number) {
      return number - this.radix;
    }

    private boolean closest(int number) {
      return this.radix <= number;
    }
  }
}
