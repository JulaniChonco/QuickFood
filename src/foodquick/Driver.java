package foodquick;

import java.io.*;
import java.util.*;

public class Driver {
    public String name;
    public String location;
    public int load;

    public Driver(String name, String location, int load) {
        this.name = name;
        this.location = location;
        this.load = load;
    }

    public static List<Driver> readDriversFile(String filePath) {
        List<Driver> drivers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.trim().split(",\\s*"); // Improved splitting
                if (parts.length == 3) {
                    String name = parts[0];
                    String city = parts[1];
                    int load = Integer.parseInt(parts[2]);
                    drivers.add(new Driver(name, city, load));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading drivers file: " + e.getMessage());
        }
        return drivers;
    }

    public static Driver findAvailableDriver(List<Driver> drivers, String restaurantLocation) {
        Driver bestDriver = null;
        int minLoad = Integer.MAX_VALUE;

        for (Driver driver : drivers) {
            if (driver.location.equalsIgnoreCase(restaurantLocation) && driver.load < minLoad) {
                minLoad = driver.load;
                bestDriver = driver;
            }
        }
        return bestDriver;
    }
}

