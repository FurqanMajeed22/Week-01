import java.util.Scanner;

public class Calendar_Display {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.println("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("\n  " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    // Method to get the first day of the month
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y--;
        }

        int k = y % 100;
        int j = y / 100;
        int d = 1; // First day of the month

        int firstDay = (d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        // Adjusting to make Sunday = 0, Monday = 1, ..., Saturday = 6
        return (firstDay + 6) % 7;
    }
}
