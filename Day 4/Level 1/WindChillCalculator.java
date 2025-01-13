import java.util.Scanner;
public class WindChillCalculator {
    // Method to calculate wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        // Applying the wind chill formula
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take user input for temperature and wind speed
        System.out.print("Enter the temperature");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the wind speed");
        double windSpeed = scanner.nextDouble();
        // Create an instance of WindChillCalculator and calculate the wind chill
        WindChillCalculator calculator = new WindChillCalculator();
        double windChill = calculator.calculateWindChill(temperature, windSpeed);
        // Output the wind chill temperature
        System.out.println("The wind chill temperature is: " + windChill + "°F");
    }
}
