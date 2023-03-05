package is.hi.cs.junit4demo;

import static org.junit.Assert.*;
import org.junit.Test;

public class MoneyTest {

  @Test
  public void testEquals() {
    Money m12 = new Money(12);
    Money m14 = new Money(14);
    Money equalMoney = new Money(12);
    assertTrue(m12.equals(m12));
    assertTrue(m12.equals(equalMoney));
    assertFalse(m12.equals(m14));
  }

  @Test
  public void testAdd() {
    Money m12 = new Money(12);
    Money m14 = new Money(14);
    Money expected = new Money(26);
    assertEquals(expected, m12.add(m14));
  }
}
