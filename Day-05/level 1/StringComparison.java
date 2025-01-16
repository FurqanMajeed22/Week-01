import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = sc.next();

        System.out.println("Enter the second string:");
        String str2 = sc.next();

        boolean customResult = compareStrings(str1, str2);
        boolean builtInResult = str1.equals(str2);

        System.out.println("Result from custom comparison: " + customResult);
        System.out.println("Result from built-in equals method: " + builtInResult);

        if (customResult == builtInResult) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The results differ between methods.");
        }

        sc.close();
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
