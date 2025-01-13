import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        // Initialize sum to 0
        int sum = 0;
        // Find divisors of the number and sum them
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;  // Add the divisor to sum
            }
        }
        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
 
    }
}
