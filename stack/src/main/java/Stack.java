import java.util.NoSuchElementException;

/**
 * Created by selonj on 16-9-24.
 */
public class Stack {
  private static final int DEFAULT_CAPACITY = 10;
  private final Object[] elements;
  private int position;

  public Stack() {
    this(DEFAULT_CAPACITY);
  }

  public Stack(int capacity) {
    elements = new Object[capacity];
  }

  public void push(Object element) {
    if (hasNoRemaining()) throw new StackOverflowException();
    elements[position++] = element;
  }

  private boolean hasNoRemaining() {
    return position == elements.length;
  }

  public Object pop() {
    if (isEmpty()) throw new NoSuchElementException();
    return remove(--position);
  }

  private Object remove(int pos) {
    Object element = elements[pos];
    elements[pos] = null;
    return element;
  }

  private boolean isEmpty() {
    return position == 0;
  }
}
