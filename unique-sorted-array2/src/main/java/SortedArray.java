/**
 * Created by selonj on 16-9-21.
 */
public class SortedArray {
  public static int[] unique(int[] array) {
    int[] result = new int[array.length];
    System.arraycopy(array, 0, result, 0, array.length);
    return result;
  }
}
