public abstract class Vehicle {

    private int avgSpeed;

    public Vehicle(int avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public int vehicleAvgSpeed() {
        return this.avgSpeed;
    }
}
