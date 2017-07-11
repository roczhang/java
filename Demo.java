
import mathWrapper.MathWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by I076057 on 7/10/2017.
 */
public class Demo {
    private static Logger logger = LogManager.getLogger(Demo.class);

    public  static  void main( String[] args){

        System.out.println(MathWrapper.add(1,3));

        logger.debug("This is debug message.");
        logger.info("This is info message.");
        logger.error("This is error message.");
    }

}
