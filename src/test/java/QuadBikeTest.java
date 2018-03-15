import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadBikeTest {
    QuadBike quadBike;

    @Before
    public void before() {
        quadBike = new QuadBike(10, 60);
    }

    @Test
    public void timeToDestination(){
        assertEquals(3, quadBike.driveDistance(30));
    }
}