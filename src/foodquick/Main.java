package foodquick;

import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Capture customer and restaurant details
        Customer customer = new Customer();
        customer.captureDetails(scanner);

        Restaurant restaurant = new Restaurant();
        restaurant.captureDetails(scanner);

        // Read drivers
        List<Driver> drivers = Driver.readDriversFile("drivers.txt");

        // Find available driver
        Driver assignedDriver = Driver.findAvailableDriver(drivers, Restaurant.location);

        // Capture meal details
        System.out.print("\nEnter the details of meals ordered (e.g., 1 x Pepperoni Pizza (R78.00)):\n");
        String mealsDetails = scanner.nextLine();

        System.out.print("Enter total amount (e.g., 242.00): R");
        double totalAmount = scanner.nextDouble();
        scanner.nextLine(); // Clear newline buffer

        // Generate order number
        int orderNumber = new Random().nextInt(9000) + 1000;

        // Create and generate invoice
        Invoice invoice = new Invoice(orderNumber, customer, restaurant, mealsDetails, totalAmount, assignedDriver);
        invoice.generateInvoice();

        scanner.close();
    }
}

