import java.util.Enumeration;

/**
 * Created by selonj on 16-9-22.
 */
public class ArrayEnumeration<E> implements Enumeration<E> {
  @Override public boolean hasMoreElements() {
    return false;
  }

  @Override public E nextElement() {
    return null;
  }
}
