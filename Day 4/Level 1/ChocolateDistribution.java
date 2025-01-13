import java.util.Scanner;
public class ChocolateDistribution {
    // Method to find chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];  // Array to hold quotient (chocolates per child) and remainder (remaining chocolates)

        // Calculate chocolates per child and remaining chocolates
        result[0] = number / divisor;  // Chocolates per child
        result[1] = number % divisor;  // Remaining chocolates

        return result;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Take user input for number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();
        // Find chocolates per child and remaining chocolates using the method
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        // Output the results
        System.out.println("Each child will get " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
