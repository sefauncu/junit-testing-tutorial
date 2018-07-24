package test11;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class TestCase extends junit.framework.TestCase {

    protected ListTest listTest = new ListTest();

    @BeforeClass
    protected void setUp(){
        listTest.add("BMW");
        listTest.add("Audi");
        listTest.add("Mercedes");
        System.out.println(listTest);

    }

    @Test
    public void testSize(){
        assertEquals("List Boyutu",3,listTest.size());
        System.out.println(listTest);
    }

    @Test
    public  void testAdd(){
        listTest.add("Fiat");
        assertEquals("Fiat eklendi. Liste Boyutu 4 oldu.",4,listTest.size());
        System.out.println(listTest);
    }

    public void testRemove(){
        listTest.remove("Audi");
        listTest.remove("Fiat");
        assertEquals("Audi ve Fiat silindi. Liste boyutu 2 oldu.",2,listTest.size());
        System.out.println(listTest);
    }
    @AfterClass
    protected void tearDown(){
        listTest.removeAll();
        System.out.println(listTest);
    }
}
