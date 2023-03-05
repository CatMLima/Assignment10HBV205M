package is.hi.cs.junit4demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DivisionByZeroTest.class, MoneyTest.class, MoneyWithAssertThatTest.class, MoneyWithFixtureTest.class })

public class AllTests {
}
