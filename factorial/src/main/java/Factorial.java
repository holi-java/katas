/**
 * Created by selonj on 16-9-20.
 */
public class Factorial {
  public static int of(final int n) {
    int result = n;
    for (int i = 2; i < n; i++) result *= i;
    return result;
  }
}
