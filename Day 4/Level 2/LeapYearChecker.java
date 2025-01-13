import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year");
        int year = scanner.nextInt();

        // Check if the input year is valid
        if (year < 1582) {
            System.out.println("Invalid input. The year must be 1582 or later.");
            return;
        }

        // Determine if the year is a leap year using a helper method
        boolean isLeap = verifyLeapYear(year);

        // Output the result
        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }

    // Method to check if a year is a leap year
    public static boolean verifyLeapYear(int yr) {
        // A leap year must be divisible by 4 and either:
        // (a) not divisible by 100, or (b) divisible by 400
        if ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)) {
            return true;
        }
        return false;
    }
}
