package test9;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class mySeleniumTest {

    //public WebDriver webDriver;
/*
    @Before
    public  void testSetup(){
        //String path = System.getProperty("user.dir");
        //System.setProperty("webdriver.chrome.driver",path + "\\Driver\\chromedriver.exe");
        //webDriver = new ChromeDriver();
        //webDriver.get("http://www.tutorialspoint.com/");
        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
        //webDriver=new ChromeDriver();
        //webDriver.manage().window().maximize();
        //webDriver.get("http://www.kodreis.com/");

    }
*/

    @Test
    public void testMethod(){
        //System.setProperty("webdriver.firefox.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        WebDriver webDriver = new ChromeDriver();
        //System.setProperty("webdriver.firefox.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        webDriver.navigate().to("http://www.kodreis.com");
        Assert.assertTrue("title should start differently",webDriver.getTitle().startsWith("KODREİS"));

        //String title = webDriver.getTitle();
        //Assert.assertTrue(title.contains("KODREİS"));

    }
/*
    @After
    public void testTearDown() {
    //    webDriver.quit();
    }
    */
}
