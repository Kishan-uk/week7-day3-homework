public class DodgemCar extends Vehicle implements IDriveable {

//    Refactored.
//    private int avgSpeed;
    private int seats;

    public DodgemCar(int avgSpeed, int seats) {
        super(avgSpeed);
        this.seats = seats;
    }

    public int driveDistance(int distance) {
        return distance / vehicleAvgSpeed();
    }

}
