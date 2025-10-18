package foodquick;

import java.util.Scanner;

public class Restaurant {
    String name;
    static String location;
    String contactNumber;

    public void captureDetails(Scanner scanner) {
        name = getValidInput(scanner, "Enter restaurant name: ");
        location = getValidInput(scanner, "Enter location (city): ");
        contactNumber = getValidPhoneNumber(scanner);
    }

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
}


