package quickfood;

public class Customer {
    // Instance variables for the Customer class

    private String customerName;
    private String customerContact;
    private String customerAddress;
    private String customerLocation;
    private String customerEmail;

    // Constructor to initialise a Customer object with provided details.
    public Customer(String customerName, String customerContact, String customerAddress, String customerLocation, String customerEmail) {
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerAddress = customerAddress;
        this.customerLocation = customerLocation;
        this.customerEmail = customerEmail;
    }

    // Getter methods for retrieving customer attributes.
    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerLocation() {
        return customerLocation;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
