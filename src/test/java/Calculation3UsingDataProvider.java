import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Calculation3UsingDataProvider {

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{{10, 2, 5}, {15, 5, 3}};
    }

    @Test(groups = "3", dataProvider = "data-provider", dependsOnGroups = "1")
    public void myModuloTest(int a, int b, int result){
        int myModulo = a%b;
        System.out.println("The modulo of the parameters equals: " +myModulo);
        Assert.assertNotEquals(result, myModulo);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotNull(myModulo);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod0(){
        System.out.println("This is to check how the after method annotation works (after modulo)!");
    }
}
