import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        // Take two numbers as input from the user
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two numbers " + number1 + " and " + number2 + ".");
    }
}
