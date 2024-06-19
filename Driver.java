package quickfood;

public class Driver {
    // Instance variables for the Driver class

    private String driverName;
    private String driverLocation;
    private int driverLoad;

    // Constructor to initialise a Driver object with provided details.
    public Driver(String driverName, String driverLocation, int driverLoad) {
        this.driverName = driverName;
        this.driverLocation = driverLocation;
        this.driverLoad = driverLoad;
    }

    // Getter method for retrieving the driver's name.
    public String getDriverName() {
        return driverName;
    }

    // Getter method for retrieving the driver's location.
    public String getDriverLocation() {
        return driverLocation;
    }

    // Getter method for retrieving the driver's load capacity.
    public int getDriverLoad() {
        return driverLoad;
    }
}
