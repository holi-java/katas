/**
 * Created by selonj on 16-9-20.
 */
public class Gcd {
  public static int of(int a, int b) {
    int sign = a < 0 ? -1 : 1;
    while (b != 0) {
      int tmp = a % b;
      a = b;
      b = tmp;
    }
    return sign * a;
  }
}
