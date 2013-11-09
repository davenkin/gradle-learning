package davenkin;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: davenkin
 * Date: 3/12/13
 * Time: 8:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldTest {

    @Test
    public void testHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        assertThat(helloWorld.sayHello(), is("Hello World."));
    }
}
