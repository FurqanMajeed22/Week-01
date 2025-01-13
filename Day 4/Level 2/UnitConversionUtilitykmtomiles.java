public class UnitConversionUtilitykmtomiles {

    // Method to convert kilometers to miles
    public static double convertKilometersToMiles(double kilometers) {
        final double conversionFactorKmToMiles = 0.621371;
        return kilometers * conversionFactorKmToMiles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKilometers(double miles) {
        final double conversionFactorMilesToKm = 1.60934;
        return miles * conversionFactorMilesToKm;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        final double conversionFactorMetersToFeet = 3.28084;
        return meters * conversionFactorMetersToFeet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        final double conversionFactorFeetToMeters = 0.3048;
        return feet * conversionFactorFeetToMeters;
    }

    public static void main(String[] args) {
        // Testing the conversion methods with various values

        // Convert kilometers to miles
        double kmValue = 12.5;
        double milesValue = convertKilometersToMiles(kmValue);
        System.out.println(kmValue + " kilometers equals " + milesValue + " miles.");

        // Convert miles to kilometers
        double milesTest = 8.3;
        double kmConverted = convertMilesToKilometers(milesTest);
        System.out.println(milesTest + " miles equals " + kmConverted + " kilometers.");

        // Convert meters to feet
        double metersValue = 7;
        double feetValue = convertMetersToFeet(metersValue);
        System.out.println(metersValue + " meters equals " + feetValue + " feet.");

        // Convert feet to meters
        double feetTest = 30;
        double metersConverted = convertFeetToMeters(feetTest);
        System.out.println(feetTest + " feet equals " + metersConverted + " meters.");
    }
}
