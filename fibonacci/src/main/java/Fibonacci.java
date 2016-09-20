/**
 * Created by selonj on 16-9-20.
 */
public class Fibonacci {
  public static int of(int n) {
    int prev = 0;
    int result = 1;
    for (int i = 1, tmp; i < n; i++) {
      tmp = result;
      result += prev;
      prev = tmp;
    }
    return result;
  }
}
