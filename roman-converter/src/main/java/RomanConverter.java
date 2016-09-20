/**
 * Created by selonj on 16-9-21.
 */
public class RomanConverter {
  public static String convert(int number) {
    int candidate = 5;
    String graph = "V";
    if (number >= candidate) {
      return graph + convert(number - candidate);
    }
    if (number >= 4) {
      return "IV" + convert(number - 4);
    }
    if (number >= 1) {
      return "I" + convert(number - 1);
    }
    return "";
  }
}
