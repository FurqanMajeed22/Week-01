import java.util.Scanner;

public class ArrayException {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] arr) {
        // Accessing an index that is larger than the length of the array
        System.out.println(arr[5]);
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch block
    public static void handleException(String[] arr) {
        try {
            // Attempting to generate the exception
            generateException(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index!");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input for the array size and names
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline

        String[] names = new String[n];
        
        // Input names into the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Calling the method to generate the exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        generateException(names);

        // Calling the method to handle the exception
        System.out.println("\nHandling the exception:");
        handleException(names);

        sc.close();
    }
}
