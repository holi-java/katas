/**
 * Created by selonj on 16-9-21.
 */
public class SortedArray {
  public static int[] unique(int[] array) {
    int[] result = new int[array.length];
    if (array.length > 0) {
      result[0] = array[0];
    }
    if (array.length > 1) {
      result[1] = array[1];
    }
    return result;
  }
}
