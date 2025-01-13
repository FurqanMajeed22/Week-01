import java.util.Scanner;

public class FactorProcessor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read input from user
        System.out.print("Please enter an integer: ");
        int num = input.nextInt();

        // Get factors using a custom method
        int[] factorList = computeFactors(num);

        // Display all factors
        System.out.print("The factors are: ");
        for (int value : factorList) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Compute and display sum of factors
        int totalSum = calculateSum(factorList);
        System.out.println("Sum of all factors: " + totalSum);

        // Compute and display product of factors
        int totalProduct = calculateProduct(factorList);
        System.out.println("Product of all factors: " + totalProduct);

        // Compute and display sum of squares of factors
        int squaredSum = sumOfFactorSquares(factorList);
        System.out.println("Sum of squares of factors: " + squaredSum);
    }

    // Method to find all factors of a number
    public static int[] computeFactors(int num) {
        int size = 0;

        // First pass to count the number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                size++;  // Increment size for each factor found
            }
        }

        int[] factors = new int[size];
        int pos = 0;

        // Second pass to store each factor in the array
        for (int j = 1; j <= num; j++) {
            if (num % j == 0) {
                factors[pos++] = j;
            }
        }
        return factors;
    }

    // Method to compute sum of factors
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;
    }

    // Method to compute product of factors
    public static int calculateProduct(int[] array) {
        int product = 1;
        for (int item : array) {
            product *= item;
        }
        return product;
    }

    // Method to compute sum of squares of factors
    public static int sumOfFactorSquares(int[] array) {
        int result = 0;
        for (int item : array) {
            result += Math.pow(item, 2);  // Use Math.pow for squaring
        }
        return result;
    }
}
