package test5;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TestUnit2 extends TestCase {

    @Before
    public void setUp() {
        float fValue1 = 2.0f;
        float fValue2 = 3.0f;
    }

    @Test
    public void testAdd() {
        //count the number of test cases
        System.out.println("No of Test Case = "+ this.countTestCases());

        //test getName
        String name = this.getName();
        System.out.println("Test Case Name = "+ name);

        //test setName
        this.setName("testNewAdd");
        String newName = this.getName();
        System.out.println("Updated Test Case Name = "+ newName);
    }

    //tearDown used to close the connection or clean up activities
    public void tearDown(  ) {
    }
}
