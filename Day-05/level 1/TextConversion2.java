import java.util.Scanner;

public class TextConversion2 {

    // Method to convert each character to lowercase using ASCII values
    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // If the character is uppercase, convert it to lowercase
            if (c >= 'A' && c <= 'Z') {
                result.append((char)(c + 32));
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

    // Method to split the text into words and return the words along with their lengths in a 2D array
    public static String[][] splitTextIntoWords(String text) {
        String[] words = text.split(" "); // Split the text by spaces
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];       // Word
            result[i][1] = String.valueOf(words[i].length()); // Length of the word
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for the text
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        
        // Convert text using the custom method for lowercase
        String customLowerCase = convertToLowerCase(text);
        
        // Convert text using the built-in method
        String builtInLowerCase = text.toLowerCase();
        
        // Compare both strings
        boolean areEqual = compareStrings(customLowerCase, builtInLowerCase);
        
        // Display results
        System.out.println("\nConverted using custom method: " + customLowerCase);
        System.out.println("Converted using built-in method: " + builtInLowerCase);
        System.out.println("\nAre both strings equal? " + areEqual);

        // Splitting text into words and displaying word lengths
        String[][] wordsWithLength = splitTextIntoWords(text);
        System.out.println("\nWords and their lengths:");
        for (int i = 0; i < wordsWithLength.length; i++) {
            System.out.println("Word: " + wordsWithLength[i][0] + ", Length: " + wordsWithLength[i][1]);
        }
        
        sc.close();
    }
}
