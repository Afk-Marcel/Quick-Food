package quickfood;

public class Restaurant {
	// Instance variables for the Restaurant class
	private String name;
	private String location;
	private String specialInstructions;

	// Constructor to initialise a Restaurant object with provided details.
	public Restaurant(String name, String location, String specialInstructions) {
		this.name = name;
		this.location = location;
		this.specialInstructions = specialInstructions;
	}

	// Getter method for retrieving the restaurant's name.
	public String getName() {
		return name;
	}

	// Getter method for retrieving the restaurant's location.
	public String getLocation() {
		return location;
	}

	// Getter method for retrieving special instructions for the restaurant.
	public String getSpecialInstructions() {
		return specialInstructions;
	}
}