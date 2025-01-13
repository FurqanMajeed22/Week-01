import java.util.*;
public class EarthVolume {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKm = 6378;
        // Volume of a sphere formula (4/3) * pi * r^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double kmToMiles = 0.621371;
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);
        // Print the result
        System.out.printf("The volume of Earth in cubic kilometers is %.2f km^3%n", volumeKm3);
        System.out.printf("The volume of Earth in cubic miles is %.2f miles^3%n", volumeMiles3);
    }
}