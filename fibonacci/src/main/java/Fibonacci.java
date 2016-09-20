/**
 * Created by selonj on 16-9-20.
 */
public class Fibonacci {
  public static int of(int n) {
    int result = 0;
    for (int prev = 1, i = 0, tmp; i < n; i++) {
      tmp = result;
      result += prev;
      prev = tmp;
    }
    return result;
  }
}
