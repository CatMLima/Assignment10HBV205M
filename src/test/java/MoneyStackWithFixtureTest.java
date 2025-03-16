import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;

public class MoneyStackWithFixtureTest {

    private MoneyStack stack;

    @Before
    public void constructMoneyStack(){
        stack = new MoneyStack();
    }

    /*
    In the design of these tests, I used the N+ strategy. I began by creating a FREE model which I
    then turned into a transition tree and later response matrix.
     */

    // Tests Cases for Empty Stack State

    @Test
    public void testPushEmptyStack(){
        Money money10 = new Money(10);
        try{
            stack.push(money10);
        } catch (ArrayIndexOutOfBoundsException exception){
            fail("Push to empty stack should not throw exception before stack is full");
        }
        Money money10pop = stack.pop();
        assertSame(money10,money10pop);
        assertFalse(stack.isFull());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPopEmptyStack(){
        stack.pop();
    }

    @Test
    public void testIsFullEmptyStack(){
        assertFalse(stack.isFull());
    }

    // Test Cases for In Between Stack State

    @Test
    public void testPushInBetweenStack(){
        for (int i = 0; i < stack.getCapacity()-2; i++){
            try{
                stack.push(new Money(i+1));
            } catch (ArrayIndexOutOfBoundsException exception){
                fail("Push should not throw exception before stack is full");
            }
        }
        Money money8 = new Money(8);
        stack.push(money8);
        assertSame(money8,stack.pop());
        assertFalse(stack.isFull());
    }

    @Test
    public void testPushInBetweenToFullStack(){
        for (int i = 0; i < stack.getCapacity()-1; i++){
            try{
                stack.push(new Money(i+1));
            } catch (ArrayIndexOutOfBoundsException exception){
                fail("Push should not throw exception before stack is full");
            }
        }
        Money money9 = new Money(9);
        stack.push(money9);
        assertTrue(stack.isFull());
        assertSame(money9,stack.pop());

    }

    @Test
    public void testPopInBetweenStack(){
        for (int i = 0; i < stack.getCapacity()-1; i++){
            try{
                stack.push(new Money(i+1));
            } catch (ArrayIndexOutOfBoundsException exception){
                fail("Push should not throw exception before stack is full");
            }
        }
        assertFalse(stack.isFull());
        stack.pop();
        assertFalse(stack.isFull());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPopInBetweenStackToEmpty(){
        try{
            stack.push(new Money(1));
        } catch (ArrayIndexOutOfBoundsException exception){
            fail("Push should not throw exception before stack is full");
        }
        stack.pop();
        stack.pop();
    }

    @Test
    public void testIsFullInBetweenStack(){
        for (int i = 0; i < stack.getCapacity()-1; i++){
            try{
                stack.push(new Money(i+1));
            } catch (ArrayIndexOutOfBoundsException exception){
                fail("Push should not throw exception before stack is full");
            }
        }
        assertFalse(stack.isFull());
    }

    // Test Cases for Full Stack State

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPushFullStack(){

        for (int i = 0; i < stack.getCapacity();i++){
            try {
                stack.push(new Money(i+1));
            } catch (ArrayIndexOutOfBoundsException exception){
                fail("Push should not throw exception before stack is full");
            }
        }
        assertTrue(stack.isFull());
        stack.push(new Money(10));
    }

    @Test
    public void testPopFullStack(){
        for (int i = 0; i < stack.getCapacity();i++){
            try {
                stack.push(new Money(i+1));
            } catch (ArrayIndexOutOfBoundsException exception){
                fail("Push should not throw exception before stack is full");
            }
        }
        assertTrue(stack.isFull());
        stack.pop();
        assertFalse(stack.isFull());
    }

    @Test
    public void testIsFullFullStack(){

        for (int i = 0; i < stack.getCapacity();i++){
            try {
                stack.push(new Money(i+1));
            } catch (ArrayIndexOutOfBoundsException exception){
                fail("Push should not throw exception before stack is full");
            }
        }
        assertTrue(stack.isFull());
    }

    // Tests for IsEmpty()
    @Test
    public void testIsEmptyEmptyStack(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmptyNonEmptyStack(){
        Money m = new Money(10);
        stack.push(m);
        assertFalse(stack.isEmpty());
        assertSame(m,stack.pop());
    }

    // Tests for getCurrentSize
    @Test
    public void testGetCurrentSizeEmptyStack(){
        assertEquals(0,stack.getCurrentSize());
    }

    @Test
    public void testGetCurrentSizeFullStack(){
        for (int i = 0; i < stack.getCapacity();i++){
            try {
                stack.push(new Money(i+1));
            } catch (ArrayIndexOutOfBoundsException exception){
                fail("Push should not throw exception before stack is full");
            }
        }
        assertEquals(10,stack.getCurrentSize());
    }

    @Test
    public void testGetCurrentSizeInBetweenStack(){
        for (int i = 0; i < stack.getCapacity()-1; i++){
            try{
                stack.push(new Money(i+1));
            } catch (ArrayIndexOutOfBoundsException exception){
                fail("Push should not throw exception before stack is full");
            }
        }
        assertEquals(9,stack.getCurrentSize());
    }
}
