public class DayOfWeek {
    public static void main(String[] args) {
        // Take month, day, and year from command-line arguments
        int m = Integer.parseInt(args[0]); // Month
        int d = Integer.parseInt(args[1]); // Day
        int y = Integer.parseInt(args[2]); // Year
        // Apply the formula for the Gregorian calendar
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        // Calculate the day of the week
        int d0 = (d + x + 31 * m0 / 12) % 7;
        System.out.println(d0); // Prints the day of the week (0 for Sunday, 1 for Monday, etc.)
    }
}

