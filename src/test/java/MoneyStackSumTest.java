import org.junit.Before;
import org.junit.Test;

import java.lang.management.MemoryManagerMXBean;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MoneyStackSumTest {

    private MoneyStack stack;

    // Test about In Between State Stack using Money Objects.
    @Test
    public void testSumInBetweenStack(){
        MoneyStack stack = new MoneyStack();
        Money money1 = new Money(10);
        Money money2 = new Money(20);

        stack.push(money1);
        stack.push(money2);

        assertEquals(30,stack.sum());
    }

    // Test about In Between State Stack using mock Money Objects.
    @Test
    public void testSumInBetweenStackMockMoney(){
        MoneyStack stack = new MoneyStack();
        Money mockMoney1 = mock(Money.class);
        Money mockMoney2 = mock(Money.class);

        when(mockMoney1.getAmount()).thenReturn(10);
        when(mockMoney2.getAmount()).thenReturn(20);
        stack.push(mockMoney1);
        stack.push(mockMoney2);

        assertEquals(30,stack.sum());
        verify(mockMoney1).getAmount();
        verify(mockMoney2).getAmount();
    }

    // TODO: not included, testing Sum method in empty and full state.

    @Test
    public void testSumEmptyStack(){
        MoneyStack stack = new MoneyStack();
        assertEquals(0,stack.sum());
    }

    @Test
    public void testSumFullStack(){
        MoneyStack stack = new MoneyStack();
        int sum = 0;
        for (int i = 0; i < stack.getCapacity();i++){
            stack.push(new Money(i+1));
            sum += i+1;
        }
        assertEquals(sum,stack.sum());
    }

    @Test
    public void testSumBeforeAfterPushPop(){
        MoneyStack stack = new MoneyStack();
        assertEquals(0,stack.sum());
        stack.push(new Money(10));
        assertEquals(10,stack.sum());
        stack.pop();
        assertEquals(0,stack.sum());
    }
}
