package resources.model;

import org.junit.Test;
import org.junit.Assert;

public class TimerTest {

    @Test
    public void handleGreetingTest() {
        Timer timerService = new Timer();
        Assert.assertTrue(timerService.getCurrentTime() != null);
    }
}