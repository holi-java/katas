/**
 * Created by selonj on 16-9-20.
 */
public class Factorial {
  public static int of(final int n) {
    int i = 2;
    int result = n;
    while (i < n) {
      result *= i;
      i++;
    }
    return result;
  }
}
