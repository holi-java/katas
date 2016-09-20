/**
 * Created by selonj on 16-9-20.
 */
public class Factorial {
  public static int of(int n) {
    if (n > 3) {
      n *= 3;
    }
    if (n > 2) {
      n *= 2;
    }
    return n;
  }
}
