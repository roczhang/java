package myMath;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by I076057 on 7/10/2017.
 */
public class MyMath {

    public static int add(int lop, int rop) {

        Logger logger = LogManager.getLogger(MyMath.class);

        System.out.println(  "in Myth1 ..");
        logger.error("this is in the My Math1");
        return  lop + rop;
    }

    public static void main(String [] args)
    {
         System.out.println(  MyMath.add( 1, 1));
    }
}
