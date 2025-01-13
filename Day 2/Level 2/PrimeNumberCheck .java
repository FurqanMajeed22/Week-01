import java.util.Scanner;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enter a number
        int number = scanner.nextInt();
        // Assume the number is prime initially
        boolean isPrime = true;
        // Check if the number is greater than 1 (as prime numbers must be greater than 1)
        if (number <= 1) {
            isPrime = false;  // Numbers less than or equal to 1 are not prime
        } else {
            // Loop from 2 to the number-1 to check divisibility
            for (int i = 2; i < number; i++) {
                // If the number is divisible by any number other than 1 and itself, it's not prime
                if (number % i == 0) {
                    isPrime = false;  // Not prime
                    break;  // Exit the loop since it's already not prime
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
   
    }
}
