package quickfood;

public class Driver {
	// Instance variables for the Driver class
	private String name;
	private String location;
	private int load;

	// Constructor to initialise a Driver object with provided details.
	public Driver(String name, String location, int load) {
		this.name = name;
		this.location = location;
		this.load = load;
	}

	// Getter method for retrieving the driver's name.
	public String getName() {
		return name;
	}

	// Getter method for retrieving the driver's location.
	public String getLocation() {
		return location;
	}

	// Getter method for retrieving the driver's load capacity.
	public int getLoad() {
		return load;
	}
}