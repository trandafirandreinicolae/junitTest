import org.junit.Assert;
import org.junit.Test;

public class MyTest {

    @Test
    public void aTestSample(){
        System.out.println("This is a passing test");
    }


    @Test
    public void aSecondTestSample(){
        Assert.assertTrue(false);
        System.out.println("This is a failing test");
    }


}
