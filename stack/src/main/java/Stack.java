import java.util.NoSuchElementException;

/**
 * Created by selonj on 16-9-24.
 */
public class Stack {
  private final Object[] elements = new Object[10];
  private int i;

  public void push(Object element) {
    elements[i++] = element;
  }

  public Object pop() {
    if (isEmpty()) throw new NoSuchElementException();
    //todo:how to test element has released from stack?
    return elements[--i];
  }

  private boolean isEmpty() {
    return i == 0;
  }
}
