/**
 * Created by selonj on 16-9-21.
 */
public class RomanConverter {
  public static String convert(int number) {
    if (number >= 5) {
      return "V" + convert(number - 5);
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
