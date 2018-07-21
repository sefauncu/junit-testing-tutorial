package test1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnit {

    @Test
    public void testAdd(){
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);

    }
}
