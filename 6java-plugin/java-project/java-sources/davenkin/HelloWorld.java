package davenkin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: davenkin
 * Date: 3/12/13
 * Time: 8:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld implements HelloWordApi {
          private final static Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public String sayHello(){
        logger.info("Saying Hello World.");
        return "Hello World.";
    }
}
