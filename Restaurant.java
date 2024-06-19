package quickfood;

public class Restaurant {
    // Instance variables for the Restaurant class

    private String restaurantName;
    private String restaurantLocation;
    private String specialInstructions;

    // Constructor to initialise a Restaurant object with provided details.
    public Restaurant(String restaurantName, String restaurantLocation, String specialInstructions) {
        this.restaurantName = restaurantName;
        this.restaurantLocation = restaurantLocation;
        this.specialInstructions = specialInstructions;
    }

    // Getter method for retrieving the restaurant's name.
    public String getRestaurantName() {
        return restaurantName;
    }

    // Getter method for retrieving the restaurant's location.
    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    // Getter method for retrieving special instructions for the restaurant.
    public String getSpecialInstructions() {
        return specialInstructions;
    }
}
