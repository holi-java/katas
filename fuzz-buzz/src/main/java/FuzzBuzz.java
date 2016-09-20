/**
 * Created by selonj on 16-9-20.
 */
public class FuzzBuzz {
  public static String of(int n) {
    if (n % 15 == 0) return "FuzzBuzz";
    if (n % 3 == 0) return "Fuzz";
    if (n % 5 == 0) return "Buzz";
    return String.valueOf(n);
  }
}
