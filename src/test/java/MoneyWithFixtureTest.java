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
	public void testEqualsWithSameMoneyObject() {
		assertTrue(m12.equals(m12));
		assertTrue(m14.equals(m14));
	}

	@Test
	public void testEqualsWithAnotherMoneyObjectWithSameValue() {
		Money equalMoney = new Money(12);
		assertTrue(m12.equals(equalMoney));
	}

	@Test
	public void testNotEqualObjectsNotEqual(){
		Money money = new Money(12);
		String moneyNot = "not money";
		assertFalse(money.equals(moneyNot));
	}

	@Test
	public void testNotEqualsWithMoneyObjectWithAnotherValue() {
		assertFalse(m12.equals(m14));
	}

	@Test
	public void testAdd() {
		Money expected = new Money(26);
		assertEquals(expected, m12.add(m14));
	}

	@Test
	public void testToString(){
		Money money = new Money(26);
		String expected = "26";
		assertEquals(expected,money.toString());
	}
}
