/**
 * Created by selonj on 16-9-21.
 */
public class RomanConverter {
  public static String convert(int number) {
    if (number == 1) {
      return "I";
    }
    if (number == 2) {
      return convert(1) + convert(1);
    }
    if (number == 3) {
      return convert(1) + convert(2);
    }
    return "";
  }
}
