/**
 * Created by selonj on 16-9-20.
 */
public class Gcd {
  public static int of(int a, int b) {
    if (b != 0) {
      int tmp = a % b;
      if (tmp == 0) {
        a = b;
      } else {
        a = tmp;
      }
    }
    return a;
  }
}
