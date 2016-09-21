import java.util.Enumeration;
import java.util.NoSuchElementException;

/**
 * Created by selonj on 16-9-22.
 */
public class ArrayEnumeration<E> implements Enumeration<E> {
  private E[] elements;
  private int i;

  public ArrayEnumeration(E... elements) {
    this.elements = elements == null ? empty() : elements;
  }

  private E[] empty() {
    return (E[]) new Object[0];
  }

  @Override public boolean hasMoreElements() {
    return i < elements.length;
  }

  @Override public E nextElement() {
    if (!hasMoreElements()) throw new NoSuchElementException();
    return elements[i++];
  }
}
