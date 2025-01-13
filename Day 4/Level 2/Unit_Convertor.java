public class Unit_Convertor {
    // Method to convert Fahrenheit to Celsius
    public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }
    // Method to convert Celsius to Fahrenheit
    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }
    // Method to convert pounds to kilograms
    public static double pToKg(double p) {
        double pKg = 0.453592;
        return p * pKg;
    }
    // Method to convert kilograms to pounds
    public static double kgToP(double kg) {
        double kgP = 2.20462;
        return kg * kgP;
    }
    // Method to convert gallons to liters
    public static double gToL(double g) {
        double gL = 3.78541;
        return g * gL;
    }
    // Method to convert liters to gallons
    public static double lToG(double l) {
        double lG = 0.264172;
        return l * lG;
    }

    public static void main(String[] args) {
        // Example conversions
        System.out.println("Fahrenheit to Celsius " + fToC(98.6));
        System.out.println("Celsius to Fahrenheit " + cToF(37.0));
        System.out.println("Pounds to Kilograms " + pToKg(150));
        System.out.println("Kilograms to Pounds " + kgToP(68));
        System.out.println("Gallons to Liters " + gToL(10));
        System.out.println("Liters to Gallons " + lToG(5));
    }
}
