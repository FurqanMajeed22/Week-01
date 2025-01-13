import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // Store the original number for comparison
        int originalNumber = number;
        // Initialize sum variable to 0
        int sum = 0;
        // Use a while loop to process each digit of the number
        while (number != 0) {
            // Find the last digit of the number using modulus operator
            int digit = number % 10;
            // Find the cube of the digit and add it to sum
            sum += digit * digit * digit;
            // Remove the last digit from the number by dividing it by 10
            number = number / 10;
        }
        
        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

    }
}
