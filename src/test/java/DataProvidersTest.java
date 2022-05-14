import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersTest {

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{{2, 3, 5}, {5, 4, 9}};
    }

    @Test(dataProvider = "data-provider")
    public void myTest(int a, int b, int result) {
        int sum = a + b;
        Assert.assertEquals(result, sum);
    }


}
