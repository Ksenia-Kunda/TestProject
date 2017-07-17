import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kseniya_Kunda on 7/17/2017.
 */
public class TestMaven {

    private int a = 5;
    private int b = 3;
    private int sum = 8;

    @Test
    public void simpleTest() {
        int result = a + b;
        Assert.assertTrue(result == sum, "Sum is not correct");
    }

}
