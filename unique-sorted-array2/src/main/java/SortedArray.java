/**
 * Created by selonj on 16-9-21.
 */
public class SortedArray {
  public static int[] unique(int[] array) {
    int[] result = new int[array.length];
    int i = 0;
    if (array.length > i) {
      result[i] = array[i];
    }
    i++;
    if (array.length > i) {
      result[i] = array[i];
    }
    return result;
  }
}
