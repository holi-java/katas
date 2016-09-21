/**
 * Created by selonj on 16-9-21.
 */
public class SortedArray {
  public static int[] unique(int[] array) {
    int n = 0;
    for (int i = 0; i < array.length; i++){
      n++;
    }
    return copy(array, n);
  }

  private static int[] copy(int[] array, int n) {
    int[] result = new int[n];
    System.arraycopy(array, 0, result, 0, n);
    return result;
  }
}
