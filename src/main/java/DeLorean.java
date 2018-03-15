public class DeLorean extends Vehicle implements IDriveable {

    private int doors;

    public DeLorean(int avgSpeed, int doors) {
        super(avgSpeed);
        this.doors = doors;
    }

    public int driveDistance(int distance) {
        return distance / vehicleAvgSpeed();
    }

}
