public class Spring{
    public static void main(String[] args) {
		// Check if two arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide both month and day as command-line arguments.");
            return;
        }
        // Parse month and day from command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        // Check if the date falls within the Spring season (March 20 to June 20)
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) || // March 20 to 31
                           (month == 4 && day >= 1 && day <= 30) ||  // April 1 to 30
                           (month == 5 && day >= 1 && day <= 31) ||  // May 1 to 31
                           (month == 6 && day >= 1 && day <= 20);    // June 1 to 20

        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
