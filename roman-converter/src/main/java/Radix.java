/**
 * Created by selonj on 16-9-21.
 */
public enum Radix {
  V(5),
  IV(4),
  I(1);

  private final int radix;

  Radix(int radix) {
    this.radix = radix;
  }

  public int reduce(int number) {
    return number - this.radix;
  }

  public boolean includedWith(int number) {
    return this.radix <= number;
  }

  public String compute(int number) {
    return repeat(times(number));
  }

  private String repeat(int times) {
    String result = "";
    for (int i = 0; i < times; i++) result += name();
    return result;
  }

  private int times(int number) {
    return number / radix;
  }

  public int remaining(int number) {
    return number % radix;
  }
}
