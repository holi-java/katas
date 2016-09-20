/**
 * Created by selonj on 16-9-20.
 */
public class Factorial {
  public static int of(final int n) {
    int i = 2;
    if (i < n) {
      n *= i;
      i++;
    }
    if (i < n) {
      n *= i;
      i++;
    }
    return n;
  }
}
