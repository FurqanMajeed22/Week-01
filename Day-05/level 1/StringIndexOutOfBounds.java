import java.util.Scanner;

public class StringIndexOutOfBounds {
    public static void main(String[] args) {
        generateStringIndexOutOfBoundsException();
        handleStringIndexOutOfBoundsException();
    }

    public static void generateStringIndexOutOfBoundsException() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();

        System.out.println("Trying to access an index out of bounds...");
        int index = text.length() + 1; // Deliberately out of bounds
        try {
            char ch = text.charAt(index); // This will throw StringIndexOutOfBoundsException
            System.out.println("Character at index " + index + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void handleStringIndexOutOfBoundsException() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();

        try {
            System.out.println("Accessing index safely...");
            int index = text.length() + 1; // Deliberately out of bounds
            if (index >= text.length() || index < 0) {
                System.out.println("Index out of bounds. Cannot access character at index " + index);
            } else {
                char ch = text.charAt(index);
                System.out.println("Character at index " + index + ": " + ch);
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
