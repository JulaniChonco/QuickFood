package foodquick;

import java.io.FileWriter;
import java.io.IOException;

public class Invoice {
    int orderNumber;
    Customer customer;
    Restaurant restaurant;
    String mealsDetails;
    double totalAmount;
    Driver driver;

    public Invoice(int orderNumber, Customer customer, Restaurant restaurant, String mealsDetails, double totalAmount, Driver driver) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.restaurant = restaurant;
        this.mealsDetails = mealsDetails;
        this.totalAmount = totalAmount;
        this.driver = driver;
    }

    public void generateInvoice() {
        try (FileWriter writer = new FileWriter("invoice.txt")) {
            if (driver == null) {
                writer.write("Sorry! Our drivers are too far away from you to be able to deliver to your location.\n");
            } else {
                writer.write("Order number " + orderNumber + "\n");
                writer.write("Customer: " + customer.name + "\n");
                writer.write("Email: " + customer.email + "\n");
                writer.write("Phone number: " + customer.contactNumber + "\n");
                writer.write("Location: " + customer.city + "\n\n");

                writer.write("You have ordered the following from " + restaurant.name + " in " + Restaurant.location + ":\n");
                writer.write(mealsDetails + "\n\n");
                writer.write("Special instructions: " + customer.specialInstructions + "\n");
                writer.write("Total: R" + String.format("%.2f", totalAmount) + "\n\n");

                writer.write(driver.name + " is nearest to the restaurant and so he will be delivering your order to you at:\n");
                writer.write(customer.address + "\n\n");

                writer.write("If you need to contact the restaurant, their number is " + restaurant.contactNumber + ".\n");
            }

            System.out.println("\n✅ Invoice generated successfully.");
        } catch (IOException e) {
            System.out.println("Error writing invoice: " + e.getMessage());
        }
    }
}
