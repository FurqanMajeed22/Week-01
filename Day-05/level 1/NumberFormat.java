import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        generateNumberFormatException();
        handleNumberFormatException();
    }

    public static void generateNumberFormatException() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert to an integer:");
        String text = sc.next();

        System.out.println("Trying to convert text to integer...");
        try {
            int number = Integer.parseInt(text); // This will throw NumberFormatException if text is not a valid number
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void handleNumberFormatException() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert to an integer:");
        String text = sc.next();

        try {
            System.out.println("Handling text to integer conversion...");
            int number = Integer.parseInt(text); // This will throw NumberFormatException if text is not a valid number
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
