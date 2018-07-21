package test5;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JunitTestSuite {

    public static void main(String[] a) {

        TestSuite suite = new TestSuite(TestUnit.class,TestUnit2.class,TestUnit3.class);
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println("Number of test cases = " + result.runCount());

    }
}
