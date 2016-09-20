/**
 * Created by selonj on 16-9-20.
 */
public class Factorial {
  public static int of(int n) {
    int i = 3;
    if (n > i) {
      n *= i;
      i--;
    }
    if (n > i) {
      n *= i;
      i--;
    }
    return n;
  }
}
