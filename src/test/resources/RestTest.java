package resources;

import org.junit.Assert;
import org.junit.Test;

public class RestTest{

    @Test
    public void handleGreetingTest(){
        Rest restService = new Rest();
        Assert.assertEquals("Should be equal to Hello World","Hello World",restService.handleGreeting());
    }

    @Test
    public void handleTimeTest(){
        Rest restService = new Rest();
        Assert.assertTrue("Should return values in millis",restService.handleTime() != null);
    }

    @Test
    public void doSomethingTest(){
        Rest restService = new Rest();
        Assert.assertEquals("shoul dbe equal to 'something was done successfully'","something was done successfully",restService.doSomething());
    }

}