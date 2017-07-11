import myMath.MyMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by I076057 on 7/10/2017.
 */
public class MathTest {

    @Test public void addTest()
    {
        Assert.assertTrue( 2 ==  MyMath.add(1, 1));
        Assert.assertTrue( 3 ==  MyMath.add(1, 2));
    }
}
