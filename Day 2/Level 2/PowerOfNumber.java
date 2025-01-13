import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter a number
        int number = sc.nextInt();
        int power = sc.nextInt();
        // Initialize the result variable to 1
        int result = 1;
        // Run a loop from 1 to power to calculate the result
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiply result by the base number in each iteration
        }
        System.out.println(number + " raised to the power of " + power + " is " + result);
        
    }
}
