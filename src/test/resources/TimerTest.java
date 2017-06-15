package resources;

import org.junit.Assert;
import org.junit.Test;

public class TimerTest {

    @Test
    public void handleGreetingTest() {
        Timer timerService = new Timer();
        Assert.assertTrue("Should return values in millis",timerService.getCurrentTime() != null);
    }
}