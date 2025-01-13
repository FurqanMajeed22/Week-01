public class kmconversion {
    public static void main(String[] args) {
        // Given distance in kilometers
        double kilometers = 10.8;
        // Conversion factor from kilometers to miles
        double kmToMiles = 1.6;
        // Convert kilometers to miles
        double miles = kilometers * kmToMiles;
        System.out.println("The distance " + kilometers + " km in miles is " + miles + ".");
    }
}
