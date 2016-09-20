/**
 * Created by selonj on 16-9-20.
 */
public class Fibonacci {
  public static int of(int n) {
    int prev = 1;
    int result = 1;
    for (int i = 2; i < n; i++) {
      result += prev;
    }
    return result;
  }
}
