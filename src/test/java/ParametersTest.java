import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Test(groups = "parameters")
    @Parameters({ "suiteParam"})
    public void singleParamTest(String suiteParam){
        System.out.println("Test singleParamTest suite param is: " + suiteParam);
    }

   /* @Test(groups = "parameters")
    @Parameters({ "suiteParam", "testParam2", "testParam3" })
    public void multiParamTest(String suiteParam, String testParam) {
        System.out.println("Test multiParamTest suite param is: " + suiteParam);
        System.out.println("Test multiParamTest param is: " + testParam);
    }*/

}
