package is.hi.cs.junit4demo;

import org.junit.Test;

public class DivisionByZeroTest {
  @Test(expected=ArithmeticException.class)
  public void testDivideByZero() {
    int b=2/0;
  }
}
