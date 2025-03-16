import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MoneyStackSumTest.class,
        MoneyStackWithFixtureTest.class,
        MoneyWithFixtureTest.class
})
public class AllTests {
}
