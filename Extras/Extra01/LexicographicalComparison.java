import java.util.Scanner;
public class LexicographicalComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2");
        String str2 = sc.nextLine();
        // Compare the strings lexicographically
        int result = compareStringsLexicographically(str1, str2);

        // Output the comparison result
        if (result < 0) {
            System.out.println('"' + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println('"' + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        } else {
            System.out.println('"' + str1 + "\" is equal to \"" + str2 + "\".");
        }

    }

    // Method to compare two strings lexicographically
    public static int compareStringsLexicographically(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        // Compare characters one by one
        for (int i = 0; i < Math.min(len1, len2); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            // If characters are different, return the difference
            if (ch1 != ch2) {
                return ch1 - ch2;
            }
        }
        // If the strings are identical up to the length of the shorter string,
        // compare their lengths
        return len1 - len2;
    }
}
