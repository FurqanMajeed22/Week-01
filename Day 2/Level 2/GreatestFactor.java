import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Enter a number
        int number = sc.nextInt();
        // Initialize greatestFactor to 1 (as every number is divisible by 1)
        int greatestFactor = 1;
        // Loop from number-1 down to 1 to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;  // Update greatestFactor if i divides the number
                break;  // Break the loop once the greatest factor is found
            }
        }
        System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);
    }
}
