/**
 * Created by selonj on 16-9-21.
 */
public enum Radix {
  C(100),
  XC(90),
  L(50),
  XL(40),
  X(10),
  IX(9),
  V(5),
  IV(4),
  I(1);

  private final int radix;

  Radix(int radix) {
    this.radix = radix;
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
