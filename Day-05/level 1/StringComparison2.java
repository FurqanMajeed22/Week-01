import java.util.Scanner;

public class StringComparison2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String text = sc.next();

        System.out.println("Enter the start index:");
        int start = sc.nextInt();

        System.out.println("Enter the end index:");
        int end = sc.nextInt();

        String customSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);

        System.out.println("Substring from custom method: " + customSubstring);
        System.out.println("Substring from built-in method: " + builtInSubstring);

        boolean comparisonResult = compareStrings(customSubstring, builtInSubstring);

        if (comparisonResult) {
            System.out.println("Both substrings are the same.");
        } else {
            System.out.println("The substrings are different.");
        }

        sc.close();
    }

    public static String createSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

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
}
