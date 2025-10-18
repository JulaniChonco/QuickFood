package foodquick;

import java.util.Scanner;

public class Customer {
    String name;
    String contactNumber;
    String address;
    String city;
    String email;
    String specialInstructions;

    public void captureDetails(Scanner scanner) {
        name = getValidInput(scanner, "Enter customer name: ");
        contactNumber = getValidPhoneNumber(scanner);
        address = getValidInput(scanner, "Enter address: ");
        city = getValidInput(scanner, "Enter city: ");
        email = getValidEmail(scanner);
        specialInstructions = getValidInput(scanner, "Enter spcial Instruction: ");
       
    }

    // Method to ensure input is not blank
    private String getValidInput(Scanner scanner, String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("This field cannot be empty. Please enter a valid input.");
            }
        } while (input.isEmpty());
        return input;
    }

    // Method to validate phone number (10 digits only)
    private String getValidPhoneNumber(Scanner scanner) {
        String phoneNumber;
        do {
            System.out.print("Enter contact number (10 digits): ");
            phoneNumber = scanner.nextLine().trim();
            if (!phoneNumber.matches("\\d{10}")) {
                System.out.println("Invalid contact number! It must be exactly 10 digits.");
            }
        } while (!phoneNumber.matches("\\d{10}"));
        return phoneNumber;
    }

    // Method to validate email
    private String getValidEmail(Scanner scanner) {
        String email;
        do {
            System.out.print("Enter email: ");
            email = scanner.nextLine().trim();
            if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                System.out.println("Invalid email! Please enter a valid email (example@domain.com).");
            }
        } while (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"));
        return email;
    }
}