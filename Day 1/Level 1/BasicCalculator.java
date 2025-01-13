import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        // Take two floating point numbers as input
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        System.out.println("The addition, subtraction, multiplication and division value of " 
                           + number1 + " and " + number2 + " is " 
                           + addition + ", " 
                           + subtraction + ", " 
                           + multiplication + ", and " 
                           + division);
    }
}