/**
 * Created by selonj on 16-9-21.
 */
public class RomanConverter {
  public static String convert(int number) {
    StringBuilder out = new StringBuilder();
    for (Radix radix : Radix.values()) {
      out.append(radix.compute(number));
      number = radix.remaining(number);
    }
    return out.toString();
  }
}
