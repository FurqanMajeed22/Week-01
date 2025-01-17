import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Toggle the case of each character in the string
        String toggledString = toggleCase(input);

        // Output the result
        System.out.println("String after toggling case: " + toggledString);

    }

    // Method to toggle the case of each character in a string
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is uppercase, if so, convert to lowercase
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            }
            // If the character is lowercase, convert to uppercase
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // Non-alphabetic characters remain unchanged
            }
        }

        return result.toString();
    }
}
