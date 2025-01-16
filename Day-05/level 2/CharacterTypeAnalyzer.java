import java.util.Scanner;

public class CharacterTypeAnalyzer {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to classify characters in a string
    public static String[][] classifyCharacters(String text) {
        int n = text.length();
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayCharacterTypes(String[][] data) {
        System.out.println("\nCharacter Type");
        for (String[] row : data) {
            System.out.println(row[0] + " -> " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] characterTypes = classifyCharacters(input);
        displayCharacterTypes(characterTypes);

        sc.close();
    }
}
