import java.util.ArrayList;
import java.util.List;

/**
 * Created by selonj on 16-9-20.
 */
public class PrimeFactors {
  public static List<Integer> of(int n) {
    List<Integer> primes = new ArrayList<>();
    int candidate = 2;
    if (n > 1) {
      while (n % candidate == 0) {
        primes.add(candidate);
        n /= candidate;
      }
    }
    if (n > 1) {
      primes.add(n);
    }
    return primes;
  }
}
