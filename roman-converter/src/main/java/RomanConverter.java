/**
 * Created by selonj on 16-9-21.
 */
public class RomanConverter {
  public static String convert(int number) {
    Radix radix;

    radix = Radix.V;
    if (number >= radix.radix) {
      return radix.name() + convert(number - radix.radix);
    }

    radix = Radix.IV;
    if (number >= radix.radix) {
      return radix.name() + convert(number - radix.radix);
    }

    radix = Radix.I;
    if (number >= radix.radix) {
      return radix.name() + convert(number - radix.radix);
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
  }
}
