/**
 * Created by selonj on 16-9-20.
 */
public class Fibonacci {
  public static int of(int n) {
    int result = 1;
    int i = 2;
    if (n > i) {
      result += 1;
      i++;
    }
    if (n > i) {
      result += 1;
      i++;
    }
    return result;
  }
}
