package test2;

import junit.framework.TestCase;

public class TestUnit extends TestCase {
    protected int value1, value2;


    protected void setUp() {
        value1 = 3;
        value2 = 3;
    }

    public void testAdd(){
        double result = value1 + value2;
        assertTrue(result == 7);
    }
}
