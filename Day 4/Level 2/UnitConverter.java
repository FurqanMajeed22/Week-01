public class UnitConverter {

    // Convert kilometers to miles
    public static double kmToMiles(double distance) {
        double kmFactor = 0.621371;
        return distance * kmFactor;
    }

    // Convert miles to kilometers
    public static double milesToKm(double distance) {
        double mileFactor = 1.60934;
        return distance * mileFactor;
    }

    // Convert meters to feet
    public static double metersToFeet(double distance) {
        double meterFactor = 3.28084;
        return distance * meterFactor;
    }

    // Convert feet to meters
    public static double feetToMeters(double distance) {
        double feetFactor = 0.3048;
        return distance * feetFactor;
    }

    public static void main(String[] args) {
        System.out.println("10 km to miles: " + kmToMiles(10.0));          // km to miles
        System.out.println("6 miles to km: " + milesToKm(6.0));            // miles to km
        System.out.println("50 meters to feet: " + metersToFeet(50.0));    // meters to feet
        System.out.println("20 feet to meters: " + feetToMeters(20.0));    // feet to meters
    }
}
