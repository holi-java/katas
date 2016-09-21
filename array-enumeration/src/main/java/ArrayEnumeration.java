import java.util.Enumeration;
import java.util.NoSuchElementException;

/**
 * Created by selonj on 16-9-22.
 */
public class ArrayEnumeration<E> implements Enumeration<E> {
  private E element;
  private E[] elements;
  private int i;

  public ArrayEnumeration(E element) {
    this((E[]) new Object[] {element});
  }

  public ArrayEnumeration(E... elements) {
    this.elements = elements;
  }

  @Override public boolean hasMoreElements() {
    return i < elements.length;
  }

  @Override public E nextElement() {
    if (!hasMoreElements()) throw new NoSuchElementException();
    element = null;
    return elements[i++];
  }
}
