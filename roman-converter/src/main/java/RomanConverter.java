/**
 * Created by selonj on 16-9-21.
 */
public class RomanConverter {
  public static String convert(int number) {
    for (Radix radix : Radix.values()) {
      if (radix.includedWith(number)) {
        return radix.name() + convert(radix.reduce(number));
      }
    }
    return "";
  }
}
