/**
 * Created by selonj on 16-9-21.
 */
public class RomanConverter {
  public static String convert(int number) {
    Radix radix = Radix.V;
    if (number >= radix.radix) {
      return radix.name() + convert(number - radix.radix);
    }
    if (number >= 4) {
      return "IV" + convert(number - 4);
    }
    if (number >= 1) {
      return "I" + convert(number - 1);
    }
    return "";
  }

  private enum Radix {
    V(5);

    private final int radix;

    Radix(int radix) {
      this.radix = radix;
    }
  }
}
