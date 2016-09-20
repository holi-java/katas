/**
 * Created by selonj on 16-9-21.
 */
public class RomanConverter {
  public static String convert(int number) {
    StringBuilder out = new StringBuilder();
    for (Symbol symbol : Symbol.values()) {
      out.append(symbol.compute(number));
      number = symbol.remaining(number);
    }
    return out.toString();
  }
}
