package test3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUnit {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        message = "Hello World";
        assertEquals(message,messageUtil.printMessage());
    }
}