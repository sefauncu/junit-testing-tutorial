package test7;

import org.junit.Test;

import static org.junit.Assert.*;


public class TestAssertions {

    @Test
    public void testAssertions() {

        String str1 = new String ("kodreis");
        String str2 = new String ("kodreis");
        String str3 = null;
        String str4 = "sefa";
        String str5 = "sefa";

        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"bir", "iki", "uc"};
        String[] resultArray =  {"bir", "iki", "uc"};


        assertEquals(str1, str2);


        assertTrue (val1 < val2);


        assertFalse(val1 > val2);


        assertNotNull(str1);


        assertNull(str3);

        //iki nesne referansı aynı nesneyi gösterip göstermediğini kontrol et.
        assertSame(str4,str5);

        //iki nesne referansı aynı nesneyi gösterip göstermediğini kontrol et.
        assertNotSame(str1,str3);

        //iki dizinin birbirine eşitliğinin kontrolü.
        assertArrayEquals(expectedArray, resultArray);
    }
}
