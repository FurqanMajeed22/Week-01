import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        // Remove duplicates and get the modified string
        String result = removeDuplicates(input);

        System.out.println("String after removing duplicates: " + result);
    }

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];  // Assumes ASCII character set

        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // If the character is not seen yet, append it to the result and mark as seen
            if (!seen[ch]) {
                result.append(ch);
                seen[ch] = true;
            }
        }

        return result.toString();
    }
}
