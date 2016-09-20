/**
 * Created by selonj on 16-9-20.
 */
public class FuzzBuzz {
  public static String of(int n) {
    if (n % 3 == 0) return "Fuzz";
    return String.valueOf(n);
  }
}
