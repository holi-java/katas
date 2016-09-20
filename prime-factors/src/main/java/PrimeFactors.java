import java.util.ArrayList;
import java.util.List;

/**
 * Created by selonj on 16-9-20.
 */
public class PrimeFactors {
  public static List<Integer> of(int n) {
    List<Integer> primes = new ArrayList<>();
    if (n > 1) {
      while (n % 2 == 0) {
        primes.add(2);
        n /= 2;
      }
    }
    if (n > 1) {
      primes.add(n);
    }
    return primes;
  }
}
