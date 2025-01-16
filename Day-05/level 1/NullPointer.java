import java.util.Scanner;

public class NullPointer {
    public static void main(String[] args) {
        generateNullPointerException();
        handleNullPointerException();
    }

    public static void generateNullPointerException() {
        String text = null;
        try {
            System.out.println("Trying to get the length of a null string...");
            int length = text.length(); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println("Accessing a null string safely...");
            if (text != null) {
                int length = text.length();
                System.out.println("Length of the string: " + length);
            } else {
                System.out.println("The string is null. Cannot access methods on it.");
            }
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
