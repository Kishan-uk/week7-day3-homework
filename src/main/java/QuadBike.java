public class QuadBike extends Vehicle implements IDriveable {

    private int engineCapacity;

    public QuadBike(int avgSpeed, int engineCapacity) {
        super(avgSpeed);
        this.engineCapacity = engineCapacity;
    }

    public int driveDistance(int distance) {
        return distance / vehicleAvgSpeed();
    }

}
