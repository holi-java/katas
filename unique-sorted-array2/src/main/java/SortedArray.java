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
    int j = i;
    if (array.length > j) {
      result[j] = array[j];
    }
    return result;
  }
}
