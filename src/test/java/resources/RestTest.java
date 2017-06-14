package resources;

import org.junit.Test;
import org.junit.Assert;

public class RestTest{

    @Test
    public void handleGreetingTest(){
        Rest restService = new Rest();
        Assert.assertEquals("Hello World",restService.handleGreeting());
    }

    @Test
    public void handleTimeTest(){
        Rest restService = new Rest();
        Assert.assertTrue(restService.handleTime() != null);
    }

    @Test
    public void doSomethingTest(){
        Rest restService = new Rest();
        Assert.assertEquals("something was done successfully",restService.doSomething());
    }

}