import java.util.Enumeration;

/**
 * Created by selonj on 16-9-22.
 */
public class ArrayEnumeration<E> implements Enumeration<E> {
  private E element;
  private E[] elements;
  private int i;

  public ArrayEnumeration() {
  }

  public ArrayEnumeration(E element) {
    this((E[]) new Object[] {element});
  }

  public ArrayEnumeration(E... elements) {
    this.element = elements[0];
    this.elements = elements;
  }

  @Override public boolean hasMoreElements() {
    return element != null;
  }

  @Override public E nextElement() {
    element = null;
    return elements[i++];
  }
}
