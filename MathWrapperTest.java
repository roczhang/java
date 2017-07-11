import mathWrapper.MathWrapper;
import myMath.MyMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by I076057 on 7/11/2017.
 */
public class MathWrapperTest {

    @Test
    public void add( ){

        int left = 1;
        int right = 2;
        Assert.assertEquals( left + right,  MathWrapper.add(left, right) );
    }
}
