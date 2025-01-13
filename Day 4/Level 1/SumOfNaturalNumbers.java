import java.util.Scanner;
public class SumOfNaturalNumbers {

    // Method to find the sum of n natural numbers using a loop
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  // Add i to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            // Get integer input from the user
            System.out.print("Enter a positive integer: ");
            int n = scanner.nextInt();

            if (n < 1) {
                System.out.println("Please enter a positive integer greater than or equal to 1.");
            } else {
                int result = findSum(n);
                System.out.println("The sum of the first " + n + " natural numbers is: " + result);
            }
        
    }
}
