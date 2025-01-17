import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        // Reverse the string manually
        String reversed = reverseString(input);
        // Output the reversed string
        System.out.println("Reversed string: " + reversed);
    }

    // Method to reverse a string without using a character array
    public static String reverseString(String str) {
        String reversed = "";
        // Iterate from the end of the string to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }
}
