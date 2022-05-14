import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Calculation1UsingDataProvider {
    @BeforeTest(alwaysRun = true)
    public void beforeTest0(){
        System.out.println("Now we run group1 tests below:");
    }

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{{10, 7, 3}, {5, 4, 1}};
    }

    @Test(groups = "1", dataProvider = "data-provider")
    public void myDiffTest(int a, int b, int result){
        int myDiff = a-b;
        System.out.println("The difference between param a and param b equals: " +myDiff);

        Assert.assertEquals(result, myDiff);
    }

    @AfterTest(alwaysRun = true)
    public void afterTest1(){
        System.out.println("Print this after the difference calculation.");
    }
}