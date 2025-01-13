import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // Check and print all factors of the number  
        // Loop through all numbers from 1 to number-1 to find factors
        for (int i = 1; i < number; i++) {
            // If the number is divisible by i, it's a factor
            if (number % i == 0) {
                System.out.println(i);  // Print the factor
            }
        }
    }
}
