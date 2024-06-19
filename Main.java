package quickfood;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collecting customer information.
        String customerName = getInput(scanner, "Enter customer name: ");
        String customerContactNumber = getInput(scanner, "Enter customer contact number: ");
        String customerAddress = getInput(scanner, "Enter customer address: ");
        String customerLocation = getInput(scanner, "Enter customer location: ");
        String customerEmail = getInput(scanner, "Enter customer email: ", true);

        Customer customer = new Customer(customerName, customerContactNumber, customerAddress, customerLocation,
                customerEmail);

        // Collecting restaurant information.
        String restaurantName = getInput(scanner, "Enter restaurant name: ");
        String restaurantLocation = getInput(scanner, "Enter restaurant location: ");
        String specialInstructions = getInput(scanner, "Enter special instructions for the restaurant: ");

        Restaurant restaurant = new Restaurant(restaurantName, restaurantLocation, specialInstructions);

        // Finding an appropriate driver based on restaurant location.
        Driver assignedDriver = findDriver(restaurantLocation);

        // Generating a random order number for the invoice.
        int orderNumber = generateRandomOrderNumber();

        // Attempting to generate invoice with collected information.
        try {
            generateInvoice(orderNumber, customer, restaurant, assignedDriver);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    // Method to get validated input from user.
    private static String getInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine().trim();
        while (input.isEmpty()) {
            System.out.println("Please enter a valid input.");
            input = scanner.nextLine().trim();
        }
        return input;
    }

    // Overloaded method to validate email input.
    private static String getInput(Scanner scanner, String prompt, boolean validateEmail) {
        if (!validateEmail) {
            return getInput(scanner, prompt);
        }

        String input;
        boolean valid = false;
        do {
            input = getInput(scanner, prompt);
            if (!input.contains("@")) {
                System.out.println("Invalid email format. Please enter a valid email.");
            } else {
                valid = true;
            }
        } while (!valid);

        return input;
    }

    // Method to generate a random order number.
    public static int generateRandomOrderNumber() {
        Random rand = new Random();
        return 1000 + rand.nextInt(9000);
    }

    // Method to find a driver based on restaurant location.
    public static Driver findDriver(String restaurantLocation) {
        List<Driver> drivers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("driver-info.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                String name = parts[0];
                String location = parts[1];
                int load = Integer.parseInt(parts[2]);
                drivers.add(new Driver(name, location, load));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Finding the most suitable driver based on load and location.
        Driver assignedDriver = null;
        for (Driver driver : drivers) {
            if (driver.getLocation().equalsIgnoreCase(restaurantLocation)) {
                if (assignedDriver == null || driver.getLoad() < assignedDriver.getLoad()) {
                    assignedDriver = driver;
                }
            }
        }

        return assignedDriver;
    }

    // Method to generate an invoice based on provided information.
    public static void generateInvoice(int orderNumber, Customer customer, Restaurant restaurant, Driver driver)
            throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("invoice.txt"))) {
            // Writing order details to invoice file.
            writer.write("Order number: " + orderNumber + "\n");
            writer.write("Customer: " + customer.getName() + "\n");
            writer.write("Email: " + customer.getEmail() + "\n");
            writer.write("Phone number: " + customer.getContactNumber() + "\n");
            writer.write("Location: " + customer.getLocation() + "\n\n");
            writer.write(
                    "You have ordered the following from " + restaurant.getName() + " in " + restaurant.getLocation() + ":\n\n");
            writer.write("1 x Pepperoni pizza (R78.00)\n");
            writer.write("2 x Hawaiian pizza (R82.00)\n\n");
            writer.write("Special instructions: " + restaurant.getSpecialInstructions() + "\n\n");
            writer.write("Total: R242.00\n\n");

            // Checking if a driver is available and capable of delivering to customer's
            // location.
            if (driver != null && customer.getLocation().equalsIgnoreCase(restaurant.getLocation())) {
                writer
                        .write(driver.getName() + " is nearest to the restaurant and will be delivering your order to you at:\n\n");
                writer.write(customer.getAddress() + "\n\n");
                writer.write("If you need to contact the restaurant, their number is 098 765 4321.\n");
            } else {
                writer.write("Unfortunately, no drivers are available to deliver to your location.\n");
            }
        }
    }
}
