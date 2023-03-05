package is.hi.cs.junit4demo;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MoneyWithFixtureTest {
  private Money m12;
  private Money m14;
  @Before
  public void constructMoneyTestObjects() {
    m12 = new Money(12);
    m14 = new Money(14);
  }
  @Test
  public void testEquals() {
    Money equalMoney = new Money(12);
    assertTrue(m12.equals(m12));
    assertTrue(m12.equals(equalMoney));
    assertFalse(m12.equals(m14));
  }
  @Test
  public void testAdd() {
    Money expected = new Money(26);
    assertEquals(expected, m12.add(m14));
  }
}
