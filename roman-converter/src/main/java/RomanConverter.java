/**
 * Created by selonj on 16-9-21.
 */
public class RomanConverter {
  public static String convert(int number) {
    if (number == 5) {
      return "V";
    }
    if (number == 4) {
      return "IV";
    }
    if (number > 0) {
      return "I" + convert(number - 1);
    }
    return "";
  }
}
