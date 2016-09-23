import java.util.NoSuchElementException;

/**
 * Created by selonj on 16-9-24.
 */
public class Stack {
  private final Object[] elements;
  private int i;

  public Stack() {
    elements = new Object[10];
  }

  public Stack(int capacity) {
    elements = new Object[capacity];
  }

  public void push(Object element) {
    if (hasNoRemaining()) throw new StackOverflowException();
    elements[i++] = element;
  }

  private boolean hasNoRemaining() {
    return i == elements.length;
  }

  public Object pop() {
    if (isEmpty()) throw new NoSuchElementException();
    return remove(--i);
  }

  private Object remove(int pos) {
    Object element = elements[pos];
    elements[pos] = null;
    return element;
  }

  private boolean isEmpty() {
    return i == 0;
  }
}
