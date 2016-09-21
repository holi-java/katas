import java.util.Arrays;

/**
 * Created by selonj on 16-9-21.
 */
public class SortedArray {

  public static int[] unique(int[] array) {
    int[] result = new int[array.length];
    int n = 0;
    long prev = Long.MAX_VALUE;
    for (int current : array) {
      if (prev != current) {
        prev = result[n++] = current;
      }
    }

    return Arrays.copyOf(result, n);
  }
}