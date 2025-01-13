import java.util.Scanner;
public class DistanceConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the distance in feet
        double distanceInFeet = scanner.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;
        // Convert feet to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        System.out.printf("Your distance in yards is %.2f while in miles is %.5f and in feet is %.2f.%n",
                          distanceInYards, distanceInMiles, distanceInFeet);
    }
}
