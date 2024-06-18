package quickfood;

public class Customer {
	// Instance variables for the Customer class
	private String name;
	private String contactNumber;
	private String address;
	private String location;
	private String email;

	// Constructor to initialise a Customer object with provided details.
	public Customer(String name, String contactNumber, String address, String location, String email) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.address = address;
		this.location = location;
		this.email = email;
	}

	// Getter methods for retrieving customer attributes.
	public String getName() {
		return name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getLocation() {
		return location;
	}

	public String getEmail() {
		return email;
	}
}