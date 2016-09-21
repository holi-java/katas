/**
 * Created by selonj on 16-9-21.
 */
public class SortedArray {
  public static int[] unique(int[] array) {
    int[] result = new int[array.length];
    int n = 0;
    for (int i = 0; i < array.length; i++) {
      if (i == 0 || array[i - 1] != array[i]) {
        result[n++] = array[i];
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
