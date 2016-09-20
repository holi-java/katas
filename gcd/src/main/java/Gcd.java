/**
 * Created by selonj on 16-9-20.
 */
public class Gcd {
  public static int of(int a, int b) {
    return sign(a) * sign(b) * unsigned(a, b);
  }

  public static int unsigned(int a, int b) {
    while (b != 0) {
      int tmp = a % b;
      a = b;
      b = tmp;
    }
    return Math.abs(a);
  }

  private static int sign(int a) {
    return a < 0 ? -1 : 1;
  }
}
