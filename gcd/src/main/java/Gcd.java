/**
 * Created by selonj on 16-9-20.
 */
public class Gcd {
  public static int of(int a, int b) {
    while (b != 0) {
      int tmp = a % b;
      if (tmp == 0) {
        a = b;
        break;
      } else {
        a = b;
        b = tmp;
      }
    }
    return a;
  }
}
