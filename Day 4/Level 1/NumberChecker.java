import java.util.Scanner;
public class NumberChecker {
    // Method to check if a number is positive, negative, or zero
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;  // Positive
        } else if (num < 0) {
            return -1; // Negative
        } else {
            return 0;  // Zero
        }
    }
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
            // Get integer input from the user
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            int result = checkNumber(number);

            // Display result based on the returned value
            if (result == 1) {
                System.out.println("The number is positive.");
            } else if (result == -1) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        
        
    }
}
