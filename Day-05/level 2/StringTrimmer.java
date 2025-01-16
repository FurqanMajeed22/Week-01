import java.util.Scanner;

public class StringTrimmer {

    // Method to find start and end indexes without leading or trailing spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        // Trim leading spaces
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end };
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        // Trim spaces using user-defined methods
        int[] indexes = findTrimIndexes(input);
        String trimmedByCustomMethod = (indexes[0] <= indexes[1])? createSubstring(input, indexes[0], indexes[1]): "";

        // Trim spaces using built-in trim() method
        String trimmedByBuiltIn = input.trim();

        // Compare the two results
        boolean areEqual = compareStrings(trimmedByCustomMethod, trimmedByBuiltIn);

        // Display the results
        System.out.println("\nOriginal String: \"" + input + "\"");
        System.out.println("Trimmed by custom method: \"" + trimmedByCustomMethod + "\"");
        System.out.println("Trimmed by built-in method: \"" + trimmedByBuiltIn + "\"");
        System.out.println("Are the results equal? " + (areEqual ? "Yes" : "No"));

        sc.close();
    }
}
