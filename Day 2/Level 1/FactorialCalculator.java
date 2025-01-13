import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enter an integer
        int number = sc.nextInt();
        // Check if the number is a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            // Variable to store the factorial result
            long factorial = 1;
            // Compute factorial using while loop
            int counter = 1;
            while (counter <= number) {
                factorial *= counter;  // Multiply current value with counter
                counter++;  // Increment the counter
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
