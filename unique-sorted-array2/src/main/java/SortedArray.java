/**
 * Created by selonj on 16-9-21.
 */
public class SortedArray {
  public static int[] unique(int[] array) {
    int n = array.length;
    int[] result = new int[n];
    System.arraycopy(array, 0, result, 0, n);
    return result;
  }
}
