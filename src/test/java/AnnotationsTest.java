import org.testng.annotations.*;


public class AnnotationsTest {
    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("This is before test update!");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        System.out.println("This is after test update!");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        System.out.println("This is before method update!");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("This is after method update!");
    }

    @Test
    public void myFirstTestNGTestCase() {
        System.out.println("This is my first testNG test case - 1");
    }

    @Test
    public void mySecondTestNGTestCase() {
        System.out.println("This is my first testNG test case - 2");
    }

    @Test
    public void myThirdTestNGTestCase() {
        System.out.println("This is my first testNG test case - 3");
    }
}
