import java.util.Scanner;

public class StringComparison3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String text = sc.next();

        char[] customChars = getAllCharacters(text);
        char[] builtInChars = text.toCharArray();

        System.out.println("Characters from custom method:");
        printArray(customChars);

        System.out.println("Characters from built-in method:");
        printArray(builtInChars);

        boolean comparisonResult = compareCharArrays(customChars, builtInChars);

        if (comparisonResult) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The results differ between methods.");
        }

        sc.close();
    }

    public static char[] getAllCharacters(String s) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
