import java.util.Scanner;
public class SmallestAndLargest {

    // Method to find the smallest and largest of three numbers using Math.min and Math.max
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        // Use Math.min and Math.max to find the smallest and largest
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};  // Return an array with smallest and largest
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

    
            // Get user input for 3 numbers
            System.out.print("Enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int number2 = scanner.nextInt();

            System.out.print("Enter the third number: ");
            int number3 = scanner.nextInt();

            // Call method to find smallest and largest numbers
            int[] result = findSmallestAndLargest(number1, number2, number3);

            // Display the results
            System.out.println("The smallest number is: " + result[0]);
            System.out.println("The largest number is: " + result[1]);
    }
}
