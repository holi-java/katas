import java.util.Arrays;

/**
 * Created by selonj on 16-9-21.
 */
public class SortedArray {

  public static int[] unique(int[] array) {
    int[] result = new int[array.length];
    int n = 0;
    int prev = 0;
    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        prev = result[n++] = array[i];
      } else {
        if (prev != array[i]) {
          prev = result[n++] = array[i];
        }
      }
    }

    return Arrays.copyOf(result, n);
  }
}