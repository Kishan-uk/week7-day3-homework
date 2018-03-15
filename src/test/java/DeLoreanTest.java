import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeLoreanTest {
    DeLorean delorean;

    @Before
    public void before() {
        delorean = new DeLorean(88, 2);
    }

    @Test
    public void timeToDestination(){
        assertEquals(22, delorean.driveDistance(1985));
    }
}