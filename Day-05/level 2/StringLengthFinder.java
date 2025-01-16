import java.util.Scanner;

public class StringLengthFinder {

    // Method to calculate length without using length() method
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Stop when index exceeds string length
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        
        // Display length using both methods
        System.out.println("\nLength using custom method: " + findLength(input));
        System.out.println("Length using built-in method: " + input.length());
        sc.close();
    }
}
