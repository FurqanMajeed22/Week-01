import java.util.Scanner;
public class FarenheittoCelsius{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take temperature in Fahrenheit as input
        double fahrenheit = scanner.nextDouble();
        // Convert Fahrenheit to Celsius using the formula
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius.");
    }
}
