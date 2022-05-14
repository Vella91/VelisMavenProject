import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class AssertionsHomeWork {
    int a;
    int b;

    @Parameters({"a", "b"})
    @Test(alwaysRun = true, priority = 1)
    public void sampleAssertionTest(int a, int b) {
        int sum = (a + b);
        System.out.println("The sum of the two parameters is: " + sum);

        int difference = (a-b);
        System.out.println("The difference between the two params is: " + difference);

        int multiplied = (a*b);
        System.out.println("The two params multiplied result in: " + multiplied);

        int division = (a/b);
        System.out.println("The two params divided result in: " + division);

        int modulo = (a%b);
        System.out.println("The two params modulo is: " + modulo);

        //  assertEquals(sum, 17);
        assertEquals(difference, 3);
        assertEquals(multiplied, 70);
        assertNotEquals(division, 2);
        assertNotNull(modulo);
        //  fail("Message");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(a == b);
        softAssert.assertTrue(a != b);
        softAssert.assertFalse(a < b);
        softAssert.assertTrue(a > b);
        softAssert.assertEquals(sum, 17);
        softAssert.assertNotNull(sum);
        softAssert.assertEquals(difference, 3);
        softAssert.assertEquals(multiplied, 70);
        softAssert.assertNotEquals(multiplied, 71);
        softAssert.assertEquals(division, 1);
        softAssert.assertNotNull(modulo);
        softAssert.assertEquals(modulo, 3);

        softAssert.assertAll();
    }
}
