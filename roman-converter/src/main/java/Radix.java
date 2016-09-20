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
    String result = "";
    for (int i = 0; i < number; i++) result += "I";
    return result;
  }
}
