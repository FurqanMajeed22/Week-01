import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        // Store the original number and initialize sum to 0
        int originalNumber = number;
        int sum = 0;
        // Use a while loop to access each digit of the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit of the number
            sum += digit;  // Add the digit to the sum
            number = number / 10;  // Remove the last digit
        }
        
        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }
    }
}
