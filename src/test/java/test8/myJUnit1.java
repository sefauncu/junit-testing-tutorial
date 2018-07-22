package test8;

import org.junit.*;

import static org.junit.Assert.fail;

public class myJUnit1 {

    @BeforeClass
    public static void getBeforeClassEveryTest(){
        System.out.println("#beforeClassEveryTest");
    }

    @Before
    public void getBeforeEveryTest(){
        System.out.println("#beforeEveryTest");
    }


    @Test() //@Test(timeout = 1000)
    public void testMultiply(){
       if (getMultiply(10,30)==300){
           System.out.println("Multiply Doğru");
       }else {
           System.out.println("Multiply Yanlış");
           fail("Multiply Başarısız");
       }
    }
    @Test
    @Ignore
    public void testAdd(){
        if (getAdd(10,30)==300){
            System.out.println("Add Doğru");
        }else {
            System.out.println("Add Yanlış");
            fail("Add Başarısız");
        }
    }

    @AfterClass
    public static void getAfterClassEveryTest(){
        System.out.println("#afterClassEveryTest");
    }


    @After
    public void getAfterEveryTest(){
        System.out.println("#afterEveryTest");
    }


    public int getMultiply(int x, int y){
        return x*y;
    }

    public int getAdd(int x, int y) {
        return x + y;


    }
}

