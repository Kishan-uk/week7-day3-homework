import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriverTest {

    Driver driver;
    QuadBike quadbike;
    DodgemCar dodgemcar;

    @Before
    public void before() {
        quadbike = new QuadBike(10, 30);
        dodgemcar = new DodgemCar(15, 5);
        driver = new Driver("Michael Knight", quadbike);

    }

    @Test
    public void  driverHasName(){
        assertEquals("Michael Knight", driver.getName());
    }

    @Test
    public void timeToDestinationWithQuadBike(){
        assertEquals(2, quadbike.driveDistance(20));
    }

    @Test
    public void timeToDestinationDogemCar(){
        assertEquals(3, dodgemcar.driveDistance(45));
    }

    @Test
    public void setNewDriver() {
        Driver driver = new Driver("Mr T",dodgemcar);
        driver.newDriver("Mr T");
        assertEquals("Mr T", driver.getName());
    }

//    Another way ???
//
//    @Test
//    public void setNewDriver() {
//        driver.newDriver("Mr T");
//        assertEquals("Mr T", driver.getName());
//    }

    @Test
    public void setNewVehicle(){
        DodgemCar dodgemcar = new DodgemCar(30, 4);
        driver.newVehicle(dodgemcar);
        assertEquals(dodgemcar, driver.getVehicle());
    }

//    Another way ???
//
//    @Test
//    public void setNewVehicle() {
//        driver.newVehicle(quadbike);
//        assertEquals(quadbike, driver.getVehicle());
//    }
}