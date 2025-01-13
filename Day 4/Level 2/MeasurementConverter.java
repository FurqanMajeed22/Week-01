public class MeasurementConverter {

    // Converts yards to feet
    public static double yardsToFeet(double yardsInput) {
        final double yardsToFeetFactor = 3;
        return yardsInput * yardsToFeetFactor;
    }

    // Converts feet to yards
    public static double feetToYards(double feetInput) {
        final double feetToYardsFactor = 0.333333;
        return feetInput * feetToYardsFactor;
    }

    // Converts meters to inches
    public static double metersToInches(double metersInput) {
        final double metersToInchesFactor = 39.3701;
        return metersInput * metersToInchesFactor;
    }

    // Converts inches to meters
    public static double inchesToMeters(double inchesInput) {
        final double inchesToMetersFactor = 0.0254;
        return inchesInput * inchesToMetersFactor;
    }

    // Converts inches to centimeters
    public static double inchesToCm(double inchesInput) {
        final double inchesToCmFactor = 2.54;
        return inchesInput * inchesToCmFactor;
    }

    public static void main(String[] args) {
        // Example usage of conversion methods
        
        // Convert yards to feet
        double yardsValue = 6;
        double feetResult = yardsToFeet(yardsValue);
        System.out.println(yardsValue + " yards equals " + feetResult + " feet.");

        // Convert feet to yards
        double feetValue = 20;
        double yardsResult = feetToYards(feetValue);
        System.out.println(feetValue + " feet equals " + yardsResult + " yards.");

        // Convert meters to inches
        double metersValue = 3.5;
        double inchesResult = metersToInches(metersValue);
        System.out.println(metersValue + " meters equals " + inchesResult + " inches.");

        // Convert inches to meters
        double inchesTestValue = 80;
        double metersConverted = inchesToMeters(inchesTestValue);
        System.out.println(inchesTestValue + " inches equals " + metersConverted + " meters.");

        // Convert inches to centimeters
        double inchesForCmValue = 24;
        double cmResult = inchesToCm(inchesForCmValue);
        System.out.println(inchesForCmValue + " inches equals " + cmResult + " centimeters.");
    }
}
