/**
 * Created by selonj on 16-9-20.
 */
public class Gcd {
  public static int of(int a, int b) {
    if (b != 0) {
      if (a % b == 0) {
        a = b;
      }
    }
    return a;
  }
}
