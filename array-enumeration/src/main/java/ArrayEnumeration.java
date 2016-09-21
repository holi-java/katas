import java.util.Enumeration;

/**
 * Created by selonj on 16-9-22.
 */
public class ArrayEnumeration<E> implements Enumeration<E> {
  private E element;

  public ArrayEnumeration() {
  }

  public ArrayEnumeration(E element) {
    this.element = element;
  }

  @Override public boolean hasMoreElements() {
    return element != null;
  }

  @Override public E nextElement() {
    E result = element;
    element = null;
    return result;
  }
}
