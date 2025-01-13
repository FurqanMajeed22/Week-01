import java.util.Scanner;
public class QuotientAndRemainder {
    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];  // Array to hold quotient and remainder
        // Calculate quotient and remainder
        result[0] = number / divisor;  // Quotient
        result[1] = number % divisor;  // Remainder
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input for number and divisor
        System.out.print("Enter the number");
        int number = sc.nextInt();
        
        System.out.print("Enter the divisor");
        int divisor = sc.nextInt();
        // Find quotient and remainder using the method
        int[] result = findRemainderAndQuotient(number, divisor);
        // Output the quotient and remainder
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }
}
