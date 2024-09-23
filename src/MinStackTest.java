import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinStackTest {
    @Test
    public void test1(){
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        assertEquals(1,stack.min());
    }
    @Test
    public void test2(){
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals(1,stack.min());
    }
    @Test
    public void test3(){
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);

        stack.pop();
        assertEquals(2,stack.min());
    }
}
