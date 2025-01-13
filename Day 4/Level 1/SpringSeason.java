public class SpringSeason {

    // Method to check if the given date falls in the Spring season
    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20 && day <= 31) {
            return true;  // March 20 - March 31
        } else if (month == 4 && day >= 1 && day <= 30) {
            return true;  // April
        } else if (month == 5 && day >= 1 && day <= 31) {
            return true;  // May
        } else if (month == 6 && day >= 1 && day <= 20) {
            return true;  // June 1 - June 20
        } else {
            return false; // Not in the spring season
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide both month and day as command-line arguments);
            return;
        }
            // Parse command-line arguments
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);
            // Check if the date is in the Spring season
            boolean isSpring = isSpringSeason(month, day);
            if (isSpring) {
                System.out.println("It's a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        
    }
}
