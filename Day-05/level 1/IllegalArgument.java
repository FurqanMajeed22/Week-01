import java.util.Scanner;

public class IllegalArgument {
    public static void main(String[] args) {
        generateIllegalArgumentException();
        handleIllegalArgumentException();
    }

    public static void generateIllegalArgumentException() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();

        System.out.println("Trying to use substring with invalid indices...");
        try {
            String result = text.substring(5, 2); // Start index greater than end index
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void handleIllegalArgumentException() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();

        try {
            System.out.println("Handling substring with invalid indices...");
            int start = 5;
            int end = 2;
            if (start > end) {
                throw new IllegalArgumentException("Start index cannot be greater than end index.");
            } else {
                String result = text.substring(start, end);
                System.out.println("Substring: " + result);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
