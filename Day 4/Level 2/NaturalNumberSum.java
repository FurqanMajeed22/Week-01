import java.util.Scanner;
public class NaturalNumberSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input and validate it
        System.out.print("Enter a positive integer (natural number): ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("The input must be a natural number greater than 0.");
            return;
        }

        // Compute sum using recursion
        int recursiveSum = computeSumRecursively(number);

        // Compute sum using the formula
        int formulaSum = calculateSumUsingFormula(number);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare the two results
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("There is a mismatch in the results.");
        }
    }

    // Method to compute sum of natural numbers using recursion
    public static int computeSumRecursively(int n) {
        // Base case: if n is 1, return 1
        if (n == 1) {
            return 1;
        }
        // Recursive case: sum of n is n + sum of (n-1)
        return n + computeSumRecursively(n - 1);
    }

    // Method to compute sum of natural numbers using the formula n*(n+1)/2
    public static int calculateSumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}
