/**
 * Created by selonj on 16-9-21.
 */
public class SortedArray {
  public static int[] unique(int[] array) {
    int[] result = new int[array.length];
    int n = 0;
    long prev = Long.MAX_VALUE;
    for (int i = 0; i < array.length; i++) {
      if (prev != array[i]) {
        prev = result[n++] = array[i];
      }
    }
    return copy(result, n);
  }

  private static int[] copy(int[] array, int n) {
    int[] result = new int[n];
    System.arraycopy(array, 0, result, 0, n);
    return result;
  }
}
