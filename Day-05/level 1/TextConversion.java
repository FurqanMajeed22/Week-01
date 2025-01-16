import java.util.Scanner;

public class TextConversion {

    // Method to convert each character to uppercase using ASCII values
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // If the character is lowercase, convert it to uppercase
            if (c >= 'a' && c <= 'z') {
                result.append((char)(c - 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings of different lengths are not equal
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any characters are different, return false
            }
        }
        
        return true; // Strings are equal
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for the text
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        
        // Convert text using the custom method
        String customUpperCase = convertToUpperCase(text);
        
        // Convert text using the built-in method
        String builtInUpperCase = text.toUpperCase();
        
        // Compare both strings
        boolean areEqual = compareStrings(customUpperCase, builtInUpperCase);
        
        // Display results
        System.out.println("\nConverted using custom method: " + customUpperCase);
        System.out.println("Converted using built-in method: " + builtInUpperCase);
        System.out.println("\nAre both strings equal? " + areEqual);
        
        sc.close();
    }
}
