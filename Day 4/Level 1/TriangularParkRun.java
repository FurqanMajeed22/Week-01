import java.util.Scanner;

    public class TriangularParkRun {
    // Method to calculate the perimeter of the triangular park
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }
    // Method to calculate the number of rounds needed to complete a 5 km run
    public static int calculateRounds(double perimeter) {
        // Convert 5 km to meters 
        double distanceToRun = 5000;
        // Calculate the number of rounds (rounding up to the nearest integer)
        return (int) Math.ceil(distanceToRun / perimeter);
    }
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc= new Scanner(System.in);

        // Taking user input for the three sides of the triangular park
        System.out.print("Enter the length of side");
        double side1 = sc.nextDouble();

        System.out.print("Enter the length of side");
        double side2 = sc.nextDouble();

        System.out.print("Enter the length of side");
        double side3 = sc.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Calculate the number of rounds needed to complete a 5 km run
        int rounds = calculateRounds(perimeter);

        // Display the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to complete a 5 km run");
    }
}
