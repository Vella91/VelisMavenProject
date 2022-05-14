import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Calculation2UsingDataProvider {
    @BeforeTest(alwaysRun = true)
    public void beforeTest0(){
        System.out.println("Now we run group2 tests below:");
    }

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{{10, 2, 5}, {15, 5, 3}};
    }

    @Test(groups = "2", dataProvider = "data-provider", dependsOnGroups = "1")
    public void myDivisionTest(int a, int b, int result){
        int myDivision = a/b;
        System.out.println("The division of the parameters equals: " +myDivision);

        Assert.assertEquals(result, myDivision);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotNull(myDivision);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod0(){
        System.out.println("This is to check how the after method annotation works (after division)!");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest0(){
        System.out.println("The end of the test (division)!");
    }
}