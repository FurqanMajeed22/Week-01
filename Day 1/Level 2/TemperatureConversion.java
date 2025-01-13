import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take temperature in Celsius as input
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit.");
    }
}
