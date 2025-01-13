import java.util.Scanner;
public class StringComparisonChar {
    // Method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] characters = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for the string
        System.out.print("Enter the string: ");
        String text = sc.next();
        // Get characters using the user-defined method
        char[] userDefinedCharacters = getCharacters(text);
        // Get characters using the built-in toCharArray() method
        char[] builtInCharacters = text.toCharArray();
        // Compare the two character arrays
        boolean areEqual = compareCharArrays(userDefinedCharacters, builtInCharacters);

        // Display the results
        System.out.print("Characters using user-defined method: ");
        for (char c : userDefinedCharacters) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Characters using built-in toCharArray(): ");
        for (char c : builtInCharacters) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are both character arrays equal? " + areEqual);
    }
}
