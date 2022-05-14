import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Calculation0UsingDataProvider {
    @BeforeTest(alwaysRun = true)
    public void beforeTest0(){
        System.out.println("Now we run group1 tests below:");
    }

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{{10, 7, 17}, {5, 4, 9}};
    }

    @Test(groups = "myFirstGroup", dataProvider = "data-provider", priority = 0)
    public void myAdditionTest(int a, int b, int result){
        int myAddition = a+b;
        System.out.println("The addition of the parameters equals: " +myAddition);
        Assert.assertEquals(result, myAddition);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(result, myAddition);
    }
}