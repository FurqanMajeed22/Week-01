import java.util.Scanner;
public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = sc.nextLine();
        // Input the character to remove
        System.out.println("Enter the character to remove:");
        char charToRemove = sc.next().charAt(0);

        // Remove all occurrences of the specified character
        String modifiedString = removeCharacter(inputString, charToRemove);

        // Output the modified string
        System.out.println("Modified String: " + modifiedString);

    }

    // Method to remove all occurrences of a specific character from the string
    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder result = new StringBuilder();
        // Iterate through the string and add characters that are not equal to charToRemove
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar != charToRemove) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
