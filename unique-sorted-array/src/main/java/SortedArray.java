import java.util.Arrays;

/**
 * Created by selonj on 16-9-21.
 */
public class SortedArray {

  public static int[] unique(int[] array) {
    int[] result = new int[array.length];
    int n = 0;
    int prev = 0;
    for (int current : array) {
      if (n == 0) {
        prev = result[n++] = current;
      } else {
        if (prev != current) {
          prev = result[n++] = current;
        }
      }
    }

    return Arrays.copyOf(result, n);
  }
}