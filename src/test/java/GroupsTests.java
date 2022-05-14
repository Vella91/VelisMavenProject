import org.testng.annotations.*;

public class GroupsTests {
    @Test(alwaysRun = true, groups = "myGroup")
    public void SimpleTest(){
        System.out.println("My First Test is executed!");
    }

    @Test(alwaysRun = true, dependsOnGroups = "myGroup")
    public void SimpleTest2(){
        System.out.println("My Second test is executed!");
    }


    @Test(groups = "example2", description = "This is my first test case with testng description"
            , dependsOnGroups = "example")
    public void dependsOnGroupExample() {
        System.out.println("This is a depends on test example");
    }

    @Test(groups = "example4", dependsOnMethods = "myFirstTestNGTestCase")
    public void dependsOnMethodExample() {
        System.out.println("This is a depends on test example");
    }
}
