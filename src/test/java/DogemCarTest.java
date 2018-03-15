import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogemCarTest {
    DodgemCar dodgemCar;

    @Before
    public void before() {
        dodgemCar = new DodgemCar(5, 5);
    }

    @Test
    public void timeToDestination(){
        assertEquals(2, dodgemCar.driveDistance(10));
    }
}
