# QuickFood Project

## Overview

The QuickFood project is a Java application designed to handle food delivery operations. It involves three primary classes: `Customer`, `Driver`, and `Restaurant`, along with a `Main` class that orchestrates the functionality. The `Main` class collects customer and restaurant information, finds an appropriate driver, generates a random order number, and creates an invoice.

## Classes

### Customer Class

The `Customer` class represents a customer with attributes such as name, contact number, address, location, and email.

### Driver Class

The `Driver` class represents a delivery driver with attributes such as name, location, and load capacity.

### Restaurant Class

The `Restaurant` class represents a restaurant with attributes such as name, location, and special instructions.

### Main Class

The `Main` class is responsible for:

1. **Collecting Customer Information**: Gathers name, contact number, address, location, and email from the user.
2. **Collecting Restaurant Information**: Gathers name, location, and special instructions from the user.
3. **Finding a Driver**: Reads driver information from `drivers.txt` and selects a suitable driver based on location and load.
4. **Generating an Order Number**: Creates a random order number for the invoice.
5. **Generating an Invoice**: Writes order details to `invoice.txt`, including customer information, restaurant details, and driver information if available.

## Usage

1. **Compile the Code**: Ensure you have Java Development Kit (JDK) installed. Compile the Java files using:
   ```sh
   javac quickfood/*.java
2. **Run the Application**: Execute the Main class with:
   ```sh
   java quickfood.Main
3. **Input Data**: Follow the prompts to enter customer and restaurant information.
4. **Check Invoice**: After running the program, check invoice.txt for the generated invoice details.

## Requirements

1. Java Development Kit (JDK) 8 or higher
2. drivers.txt file with driver information in the format: name, location, load

## Example

Here’s a snippet of how the Main class works:
```Java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Collecting customer information
    String customerName = getInput(scanner, "Enter customer name: ");
    // More code...
}
```

## License

This project is licensed under the MIT License
