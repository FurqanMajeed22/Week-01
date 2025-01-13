import java.util.Scanner;
public class TriangularParkRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take user input for the sides of the triangular park
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;
        // Convert the required distance from kilometers to meters (1 km = 1000 m)
        double requiredDistance = 5 * 1000;
        // Calculate the total number of rounds (rounds = distance / perimeter)
        double rounds = requiredDistance / perimeter;
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");
    }
}
